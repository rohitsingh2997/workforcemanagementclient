/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-05-22")
public class TPaxRangeResponse implements org.apache.thrift.TBase<TPaxRangeResponse, TPaxRangeResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TPaxRangeResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPaxRangeResponse");

  private static final org.apache.thrift.protocol.TField PAX_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("paxRange", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("errorList", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPaxRangeResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPaxRangeResponseTupleSchemeFactory();

  private TPaxRange paxRange; // required
  private TStatus status; // required
  private java.util.Map<java.lang.String,java.lang.String> errorList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAX_RANGE((short)1, "paxRange"),
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
        case 1: // PAX_RANGE
          return PAX_RANGE;
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
    tmpMap.put(_Fields.PAX_RANGE, new org.apache.thrift.meta_data.FieldMetaData("paxRange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPaxRange.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TStatus.class)));
    tmpMap.put(_Fields.ERROR_LIST, new org.apache.thrift.meta_data.FieldMetaData("errorList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPaxRangeResponse.class, metaDataMap);
  }

  public TPaxRangeResponse() {
  }

  public TPaxRangeResponse(
    TPaxRange paxRange,
    TStatus status,
    java.util.Map<java.lang.String,java.lang.String> errorList)
  {
    this();
    this.paxRange = paxRange;
    this.status = status;
    this.errorList = errorList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPaxRangeResponse(TPaxRangeResponse other) {
    if (other.isSetPaxRange()) {
      this.paxRange = new TPaxRange(other.paxRange);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetErrorList()) {
      java.util.Map<java.lang.String,java.lang.String> __this__errorList = new java.util.HashMap<java.lang.String,java.lang.String>(other.errorList);
      this.errorList = __this__errorList;
    }
  }

  public TPaxRangeResponse deepCopy() {
    return new TPaxRangeResponse(this);
  }

  @Override
  public void clear() {
    this.paxRange = null;
    this.status = null;
    this.errorList = null;
  }

  public TPaxRange getPaxRange() {
    return this.paxRange;
  }

  public void setPaxRange(TPaxRange paxRange) {
    this.paxRange = paxRange;
  }

  public void unsetPaxRange() {
    this.paxRange = null;
  }

  /** Returns true if field paxRange is set (has been assigned a value) and false otherwise */
  public boolean isSetPaxRange() {
    return this.paxRange != null;
  }

  public void setPaxRangeIsSet(boolean value) {
    if (!value) {
      this.paxRange = null;
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
    case PAX_RANGE:
      if (value == null) {
        unsetPaxRange();
      } else {
        setPaxRange((TPaxRange)value);
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
    case PAX_RANGE:
      return getPaxRange();

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
    case PAX_RANGE:
      return isSetPaxRange();
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
    if (that instanceof TPaxRangeResponse)
      return this.equals((TPaxRangeResponse)that);
    return false;
  }

  public boolean equals(TPaxRangeResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_paxRange = true && this.isSetPaxRange();
    boolean that_present_paxRange = true && that.isSetPaxRange();
    if (this_present_paxRange || that_present_paxRange) {
      if (!(this_present_paxRange && that_present_paxRange))
        return false;
      if (!this.paxRange.equals(that.paxRange))
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

    hashCode = hashCode * 8191 + ((isSetPaxRange()) ? 131071 : 524287);
    if (isSetPaxRange())
      hashCode = hashCode * 8191 + paxRange.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetErrorList()) ? 131071 : 524287);
    if (isSetErrorList())
      hashCode = hashCode * 8191 + errorList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPaxRangeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPaxRange()).compareTo(other.isSetPaxRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaxRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paxRange, other.paxRange);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPaxRangeResponse(");
    boolean first = true;

    sb.append("paxRange:");
    if (this.paxRange == null) {
      sb.append("null");
    } else {
      sb.append(this.paxRange);
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
    if (paxRange != null) {
      paxRange.validate();
    }
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

  private static class TPaxRangeResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPaxRangeResponseStandardScheme getScheme() {
      return new TPaxRangeResponseStandardScheme();
    }
  }

  private static class TPaxRangeResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPaxRangeResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPaxRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAX_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.paxRange = new TPaxRange();
              struct.paxRange.read(iprot);
              struct.setPaxRangeIsSet(true);
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
                org.apache.thrift.protocol.TMap _map548 = iprot.readMapBegin();
                struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map548.size);
                java.lang.String _key549;
                java.lang.String _val550;
                for (int _i551 = 0; _i551 < _map548.size; ++_i551)
                {
                  _key549 = iprot.readString();
                  _val550 = iprot.readString();
                  struct.errorList.put(_key549, _val550);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPaxRangeResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.paxRange != null) {
        oprot.writeFieldBegin(PAX_RANGE_FIELD_DESC);
        struct.paxRange.write(oprot);
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
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter552 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter552.getKey());
            oprot.writeString(_iter552.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPaxRangeResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPaxRangeResponseTupleScheme getScheme() {
      return new TPaxRangeResponseTupleScheme();
    }
  }

  private static class TPaxRangeResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPaxRangeResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPaxRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPaxRange()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetErrorList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPaxRange()) {
        struct.paxRange.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetErrorList()) {
        {
          oprot.writeI32(struct.errorList.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter553 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter553.getKey());
            oprot.writeString(_iter553.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPaxRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.paxRange = new TPaxRange();
        struct.paxRange.read(iprot);
        struct.setPaxRangeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = com.oyo.metadata.TStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map554 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map554.size);
          java.lang.String _key555;
          java.lang.String _val556;
          for (int _i557 = 0; _i557 < _map554.size; ++_i557)
          {
            _key555 = iprot.readString();
            _val556 = iprot.readString();
            struct.errorList.put(_key555, _val556);
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

