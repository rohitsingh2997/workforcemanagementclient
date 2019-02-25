/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.mm.channel.accountmanagement;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-23")
public class TSearchAccountRequest implements org.apache.thrift.TBase<TSearchAccountRequest, TSearchAccountRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TSearchAccountRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSearchAccountRequest");

  private static final org.apache.thrift.protocol.TField ACCOUNT_SEARCH_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("accountSearchObject", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField RANGE_SEARCH_FIELD_DESC = new org.apache.thrift.protocol.TField("rangeSearch", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("size", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSearchAccountRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSearchAccountRequestTupleSchemeFactory();

  private java.util.Map<java.lang.String,java.util.List<java.lang.String>> accountSearchObject; // required
  private java.util.Map<java.lang.String,TRangeObject> rangeSearch; // optional
  private int offset; // optional
  private int size; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACCOUNT_SEARCH_OBJECT((short)1, "accountSearchObject"),
    RANGE_SEARCH((short)2, "rangeSearch"),
    OFFSET((short)3, "offset"),
    SIZE((short)4, "size");

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
        case 1: // ACCOUNT_SEARCH_OBJECT
          return ACCOUNT_SEARCH_OBJECT;
        case 2: // RANGE_SEARCH
          return RANGE_SEARCH;
        case 3: // OFFSET
          return OFFSET;
        case 4: // SIZE
          return SIZE;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private static final int __SIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RANGE_SEARCH,_Fields.OFFSET,_Fields.SIZE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACCOUNT_SEARCH_OBJECT, new org.apache.thrift.meta_data.FieldMetaData("accountSearchObject", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.RANGE_SEARCH, new org.apache.thrift.meta_data.FieldMetaData("rangeSearch", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRangeObject.class))));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SIZE, new org.apache.thrift.meta_data.FieldMetaData("size", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSearchAccountRequest.class, metaDataMap);
  }

  public TSearchAccountRequest() {
  }

  public TSearchAccountRequest(
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> accountSearchObject)
  {
    this();
    this.accountSearchObject = accountSearchObject;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSearchAccountRequest(TSearchAccountRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAccountSearchObject()) {
      java.util.Map<java.lang.String,java.util.List<java.lang.String>> __this__accountSearchObject = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>>(other.accountSearchObject.size());
      for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> other_element : other.accountSearchObject.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        java.util.List<java.lang.String> other_element_value = other_element.getValue();

        java.lang.String __this__accountSearchObject_copy_key = other_element_key;

        java.util.List<java.lang.String> __this__accountSearchObject_copy_value = new java.util.ArrayList<java.lang.String>(other_element_value);

        __this__accountSearchObject.put(__this__accountSearchObject_copy_key, __this__accountSearchObject_copy_value);
      }
      this.accountSearchObject = __this__accountSearchObject;
    }
    if (other.isSetRangeSearch()) {
      java.util.Map<java.lang.String,TRangeObject> __this__rangeSearch = new java.util.HashMap<java.lang.String,TRangeObject>(other.rangeSearch.size());
      for (java.util.Map.Entry<java.lang.String, TRangeObject> other_element : other.rangeSearch.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        TRangeObject other_element_value = other_element.getValue();

        java.lang.String __this__rangeSearch_copy_key = other_element_key;

        TRangeObject __this__rangeSearch_copy_value = new TRangeObject(other_element_value);

        __this__rangeSearch.put(__this__rangeSearch_copy_key, __this__rangeSearch_copy_value);
      }
      this.rangeSearch = __this__rangeSearch;
    }
    this.offset = other.offset;
    this.size = other.size;
  }

  public TSearchAccountRequest deepCopy() {
    return new TSearchAccountRequest(this);
  }

  @Override
  public void clear() {
    this.accountSearchObject = null;
    this.rangeSearch = null;
    setOffsetIsSet(false);
    this.offset = 0;
    setSizeIsSet(false);
    this.size = 0;
  }

  public int getAccountSearchObjectSize() {
    return (this.accountSearchObject == null) ? 0 : this.accountSearchObject.size();
  }

  public void putToAccountSearchObject(java.lang.String key, java.util.List<java.lang.String> val) {
    if (this.accountSearchObject == null) {
      this.accountSearchObject = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>>();
    }
    this.accountSearchObject.put(key, val);
  }

  public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getAccountSearchObject() {
    return this.accountSearchObject;
  }

  public void setAccountSearchObject(java.util.Map<java.lang.String,java.util.List<java.lang.String>> accountSearchObject) {
    this.accountSearchObject = accountSearchObject;
  }

  public void unsetAccountSearchObject() {
    this.accountSearchObject = null;
  }

  /** Returns true if field accountSearchObject is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountSearchObject() {
    return this.accountSearchObject != null;
  }

  public void setAccountSearchObjectIsSet(boolean value) {
    if (!value) {
      this.accountSearchObject = null;
    }
  }

  public int getRangeSearchSize() {
    return (this.rangeSearch == null) ? 0 : this.rangeSearch.size();
  }

  public void putToRangeSearch(java.lang.String key, TRangeObject val) {
    if (this.rangeSearch == null) {
      this.rangeSearch = new java.util.HashMap<java.lang.String,TRangeObject>();
    }
    this.rangeSearch.put(key, val);
  }

  public java.util.Map<java.lang.String,TRangeObject> getRangeSearch() {
    return this.rangeSearch;
  }

  public void setRangeSearch(java.util.Map<java.lang.String,TRangeObject> rangeSearch) {
    this.rangeSearch = rangeSearch;
  }

  public void unsetRangeSearch() {
    this.rangeSearch = null;
  }

  /** Returns true if field rangeSearch is set (has been assigned a value) and false otherwise */
  public boolean isSetRangeSearch() {
    return this.rangeSearch != null;
  }

  public void setRangeSearchIsSet(boolean value) {
    if (!value) {
      this.rangeSearch = null;
    }
  }

  public int getOffset() {
    return this.offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
    setOffsetIsSet(true);
  }

  public void unsetOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
    setSizeIsSet(true);
  }

  public void unsetSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  /** Returns true if field size is set (has been assigned a value) and false otherwise */
  public boolean isSetSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  public void setSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ACCOUNT_SEARCH_OBJECT:
      if (value == null) {
        unsetAccountSearchObject();
      } else {
        setAccountSearchObject((java.util.Map<java.lang.String,java.util.List<java.lang.String>>)value);
      }
      break;

    case RANGE_SEARCH:
      if (value == null) {
        unsetRangeSearch();
      } else {
        setRangeSearch((java.util.Map<java.lang.String,TRangeObject>)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Integer)value);
      }
      break;

    case SIZE:
      if (value == null) {
        unsetSize();
      } else {
        setSize((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ACCOUNT_SEARCH_OBJECT:
      return getAccountSearchObject();

    case RANGE_SEARCH:
      return getRangeSearch();

    case OFFSET:
      return getOffset();

    case SIZE:
      return getSize();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ACCOUNT_SEARCH_OBJECT:
      return isSetAccountSearchObject();
    case RANGE_SEARCH:
      return isSetRangeSearch();
    case OFFSET:
      return isSetOffset();
    case SIZE:
      return isSetSize();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TSearchAccountRequest)
      return this.equals((TSearchAccountRequest)that);
    return false;
  }

  public boolean equals(TSearchAccountRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_accountSearchObject = true && this.isSetAccountSearchObject();
    boolean that_present_accountSearchObject = true && that.isSetAccountSearchObject();
    if (this_present_accountSearchObject || that_present_accountSearchObject) {
      if (!(this_present_accountSearchObject && that_present_accountSearchObject))
        return false;
      if (!this.accountSearchObject.equals(that.accountSearchObject))
        return false;
    }

    boolean this_present_rangeSearch = true && this.isSetRangeSearch();
    boolean that_present_rangeSearch = true && that.isSetRangeSearch();
    if (this_present_rangeSearch || that_present_rangeSearch) {
      if (!(this_present_rangeSearch && that_present_rangeSearch))
        return false;
      if (!this.rangeSearch.equals(that.rangeSearch))
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_size = true && this.isSetSize();
    boolean that_present_size = true && that.isSetSize();
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (this.size != that.size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAccountSearchObject()) ? 131071 : 524287);
    if (isSetAccountSearchObject())
      hashCode = hashCode * 8191 + accountSearchObject.hashCode();

    hashCode = hashCode * 8191 + ((isSetRangeSearch()) ? 131071 : 524287);
    if (isSetRangeSearch())
      hashCode = hashCode * 8191 + rangeSearch.hashCode();

    hashCode = hashCode * 8191 + ((isSetOffset()) ? 131071 : 524287);
    if (isSetOffset())
      hashCode = hashCode * 8191 + offset;

    hashCode = hashCode * 8191 + ((isSetSize()) ? 131071 : 524287);
    if (isSetSize())
      hashCode = hashCode * 8191 + size;

    return hashCode;
  }

  @Override
  public int compareTo(TSearchAccountRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAccountSearchObject()).compareTo(other.isSetAccountSearchObject());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountSearchObject()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountSearchObject, other.accountSearchObject);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRangeSearch()).compareTo(other.isSetRangeSearch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRangeSearch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rangeSearch, other.rangeSearch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSize()).compareTo(other.isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.size, other.size);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSearchAccountRequest(");
    boolean first = true;

    sb.append("accountSearchObject:");
    if (this.accountSearchObject == null) {
      sb.append("null");
    } else {
      sb.append(this.accountSearchObject);
    }
    first = false;
    if (isSetRangeSearch()) {
      if (!first) sb.append(", ");
      sb.append("rangeSearch:");
      if (this.rangeSearch == null) {
        sb.append("null");
      } else {
        sb.append(this.rangeSearch);
      }
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetSize()) {
      if (!first) sb.append(", ");
      sb.append("size:");
      sb.append(this.size);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAccountSearchObject()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'accountSearchObject' is unset! Struct:" + toString());
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

  private static class TSearchAccountRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSearchAccountRequestStandardScheme getScheme() {
      return new TSearchAccountRequestStandardScheme();
    }
  }

  private static class TSearchAccountRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSearchAccountRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSearchAccountRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACCOUNT_SEARCH_OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map40 = iprot.readMapBegin();
                struct.accountSearchObject = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>>(2*_map40.size);
                java.lang.String _key41;
                java.util.List<java.lang.String> _val42;
                for (int _i43 = 0; _i43 < _map40.size; ++_i43)
                {
                  _key41 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list44 = iprot.readListBegin();
                    _val42 = new java.util.ArrayList<java.lang.String>(_list44.size);
                    java.lang.String _elem45;
                    for (int _i46 = 0; _i46 < _list44.size; ++_i46)
                    {
                      _elem45 = iprot.readString();
                      _val42.add(_elem45);
                    }
                    iprot.readListEnd();
                  }
                  struct.accountSearchObject.put(_key41, _val42);
                }
                iprot.readMapEnd();
              }
              struct.setAccountSearchObjectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RANGE_SEARCH
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map47 = iprot.readMapBegin();
                struct.rangeSearch = new java.util.HashMap<java.lang.String,TRangeObject>(2*_map47.size);
                java.lang.String _key48;
                TRangeObject _val49;
                for (int _i50 = 0; _i50 < _map47.size; ++_i50)
                {
                  _key48 = iprot.readString();
                  _val49 = new TRangeObject();
                  _val49.read(iprot);
                  struct.rangeSearch.put(_key48, _val49);
                }
                iprot.readMapEnd();
              }
              struct.setRangeSearchIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.offset = iprot.readI32();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.size = iprot.readI32();
              struct.setSizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSearchAccountRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.accountSearchObject != null) {
        oprot.writeFieldBegin(ACCOUNT_SEARCH_OBJECT_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.accountSearchObject.size()));
          for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> _iter51 : struct.accountSearchObject.entrySet())
          {
            oprot.writeString(_iter51.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter51.getValue().size()));
              for (java.lang.String _iter52 : _iter51.getValue())
              {
                oprot.writeString(_iter52);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rangeSearch != null) {
        if (struct.isSetRangeSearch()) {
          oprot.writeFieldBegin(RANGE_SEARCH_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.rangeSearch.size()));
            for (java.util.Map.Entry<java.lang.String, TRangeObject> _iter53 : struct.rangeSearch.entrySet())
            {
              oprot.writeString(_iter53.getKey());
              _iter53.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI32(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSize()) {
        oprot.writeFieldBegin(SIZE_FIELD_DESC);
        oprot.writeI32(struct.size);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSearchAccountRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSearchAccountRequestTupleScheme getScheme() {
      return new TSearchAccountRequestTupleScheme();
    }
  }

  private static class TSearchAccountRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSearchAccountRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSearchAccountRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.accountSearchObject.size());
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> _iter54 : struct.accountSearchObject.entrySet())
        {
          oprot.writeString(_iter54.getKey());
          {
            oprot.writeI32(_iter54.getValue().size());
            for (java.lang.String _iter55 : _iter54.getValue())
            {
              oprot.writeString(_iter55);
            }
          }
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRangeSearch()) {
        optionals.set(0);
      }
      if (struct.isSetOffset()) {
        optionals.set(1);
      }
      if (struct.isSetSize()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRangeSearch()) {
        {
          oprot.writeI32(struct.rangeSearch.size());
          for (java.util.Map.Entry<java.lang.String, TRangeObject> _iter56 : struct.rangeSearch.entrySet())
          {
            oprot.writeString(_iter56.getKey());
            _iter56.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeI32(struct.offset);
      }
      if (struct.isSetSize()) {
        oprot.writeI32(struct.size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSearchAccountRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map57 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.accountSearchObject = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>>(2*_map57.size);
        java.lang.String _key58;
        java.util.List<java.lang.String> _val59;
        for (int _i60 = 0; _i60 < _map57.size; ++_i60)
        {
          _key58 = iprot.readString();
          {
            org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
            _val59 = new java.util.ArrayList<java.lang.String>(_list61.size);
            java.lang.String _elem62;
            for (int _i63 = 0; _i63 < _list61.size; ++_i63)
            {
              _elem62 = iprot.readString();
              _val59.add(_elem62);
            }
          }
          struct.accountSearchObject.put(_key58, _val59);
        }
      }
      struct.setAccountSearchObjectIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map64 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.rangeSearch = new java.util.HashMap<java.lang.String,TRangeObject>(2*_map64.size);
          java.lang.String _key65;
          TRangeObject _val66;
          for (int _i67 = 0; _i67 < _map64.size; ++_i67)
          {
            _key65 = iprot.readString();
            _val66 = new TRangeObject();
            _val66.read(iprot);
            struct.rangeSearch.put(_key65, _val66);
          }
        }
        struct.setRangeSearchIsSet(true);
      }
      if (incoming.get(1)) {
        struct.offset = iprot.readI32();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.size = iprot.readI32();
        struct.setSizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

