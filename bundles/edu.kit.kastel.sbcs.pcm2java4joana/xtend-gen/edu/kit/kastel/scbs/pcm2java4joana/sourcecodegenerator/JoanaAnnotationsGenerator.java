package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator;

import edu.kit.ipd.sdq.activextendannotations.Utility;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Sink;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Utility
@SuppressWarnings("all")
public final class JoanaAnnotationsGenerator {
  public static void generateJoanaAnnotation(final TopLevelType parent, final Method method, final JOANARoot joanaModel, final BufferedWriter writer) {
    if ((joanaModel == null)) {
      return;
    }
    JoanaAnnotationsGenerator.generateEntryPoints(parent, method, joanaModel, writer);
    JoanaAnnotationsGenerator.generateSources(parent, method, joanaModel, writer);
    JoanaAnnotationsGenerator.generateSinks(parent, method, joanaModel, writer);
  }
  
  public static void generateJoanaAnnotation(final TopLevelType parent, final Method method, final Parameter parameter, final JOANARoot joanaModel, final BufferedWriter writer) {
    if ((joanaModel == null)) {
      return;
    }
    JoanaAnnotationsGenerator.generateSources(parent, method, parameter, joanaModel, writer);
    JoanaAnnotationsGenerator.generateSinks(parent, method, parameter, joanaModel, writer);
  }
  
  public static void generateEntryPoints(final TopLevelType parent, final Method method, final JOANARoot joanaModel, final BufferedWriter writer) {
    final List<EntryPoint> entryPoints = JoanaModelUtils.getEntryPoints(joanaModel, parent.getName(), method.getName());
    for (final EntryPoint entryPoint : entryPoints) {
      JoanaAnnotationsGenerator.generateEntryPointAnnotation(entryPoint, writer);
    }
  }
  
  public static void generateSources(final TopLevelType parent, final Method method, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      final List<Source> sources = JoanaModelUtils.getSourcesFor(joanaModel, parent.getName(), method.getName());
      final ArrayList<String> tags = new ArrayList<String>();
      for (final Source source : sources) {
        tags.addAll(source.getTag());
      }
      int _size = sources.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Source");
        String _generateAnnotation = JoanaAnnotationsGenerator.generateAnnotation(sources.get(0), tags);
        _builder.append(_generateAnnotation);
        final String content = _builder.toString();
        writer.write(content);
        writer.flush();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateSinks(final TopLevelType parent, final Method method, final Parameter parameter, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      final List<Sink> sinks = JoanaModelUtils.getSinksFor(joanaModel, parent.getName(), method.getName(), parameter.getName());
      final ArrayList<String> tags = new ArrayList<String>();
      for (final Sink sink : sinks) {
        tags.addAll(sink.getTag());
      }
      int _size = sinks.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Sink");
        String _generateAnnotation = JoanaAnnotationsGenerator.generateAnnotation(sinks.get(0), tags);
        _builder.append(_generateAnnotation);
        final String content = _builder.toString();
        writer.write(content);
        writer.flush();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateSources(final TopLevelType parent, final Method method, final Parameter parameter, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      final List<Source> sources = JoanaModelUtils.getSourcesFor(joanaModel, parent.getName(), method.getName(), parameter.getName());
      final ArrayList<String> tags = new ArrayList<String>();
      for (final Source source : sources) {
        tags.addAll(source.getTag());
      }
      int _size = sources.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Source");
        String _generateAnnotation = JoanaAnnotationsGenerator.generateAnnotation(sources.get(0), tags);
        _builder.append(_generateAnnotation);
        final String content = _builder.toString();
        writer.write(content);
        writer.flush();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateSinks(final TopLevelType parent, final Method method, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      final List<Sink> sinks = JoanaModelUtils.getSinksFor(joanaModel, parent.getName(), method.getName());
      final ArrayList<String> tags = new ArrayList<String>();
      for (final Sink sink : sinks) {
        tags.addAll(sink.getTag());
      }
      int _size = sinks.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Sink");
        String _generateAnnotation = JoanaAnnotationsGenerator.generateAnnotation(sinks.get(0), tags);
        _builder.append(_generateAnnotation);
        final String content = _builder.toString();
        writer.write(content);
        writer.flush();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateEntryPointAnnotation(final EntryPoint element, final BufferedWriter writer) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@EntryPoint(tag = \"");
      String _get = element.getTag().get(0);
      _builder.append(_get);
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("levels = ");
      String _generateLevelsAnnotation = JoanaAnnotationsGenerator.generateLevelsAnnotation(element.getSecuritylevels());
      _builder.append(_generateLevelsAnnotation, "\t");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("lattice = ");
      String _generateLattice = JoanaAnnotationsGenerator.generateLattice(element.getLattice());
      _builder.append(_generateLattice, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append(")");
      _builder.newLine();
      final String content = _builder.toString();
      writer.write(content);
      writer.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String generateLattice(final Lattice lattice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      EList<FlowRelation> _flowrelation = lattice.getFlowrelation();
      for(final FlowRelation relation : _flowrelation) {
        String _generateMayFlowRelation = JoanaAnnotationsGenerator.generateMayFlowRelation(relation);
        _builder.append(_generateMayFlowRelation);
        {
          int _indexOf = lattice.getFlowrelation().indexOf(relation);
          int _length = ((Object[])Conversions.unwrapArray(lattice.getFlowrelation(), Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(",");
          }
        }
      }
    }
    _builder.append("}");
    return _builder.toString();
  }
  
  public static String generateMayFlowRelation(final FlowRelation relation) {
    final String to = JoanaModelUtils.combineIntoOneSecurityLevel(relation.getTo());
    final String from = JoanaModelUtils.combineIntoOneSecurityLevel(relation.getFrom());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@MayFlow(from =\"");
    _builder.append(from);
    _builder.append("\", to = \"");
    _builder.append(to);
    _builder.append("\")");
    return _builder.toString();
  }
  
  public static String generateLevelsAnnotation(final List<SecurityLevel> levels) {
    final List<List<SecurityLevel>> powerSet = SetOperations.<SecurityLevel>generatePowerSet(levels);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      for(final List<SecurityLevel> levelSet : powerSet) {
        {
          int _size = levelSet.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            _builder.append("\"");
            String _combineIntoOneSecurityLevel = JoanaModelUtils.combineIntoOneSecurityLevel(levelSet);
            _builder.append(_combineIntoOneSecurityLevel);
            _builder.append("\"");
            {
              int _indexOf = powerSet.indexOf(levelSet);
              int _length = ((Object[])Conversions.unwrapArray(powerSet, Object.class)).length;
              int _minus = (_length - 1);
              boolean _notEquals = (_indexOf != _minus);
              if (_notEquals) {
                _builder.append(",");
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    return _builder.toString();
  }
  
  public static String generateSource(final Source element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Source");
    String _generateAnnotation = JoanaAnnotationsGenerator.generateAnnotation(element);
    _builder.append(_generateAnnotation);
    _builder.append(" ");
    return _builder.toString();
  }
  
  public static String generateSink(final Sink element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Sink");
    String _generateAnnotation = JoanaAnnotationsGenerator.generateAnnotation(element);
    _builder.append(_generateAnnotation);
    _builder.append(" ");
    return _builder.toString();
  }
  
  public static String generateAnnotation(final Annotation annotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(tags = \"");
    EList<String> _tag = annotation.getTag();
    _builder.append(_tag);
    _builder.append("\", level = \"");
    String _combineIntoOneSecurityLevel = JoanaModelUtils.combineIntoOneSecurityLevel(annotation.getSecuritylevel());
    _builder.append(_combineIntoOneSecurityLevel);
    _builder.append("\")");
    return _builder.toString();
  }
  
  public static String generateAnnotation(final Annotation annotation, final List<String> tags) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(tags = {");
    {
      for(final String tag : tags) {
        _builder.append("\"");
        _builder.append(tag);
        _builder.append("\"");
        {
          int _indexOf = tags.indexOf(tag);
          int _length = ((Object[])Conversions.unwrapArray(tags, Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append("}, level = \"");
    String _combineIntoOneSecurityLevel = JoanaModelUtils.combineIntoOneSecurityLevel(annotation.getSecuritylevel());
    _builder.append(_combineIntoOneSecurityLevel);
    _builder.append("\")");
    return _builder.toString();
  }
  
  private JoanaAnnotationsGenerator() {
    
  }
}
