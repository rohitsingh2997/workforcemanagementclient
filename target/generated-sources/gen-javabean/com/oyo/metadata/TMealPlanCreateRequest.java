/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-23")
public class TMealPlanCreateRequest implements org.apache.thrift.TBase<TMealPlanCreateRequest, TMealPlanCreateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TMealPlanCreateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMealPlanCreateRequest");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACRONYM_FIELD_DESC = new org.apache.thrift.protocol.TField("acronym", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMealPlanCreateRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMealPlanCreateRequestTupleSchemeFactory();

  private java.lang.String name; // required
  private java.lang.String acronym; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    ACRONYM((short)2, "acronym");

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
        case 1: // NAME
          return NAME;
        case 2: // ACRONYM
          return ACRONYM;
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
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACRONYM, new org.apache.thrift.meta_data.FieldMetaData("acronym", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMealPlanCreateRequest.class, metaDataMap);
  }

  public TMealPlanCreateRequest() {
  }

  public TMealPlanCreateRequest(
    java.lang.String name,
    java.lang.String acronym)
  {
    this();
    this.name = name;
    this.acronym = acronym;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMealPlanCreateRequest(TMealPlanCreateRequest other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetAcronym()) {
      this.acronym = other.acronym;
    }
  }

  public TMealPlanCreateRequest deepCopy() {
    return new TMealPlanCreateRequest(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.acronym = null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getAcronym() {
    return this.acronym;
  }

  public void setAcronym(java.lang.String acronym) {
    this.acronym = acronym;
  }

  public void unsetAcronym() {
    this.acronym = null;
  }

  /** Returns true if field acronym is set (has been assigned a value) and false otherwise */
  public boolean isSetAcronym() {
    return this.acronym != null;
  }

  public void setAcronymIsSet(boolean value) {
    if (!value) {
      this.acronym = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ACRONYM:
      if (value == null) {
        unsetAcronym();
      } else {
        setAcronym((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case ACRONYM:
      return getAcronym();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case ACRONYM:
      return isSetAcronym();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TMealPlanCreateRequest)
      return this.equals((TMealPlanCreateRequest)that);
    return false;
  }

  public boolean equals(TMealPlanCreateRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_acronym = true && this.isSetAcronym();
    boolean that_present_acronym = true && that.isSetAcronym();
    if (this_present_acronym || that_present_acronym) {
      if (!(this_present_acronym && that_present_acronym))
        return false;
      if (!this.acronym.equals(that.acronym))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetAcronym()) ? 131071 : 524287);
    if (isSetAcronym())
      hashCode = hashCode * 8191 + acronym.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMealPlanCreateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAcronym()).compareTo(other.isSetAcronym());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcronym()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acronym, other.acronym);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMealPlanCreateRequest(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("acronym:");
    if (this.acronym == null) {
      sb.append("null");
    } else {
      sb.append(this.acronym);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

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

  private static class TMealPlanCreateRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMealPlanCreateRequestStandardScheme getScheme() {
      return new TMealPlanCreateRequestStandardScheme();
    }
  }

  private static class TMealPlanCreateRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMealPlanCreateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMealPlanCreateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACRONYM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.acronym = iprot.readString();
              struct.setAcronymIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMealPlanCreateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.acronym != null) {
        oprot.writeFieldBegin(ACRONYM_FIELD_DESC);
        oprot.writeString(struct.acronym);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMealPlanCreateRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMealPlanCreateRequestTupleScheme getScheme() {
      return new TMealPlanCreateRequestTupleScheme();
    }
  }

  private static class TMealPlanCreateRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMealPlanCreateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMealPlanCreateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.name);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAcronym()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAcronym()) {
        oprot.writeString(struct.acronym);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMealPlanCreateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.acronym = iprot.readString();
        struct.setAcronymIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

