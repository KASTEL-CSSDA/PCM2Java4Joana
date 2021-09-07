package edu.kit.kastel.scbs.pcm2java4joana.backprojection;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultFactory;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultType;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;

public class JoanaResultsParser {
	private static final String ENTRYPOINT_KEY = "entry_point_method";
	private static final String FLOW_KEY = "flow";
	private static final String FLOW_DELIMETER = "-";
	private static final String SOURCE_KEY = "source";
	private static final String SOURCE_LEVEL_KEY = "source_level";
	private static final String SINK_KEY = "sink";
	private static final String SINK_LEVEL_KEY = "sink_level";
	private static final String CLASS_KEY = "class";
	private static final String METHODNAME_KEY = "name";
	private static final String RETURN_KEY = "return";
	private static final String PARAMETERS_KEY = "parameters";
	private static final String KEY_VALUE_DELIMETER = ":";
	private static final String PARAMETERS_ENTRY = "-";
	private static final String INDEX_KEY = "index";
	private static final String KIND_ENTRY = "kind";
	private static final String SDGFORMALPARAMETER = "edu.kit.joana.api.sdg.sdgformalparameter";
	private static final String SDGFORMALMETHOD = "edu.kit.joana.api.sdg.sdgmethod";

	public static Result parseJoanaResults(BufferedReader reader) throws IOException, InputException {
		JoanasimplifiedresultFactory factory = JoanasimplifiedresultFactory.eINSTANCE;
		Result result = factory.createResult();

		String line;
		while ((line = reader.readLine()) != null) {
			if (line.contains(ENTRYPOINT_KEY)) {
				result.getTrace().addAll(parseEntryPoint(reader));
			}
		}

		return result;
	}

	private static Collection<Trace> parseEntryPoint(BufferedReader reader) throws IOException, InputException {
		Collection<Trace> traces = new ArrayList<Trace>();
		String line;

		reader.readLine(); // tag
		line = reader.readLine(); // found_flows
		reader.readLine(); // only_direct_flow

		if (line.contains("false")) {
			return traces;
		}
		while ((line = reader.readLine()) != null) {
			if (line.contains(FLOW_KEY)) {
				traces.addAll(parseFlow(reader));
			}
		}

		return traces;
	}

	private static Collection<Trace> parseFlow(BufferedReader reader) throws IOException, InputException {
		Collection<Trace> traces = new ArrayList<Trace>();

		String line;
		while ((line = reader.readLine()) != null) {
			if (line.contains(FLOW_DELIMETER)) {
				Trace trace = parseResult(reader);
				if (trace == null) {
					break;
				}
				traces.add(trace);
			}
		}

		return traces;
	}

	private static Trace parseResult(BufferedReader reader) throws IOException, InputException {
		JoanasimplifiedresultFactory factory = JoanasimplifiedresultFactory.eINSTANCE;
		Trace trace = factory.createTrace();

		String line = reader.readLine(); // type
		if (line == null) {
			return null;
		}
		reader.readLine(); // attacker_level

		checkLineKey(reader.readLine(), SOURCE_KEY);
		TraceState source = parseSource(reader);
		source.setParameterIndex(0);

		checkLineKey(reader.readLine(), SINK_KEY);
		TraceState sink = parseSink(reader);
		sink.setParameterIndex(1);

		System.out.println(" & Class & " + source.getTraceClassName() + " & " + sink.getTraceClassName() + "\\\\");
		System.out.println(" & Method Name & " + source.getResultmethod().getName() + " & "
				+ sink.getResultmethod().getName() + "\\\\");
		System.out.println(
				" & Parameter Index & " + source.getParameterIndex() + " & " + sink.getParameterIndex() + "\\\\");
		System.out.println(
				" & Security Level & " + source.getSecurityLevelName() + " & " + sink.getSecurityLevelName() + "\\\\");
		System.out.println(" & Public / Private & Public & Public \\\\");
		System.out.println();

		trace.getTracestate().add(source);
		trace.getTracestate().add(sink);

		return trace;
	}

	private static TraceState parseSource(BufferedReader reader) throws IOException, InputException {
		return parseTraceState(reader, SOURCE_LEVEL_KEY);
	}

	private static TraceState parseSink(BufferedReader reader) throws IOException, InputException {
		return parseTraceState(reader, SINK_LEVEL_KEY);
	}

	private static TraceState parseTraceState(BufferedReader reader, String securityLevelKey)
			throws IOException, InputException {
		JoanasimplifiedresultFactory factory = JoanasimplifiedresultFactory.eINSTANCE;
		TraceState traceState = factory.createTraceState();
		ResultMethod method = factory.createResultMethod();

		String line = reader.readLine(); // kind
		String kind = getEntryValue(line, KIND_ENTRY);

		if (kind.equals(SDGFORMALPARAMETER)) {
			reader.readLine();
		}

		line = reader.readLine();
		String fullyQualifiedClassName = getEntryValue(line, CLASS_KEY);
		String[] classNameParts = fullyQualifiedClassName.split("\\.");
		String className = classNameParts[classNameParts.length - 1];
		traceState.setTraceClassName(className);

		line = reader.readLine();
		String methodName = getEntryValue(line, METHODNAME_KEY);
		method.setName(methodName);

		reader.readLine(); // selector

		line = reader.readLine();
		String returnTypeString = getEntryValue(line, RETURN_KEY);
		ResultType returnType = factory.createResultType();
		returnType.setTypeString(returnTypeString);
		method.setReturnType(returnType);

		line = reader.readLine();
		checkLineKey(line, PARAMETERS_KEY);

		while ((line = reader.readLine()).contains(PARAMETERS_ENTRY)) {
			ResultType parameterType = factory.createResultType();
			parameterType.setTypeString(line.replace(PARAMETERS_ENTRY, "").strip());
			method.getParamterTypes().add(parameterType);
		}

		int index = -1;
		if (line.contains(INDEX_KEY)) {
			String indexString = getEntryValue(line, INDEX_KEY);
			index = Integer.parseInt(indexString);
			line = reader.readLine();
		}
		traceState.setParameterIndex(index);

		if (!line.contains(securityLevelKey)) {
			line = reader.readLine();
		}

		String securityLevel = getEntryValue(line, securityLevelKey);
		traceState.setSecurityLevelName(securityLevel);
		traceState.setResultmethod(method);

		return traceState;
	}

	private static String getEntryValue(String line, String key) throws InputException {
		checkLineKey(line, key);
		return line.split(KEY_VALUE_DELIMETER)[1].strip();
	}

	private static void checkLineKey(String line, String key) throws InputException {
		if (!line.contains(key)) {
			throw new InputException("Invalid key word");
		}
	}
}
