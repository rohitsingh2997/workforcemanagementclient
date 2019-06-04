/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-05-22")
public class TMonthResponse implements org.apache.thrift.TBase<TMonthResponse, TMonthResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TMonthResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMonthResponse");

  private static final org.apache.thrift.protocol.TField MONTH_FIELD_DESC = new org.apache.thrift.protocol.TField("month", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("errorList", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMonthResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMonthResponseTupleSchemeFactory();

  private TMonth month; // required
  private TStatus status; // required
  private java.util.Map<java.lang.String,java.lang.String> errorList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MONTH((short)1, "month"),
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
        case 1: // MONTH
          return MONTH;
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
    tmpMap.put(_Fields.MONTH, new org.apache.thrift.meta_data.FieldMetaData("month", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMonth.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TStatus.class)));
    tmpMap.put(_Fields.ERROR_LIST, new org.apache.thrift.meta_data.FieldMetaData("errorList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMonthResponse.class, metaDataMap);
  }

  public TMonthResponse() {
  }

  public TMonthResponse(
    TMonth month,
    TStatus status,
    java.util.Map<java.lang.String,java.lang.String> errorList)
  {
    this();
    this.month = month;
    this.status = status;
    this.errorList = errorList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMonthResponse(TMonthResponse other) {
    if (other.isSetMonth()) {
      this.month = new TMonth(other.month);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetErrorList()) {
      java.util.Map<java.lang.String,java.lang.String> __this__errorList = new java.util.HashMap<java.lang.String,java.lang.String>(other.errorList);
      this.errorList = __this__errorList;
    }
  }

  public TMonthResponse deepCopy() {
    return new TMonthResponse(this);
  }

  @Override
  public void clear() {
    this.month = null;
    this.status = null;
    this.errorList = null;
  }

  public TMonth getMonth() {
    return this.month;
  }

  public void setMonth(TMonth month) {
    this.month = month;
  }

  public void unsetMonth() {
    this.month = null;
  }

  /** Returns true if field month is set (has been assigned a value) and false otherwise */
  public boolean isSetMonth() {
    return this.month != null;
  }

  public void setMonthIsSet(boolean value) {
    if (!value) {
      this.month = null;
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
    case MONTH:
      if (value == null) {
        unsetMonth();
      } else {
        setMonth((TMonth)value);
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
    case MONTH:
      return getMonth();

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
    case MONTH:
      return isSetMonth();
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
    if (that instanceof TMonthResponse)
      return this.equals((TMonthResponse)that);
    return false;
  }

  public boolean equals(TMonthResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_month = true && this.isSetMonth();
    boolean that_present_month = true && that.isSetMonth();
    if (this_present_month || that_present_month) {
      if (!(this_present_month && that_present_month))
        return false;
      if (!this.month.equals(that.month))
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

    hashCode = hashCode * 8191 + ((isSetMonth()) ? 131071 : 524287);
    if (isSetMonth())
      hashCode = hashCode * 8191 + month.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetErrorList()) ? 131071 : 524287);
    if (isSetErrorList())
      hashCode = hashCode * 8191 + errorList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMonthResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMonth()).compareTo(other.isSetMonth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.month, other.month);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMonthResponse(");
    boolean first = true;

    sb.append("month:");
    if (this.month == null) {
      sb.append("null");
    } else {
      sb.append(this.month);
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
    if (month != null) {
      month.validate();
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

  private static class TMonthResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMonthResponseStandardScheme getScheme() {
      return new TMonthResponseStandardScheme();
    }
  }

  private static class TMonthResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMonthResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMonthResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MONTH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.month = new TMonth();
              struct.month.read(iprot);
              struct.setMonthIsSet(true);
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
                org.apache.thrift.protocol.TMap _map128 = iprot.readMapBegin();
                struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map128.size);
                java.lang.String _key129;
                java.lang.String _val130;
                for (int _i131 = 0; _i131 < _map128.size; ++_i131)
                {
                  _key129 = iprot.readString();
                  _val130 = iprot.readString();
                  struct.errorList.put(_key129, _val130);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMonthResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.month != null) {
        oprot.writeFieldBegin(MONTH_FIELD_DESC);
        struct.month.write(oprot);
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
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter132 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter132.getKey());
            oprot.writeString(_iter132.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMonthResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMonthResponseTupleScheme getScheme() {
      return new TMonthResponseTupleScheme();
    }
  }

  private static class TMonthResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMonthResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMonthResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMonth()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetErrorList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMonth()) {
        struct.month.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetErrorList()) {
        {
          oprot.writeI32(struct.errorList.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter133 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter133.getKey());
            oprot.writeString(_iter133.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMonthResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.month = new TMonth();
        struct.month.read(iprot);
        struct.setMonthIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = com.oyo.metadata.TStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map134 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map134.size);
          java.lang.String _key135;
          java.lang.String _val136;
          for (int _i137 = 0; _i137 < _map134.size; ++_i137)
          {
            _key135 = iprot.readString();
            _val136 = iprot.readString();
            struct.errorList.put(_key135, _val136);
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

