/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-23")
public class THotelCategoryResponse implements org.apache.thrift.TBase<THotelCategoryResponse, THotelCategoryResponse._Fields>, java.io.Serializable, Cloneable, Comparable<THotelCategoryResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THotelCategoryResponse");

  private static final org.apache.thrift.protocol.TField HOTEL_CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("hotelCategory", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("errorList", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THotelCategoryResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THotelCategoryResponseTupleSchemeFactory();

  private THotelCategory hotelCategory; // required
  private TStatus status; // required
  private java.util.Map<java.lang.String,java.lang.String> errorList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOTEL_CATEGORY((short)1, "hotelCategory"),
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
        case 1: // HOTEL_CATEGORY
          return HOTEL_CATEGORY;
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
    tmpMap.put(_Fields.HOTEL_CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("hotelCategory", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THotelCategory.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TStatus.class)));
    tmpMap.put(_Fields.ERROR_LIST, new org.apache.thrift.meta_data.FieldMetaData("errorList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THotelCategoryResponse.class, metaDataMap);
  }

  public THotelCategoryResponse() {
  }

  public THotelCategoryResponse(
    THotelCategory hotelCategory,
    TStatus status,
    java.util.Map<java.lang.String,java.lang.String> errorList)
  {
    this();
    this.hotelCategory = hotelCategory;
    this.status = status;
    this.errorList = errorList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THotelCategoryResponse(THotelCategoryResponse other) {
    if (other.isSetHotelCategory()) {
      this.hotelCategory = new THotelCategory(other.hotelCategory);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetErrorList()) {
      java.util.Map<java.lang.String,java.lang.String> __this__errorList = new java.util.HashMap<java.lang.String,java.lang.String>(other.errorList);
      this.errorList = __this__errorList;
    }
  }

  public THotelCategoryResponse deepCopy() {
    return new THotelCategoryResponse(this);
  }

  @Override
  public void clear() {
    this.hotelCategory = null;
    this.status = null;
    this.errorList = null;
  }

  public THotelCategory getHotelCategory() {
    return this.hotelCategory;
  }

  public void setHotelCategory(THotelCategory hotelCategory) {
    this.hotelCategory = hotelCategory;
  }

  public void unsetHotelCategory() {
    this.hotelCategory = null;
  }

  /** Returns true if field hotelCategory is set (has been assigned a value) and false otherwise */
  public boolean isSetHotelCategory() {
    return this.hotelCategory != null;
  }

  public void setHotelCategoryIsSet(boolean value) {
    if (!value) {
      this.hotelCategory = null;
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
    case HOTEL_CATEGORY:
      if (value == null) {
        unsetHotelCategory();
      } else {
        setHotelCategory((THotelCategory)value);
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
    case HOTEL_CATEGORY:
      return getHotelCategory();

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
    case HOTEL_CATEGORY:
      return isSetHotelCategory();
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
    if (that instanceof THotelCategoryResponse)
      return this.equals((THotelCategoryResponse)that);
    return false;
  }

  public boolean equals(THotelCategoryResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hotelCategory = true && this.isSetHotelCategory();
    boolean that_present_hotelCategory = true && that.isSetHotelCategory();
    if (this_present_hotelCategory || that_present_hotelCategory) {
      if (!(this_present_hotelCategory && that_present_hotelCategory))
        return false;
      if (!this.hotelCategory.equals(that.hotelCategory))
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

    hashCode = hashCode * 8191 + ((isSetHotelCategory()) ? 131071 : 524287);
    if (isSetHotelCategory())
      hashCode = hashCode * 8191 + hotelCategory.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetErrorList()) ? 131071 : 524287);
    if (isSetErrorList())
      hashCode = hashCode * 8191 + errorList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(THotelCategoryResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHotelCategory()).compareTo(other.isSetHotelCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHotelCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hotelCategory, other.hotelCategory);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THotelCategoryResponse(");
    boolean first = true;

    sb.append("hotelCategory:");
    if (this.hotelCategory == null) {
      sb.append("null");
    } else {
      sb.append(this.hotelCategory);
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
    if (hotelCategory != null) {
      hotelCategory.validate();
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

  private static class THotelCategoryResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THotelCategoryResponseStandardScheme getScheme() {
      return new THotelCategoryResponseStandardScheme();
    }
  }

  private static class THotelCategoryResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<THotelCategoryResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THotelCategoryResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOTEL_CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hotelCategory = new THotelCategory();
              struct.hotelCategory.read(iprot);
              struct.setHotelCategoryIsSet(true);
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
                org.apache.thrift.protocol.TMap _map208 = iprot.readMapBegin();
                struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map208.size);
                java.lang.String _key209;
                java.lang.String _val210;
                for (int _i211 = 0; _i211 < _map208.size; ++_i211)
                {
                  _key209 = iprot.readString();
                  _val210 = iprot.readString();
                  struct.errorList.put(_key209, _val210);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, THotelCategoryResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hotelCategory != null) {
        oprot.writeFieldBegin(HOTEL_CATEGORY_FIELD_DESC);
        struct.hotelCategory.write(oprot);
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
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter212 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter212.getKey());
            oprot.writeString(_iter212.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THotelCategoryResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THotelCategoryResponseTupleScheme getScheme() {
      return new THotelCategoryResponseTupleScheme();
    }
  }

  private static class THotelCategoryResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<THotelCategoryResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THotelCategoryResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHotelCategory()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetErrorList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetHotelCategory()) {
        struct.hotelCategory.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetErrorList()) {
        {
          oprot.writeI32(struct.errorList.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter213 : struct.errorList.entrySet())
          {
            oprot.writeString(_iter213.getKey());
            oprot.writeString(_iter213.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THotelCategoryResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.hotelCategory = new THotelCategory();
        struct.hotelCategory.read(iprot);
        struct.setHotelCategoryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = com.oyo.metadata.TStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map214 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.errorList = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map214.size);
          java.lang.String _key215;
          java.lang.String _val216;
          for (int _i217 = 0; _i217 < _map214.size; ++_i217)
          {
            _key215 = iprot.readString();
            _val216 = iprot.readString();
            struct.errorList.put(_key215, _val216);
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

