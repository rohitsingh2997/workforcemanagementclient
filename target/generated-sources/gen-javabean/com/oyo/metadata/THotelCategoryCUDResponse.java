/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-05-22")
public class THotelCategoryCUDResponse implements org.apache.thrift.TBase<THotelCategoryCUDResponse, THotelCategoryCUDResponse._Fields>, java.io.Serializable, Cloneable, Comparable<THotelCategoryCUDResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THotelCategoryCUDResponse");

  private static final org.apache.thrift.protocol.TField METADATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("metadataId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("errorList", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THotelCategoryCUDResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THotelCategoryCUDResponseTupleSchemeFactory();

  private java.lang.String metadataId; // required
  private TStatus status; // required
  private java.util.Map<java.lang.String,java.lang.String> errorList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA_ID((short)1, "metadataId"),
    /**
     * 
     * @see TStatus
     */
    STATUS((short)2, "status"),
    ERROR_LIST((short)3, "errorList");

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
        case 1: // METADATA_ID
          return METADATA_ID;
        case 2: // STATUS
          return STATUS;
        case 3: // ERROR_LIST
          return ERROR_LIST;
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
    tmpMap.put(_Fields.METADATA_ID, new org.apache.thrift.meta_data.FieldMetaData("metadataId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TStatus.class)));
    tmpMap.put(_Fields.ERROR_LIST, new org.apache.thrift.meta_data.FieldMetaData("errorList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THotelCategoryCUDResponse.class, metaDataMap);
  }

  public THotelCategoryCUDResponse() {
  }

  public THotelCategoryCUDResponse(
    java.lang.String metadataId,
    TStatus status,
    java.util.Map<java.lang.String,java.lang.String> errorList)
  {
    this();
    this.metadataId = metadataId;
    this.status = status;
    this.errorList = errorList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THotelCategoryCUDResponse(THotelCategoryCUDResponse other) {
    if (other.isSetMetadataId()) {
      this.metadataId = other.metadataId;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetErrorList()) {
      java.util.Map<java.lang.String,java.lang.String> __this__errorList = new java.util.HashMap<java.lang.String,java.lang.String>(other.errorList);
      this.errorList = __this__errorList;
    }
  }

  public THotelCategoryCUDResponse deepCopy() {
    return new THotelCategoryCUDResponse(this);
  }

  @Override
  public void clear() {
    this.metadataId = null;
    this.status = null;
    this.errorList = null;
  }

  public java.lang.String getMetadataId() {
    return this.metadataId;
  }

  public void setMetadataId(java.lang.String metadataId) {
    this.metadataId = metadataId;
  }

  public void unsetMetadataId() {
    this.metadataId = null;
  }

  /** Returns true if field metadataId is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataId() {
    return this.metadataId != null;
  }

  public void setMetadataIdIsSet(boolean value) {
    if (!value) {
      this.metadataId = null;
    }
  }

  /**
   * 
   * @see TStatus
   */
  public TStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TStatus
   */
  public void setStatus(TStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getErrorListSize() {
    return (this.errorList == null) ? 0 : this.errorList.size();
  }

  public void putToErrorList(java.lang.String key, java.lang.String val) {
    if (this.errorList == null) {
      this.errorList = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.errorList.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getErrorList() {
    return this.errorList;
  }

  public void setErrorList(java.util.Map<java.lang.String,java.lang.String> errorList) {
    this.errorList = errorList;
  }

  public void unsetErrorList() {
    this.errorList = null;
  }

  /** Returns true if field errorList is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorList() {
    return this.errorList != null;
  }

  public void setErrorListIsSet(boolean value) {
    if (!value) {
      this.errorList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case METADATA_ID:
      if (value == null) {
        unsetMetadataId();
      } else {
        setMetadataId((java.lang.String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TStatus)value);
      }
      break;

    case ERROR_LIST:
      if (value == null) {
        unsetErrorList();
      } else {
        setErrorList((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_ID:
      return getMetadataId();

    case STATUS:
      return getStatus();

    case ERROR_LIST:
      return getErrorList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case METADATA_ID:
      return isSetMetadataId();
    case STATUS:
      return isSetStatus();
    case ERROR_LIST:
      return isSetErrorList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof THotelCategoryCUDResponse)
      return this.equals((THotelCategoryCUDResponse)that);
    return false;
  }

  public boolean equals(THotelCategoryCUDResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_metadataId = true && this.isSetMetadataId();
    boolean that_present_metadataId = true && that.isSetMetadataId();
    if (this_present_metadataId || that_present_metadataId) {
      if (!(this_present_metadataId && that_present_metadataId))
        return false;
      if (!this.metadataId.equals(that.metadataId))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_errorList = true && this.isSetErrorList();
    boolean that_present_errorList = true && that.isSetErrorList();
    if (this_present_errorList || that_present_errorList) {
      if (!(this_present_errorList && that_present_errorList))
        return false;
      if (!this.errorList.equals(that.errorList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMetadataId()) ? 131071 : 524287);
    if (isSetMetadataId())
      hashCode = hashCode * 8191 + metadataId.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetErrorList()) ? 131071 : 524287);
    if (isSetErrorList())
      hashCode = hashCode * 8191 + errorList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(THotelCategoryCUDResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMetadataId()).compareTo(other.isSetMetadataId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadataId, other.metadataId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrorList()).compareTo(other.isSetErrorList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorList, other.errorList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THotelCategoryCUDResponse(");
    boolean first = true;

    sb.append("metadataId:");
    if (this.metadataId == null) {
      sb.append("null");
    } else {
      sb.append(this.metadataId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorList:");
    if (this.errorList == null) {
      sb.append("null");
    } else {
      sb.append(this.errorList);
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

  private static class THotelCategoryCUDResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THotelCategoryCUDResponseStandardScheme getScheme() {
      return new THotelCategoryCUDResponseStandardScheme();
    }
  }

  private static class THotelCategoryCUDResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<THotelCategoryCUDResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THotelCategoryCUDResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadataId = iprot.readString();
              struct.setMetadataIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.oyo.metadata.TStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map218 = iprot.readMapBegin();
                struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map218.size);
                java.lang.String _key219;
                java.lang.String _val220;
                for (int _i221 = 0; _i221 < _map218.size; ++_i221)
                {
                  _key219 = iprot.readString();
                  _val220 = iprot.readString();
                  struct.errorList.put(_key219, _val220);
                }
                iprot.readMapEnd();
              }
              struct.setErrorListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, THotelCategoryCUDResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadataId != null) {
        oprot.writeFieldBegin(METADATA_ID_FIELD_DESC);
        oprot.writeString(struct.metadataId);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.errorList != null) {
        oprot.writeFieldBegin(ERROR_LIST_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.errorList.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter222 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter222.getKey());
            oprot.writeString(_iter222.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THotelCategoryCUDResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THotelCategoryCUDResponseTupleScheme getScheme() {
      return new THotelCategoryCUDResponseTupleScheme();
    }
  }

  private static class THotelCategoryCUDResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<THotelCategoryCUDResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THotelCategoryCUDResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMetadataId()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetErrorList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMetadataId()) {
        oprot.writeString(struct.metadataId);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetErrorList()) {
        {
          oprot.writeI32(struct.errorList.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter223 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter223.getKey());
            oprot.writeString(_iter223.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THotelCategoryCUDResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.metadataId = iprot.readString();
        struct.setMetadataIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = com.oyo.metadata.TStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map224 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map224.size);
          java.lang.String _key225;
          java.lang.String _val226;
          for (int _i227 = 0; _i227 < _map224.size; ++_i227)
          {
            _key225 = iprot.readString();
            _val226 = iprot.readString();
            struct.errorList.put(_key225, _val226);
          }
        }
        struct.setErrorListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

