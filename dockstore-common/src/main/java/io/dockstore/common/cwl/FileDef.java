package io.dockstore.common.cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** Define a file that must be placed in the designated output directory
prior to executing the command line tool.  May be the result of executing
an expression, such as building a configuration file from a template.
 */
@org.apache.avro.specific.AvroGenerated
public class FileDef extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FileDef\",\"doc\":\"Define a file that must be placed in the designated output directory\\nprior to executing the command line tool.  May be the result of executing\\nan expression, such as building a configuration file from a template.\\n\",\"fields\":[{\"name\":\"filename\",\"type\":[\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"}],\"doc\":\"The name of the file to create in the output directory.\"},{\"name\":\"fileContent\",\"type\":[\"string\",\"Expression\"],\"doc\":\"If the value is a string literal or an expression which evaluates to a\\nstring, a new file must be created with the string as the file contents.\\n\\nIf the value is an expression that evaluates to a File object, this\\nindicates the referenced file should be added to the designated output\\ndirectory prior to executing the tool.\\n\\nFiles added in this way may be read-only, and may be provided\\nby bind mounts or file system links to avoid\\nunnecessary copying of the input file.\\n\"}],\"docParent\":\"https://w3id.org/cwl/cwl#CreateFileRequirement\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The name of the file to create in the output directory. */
  @Deprecated public java.lang.Object filename;
  /** If the value is a string literal or an expression which evaluates to a
string, a new file must be created with the string as the file contents.

If the value is an expression that evaluates to a File object, this
indicates the referenced file should be added to the designated output
directory prior to executing the tool.

Files added in this way may be read-only, and may be provided
by bind mounts or file system links to avoid
unnecessary copying of the input file.
 */
  @Deprecated public java.lang.Object fileContent;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public FileDef() {}

  /**
   * All-args constructor.
   */
  public FileDef(java.lang.Object filename, java.lang.Object fileContent) {
    this.filename = filename;
    this.fileContent = fileContent;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return filename;
    case 1: return fileContent;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: filename = (java.lang.Object)value$; break;
    case 1: fileContent = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'filename' field.
   * The name of the file to create in the output directory.   */
  public java.lang.Object getFilename() {
    return filename;
  }

  /**
   * Sets the value of the 'filename' field.
   * The name of the file to create in the output directory.   * @param value the value to set.
   */
  public void setFilename(java.lang.Object value) {
    this.filename = value;
  }

  /**
   * Gets the value of the 'fileContent' field.
   * If the value is a string literal or an expression which evaluates to a
string, a new file must be created with the string as the file contents.

If the value is an expression that evaluates to a File object, this
indicates the referenced file should be added to the designated output
directory prior to executing the tool.

Files added in this way may be read-only, and may be provided
by bind mounts or file system links to avoid
unnecessary copying of the input file.
   */
  public java.lang.Object getFileContent() {
    return fileContent;
  }

  /**
   * Sets the value of the 'fileContent' field.
   * If the value is a string literal or an expression which evaluates to a
string, a new file must be created with the string as the file contents.

If the value is an expression that evaluates to a File object, this
indicates the referenced file should be added to the designated output
directory prior to executing the tool.

Files added in this way may be read-only, and may be provided
by bind mounts or file system links to avoid
unnecessary copying of the input file.
   * @param value the value to set.
   */
  public void setFileContent(java.lang.Object value) {
    this.fileContent = value;
  }

  /** Creates a new FileDef RecordBuilder */
  public static FileDef.Builder newBuilder() {
    return new FileDef.Builder();
  }
  
  /** Creates a new FileDef RecordBuilder by copying an existing Builder */
  public static FileDef.Builder newBuilder(FileDef.Builder other) {
    return new FileDef.Builder(other);
  }
  
  /** Creates a new FileDef RecordBuilder by copying an existing FileDef instance */
  public static FileDef.Builder newBuilder(FileDef other) {
    return new FileDef.Builder(other);
  }
  
  /**
   * RecordBuilder for FileDef instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FileDef>
    implements org.apache.avro.data.RecordBuilder<FileDef> {

    private java.lang.Object filename;
    private java.lang.Object fileContent;

    /** Creates a new Builder */
    private Builder() {
      super(FileDef.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(FileDef.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.filename)) {
        this.filename = data().deepCopy(fields()[0].schema(), other.filename);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fileContent)) {
        this.fileContent = data().deepCopy(fields()[1].schema(), other.fileContent);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FileDef instance */
    private Builder(FileDef other) {
            super(FileDef.SCHEMA$);
      if (isValidValue(fields()[0], other.filename)) {
        this.filename = data().deepCopy(fields()[0].schema(), other.filename);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fileContent)) {
        this.fileContent = data().deepCopy(fields()[1].schema(), other.fileContent);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'filename' field */
    public java.lang.Object getFilename() {
      return filename;
    }
    
    /** Sets the value of the 'filename' field */
    public FileDef.Builder setFilename(java.lang.Object value) {
      validate(fields()[0], value);
      this.filename = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'filename' field has been set */
    public boolean hasFilename() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'filename' field */
    public FileDef.Builder clearFilename() {
      filename = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'fileContent' field */
    public java.lang.Object getFileContent() {
      return fileContent;
    }
    
    /** Sets the value of the 'fileContent' field */
    public FileDef.Builder setFileContent(java.lang.Object value) {
      validate(fields()[1], value);
      this.fileContent = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'fileContent' field has been set */
    public boolean hasFileContent() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'fileContent' field */
    public FileDef.Builder clearFileContent() {
      fileContent = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public FileDef build() {
      try {
        FileDef record = new FileDef();
        record.filename = fieldSetFlags()[0] ? this.filename : (java.lang.Object) defaultValue(fields()[0]);
        record.fileContent = fieldSetFlags()[1] ? this.fileContent : (java.lang.Object) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
