/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.mm.channel.accountmanagement;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-27")
public class TRangeObject implements org.apache.thrift.TBase<TRangeObject, TRangeObject._Fields>, java.io.Serializable, Cloneable, Comparable<TRangeObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRangeObject");

  private static final org.apache.thrift.protocol.TField START_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("startRange", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("endRange", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRangeObjectStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRangeObjectTupleSchemeFactory();

  private java.lang.String startRange; // required
  private java.lang.String endRange; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_RANGE((short)1, "startRange"),
    END_RANGE((short)2, "endRange");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START_RANGE
          return START_RANGE;
        case 2: // END_RANGE
          return END_RANGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_RANGE, new org.apache.thrift.meta_data.FieldMetaData("startRange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_RANGE, new org.apache.thrift.meta_data.FieldMetaData("endRange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRangeObject.class, metaDataMap);
  }

  public TRangeObject() {
  }

  public TRangeObject(
    java.lang.String startRange,
    java.lang.String endRange)
  {
    this();
    this.startRange = startRange;
    this.endRange = endRange;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRangeObject(TRangeObject other) {
    if (other.isSetStartRange()) {
      this.startRange = other.startRange;
    }
    if (other.isSetEndRange()) {
      this.endRange = other.endRange;
    }
  }

  public TRangeObject deepCopy() {
    return new TRangeObject(this);
  }

  @Override
  public void clear() {
    this.startRange = null;
    this.endRange = null;
  }

  public java.lang.String getStartRange() {
    return this.startRange;
  }

  public void setStartRange(java.lang.String startRange) {
    this.startRange = startRange;
  }

  public void unsetStartRange() {
    this.startRange = null;
  }

  /** Returns true if field startRange is set (has been assigned a value) and false otherwise */
  public boolean isSetStartRange() {
    return this.startRange != null;
  }

  public void setStartRangeIsSet(boolean value) {
    if (!value) {
      this.startRange = null;
    }
  }

  public java.lang.String getEndRange() {
    return this.endRange;
  }

  public void setEndRange(java.lang.String endRange) {
    this.endRange = endRange;
  }

  public void unsetEndRange() {
    this.endRange = null;
  }

  /** Returns true if field endRange is set (has been assigned a value) and false otherwise */
  public boolean isSetEndRange() {
    return this.endRange != null;
  }

  public void setEndRangeIsSet(boolean value) {
    if (!value) {
      this.endRange = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case START_RANGE:
      if (value == null) {
        unsetStartRange();
      } else {
        setStartRange((java.lang.String)value);
      }
      break;

    case END_RANGE:
      if (value == null) {
        unsetEndRange();
      } else {
        setEndRange((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START_RANGE:
      return getStartRange();

    case END_RANGE:
      return getEndRange();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START_RANGE:
      return isSetStartRange();
    case END_RANGE:
      return isSetEndRange();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TRangeObject)
      return this.equals((TRangeObject)that);
    return false;
  }

  public boolean equals(TRangeObject that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_startRange = true && this.isSetStartRange();
    boolean that_present_startRange = true && that.isSetStartRange();
    if (this_present_startRange || that_present_startRange) {
      if (!(this_present_startRange && that_present_startRange))
        return false;
      if (!this.startRange.equals(that.startRange))
        return false;
    }

    boolean this_present_endRange = true && this.isSetEndRange();
    boolean that_present_endRange = true && that.isSetEndRange();
    if (this_present_endRange || that_present_endRange) {
      if (!(this_present_endRange && that_present_endRange))
        return false;
      if (!this.endRange.equals(that.endRange))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStartRange()) ? 131071 : 524287);
    if (isSetStartRange())
      hashCode = hashCode * 8191 + startRange.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndRange()) ? 131071 : 524287);
    if (isSetEndRange())
      hashCode = hashCode * 8191 + endRange.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRangeObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStartRange()).compareTo(other.isSetStartRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startRange, other.startRange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndRange()).compareTo(other.isSetEndRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endRange, other.endRange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRangeObject(");
    boolean first = true;

    sb.append("startRange:");
    if (this.startRange == null) {
      sb.append("null");
    } else {
      sb.append(this.startRange);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endRange:");
    if (this.endRange == null) {
      sb.append("null");
    } else {
      sb.append(this.endRange);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRangeObjectStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRangeObjectStandardScheme getScheme() {
      return new TRangeObjectStandardScheme();
    }
  }

  private static class TRangeObjectStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRangeObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRangeObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startRange = iprot.readString();
              struct.setStartRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endRange = iprot.readString();
              struct.setEndRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRangeObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.startRange != null) {
        oprot.writeFieldBegin(START_RANGE_FIELD_DESC);
        oprot.writeString(struct.startRange);
        oprot.writeFieldEnd();
      }
      if (struct.endRange != null) {
        oprot.writeFieldBegin(END_RANGE_FIELD_DESC);
        oprot.writeString(struct.endRange);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRangeObjectTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRangeObjectTupleScheme getScheme() {
      return new TRangeObjectTupleScheme();
    }
  }

  private static class TRangeObjectTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRangeObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRangeObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStartRange()) {
        optionals.set(0);
      }
      if (struct.isSetEndRange()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStartRange()) {
        oprot.writeString(struct.startRange);
      }
      if (struct.isSetEndRange()) {
        oprot.writeString(struct.endRange);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRangeObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.startRange = iprot.readString();
        struct.setStartRangeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endRange = iprot.readString();
        struct.setEndRangeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

