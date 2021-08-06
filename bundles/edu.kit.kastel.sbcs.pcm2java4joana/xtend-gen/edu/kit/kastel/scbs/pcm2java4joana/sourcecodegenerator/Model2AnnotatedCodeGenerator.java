package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Sink;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.internal.xtend.util.Triplet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Model2AnnotatedCodeGenerator {
  public List<Triplet<String, String, String>> generateAnnotatedCode(final SourceCodeRoot sourceCodeModel, final JOANARoot joanaModel) {
    final ArrayList<Triplet<String, String, String>> contentsForFiles = new ArrayList<Triplet<String, String, String>>();
    EList<TopLevelType> _topleveltype = sourceCodeModel.getTopleveltype();
    for (final TopLevelType topLevelType : _topleveltype) {
      {
        final String content = this.generateTopLevelType(topLevelType, joanaModel);
        String _name = topLevelType.getName();
        String _plus = (_name + ".java");
        final Triplet<String, String, String> newTuple = new Triplet<String, String, String>(content, _plus, "");
        contentsForFiles.add(newTuple);
      }
    }
    return contentsForFiles;
  }
  
  public String generateTopLevelType(final TopLevelType topLevelType, final JOANARoot joanaModel) {
    String _switchResult = null;
    boolean _matched = false;
    if (topLevelType instanceof edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class) {
      _matched=true;
      _switchResult = this.generateClass(((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)topLevelType), joanaModel);
    }
    if (!_matched) {
      if (topLevelType instanceof Interface) {
        _matched=true;
        _switchResult = this.generateInterface(((Interface)topLevelType));
      }
    }
    return _switchResult;
  }
  
  public String generateClass(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generatePackage = this.generatePackage();
    _builder.append(_generatePackage);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import edu.kit.joana.ui.annotations.*;");
    _builder.newLine();
    {
      EList<Interface> _implements = sourceCodeClass.getImplements();
      for(final Interface toImport : _implements) {
        String _generateImport = this.generateImport(toImport);
        _builder.append(_generateImport);
        _builder.newLineIfNotEmpty();
      }
    }
    String _generateImports = this.generateImports(sourceCodeClass.getFields());
    _builder.append(_generateImports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = sourceCodeClass.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      int _size = sourceCodeClass.getImplements().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("implements ");
        String _generateImplements = this.generateImplements(sourceCodeClass.getImplements());
        _builder.append(_generateImplements);
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateFields = this.generateFields(sourceCodeClass.getFields(), sourceCodeClass, joanaModel);
    _builder.append(_generateFields, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = sourceCodeClass.getName();
    _builder.append(_name_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// TODO: Implement me!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateInterface(final Interface inter) {
    StringConcatenation _builder = new StringConcatenation();
    String _generatePackage = this.generatePackage();
    _builder.append(_generatePackage);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateImportsInterface = this.generateImportsInterface(inter.getMethods());
    _builder.append(_generateImportsInterface);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    String _name = inter.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Method> _methods = inter.getMethods();
      for(final Method method : _methods) {
        _builder.append("\t");
        String _generateInterfaceMethod = this.generateInterfaceMethod(method);
        _builder.append(_generateInterfaceMethod, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateInterfaceMethod(final Method method) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDataType = this.generateDataType(method.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = method.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Parameter> _parameter = method.getParameter();
      for(final Parameter parameter : _parameter) {
        String _generateParameter = this.generateParameter(parameter, null);
        _builder.append(_generateParameter);
        {
          int _indexOf = method.getParameter().indexOf(parameter);
          int _length = ((Object[])Conversions.unwrapArray(method.getParameter(), Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateFields(final List<Field> fields, final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Field field : fields) {
        String _generateField = this.generateField(field, sourceCodeClass, joanaModel);
        _builder.append(_generateField);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateField(final Field field, final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, final JOANARoot joanaModel) {
    String _switchResult = null;
    boolean _matched = false;
    if (field instanceof Variable) {
      _matched=true;
      _switchResult = this.generateVariable(((Variable)field));
    }
    if (!_matched) {
      if (field instanceof Method) {
        _matched=true;
        _switchResult = this.generateMethod(sourceCodeClass, ((Method)field), joanaModel);
      }
    }
    return _switchResult;
  }
  
  public String generateVariable(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _generateDataType = this.generateDataType(variable.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateGetter = this.generateGetter(variable);
    _builder.append(_generateGetter);
    _builder.newLineIfNotEmpty();
    String _generateSetter = this.generateSetter(variable);
    _builder.append(_generateSetter);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateGetter(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _generateDataType = this.generateDataType(variable.getType());
    _builder.append(_generateDataType);
    _builder.append(" get");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _name_1 = variable.getName();
    _builder.append(_name_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder.toString();
  }
  
  public String generateSetter(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append("(");
    String _generateDataType = this.generateDataType(variable.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name_1 = variable.getName();
    _builder.append(_name_1);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _name_2 = variable.getName();
    _builder.append(_name_2, "\t");
    _builder.append(" = ");
    String _name_3 = variable.getName();
    _builder.append(_name_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateDataType(final Type type) {
    if ((type == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("void");
      return _builder.toString();
    }
    boolean _matched = false;
    if (type instanceof BuiltInType) {
      _matched=true;
      return this.generateBuiltInType(((BuiltInType)type));
    }
    if (!_matched) {
      if (type instanceof ReferenceType) {
        _matched=true;
        return this.generateReferenceType(((ReferenceType)type));
      }
    }
    if (!_matched) {
      if (type instanceof CollectionType) {
        _matched=true;
        return this.generateCollectionType(((CollectionType)type));
      }
    }
    return null;
  }
  
  public String generateCollectionType(final CollectionType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Collection<");
    String _generateDataType = this.generateDataType(type.getType());
    _builder.append(_generateDataType);
    _builder.append(">");
    return _builder.toString();
  }
  
  public String generateReferenceType(final ReferenceType type) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = type.getTopleveltype().getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  public String generateBuiltInType(final BuiltInType type) {
    BuiltInTypes _builtInType = type.getBuiltInType();
    if (_builtInType != null) {
      switch (_builtInType) {
        case BOOLEAN:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Boolean");
          return _builder.toString();
        case BYTE:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Byte");
          return _builder_1.toString();
        case CHAR:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Char");
          return _builder_2.toString();
        case SHORT:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("Short");
          return _builder_3.toString();
        case INT:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("Integer");
          return _builder_4.toString();
        case FLOAT:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("Float");
          return _builder_5.toString();
        case DOUBLE:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("Double");
          return _builder_6.toString();
        case STRING:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("String");
          return _builder_7.toString();
        case LONG:
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("Long");
          return _builder_8.toString();
        default:
          break;
      }
    }
    StringConcatenation _builder_9 = new StringConcatenation();
    _builder_9.append("void");
    return _builder_9.toString();
  }
  
  public String generateMethod(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateJoanaAnnotation = this.generateJoanaAnnotation(scClass, method, joanaModel);
    _builder.append(_generateJoanaAnnotation);
    _builder.newLineIfNotEmpty();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public ");
    String _generateDataType = this.generateDataType(method.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = method.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Parameter> _parameter = method.getParameter();
      for(final Parameter parameter : _parameter) {
        String _generateJoanaAnnotation_1 = this.generateJoanaAnnotation(scClass, method, parameter, joanaModel);
        _builder.append(_generateJoanaAnnotation_1);
        _builder.append(" ");
        String _generateParameter = this.generateParameter(parameter, null);
        _builder.append(_generateParameter);
        {
          int _indexOf = method.getParameter().indexOf(parameter);
          int _length = ((Object[])Conversions.unwrapArray(method.getParameter(), Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// TODO: Implement me!");
    _builder.newLine();
    _builder.append("\t");
    {
      Type _type = method.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        _builder.append("return null;");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateJoanaAnnotation(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateEntryPoints = this.generateEntryPoints(scClass, method, joanaModel);
    _builder.append(_generateEntryPoints);
    _builder.newLineIfNotEmpty();
    String _generateSources = this.generateSources(scClass, method, joanaModel);
    _builder.append(_generateSources);
    _builder.newLineIfNotEmpty();
    String _generateSinks = this.generateSinks(scClass, method, joanaModel);
    _builder.append(_generateSinks);
    return _builder.toString();
  }
  
  public String generateJoanaAnnotation(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final Parameter parameter, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateSources = this.generateSources(scClass, method, parameter, joanaModel);
    _builder.append(_generateSources);
    _builder.append(" ");
    String _generateSinks = this.generateSinks(scClass, method, parameter, joanaModel);
    _builder.append(_generateSinks);
    return _builder.toString();
  }
  
  public String generateEntryPoints(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
    final List<EntryPoint> entryPoints = JoanaModelUtils.getEntryPoints(joanaModel, scClass.getName(), method.getName());
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final EntryPoint entryPoint : entryPoints) {
        String _generateEntryPointAnnotation = this.generateEntryPointAnnotation(entryPoint);
        _builder.append(_generateEntryPointAnnotation);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateSources(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
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
      String _generateAnnotation = this.generateAnnotation(sources.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public String generateSinks(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final Parameter parameter, final JOANARoot joanaModel) {
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
      String _generateAnnotation = this.generateAnnotation(sinks.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public String generateSources(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final Parameter parameter, final JOANARoot joanaModel) {
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
      String _generateAnnotation = this.generateAnnotation(sources.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public String generateSinks(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, final Method method, final JOANARoot joanaModel) {
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
      String _generateAnnotation = this.generateAnnotation(sinks.get(0), tags);
      _builder_1.append(_generateAnnotation);
      return _builder_1.toString();
    }
  }
  
  public String generateEntryPointAnnotation(final EntryPoint element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@EntryPoint(tag = \"");
    String _tag = element.getTag();
    _builder.append(_tag);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("levels = ");
    String _generateLevelsAnnotation = this.generateLevelsAnnotation(element.getSecuritylevels());
    _builder.append(_generateLevelsAnnotation, "\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("lattice = ");
    String _generateLattice = this.generateLattice(element.getLattice());
    _builder.append(_generateLattice, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateLattice(final Lattice lattice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      EList<FlowRelation> _flowrelation = lattice.getFlowrelation();
      for(final FlowRelation relation : _flowrelation) {
        String _generateMayFlowRelation = this.generateMayFlowRelation(relation);
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
  
  public String generateMayFlowRelation(final FlowRelation relation) {
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
  
  public String generateLevelsAnnotation(final List<SecurityLevel> levels) {
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
  
  public String generateSource(final Source element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Source");
    String _generateAnnotation = this.generateAnnotation(element);
    _builder.append(_generateAnnotation);
    _builder.append(" ");
    return _builder.toString();
  }
  
  public String generateSink(final Sink element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Sink");
    String _generateAnnotation = this.generateAnnotation(element);
    _builder.append(_generateAnnotation);
    _builder.append(" ");
    return _builder.toString();
  }
  
  public String generateAnnotation(final Annotation annotation) {
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
  
  public String generateAnnotation(final Annotation annotation, final List<String> tags) {
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
  
  public String generateParameter(final Parameter parameter, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDataType = this.generateDataType(parameter.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = parameter.getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  public String generateImplements(final List<Interface> interfaces) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Interface inter : interfaces) {
        String _name = inter.getName();
        _builder.append(_name);
        {
          int _indexOf = interfaces.indexOf(inter);
          int _length = ((Object[])Conversions.unwrapArray(interfaces, Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String generateImportsInterface(final List<Method> methods) {
    final ArrayList<Field> fields = new ArrayList<Field>();
    for (final Method method : methods) {
      fields.add(method);
    }
    return this.generateImports(fields);
  }
  
  public String generateImports(final List<Field> fields) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _referenceTypes = SourceCodeModelUtils.getReferenceTypes(fields);
      for(final String referenceType : _referenceTypes) {
        _builder.append("import generated.code.");
        _builder.append(referenceType);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _hasCollectionType = SourceCodeModelUtils.hasCollectionType(fields);
      if (_hasCollectionType) {
        _builder.append("import java.util.Collection;");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String generateImport(final TopLevelType toImport) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import generated.code.");
    String _name = toImport.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePackage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.code;");
    return _builder.toString();
  }
}
