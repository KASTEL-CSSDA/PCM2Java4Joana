package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator;

import edu.kit.ipd.sdq.activextendannotations.Utility;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.CodeSaveException;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.models.CodeWithFile;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Utility
@SuppressWarnings("all")
public final class SupplierAnalysisModel2AnnotatedCodeGenerator {
  public static List<CodeWithFile> generateAnnotatedCode(final SourceCodeRoot sourceCodeModel, final JOANARoot joanaModel, final IPath baseFolder) {
    try {
      final ArrayList<CodeWithFile> contentsForFiles = new ArrayList<CodeWithFile>();
      final IPath destinationFolder = baseFolder.append("src-gen");
      String _string = destinationFolder.toString();
      final String folder = (_string + Character.valueOf(IPath.SEPARATOR));
      new File(folder).mkdirs();
      EList<TopLevelType> _topleveltype = sourceCodeModel.getTopleveltype();
      for (final TopLevelType topLevelType : _topleveltype) {
        {
          String _name = topLevelType.getName();
          String _plus = (folder + _name);
          final String filePath = (_plus + ".java");
          final File file = new File(filePath);
          boolean _exists = file.exists();
          boolean _not = (!_exists);
          if (_not) {
            try {
              file.createNewFile();
            } catch (final Throwable _t) {
              if (_t instanceof IOException) {
                final IOException e = (IOException)_t;
                e.printStackTrace();
                String _message = e.getMessage();
                throw new CodeSaveException(_message);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
          final FileWriter fw = new FileWriter(file);
          final BufferedWriter writer = new BufferedWriter(fw);
          SupplierAnalysisModel2AnnotatedCodeGenerator.generateTopLevelType(topLevelType, joanaModel, writer);
          writer.close();
          fw.close();
        }
      }
      return contentsForFiles;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateTopLevelType(final TopLevelType topLevelType, final JOANARoot joanaModel, final BufferedWriter writer) {
    boolean _matched = false;
    if (topLevelType instanceof edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class) {
      _matched=true;
      SupplierAnalysisModel2AnnotatedCodeGenerator.generateClass(((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)topLevelType), joanaModel, writer);
    }
    if (!_matched) {
      if (topLevelType instanceof Interface) {
        _matched=true;
        SupplierAnalysisModel2AnnotatedCodeGenerator.generateInterface(((Interface)topLevelType), writer);
      }
    }
  }
  
  public static void generateInterface(final Interface inter, final BufferedWriter writer) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      String _generatePackage = SourceCodeElementGenerator.generatePackage();
      _builder.append(_generatePackage);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      String _generateImportsInterface = SourceCodeElementGenerator.generateImportsInterface(inter.getMethods());
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
          String _generateInterfaceMethod = SupplierAnalysisModel2AnnotatedCodeGenerator.generateInterfaceMethod(method);
          _builder.append(_generateInterfaceMethod, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      final String content = _builder.toString();
      writer.write(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String generateInterfaceMethod(final Method method) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDataType = SourceCodeElementGenerator.generateDataType(method.getType());
    _builder.append(_generateDataType);
    _builder.append(" ");
    String _name = method.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Parameter> _parameter = method.getParameter();
      for(final Parameter parameter : _parameter) {
        String _generateDataType_1 = SourceCodeElementGenerator.generateDataType(parameter.getType());
        _builder.append(_generateDataType_1);
        _builder.append(" ");
        String _name_1 = parameter.getName();
        _builder.append(_name_1);
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
    return _builder.toString();
  }
  
  public static void generateClass(final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      String _generatePackage = SourceCodeElementGenerator.generatePackage();
      _builder.append(_generatePackage);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import edu.kit.joana.ui.annotations.*;");
      _builder.newLine();
      {
        EList<Interface> _implements = sourceCodeClass.getImplements();
        for(final Interface toImport : _implements) {
          String _generateImport = SourceCodeElementGenerator.generateImport(toImport);
          _builder.append(_generateImport);
          _builder.newLineIfNotEmpty();
        }
      }
      String _generateImports = SourceCodeElementGenerator.generateImports(sourceCodeClass.getFields());
      _builder.append(_generateImports);
      final String packageAndImports = _builder.toString();
      writer.write(packageAndImports);
      writer.flush();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public class ");
      String _name = sourceCodeClass.getName();
      _builder_1.append(_name);
      _builder_1.append(" ");
      {
        int _size = sourceCodeClass.getImplements().size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder_1.append("implements ");
          String _generateImplements = SourceCodeElementGenerator.generateImplements(sourceCodeClass.getImplements());
          _builder_1.append(_generateImplements);
        }
      }
      _builder_1.append("{ ");
      final String classDefinition = _builder_1.toString();
      writer.write(classDefinition);
      writer.flush();
      SupplierAnalysisModel2AnnotatedCodeGenerator.generateFields(sourceCodeClass.getFields(), sourceCodeClass, joanaModel, writer);
      StringConcatenation _builder_2 = new StringConcatenation();
      String _generateConstructor = SourceCodeElementGenerator.generateConstructor(sourceCodeClass);
      _builder_2.append(_generateConstructor);
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("}");
      final String constructor = _builder_2.toString();
      writer.write(constructor);
      writer.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateFields(final List<Field> fields, final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, final JOANARoot joanaModel, final BufferedWriter writer) {
    for (final Field field : fields) {
      SupplierAnalysisModel2AnnotatedCodeGenerator.generateField(field, sourceCodeClass, joanaModel, writer);
    }
  }
  
  public static void generateField(final Field field, final edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, final JOANARoot joanaModel, final BufferedWriter writer) {
    boolean _matched = false;
    if (field instanceof Variable) {
      _matched=true;
      SourceCodeElementGenerator.generateVariable(((Variable)field), writer);
    }
    if (!_matched) {
      if (field instanceof Method) {
        _matched=true;
        SupplierAnalysisModel2AnnotatedCodeGenerator.generateMethod(sourceCodeClass, ((Method)field), true, joanaModel, writer);
      }
    }
  }
  
  public static void generateMethod(final TopLevelType parent, final Method method, final boolean isOverride, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      JoanaAnnotationsGenerator.generateJoanaAnnotation(parent, method, joanaModel, writer);
      if (isOverride) {
        writer.write("@Override \n");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      String _generateDataType = SourceCodeElementGenerator.generateDataType(method.getType());
      _builder.append(_generateDataType);
      _builder.append(" ");
      String _name = method.getName();
      _builder.append(_name);
      _builder.append("(");
      final String content = _builder.toString();
      writer.write(content);
      writer.flush();
      EList<Parameter> _parameter = method.getParameter();
      for (final Parameter parameter : _parameter) {
        {
          SupplierAnalysisModel2AnnotatedCodeGenerator.generateParameter(parent, method, parameter, joanaModel, writer);
          int _indexOf = method.getParameter().indexOf(parameter);
          int _length = ((Object[])Conversions.unwrapArray(method.getParameter(), Object.class)).length;
          int _minus = (_length - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            writer.write(",");
          }
        }
      }
      writer.write(") { \n");
      Type _type = method.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        writer.write("return null; \n");
      }
      writer.write("} \n");
      writer.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateParameter(final TopLevelType parent, final Method method, final Parameter parameter, final JOANARoot joanaModel, final BufferedWriter writer) {
    try {
      JoanaAnnotationsGenerator.generateJoanaAnnotation(parent, method, parameter, joanaModel, writer);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("generateDataType(parameter.type)» ");
      String _name = parameter.getName();
      _builder.append(_name);
      final String content = _builder.toString();
      writer.write(content);
      writer.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private SupplierAnalysisModel2AnnotatedCodeGenerator() {
    
  }
}
