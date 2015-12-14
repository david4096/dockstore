package io.dockstore.common.cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InputRecordField extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"doc\":\"Salad data types are based on Avro schema declarations.  Refer to the\\n[Avro schema declaration documentation](https://avro.apache.org/docs/current/spec.html#schemas) for\\ndetailed information.\\n\\n## Simple types\\n\\n* **null**: no value\\n* **boolean**: a binary value\\n* **int**: 32-bit signed integer\\n* **long**: 64-bit signed integer\\n* **float**: single precision (32-bit) IEEE 754 floating-point number\\n* **double**: double precision (64-bit) IEEE 754 floating-point number\\n* **string**: Unicode character sequence\\n\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},{\"type\":\"record\",\"name\":\"InputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"InputRecordField\"}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordField\"}]},{\"type\":\"record\",\"name\":\"InputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Binding\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\"}],\"docParent\":\"https://w3id.org/cwl/cwl#Parameter\"}],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"type\":\"record\",\"name\":\"InputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"Binding\"],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#InputParameter\",\"extends\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"Binding\"],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"extends\":\"https://w3id.org/cwl/salad#RecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The name of the field
 */
  @Deprecated public java.lang.CharSequence name;
  /** A documentation string for this field
 */
  @Deprecated public java.lang.CharSequence doc;
  /** The field type
 */
  @Deprecated public java.lang.Object type;
  @Deprecated public Binding inputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public InputRecordField() {}

  /**
   * All-args constructor.
   */
  public InputRecordField(java.lang.CharSequence name, java.lang.CharSequence doc, java.lang.Object type, Binding inputBinding) {
    this.name = name;
    this.doc = doc;
    this.type = type;
    this.inputBinding = inputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return doc;
    case 2: return type;
    case 3: return inputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: doc = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.Object)value$; break;
    case 3: inputBinding = (Binding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * The name of the field
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * The name of the field
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'doc' field.
   * A documentation string for this field
   */
  public java.lang.CharSequence getDoc() {
    return doc;
  }

  /**
   * Sets the value of the 'doc' field.
   * A documentation string for this field
   * @param value the value to set.
   */
  public void setDoc(java.lang.CharSequence value) {
    this.doc = value;
  }

  /**
   * Gets the value of the 'type' field.
   * The field type
   */
  public java.lang.Object getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * The field type
   * @param value the value to set.
   */
  public void setType(java.lang.Object value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'inputBinding' field.
   */
  public Binding getInputBinding() {
    return inputBinding;
  }

  /**
   * Sets the value of the 'inputBinding' field.
   * @param value the value to set.
   */
  public void setInputBinding(Binding value) {
    this.inputBinding = value;
  }

  /** Creates a new InputRecordField RecordBuilder */
  public static InputRecordField.Builder newBuilder() {
    return new InputRecordField.Builder();
  }
  
  /** Creates a new InputRecordField RecordBuilder by copying an existing Builder */
  public static InputRecordField.Builder newBuilder(InputRecordField.Builder other) {
    return new InputRecordField.Builder(other);
  }
  
  /** Creates a new InputRecordField RecordBuilder by copying an existing InputRecordField instance */
  public static InputRecordField.Builder newBuilder(InputRecordField other) {
    return new InputRecordField.Builder(other);
  }
  
  /**
   * RecordBuilder for InputRecordField instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InputRecordField>
    implements org.apache.avro.data.RecordBuilder<InputRecordField> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence doc;
    private java.lang.Object type;
    private Binding inputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(InputRecordField.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(InputRecordField.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.doc)) {
        this.doc = data().deepCopy(fields()[1].schema(), other.doc);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[3].schema(), other.inputBinding);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing InputRecordField instance */
    private Builder(InputRecordField other) {
            super(InputRecordField.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.doc)) {
        this.doc = data().deepCopy(fields()[1].schema(), other.doc);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[3].schema(), other.inputBinding);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public InputRecordField.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public InputRecordField.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'doc' field */
    public java.lang.CharSequence getDoc() {
      return doc;
    }
    
    /** Sets the value of the 'doc' field */
    public InputRecordField.Builder setDoc(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.doc = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'doc' field has been set */
    public boolean hasDoc() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'doc' field */
    public InputRecordField.Builder clearDoc() {
      doc = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.Object getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public InputRecordField.Builder setType(java.lang.Object value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public InputRecordField.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'inputBinding' field */
    public Binding getInputBinding() {
      return inputBinding;
    }
    
    /** Sets the value of the 'inputBinding' field */
    public InputRecordField.Builder setInputBinding(Binding value) {
      validate(fields()[3], value);
      this.inputBinding = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'inputBinding' field has been set */
    public boolean hasInputBinding() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'inputBinding' field */
    public InputRecordField.Builder clearInputBinding() {
      inputBinding = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public InputRecordField build() {
      try {
        InputRecordField record = new InputRecordField();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.doc = fieldSetFlags()[1] ? this.doc : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.Object) defaultValue(fields()[2]);
        record.inputBinding = fieldSetFlags()[3] ? this.inputBinding : (Binding) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
