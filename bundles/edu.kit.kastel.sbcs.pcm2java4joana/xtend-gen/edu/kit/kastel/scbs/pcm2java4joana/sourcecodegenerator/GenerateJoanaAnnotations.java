package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator;

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
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class GenerateJoanaAnnotations {
  public static String generateJoanaAnnotation(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateEntryPoints = GenerateJoanaAnnotations.generateEntryPoints(scClass, method, joanaModel);
    _builder.append(_generateEntryPoints);
    _builder.newLineIfNotEmpty();
    String _generateSources = GenerateJoanaAnnotations.generateSources(scClass, method, joanaModel);
    _builder.append(_generateSources);
    _builder.newLineIfNotEmpty();
    String _generateSinks = GenerateJoanaAnnotations.generateSinks(scClass, method, joanaModel);
    _builder.append(_generateSinks);
    return _builder.toString();
  }
  
  public static String generateJoanaAnnotation(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final Parameter parameter, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateSources = GenerateJoanaAnnotations.generateSources(scClass, method, parameter, joanaModel);
    _builder.append(_generateSources);
    _builder.append(" ");
    String _generateSinks = GenerateJoanaAnnotations.generateSinks(scClass, method, parameter, joanaModel);
    _builder.append(_generateSinks);
    return _builder.toString();
  }
  
  public static String generateEntryPoints(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    final List<EntryPoint> entryPoints = JoanaModelUtils.getEntryPoints(joanaModel, scClass.getName(), method.getName());
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final EntryPoint entryPoint : entryPoints) {
        String _generateEntryPointAnnotation = GenerateJoanaAnnotations.generateEntryPointAnnotation(entryPoint);
        _builder.append(_generateEntryPointAnnotation);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String generateSources(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    final List<Source> sources = JoanaModelUtils.getSourcesFor(joanaModel, scClass.getName(), method.getName());
    final ArrayList<String> tags = new ArrayList<String>();
    for (final Source source : sources) {
      tags.add(source.getTag());
    }
    int _size = sources.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@Source");
      String _generateAnnotation = GenerateJoanaAnnotations.generateAnnotation(sources.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public static String generateSinks(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final Parameter parameter, final JOANARoot joanaModel) {
    final List<Sink> sinks = JoanaModelUtils.getSinksFor(joanaModel, scClass.getName(), method.getName(), parameter.getName());
    final ArrayList<String> tags = new ArrayList<String>();
    for (final Sink sink : sinks) {
      tags.add(sink.getTag());
    }
    int _size = sinks.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@Sink");
      String _generateAnnotation = GenerateJoanaAnnotations.generateAnnotation(sinks.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public static String generateSources(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final Parameter parameter, final JOANARoot joanaModel) {
    final List<Source> sources = JoanaModelUtils.getSourcesFor(joanaModel, scClass.getName(), method.getName(), parameter.getName());
    final ArrayList<String> tags = new ArrayList<String>();
    for (final Source source : sources) {
      tags.add(source.getTag());
    }
    int _size = sources.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@Source");
      String _generateAnnotation = GenerateJoanaAnnotations.generateAnnotation(sources.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public static String generateSinks(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    final List<Sink> sinks = JoanaModelUtils.getSinksFor(joanaModel, scClass.getName(), method.getName());
    final ArrayList<String> tags = new ArrayList<String>();
    for (final Sink sink : sinks) {
      tags.add(sink.getTag());
    }
    int _size = sinks.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@Sink");
      String _generateAnnotation = GenerateJoanaAnnotations.generateAnnotation(sinks.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public static String generateEntryPointAnnotation(final EntryPoint element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@EntryPoint(tag = \"");
    String _tag = element.getTag();
    _builder.append(_tag);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("levels = ");
    String _generateLevelsAnnotation = GenerateJoanaAnnotations.generateLevelsAnnotation(element.getSecuritylevels());
    _builder.append(_generateLevelsAnnotation, "\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("lattice = ");
    String _generateLattice = GenerateJoanaAnnotations.generateLattice(element.getLattice());
    _builder.append(_generateLattice, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateLattice(final Lattice lattice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      EList<FlowRelation> _flowrelation = lattice.getFlowrelation();
      for(final FlowRelation relation : _flowrelation) {
        String _generateMayFlowRelation = GenerateJoanaAnnotations.generateMayFlowRelation(relation);
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
    String _generateAnnotation = GenerateJoanaAnnotations.generateAnnotation(element);
    _builder.append(_generateAnnotation);
    _builder.append(" ");
    return _builder.toString();
  }
  
  public static String generateSink(final Sink element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Sink");
    String _generateAnnotation = GenerateJoanaAnnotations.generateAnnotation(element);
    _builder.append(_generateAnnotation);
    _builder.append(" ");
    return _builder.toString();
  }
  
  public static String generateAnnotation(final Annotation annotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(tags = \"");
    String _tag = annotation.getTag();
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
}
