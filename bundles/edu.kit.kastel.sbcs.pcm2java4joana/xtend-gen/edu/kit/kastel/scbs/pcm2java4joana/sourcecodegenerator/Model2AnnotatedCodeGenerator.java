package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator;

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
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
    _builder.append(" implements ");
    String _generateImplements = this.generateImplements(sourceCodeClass.getImplements());
    _builder.append(_generateImplements);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateFields = this.generateFields(sourceCodeClass.getFields());
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
    _builder.append(" (");
    {
      EList<Parameter> _parameter = method.getParameter();
      for(final Parameter parameter : _parameter) {
        _builder.newLineIfNotEmpty();
        String _generateParameter = this.generateParameter(parameter, null);
        _builder.append(_generateParameter);
        _builder.append(" ");
        {
          int _indexOf = method.getParameter().indexOf(parameter);
          int _length = ((Object[])Conversions.unwrapArray(method.getParameter(), Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateFields(final List<Field> fields) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Field field : fields) {
        String _generateField = this.generateField(field);
        _builder.append(_generateField);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateField(final Field field) {
    String _switchResult = null;
    boolean _matched = false;
    if (field instanceof Variable) {
      _matched=true;
      _switchResult = this.generateVariable(((Variable)field));
    }
    if (!_matched) {
      if (field instanceof Method) {
        _matched=true;
        _switchResult = this.generateMethod(((Method)field), null);
      }
    }
    return _switchResult;
  }
  
  public String generateVariable(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDataType = this.generateDataType(variable.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
          _builder.append("boolean");
          return _builder.toString();
        case BYTE:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("byte");
          return _builder_1.toString();
        case CHAR:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("char");
          return _builder_2.toString();
        case SHORT:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("short");
          return _builder_3.toString();
        case INT:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("int");
          return _builder_4.toString();
        case FLOAT:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("float");
          return _builder_5.toString();
        case DOUBLE:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("double");
          return _builder_6.toString();
        case STRING:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("String");
          return _builder_7.toString();
        case LONG:
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("long");
          return _builder_8.toString();
        default:
          break;
      }
    }
    StringConcatenation _builder_9 = new StringConcatenation();
    _builder_9.append("void");
    return _builder_9.toString();
  }
  
  public String generateMethod(final Method method, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public ");
    String _generateDataType = this.generateDataType(method.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = method.getName();
    _builder.append(_name);
    _builder.append(" (");
    {
      EList<Parameter> _parameter = method.getParameter();
      for(final Parameter parameter : _parameter) {
        _builder.newLineIfNotEmpty();
        String _generateParameter = this.generateParameter(parameter, null);
        _builder.append(_generateParameter);
        _builder.append(" ");
        {
          int _indexOf = method.getParameter().indexOf(parameter);
          int _length = ((Object[])Conversions.unwrapArray(method.getParameter(), Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// TODO: Implement me!");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateParameter(final Parameter parameter, final JOANARoot joanaModel) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDataType = this.generateDataType(parameter.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = parameter.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
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
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
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
      List<String> _referenceTypes = this.getReferenceTypes(fields);
      for(final String referenceType : _referenceTypes) {
        _builder.append("import generated.code.");
        _builder.append(referenceType);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _hasCollectionType = this.hasCollectionType(fields);
      if (_hasCollectionType) {
        _builder.append("import java.util.Collection");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public boolean hasCollectionType(final List<Field> fields) {
    for (final Field field : fields) {
      boolean _matched = false;
      if (field instanceof Variable) {
        _matched=true;
        return this.hasVariableCollectionType(((Variable)field));
      }
      if (!_matched) {
        if (field instanceof Method) {
          _matched=true;
          return this.hasMethodCollectionType(((Method)field));
        }
      }
    }
    return false;
  }
  
  public boolean hasMethodCollectionType(final Method method) {
    Type _type = method.getType();
    if ((_type instanceof CollectionType)) {
      return true;
    }
    EList<Parameter> _parameter = method.getParameter();
    for (final Parameter parameter : _parameter) {
      Type _type_1 = parameter.getType();
      if ((_type_1 instanceof CollectionType)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasVariableCollectionType(final Variable variable) {
    Type _type = variable.getType();
    boolean _matched = false;
    if (_type instanceof CollectionType) {
      _matched=true;
      return true;
    }
    if (!_matched) {
      if (_type instanceof BuiltInType) {
        _matched=true;
      }
      if (!_matched) {
        if (_type instanceof ReferenceType) {
          _matched=true;
        }
      }
      if (_matched) {
        return false;
      }
    }
    return false;
  }
  
  public List<String> getReferenceTypes(final List<Field> fields) {
    final ArrayList<String> referenceTypes = new ArrayList<String>();
    for (final Field field : fields) {
      referenceTypes.addAll(this.getReferenceTypes(field));
    }
    return referenceTypes;
  }
  
  public List<String> getReferenceTypes(final Field field) {
    boolean _matched = false;
    if (field instanceof Variable) {
      _matched=true;
      return this.getReferenceTypeForVariable(((Variable)field));
    }
    if (!_matched) {
      if (field instanceof Method) {
        _matched=true;
        return this.getReferenceTypeForMethod(((Method)field));
      }
    }
    return new ArrayList<String>();
  }
  
  public List<String> getReferenceTypeForMethod(final Method method) {
    String methodType = "";
    final ArrayList<String> referenceTypes = new ArrayList<String>();
    Type _type = method.getType();
    boolean _matched = false;
    if (_type instanceof ReferenceType) {
      _matched=true;
      Type _type_1 = method.getType();
      methodType = this.getReferenceTypeName(((ReferenceType) _type_1));
    }
    if (!_matched) {
      if (_type instanceof CollectionType) {
        _matched=true;
        Type _type_1 = method.getType();
        methodType = this.getReferenceTypeForCollectionType(((CollectionType) _type_1));
      }
    }
    boolean _equals = methodType.equals("");
    boolean _not = (!_equals);
    if (_not) {
      referenceTypes.add(methodType);
    }
    EList<Parameter> _parameter = method.getParameter();
    for (final Parameter parameter : _parameter) {
      {
        final String paramterType = this.getReferenceTypeForParameter(parameter);
        boolean _equals_1 = paramterType.equals("");
        boolean _not_1 = (!_equals_1);
        if (_not_1) {
          referenceTypes.add(methodType);
        }
      }
    }
    return referenceTypes;
  }
  
  public String getReferenceTypeForParameter(final Parameter parameter) {
    Type _type = parameter.getType();
    boolean _matched = false;
    if (_type instanceof ReferenceType) {
      _matched=true;
      Type _type_1 = parameter.getType();
      return this.getReferenceTypeName(((ReferenceType) _type_1));
    }
    if (!_matched) {
      if (_type instanceof CollectionType) {
        _matched=true;
        Type _type_1 = parameter.getType();
        return this.getReferenceTypeForCollectionType(((CollectionType) _type_1));
      }
    }
    return "";
  }
  
  public List<String> getReferenceTypeForVariable(final Variable variable) {
    final ArrayList<String> referenceTypes = new ArrayList<String>();
    String referenceType = "";
    Type _type = variable.getType();
    boolean _matched = false;
    if (_type instanceof ReferenceType) {
      _matched=true;
      Type _type_1 = variable.getType();
      referenceType = this.getReferenceTypeName(((ReferenceType) _type_1));
    }
    if (!_matched) {
      if (_type instanceof CollectionType) {
        _matched=true;
        Type _type_1 = variable.getType();
        referenceType = this.getReferenceTypeForCollectionType(((CollectionType) _type_1));
      }
    }
    boolean _equals = referenceType.equals("");
    boolean _not = (!_equals);
    if (_not) {
      referenceTypes.add(referenceType);
    }
    return referenceTypes;
  }
  
  public String getReferenceTypeName(final ReferenceType type) {
    return type.getTopleveltype().getName();
  }
  
  public String getReferenceTypeForCollectionType(final CollectionType type) {
    final Type innerType = type.getType();
    boolean _matched = false;
    if (innerType instanceof ReferenceType) {
      _matched=true;
      return this.getReferenceTypeName(((ReferenceType)innerType));
    }
    if (!_matched) {
      if (innerType instanceof CollectionType) {
        _matched=true;
        return this.getReferenceTypeForCollectionType(((CollectionType)innerType));
      }
    }
    if (!_matched) {
      if (innerType instanceof BuiltInType) {
        _matched=true;
        return "";
      }
    }
    return "";
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
