/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-23")
public class TEmployeeOnboardRequest implements org.apache.thrift.TBase<TEmployeeOnboardRequest, TEmployeeOnboardRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TEmployeeOnboardRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TEmployeeOnboardRequest");

  private static final org.apache.thrift.protocol.TField USER_PROFILE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userProfileId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField BUSINESS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("businessId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TEmployeeOnboardRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TEmployeeOnboardRequestTupleSchemeFactory();

  private long userProfileId; // required
  private java.lang.String businessId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_PROFILE_ID((short)1, "userProfileId"),
    BUSINESS_ID((short)2, "businessId");

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
        case 1: // USER_PROFILE_ID
          return USER_PROFILE_ID;
        case 2: // BUSINESS_ID
          return BUSINESS_ID;
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
  private static final int __USERPROFILEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_PROFILE_ID, new org.apache.thrift.meta_data.FieldMetaData("userProfileId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BUSINESS_ID, new org.apache.thrift.meta_data.FieldMetaData("businessId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TEmployeeOnboardRequest.class, metaDataMap);
  }

  public TEmployeeOnboardRequest() {
  }

  public TEmployeeOnboardRequest(
    long userProfileId,
    java.lang.String businessId)
  {
    this();
    this.userProfileId = userProfileId;
    setUserProfileIdIsSet(true);
    this.businessId = businessId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TEmployeeOnboardRequest(TEmployeeOnboardRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userProfileId = other.userProfileId;
    if (other.isSetBusinessId()) {
      this.businessId = other.businessId;
    }
  }

  public TEmployeeOnboardRequest deepCopy() {
    return new TEmployeeOnboardRequest(this);
  }

  @Override
  public void clear() {
    setUserProfileIdIsSet(false);
    this.userProfileId = 0;
    this.businessId = null;
  }

  public long getUserProfileId() {
    return this.userProfileId;
  }

  public void setUserProfileId(long userProfileId) {
    this.userProfileId = userProfileId;
    setUserProfileIdIsSet(true);
  }

  public void unsetUserProfileId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERPROFILEID_ISSET_ID);
  }

  /** Returns true if field userProfileId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserProfileId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERPROFILEID_ISSET_ID);
  }

  public void setUserProfileIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERPROFILEID_ISSET_ID, value);
  }

  public java.lang.String getBusinessId() {
    return this.businessId;
  }

  public void setBusinessId(java.lang.String businessId) {
    this.businessId = businessId;
  }

  public void unsetBusinessId() {
    this.businessId = null;
  }

  /** Returns true if field businessId is set (has been assigned a value) and false otherwise */
  public boolean isSetBusinessId() {
    return this.businessId != null;
  }

  public void setBusinessIdIsSet(boolean value) {
    if (!value) {
      this.businessId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_PROFILE_ID:
      if (value == null) {
        unsetUserProfileId();
      } else {
        setUserProfileId((java.lang.Long)value);
      }
      break;

    case BUSINESS_ID:
      if (value == null) {
        unsetBusinessId();
      } else {
        setBusinessId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_PROFILE_ID:
      return getUserProfileId();

    case BUSINESS_ID:
      return getBusinessId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_PROFILE_ID:
      return isSetUserProfileId();
    case BUSINESS_ID:
      return isSetBusinessId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TEmployeeOnboardRequest)
      return this.equals((TEmployeeOnboardRequest)that);
    return false;
  }

  public boolean equals(TEmployeeOnboardRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userProfileId = true;
    boolean that_present_userProfileId = true;
    if (this_present_userProfileId || that_present_userProfileId) {
      if (!(this_present_userProfileId && that_present_userProfileId))
        return false;
      if (this.userProfileId != that.userProfileId)
        return false;
    }

    boolean this_present_businessId = true && this.isSetBusinessId();
    boolean that_present_businessId = true && that.isSetBusinessId();
    if (this_present_businessId || that_present_businessId) {
      if (!(this_present_businessId && that_present_businessId))
        return false;
      if (!this.businessId.equals(that.businessId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(userProfileId);

    hashCode = hashCode * 8191 + ((isSetBusinessId()) ? 131071 : 524287);
    if (isSetBusinessId())
      hashCode = hashCode * 8191 + businessId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TEmployeeOnboardRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserProfileId()).compareTo(other.isSetUserProfileId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserProfileId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userProfileId, other.userProfileId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBusinessId()).compareTo(other.isSetBusinessId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.businessId, other.businessId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TEmployeeOnboardRequest(");
    boolean first = true;

    sb.append("userProfileId:");
    sb.append(this.userProfileId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("businessId:");
    if (this.businessId == null) {
      sb.append("null");
    } else {
      sb.append(this.businessId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetUserProfileId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userProfileId' is unset! Struct:" + toString());
    }

    if (!isSetBusinessId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'businessId' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TEmployeeOnboardRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TEmployeeOnboardRequestStandardScheme getScheme() {
      return new TEmployeeOnboardRequestStandardScheme();
    }
  }

  private static class TEmployeeOnboardRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TEmployeeOnboardRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TEmployeeOnboardRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_PROFILE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userProfileId = iprot.readI64();
              struct.setUserProfileIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUSINESS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.businessId = iprot.readString();
              struct.setBusinessIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TEmployeeOnboardRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_PROFILE_ID_FIELD_DESC);
      oprot.writeI64(struct.userProfileId);
      oprot.writeFieldEnd();
      if (struct.businessId != null) {
        oprot.writeFieldBegin(BUSINESS_ID_FIELD_DESC);
        oprot.writeString(struct.businessId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TEmployeeOnboardRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TEmployeeOnboardRequestTupleScheme getScheme() {
      return new TEmployeeOnboardRequestTupleScheme();
    }
  }

  private static class TEmployeeOnboardRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TEmployeeOnboardRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TEmployeeOnboardRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.userProfileId);
      oprot.writeString(struct.businessId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TEmployeeOnboardRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userProfileId = iprot.readI64();
      struct.setUserProfileIdIsSet(true);
      struct.businessId = iprot.readString();
      struct.setBusinessIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

