/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.pravega.schemaregistry.serializer.avro.testobjs.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Test2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8157678982198772485L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Test2\",\"namespace\":\"io.pravega.schemaregistry.testobjs.generated\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"field1\",\"type\":\"int\"},{\"name\":\"field2\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Test2> ENCODER =
      new BinaryMessageEncoder<Test2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Test2> DECODER =
      new BinaryMessageDecoder<Test2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Test2> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Test2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Test2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Test2>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Test2 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Test2 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Test2 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Test2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private CharSequence name;
   private int field1;
   private CharSequence field2;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Test2() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param field1 The new value for field1
   * @param field2 The new value for field2
   */
  public Test2(CharSequence name, Integer field1, CharSequence field2) {
    this.name = name;
    this.field1 = field1;
    this.field2 = field2;
  }

  public SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return field1;
    case 2: return field2;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: name = (CharSequence)value$; break;
    case 1: field1 = (Integer)value$; break;
    case 2: field2 = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'field1' field.
   * @return The value of the 'field1' field.
   */
  public int getField1() {
    return field1;
  }


  /**
   * Sets the value of the 'field1' field.
   * @param value the value to set.
   */
  public void setField1(int value) {
    this.field1 = value;
  }

  /**
   * Gets the value of the 'field2' field.
   * @return The value of the 'field2' field.
   */
  public CharSequence getField2() {
    return field2;
  }


  /**
   * Sets the value of the 'field2' field.
   * @param value the value to set.
   */
  public void setField2(CharSequence value) {
    this.field2 = value;
  }

  /**
   * Creates a new Test2 RecordBuilder.
   * @return A new Test2 RecordBuilder
   */
  public static Test2.Builder newBuilder() {
    return new Test2.Builder();
  }

  /**
   * Creates a new Test2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Test2 RecordBuilder
   */
  public static Test2.Builder newBuilder(Test2.Builder other) {
    if (other == null) {
      return new Test2.Builder();
    } else {
      return new Test2.Builder(other);
    }
  }

  /**
   * Creates a new Test2 RecordBuilder by copying an existing Test2 instance.
   * @param other The existing instance to copy.
   * @return A new Test2 RecordBuilder
   */
  public static Test2.Builder newBuilder(Test2 other) {
    if (other == null) {
      return new Test2.Builder();
    } else {
      return new Test2.Builder(other);
    }
  }

  /**
   * RecordBuilder for Test2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Test2>
    implements org.apache.avro.data.RecordBuilder<Test2> {

    private CharSequence name;
    private int field1;
    private CharSequence field2;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Test2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.field1)) {
        this.field1 = data().deepCopy(fields()[1].schema(), other.field1);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.field2)) {
        this.field2 = data().deepCopy(fields()[2].schema(), other.field2);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Test2 instance
     * @param other The existing instance to copy.
     */
    private Builder(Test2 other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.field1)) {
        this.field1 = data().deepCopy(fields()[1].schema(), other.field1);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.field2)) {
        this.field2 = data().deepCopy(fields()[2].schema(), other.field2);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public Test2.Builder setName(CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public Test2.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'field1' field.
      * @return The value.
      */
    public int getField1() {
      return field1;
    }


    /**
      * Sets the value of the 'field1' field.
      * @param value The value of 'field1'.
      * @return This builder.
      */
    public Test2.Builder setField1(int value) {
      validate(fields()[1], value);
      this.field1 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'field1' field has been set.
      * @return True if the 'field1' field has been set, false otherwise.
      */
    public boolean hasField1() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'field1' field.
      * @return This builder.
      */
    public Test2.Builder clearField1() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'field2' field.
      * @return The value.
      */
    public CharSequence getField2() {
      return field2;
    }


    /**
      * Sets the value of the 'field2' field.
      * @param value The value of 'field2'.
      * @return This builder.
      */
    public Test2.Builder setField2(CharSequence value) {
      validate(fields()[2], value);
      this.field2 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'field2' field has been set.
      * @return True if the 'field2' field has been set, false otherwise.
      */
    public boolean hasField2() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'field2' field.
      * @return This builder.
      */
    public Test2.Builder clearField2() {
      field2 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Test2 build() {
      try {
        Test2 record = new Test2();
        record.name = fieldSetFlags()[0] ? this.name : (CharSequence) defaultValue(fields()[0]);
        record.field1 = fieldSetFlags()[1] ? this.field1 : (Integer) defaultValue(fields()[1]);
        record.field2 = fieldSetFlags()[2] ? this.field2 : (CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Test2>
    WRITER$ = (org.apache.avro.io.DatumWriter<Test2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Test2>
    READER$ = (org.apache.avro.io.DatumReader<Test2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeInt(this.field1);

    out.writeString(this.field2);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.field1 = in.readInt();

      this.field2 = in.readString(this.field2 instanceof Utf8 ? (Utf8)this.field2 : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.field1 = in.readInt();
          break;

        case 2:
          this.field2 = in.readString(this.field2 instanceof Utf8 ? (Utf8)this.field2 : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









