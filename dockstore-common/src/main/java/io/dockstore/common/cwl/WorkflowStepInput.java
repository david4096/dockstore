package io.dockstore.common.cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** The input of a workflow step connects an upstream parameter (from the
workflow inputs, or the outputs of other workflows steps) with the input
parameters of the underlying process.

## Input object

A WorkflowStepInput object must contain an `id` field in the form
`#fieldname` or `#stepname.fieldname`.  When the `id` field contains a
period `.` the field name consists of the characters following the final
period.  This defines a field of the workflow step input object with the
value of the `source` parameter(s).

## Merging

To merge multiple inbound data links,
[MultipleInputFeatureRequirement](#multipleinputfeaturerequirement) must be specified
in the workflow or workflow step requirements.

If the sink parameter is an array, or named in a [workflow
scatter](#workflowstep) operation, there may be multiple inbound data links
listed in the `source` field.  The values from the input links are merged
depending on the method specified in the `linkMerge` field.  If not
specified, the default method is "merge_nested".

* **merge_nested**

  The input must be an array consisting of exactly one entry for each
  input link.  If "merge_nested" is specified with a single link, the value
  from the link must be wrapped in a single-item list.

* **merge_flattened**

  1. The source and sink parameters must be compatible types, or the source
     type must be compatible with single element from the "items" type of
     the destination array parameter.
  2. Source parameters which are arrays are concatenated.
     Source parameters which are single element types are appended as
     single elements.
 */
@org.apache.avro.specific.AvroGenerated
public class WorkflowStepInput extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WorkflowStepInput\",\"doc\":\"The input of a workflow step connects an upstream parameter (from the\\nworkflow inputs, or the outputs of other workflows steps) with the input\\nparameters of the underlying process.\\n\\n## Input object\\n\\nA WorkflowStepInput object must contain an `id` field in the form\\n`#fieldname` or `#stepname.fieldname`.  When the `id` field contains a\\nperiod `.` the field name consists of the characters following the final\\nperiod.  This defines a field of the workflow step input object with the\\nvalue of the `source` parameter(s).\\n\\n## Merging\\n\\nTo merge multiple inbound data links,\\n[MultipleInputFeatureRequirement](#multipleinputfeaturerequirement) must be specified\\nin the workflow or workflow step requirements.\\n\\nIf the sink parameter is an array, or named in a [workflow\\nscatter](#workflowstep) operation, there may be multiple inbound data links\\nlisted in the `source` field.  The values from the input links are merged\\ndepending on the method specified in the `linkMerge` field.  If not\\nspecified, the default method is \\\"merge_nested\\\".\\n\\n* **merge_nested**\\n\\n  The input must be an array consisting of exactly one entry for each\\n  input link.  If \\\"merge_nested\\\" is specified with a single link, the value\\n  from the link must be wrapped in a single-item list.\\n\\n* **merge_flattened**\\n\\n  1. The source and sink parameters must be compatible types, or the source\\n     type must be compatible with single element from the \\\"items\\\" type of\\n     the destination array parameter.\\n  2. Source parameters which are arrays are concatenated.\\n     Source parameters which are single element types are appended as\\n     single elements.\\n\",\"fields\":[{\"name\":\"source\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Specifies one or more workflow parameters that will provide input to\\nthe underlying process parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#source\"},\"inherited_from\":\"https://w3id.org/cwl/cwl#Sink\"},{\"name\":\"linkMerge\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"LinkMergeMethod\",\"doc\":\"The input link merge method, described in [WorkflowStepInput](#workflowstepinput).\",\"symbols\":[\"merge_nested\",\"merge_flattened\"],\"docParent\":\"https://w3id.org/cwl/cwl#WorkflowStepInput\"}],\"doc\":\"The method to use to merge multiple inbound links into a single array.\\nIf not specified, the default method is \\\"merge_nested\\\".\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Sink\"},{\"name\":\"id\",\"type\":\"string\",\"doc\":\"A unique identifier for this workflow input parameter.\",\"jsonldPredicate\":\"@id\"},{\"name\":\"default\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Any\",\"doc\":\"The **Any** type validates for any non-null value.\\n\",\"symbols\":[\"Any\"]}],\"doc\":\"The default value for this parameter if there is no `source`\\nfield.\\n\",\"jsonldPredicate\":\"cwl:default\"}],\"docParent\":\"https://w3id.org/cwl/cwl#WorkflowStep\",\"extends\":\"https://w3id.org/cwl/cwl#Sink\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Specifies one or more workflow parameters that will provide input to
the underlying process parameter.
 */
  @Deprecated public java.lang.Object source;
  /** The method to use to merge multiple inbound links into a single array.
If not specified, the default method is "merge_nested".
 */
  @Deprecated public LinkMergeMethod linkMerge;
  /** A unique identifier for this workflow input parameter. */
  @Deprecated public java.lang.CharSequence id;
  /** The default value for this parameter if there is no `source`
field.
 */
  @Deprecated public Any default$;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public WorkflowStepInput() {}

  /**
   * All-args constructor.
   */
  public WorkflowStepInput(java.lang.Object source, LinkMergeMethod linkMerge, java.lang.CharSequence id, Any default$) {
    this.source = source;
    this.linkMerge = linkMerge;
    this.id = id;
    this.default$ = default$;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return source;
    case 1: return linkMerge;
    case 2: return id;
    case 3: return default$;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: source = (java.lang.Object)value$; break;
    case 1: linkMerge = (LinkMergeMethod)value$; break;
    case 2: id = (java.lang.CharSequence)value$; break;
    case 3: default$ = (Any)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'source' field.
   * Specifies one or more workflow parameters that will provide input to
the underlying process parameter.
   */
  public java.lang.Object getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * Specifies one or more workflow parameters that will provide input to
the underlying process parameter.
   * @param value the value to set.
   */
  public void setSource(java.lang.Object value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'linkMerge' field.
   * The method to use to merge multiple inbound links into a single array.
If not specified, the default method is "merge_nested".
   */
  public LinkMergeMethod getLinkMerge() {
    return linkMerge;
  }

  /**
   * Sets the value of the 'linkMerge' field.
   * The method to use to merge multiple inbound links into a single array.
If not specified, the default method is "merge_nested".
   * @param value the value to set.
   */
  public void setLinkMerge(LinkMergeMethod value) {
    this.linkMerge = value;
  }

  /**
   * Gets the value of the 'id' field.
   * A unique identifier for this workflow input parameter.   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * A unique identifier for this workflow input parameter.   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'default$' field.
   * The default value for this parameter if there is no `source`
field.
   */
  public Any getDefault$() {
    return default$;
  }

  /**
   * Sets the value of the 'default$' field.
   * The default value for this parameter if there is no `source`
field.
   * @param value the value to set.
   */
  public void setDefault$(Any value) {
    this.default$ = value;
  }

  /** Creates a new WorkflowStepInput RecordBuilder */
  public static WorkflowStepInput.Builder newBuilder() {
    return new WorkflowStepInput.Builder();
  }
  
  /** Creates a new WorkflowStepInput RecordBuilder by copying an existing Builder */
  public static WorkflowStepInput.Builder newBuilder(WorkflowStepInput.Builder other) {
    return new WorkflowStepInput.Builder(other);
  }
  
  /** Creates a new WorkflowStepInput RecordBuilder by copying an existing WorkflowStepInput instance */
  public static WorkflowStepInput.Builder newBuilder(WorkflowStepInput other) {
    return new WorkflowStepInput.Builder(other);
  }
  
  /**
   * RecordBuilder for WorkflowStepInput instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WorkflowStepInput>
    implements org.apache.avro.data.RecordBuilder<WorkflowStepInput> {

    private java.lang.Object source;
    private LinkMergeMethod linkMerge;
    private java.lang.CharSequence id;
    private Any default$;

    /** Creates a new Builder */
    private Builder() {
      super(WorkflowStepInput.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(WorkflowStepInput.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.source)) {
        this.source = data().deepCopy(fields()[0].schema(), other.source);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.linkMerge)) {
        this.linkMerge = data().deepCopy(fields()[1].schema(), other.linkMerge);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.default$)) {
        this.default$ = data().deepCopy(fields()[3].schema(), other.default$);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing WorkflowStepInput instance */
    private Builder(WorkflowStepInput other) {
            super(WorkflowStepInput.SCHEMA$);
      if (isValidValue(fields()[0], other.source)) {
        this.source = data().deepCopy(fields()[0].schema(), other.source);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.linkMerge)) {
        this.linkMerge = data().deepCopy(fields()[1].schema(), other.linkMerge);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.default$)) {
        this.default$ = data().deepCopy(fields()[3].schema(), other.default$);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'source' field */
    public java.lang.Object getSource() {
      return source;
    }
    
    /** Sets the value of the 'source' field */
    public WorkflowStepInput.Builder setSource(java.lang.Object value) {
      validate(fields()[0], value);
      this.source = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'source' field has been set */
    public boolean hasSource() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'source' field */
    public WorkflowStepInput.Builder clearSource() {
      source = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'linkMerge' field */
    public LinkMergeMethod getLinkMerge() {
      return linkMerge;
    }
    
    /** Sets the value of the 'linkMerge' field */
    public WorkflowStepInput.Builder setLinkMerge(LinkMergeMethod value) {
      validate(fields()[1], value);
      this.linkMerge = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'linkMerge' field has been set */
    public boolean hasLinkMerge() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'linkMerge' field */
    public WorkflowStepInput.Builder clearLinkMerge() {
      linkMerge = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public WorkflowStepInput.Builder setId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.id = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'id' field */
    public WorkflowStepInput.Builder clearId() {
      id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'default$' field */
    public Any getDefault$() {
      return default$;
    }
    
    /** Sets the value of the 'default$' field */
    public WorkflowStepInput.Builder setDefault$(Any value) {
      validate(fields()[3], value);
      this.default$ = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'default$' field has been set */
    public boolean hasDefault$() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'default$' field */
    public WorkflowStepInput.Builder clearDefault$() {
      default$ = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public WorkflowStepInput build() {
      try {
        WorkflowStepInput record = new WorkflowStepInput();
        record.source = fieldSetFlags()[0] ? this.source : (java.lang.Object) defaultValue(fields()[0]);
        record.linkMerge = fieldSetFlags()[1] ? this.linkMerge : (LinkMergeMethod) defaultValue(fields()[1]);
        record.id = fieldSetFlags()[2] ? this.id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.default$ = fieldSetFlags()[3] ? this.default$ : (Any) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
