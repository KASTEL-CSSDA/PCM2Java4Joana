package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator;

import edu.kit.ipd.sdq.activextendannotations.Utility;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@Utility
@SuppressWarnings("all")
public final class SourceCodeElementGenerator {
  public static String generateVariable(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _generateDataType = SourceCodeElementGenerator.generateDataType(variable.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateGetter = SourceCodeElementGenerator.generateGetter(variable);
    _builder.append(_generateGetter);
    _builder.newLineIfNotEmpty();
    String _generateSetter = SourceCodeElementGenerator.generateSetter(variable);
    _builder.append(_generateSetter);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String generateConstructor(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass) {
    final List<Variable> variables = SourceCodeModelUtils.getVariables(scClass);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = scClass.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      for(final Variable variable : variables) {
        String _generateDataType = SourceCodeElementGenerator.generateDataType(variable.getType());
        _builder.append(_generateDataType);
        _builder.append(" ");
        String _name_1 = variable.getName();
        _builder.append(_name_1);
        {
          int _indexOf = variables.indexOf(variable);
          int _size = variables.size();
          int _minus = (_size - 1);
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
    {
      for(final Variable variable_1 : variables) {
        _builder.append("\t");
        _builder.append("this.");
        String _name_2 = variable_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = ");
        String _name_3 = variable_1.getName();
        _builder.append(_name_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateGetter(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _generateDataType = SourceCodeElementGenerator.generateDataType(variable.getType());
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
  
  public static String generateSetter(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append("(");
    String _generateDataType = SourceCodeElementGenerator.generateDataType(variable.getType());
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
  
  public static String generateDataType(final Type type) {
    if ((type == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("void");
      return _builder.toString();
    }
    boolean _matched = false;
    if (type instanceof BuiltInType) {
      _matched=true;
      return SourceCodeElementGenerator.generateBuiltInType(((BuiltInType)type));
    }
    if (!_matched) {
      if (type instanceof ReferenceType) {
        _matched=true;
        return SourceCodeElementGenerator.generateReferenceType(((ReferenceType)type));
      }
    }
    if (!_matched) {
      if (type instanceof CollectionType) {
        _matched=true;
        return SourceCodeElementGenerator.generateCollectionType(((CollectionType)type));
      }
    }
    return null;
  }
  
  public static String generateCollectionType(final CollectionType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Collection<");
    String _generateDataType = SourceCodeElementGenerator.generateDataType(type.getType());
    _builder.append(_generateDataType);
    _builder.append(">");
    return _builder.toString();
  }
  
  public static String generateReferenceType(final ReferenceType type) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = type.getTopleveltype().getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  public static String generateBuiltInType(final BuiltInType type) {
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
          _builder_2.append("Character");
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
  
  public static String generateImplements(final List<Interface> interfaces) {
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
  
  public static String generateImportsInterface(final List<Method> methods) {
    final ArrayList<Field> fields = new ArrayList<Field>();
    for (final Method method : methods) {
      fields.add(method);
    }
    return SourceCodeElementGenerator.generateImports(fields);
  }
  
  public static String generateImports(final List<Field> fields) {
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
  
  public static String generateImport(final TopLevelType toImport) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import generated.code.");
    String _name = toImport.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String generatePackage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.code;");
    return _builder.toString();
  }
  
  private SourceCodeElementGenerator() {
    
  }
}
