/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-23")
public class TWorkLoadResponse implements org.apache.thrift.TBase<TWorkLoadResponse, TWorkLoadResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TWorkLoadResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TWorkLoadResponse");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField T_WORK_LOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("tWorkLoad", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TWorkLoadResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TWorkLoadResponseTupleSchemeFactory();

  private TResponseStatus status; // required
  private TWorkLoad tWorkLoad; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TResponseStatus
     */
    STATUS((short)1, "status"),
    T_WORK_LOAD((short)2, "tWorkLoad");

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
        case 1: // STATUS
          return STATUS;
        case 2: // T_WORK_LOAD
          return T_WORK_LOAD;
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
  private static final _Fields optionals[] = {_Fields.T_WORK_LOAD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TResponseStatus.class)));
    tmpMap.put(_Fields.T_WORK_LOAD, new org.apache.thrift.meta_data.FieldMetaData("tWorkLoad", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TWorkLoad.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TWorkLoadResponse.class, metaDataMap);
  }

  public TWorkLoadResponse() {
  }

  public TWorkLoadResponse(
    TResponseStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TWorkLoadResponse(TWorkLoadResponse other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetTWorkLoad()) {
      this.tWorkLoad = new TWorkLoad(other.tWorkLoad);
    }
  }

  public TWorkLoadResponse deepCopy() {
    return new TWorkLoadResponse(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.tWorkLoad = null;
  }

  /**
   * 
   * @see TResponseStatus
   */
  public TResponseStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TResponseStatus
   */
  public void setStatus(TResponseStatus status) {
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

  public TWorkLoad getTWorkLoad() {
    return this.tWorkLoad;
  }

  public void setTWorkLoad(TWorkLoad tWorkLoad) {
    this.tWorkLoad = tWorkLoad;
  }

  public void unsetTWorkLoad() {
    this.tWorkLoad = null;
  }

  /** Returns true if field tWorkLoad is set (has been assigned a value) and false otherwise */
  public boolean isSetTWorkLoad() {
    return this.tWorkLoad != null;
  }

  public void setTWorkLoadIsSet(boolean value) {
    if (!value) {
      this.tWorkLoad = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TResponseStatus)value);
      }
      break;

    case T_WORK_LOAD:
      if (value == null) {
        unsetTWorkLoad();
      } else {
        setTWorkLoad((TWorkLoad)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case T_WORK_LOAD:
      return getTWorkLoad();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case T_WORK_LOAD:
      return isSetTWorkLoad();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TWorkLoadResponse)
      return this.equals((TWorkLoadResponse)that);
    return false;
  }

  public boolean equals(TWorkLoadResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_tWorkLoad = true && this.isSetTWorkLoad();
    boolean that_present_tWorkLoad = true && that.isSetTWorkLoad();
    if (this_present_tWorkLoad || that_present_tWorkLoad) {
      if (!(this_present_tWorkLoad && that_present_tWorkLoad))
        return false;
      if (!this.tWorkLoad.equals(that.tWorkLoad))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetTWorkLoad()) ? 131071 : 524287);
    if (isSetTWorkLoad())
      hashCode = hashCode * 8191 + tWorkLoad.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TWorkLoadResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetTWorkLoad()).compareTo(other.isSetTWorkLoad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTWorkLoad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tWorkLoad, other.tWorkLoad);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TWorkLoadResponse(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetTWorkLoad()) {
      if (!first) sb.append(", ");
      sb.append("tWorkLoad:");
      if (this.tWorkLoad == null) {
        sb.append("null");
      } else {
        sb.append(this.tWorkLoad);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (tWorkLoad != null) {
      tWorkLoad.validate();
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

  private static class TWorkLoadResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TWorkLoadResponseStandardScheme getScheme() {
      return new TWorkLoadResponseStandardScheme();
    }
  }

  private static class TWorkLoadResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TWorkLoadResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TWorkLoadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.oyo.workforce.TResponseStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // T_WORK_LOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tWorkLoad = new TWorkLoad();
              struct.tWorkLoad.read(iprot);
              struct.setTWorkLoadIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TWorkLoadResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.tWorkLoad != null) {
        if (struct.isSetTWorkLoad()) {
          oprot.writeFieldBegin(T_WORK_LOAD_FIELD_DESC);
          struct.tWorkLoad.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TWorkLoadResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TWorkLoadResponseTupleScheme getScheme() {
      return new TWorkLoadResponseTupleScheme();
    }
  }

  private static class TWorkLoadResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TWorkLoadResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TWorkLoadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.status.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTWorkLoad()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTWorkLoad()) {
        struct.tWorkLoad.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TWorkLoadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = com.oyo.workforce.TResponseStatus.findByValue(iprot.readI32());
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.tWorkLoad = new TWorkLoad();
        struct.tWorkLoad.read(iprot);
        struct.setTWorkLoadIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

