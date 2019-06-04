/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.mm.channel.accountmanagement;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-05-22")
public class TAccountSearchResponse implements org.apache.thrift.TBase<TAccountSearchResponse, TAccountSearchResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TAccountSearchResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAccountSearchResponse");

  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("accountIds", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ACCOUNT_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("accountNames", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ACCOUNTS_FIELD_DESC = new org.apache.thrift.protocol.TField("accounts", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAccountSearchResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAccountSearchResponseTupleSchemeFactory();

  private int count; // required
  private java.util.List<java.lang.String> accountIds; // optional
  private java.util.List<java.lang.String> accountNames; // optional
  private java.util.List<TAccountObject> accounts; // optional
  private boolean success; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COUNT((short)1, "count"),
    ACCOUNT_IDS((short)2, "accountIds"),
    ACCOUNT_NAMES((short)3, "accountNames"),
    ACCOUNTS((short)4, "accounts"),
    SUCCESS((short)5, "success");

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
        case 1: // COUNT
          return COUNT;
        case 2: // ACCOUNT_IDS
          return ACCOUNT_IDS;
        case 3: // ACCOUNT_NAMES
          return ACCOUNT_NAMES;
        case 4: // ACCOUNTS
          return ACCOUNTS;
        case 5: // SUCCESS
          return SUCCESS;
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
  private static final int __COUNT_ISSET_ID = 0;
  private static final int __SUCCESS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ACCOUNT_IDS,_Fields.ACCOUNT_NAMES,_Fields.ACCOUNTS,_Fields.SUCCESS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACCOUNT_IDS, new org.apache.thrift.meta_data.FieldMetaData("accountIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ACCOUNT_NAMES, new org.apache.thrift.meta_data.FieldMetaData("accountNames", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ACCOUNTS, new org.apache.thrift.meta_data.FieldMetaData("accounts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAccountObject.class))));
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAccountSearchResponse.class, metaDataMap);
  }

  public TAccountSearchResponse() {
  }

  public TAccountSearchResponse(
    int count)
  {
    this();
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAccountSearchResponse(TAccountSearchResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.count = other.count;
    if (other.isSetAccountIds()) {
      java.util.List<java.lang.String> __this__accountIds = new java.util.ArrayList<java.lang.String>(other.accountIds);
      this.accountIds = __this__accountIds;
    }
    if (other.isSetAccountNames()) {
      java.util.List<java.lang.String> __this__accountNames = new java.util.ArrayList<java.lang.String>(other.accountNames);
      this.accountNames = __this__accountNames;
    }
    if (other.isSetAccounts()) {
      java.util.List<TAccountObject> __this__accounts = new java.util.ArrayList<TAccountObject>(other.accounts.size());
      for (TAccountObject other_element : other.accounts) {
        __this__accounts.add(new TAccountObject(other_element));
      }
      this.accounts = __this__accounts;
    }
    this.success = other.success;
  }

  public TAccountSearchResponse deepCopy() {
    return new TAccountSearchResponse(this);
  }

  @Override
  public void clear() {
    setCountIsSet(false);
    this.count = 0;
    this.accountIds = null;
    this.accountNames = null;
    this.accounts = null;
    setSuccessIsSet(false);
    this.success = false;
  }

  public int getCount() {
    return this.count;
  }

  public void setCount(int count) {
    this.count = count;
    setCountIsSet(true);
  }

  public void unsetCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public int getAccountIdsSize() {
    return (this.accountIds == null) ? 0 : this.accountIds.size();
  }

  public java.util.Iterator<java.lang.String> getAccountIdsIterator() {
    return (this.accountIds == null) ? null : this.accountIds.iterator();
  }

  public void addToAccountIds(java.lang.String elem) {
    if (this.accountIds == null) {
      this.accountIds = new java.util.ArrayList<java.lang.String>();
    }
    this.accountIds.add(elem);
  }

  public java.util.List<java.lang.String> getAccountIds() {
    return this.accountIds;
  }

  public void setAccountIds(java.util.List<java.lang.String> accountIds) {
    this.accountIds = accountIds;
  }

  public void unsetAccountIds() {
    this.accountIds = null;
  }

  /** Returns true if field accountIds is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountIds() {
    return this.accountIds != null;
  }

  public void setAccountIdsIsSet(boolean value) {
    if (!value) {
      this.accountIds = null;
    }
  }

  public int getAccountNamesSize() {
    return (this.accountNames == null) ? 0 : this.accountNames.size();
  }

  public java.util.Iterator<java.lang.String> getAccountNamesIterator() {
    return (this.accountNames == null) ? null : this.accountNames.iterator();
  }

  public void addToAccountNames(java.lang.String elem) {
    if (this.accountNames == null) {
      this.accountNames = new java.util.ArrayList<java.lang.String>();
    }
    this.accountNames.add(elem);
  }

  public java.util.List<java.lang.String> getAccountNames() {
    return this.accountNames;
  }

  public void setAccountNames(java.util.List<java.lang.String> accountNames) {
    this.accountNames = accountNames;
  }

  public void unsetAccountNames() {
    this.accountNames = null;
  }

  /** Returns true if field accountNames is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountNames() {
    return this.accountNames != null;
  }

  public void setAccountNamesIsSet(boolean value) {
    if (!value) {
      this.accountNames = null;
    }
  }

  public int getAccountsSize() {
    return (this.accounts == null) ? 0 : this.accounts.size();
  }

  public java.util.Iterator<TAccountObject> getAccountsIterator() {
    return (this.accounts == null) ? null : this.accounts.iterator();
  }

  public void addToAccounts(TAccountObject elem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<TAccountObject>();
    }
    this.accounts.add(elem);
  }

  public java.util.List<TAccountObject> getAccounts() {
    return this.accounts;
  }

  public void setAccounts(java.util.List<TAccountObject> accounts) {
    this.accounts = accounts;
  }

  public void unsetAccounts() {
    this.accounts = null;
  }

  /** Returns true if field accounts is set (has been assigned a value) and false otherwise */
  public boolean isSetAccounts() {
    return this.accounts != null;
  }

  public void setAccountsIsSet(boolean value) {
    if (!value) {
      this.accounts = null;
    }
  }

  public boolean isSuccess() {
    return this.success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
  }

  public void unsetSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((java.lang.Integer)value);
      }
      break;

    case ACCOUNT_IDS:
      if (value == null) {
        unsetAccountIds();
      } else {
        setAccountIds((java.util.List<java.lang.String>)value);
      }
      break;

    case ACCOUNT_NAMES:
      if (value == null) {
        unsetAccountNames();
      } else {
        setAccountNames((java.util.List<java.lang.String>)value);
      }
      break;

    case ACCOUNTS:
      if (value == null) {
        unsetAccounts();
      } else {
        setAccounts((java.util.List<TAccountObject>)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COUNT:
      return getCount();

    case ACCOUNT_IDS:
      return getAccountIds();

    case ACCOUNT_NAMES:
      return getAccountNames();

    case ACCOUNTS:
      return getAccounts();

    case SUCCESS:
      return isSuccess();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COUNT:
      return isSetCount();
    case ACCOUNT_IDS:
      return isSetAccountIds();
    case ACCOUNT_NAMES:
      return isSetAccountNames();
    case ACCOUNTS:
      return isSetAccounts();
    case SUCCESS:
      return isSetSuccess();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TAccountSearchResponse)
      return this.equals((TAccountSearchResponse)that);
    return false;
  }

  public boolean equals(TAccountSearchResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_accountIds = true && this.isSetAccountIds();
    boolean that_present_accountIds = true && that.isSetAccountIds();
    if (this_present_accountIds || that_present_accountIds) {
      if (!(this_present_accountIds && that_present_accountIds))
        return false;
      if (!this.accountIds.equals(that.accountIds))
        return false;
    }

    boolean this_present_accountNames = true && this.isSetAccountNames();
    boolean that_present_accountNames = true && that.isSetAccountNames();
    if (this_present_accountNames || that_present_accountNames) {
      if (!(this_present_accountNames && that_present_accountNames))
        return false;
      if (!this.accountNames.equals(that.accountNames))
        return false;
    }

    boolean this_present_accounts = true && this.isSetAccounts();
    boolean that_present_accounts = true && that.isSetAccounts();
    if (this_present_accounts || that_present_accounts) {
      if (!(this_present_accounts && that_present_accounts))
        return false;
      if (!this.accounts.equals(that.accounts))
        return false;
    }

    boolean this_present_success = true && this.isSetSuccess();
    boolean that_present_success = true && that.isSetSuccess();
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + count;

    hashCode = hashCode * 8191 + ((isSetAccountIds()) ? 131071 : 524287);
    if (isSetAccountIds())
      hashCode = hashCode * 8191 + accountIds.hashCode();

    hashCode = hashCode * 8191 + ((isSetAccountNames()) ? 131071 : 524287);
    if (isSetAccountNames())
      hashCode = hashCode * 8191 + accountNames.hashCode();

    hashCode = hashCode * 8191 + ((isSetAccounts()) ? 131071 : 524287);
    if (isSetAccounts())
      hashCode = hashCode * 8191 + accounts.hashCode();

    hashCode = hashCode * 8191 + ((isSetSuccess()) ? 131071 : 524287);
    if (isSetSuccess())
      hashCode = hashCode * 8191 + ((success) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TAccountSearchResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccountIds()).compareTo(other.isSetAccountIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountIds, other.accountIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccountNames()).compareTo(other.isSetAccountNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountNames, other.accountNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccounts()).compareTo(other.isSetAccounts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccounts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accounts, other.accounts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAccountSearchResponse(");
    boolean first = true;

    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (isSetAccountIds()) {
      if (!first) sb.append(", ");
      sb.append("accountIds:");
      if (this.accountIds == null) {
        sb.append("null");
      } else {
        sb.append(this.accountIds);
      }
      first = false;
    }
    if (isSetAccountNames()) {
      if (!first) sb.append(", ");
      sb.append("accountNames:");
      if (this.accountNames == null) {
        sb.append("null");
      } else {
        sb.append(this.accountNames);
      }
      first = false;
    }
    if (isSetAccounts()) {
      if (!first) sb.append(", ");
      sb.append("accounts:");
      if (this.accounts == null) {
        sb.append("null");
      } else {
        sb.append(this.accounts);
      }
      first = false;
    }
    if (isSetSuccess()) {
      if (!first) sb.append(", ");
      sb.append("success:");
      sb.append(this.success);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCount()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'count' is unset! Struct:" + toString());
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

  private static class TAccountSearchResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAccountSearchResponseStandardScheme getScheme() {
      return new TAccountSearchResponseStandardScheme();
    }
  }

  private static class TAccountSearchResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAccountSearchResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAccountSearchResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCOUNT_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list96 = iprot.readListBegin();
                struct.accountIds = new java.util.ArrayList<java.lang.String>(_list96.size);
                java.lang.String _elem97;
                for (int _i98 = 0; _i98 < _list96.size; ++_i98)
                {
                  _elem97 = iprot.readString();
                  struct.accountIds.add(_elem97);
                }
                iprot.readListEnd();
              }
              struct.setAccountIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACCOUNT_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list99 = iprot.readListBegin();
                struct.accountNames = new java.util.ArrayList<java.lang.String>(_list99.size);
                java.lang.String _elem100;
                for (int _i101 = 0; _i101 < _list99.size; ++_i101)
                {
                  _elem100 = iprot.readString();
                  struct.accountNames.add(_elem100);
                }
                iprot.readListEnd();
              }
              struct.setAccountNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ACCOUNTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list102 = iprot.readListBegin();
                struct.accounts = new java.util.ArrayList<TAccountObject>(_list102.size);
                TAccountObject _elem103;
                for (int _i104 = 0; _i104 < _list102.size; ++_i104)
                {
                  _elem103 = new TAccountObject();
                  _elem103.read(iprot);
                  struct.accounts.add(_elem103);
                }
                iprot.readListEnd();
              }
              struct.setAccountsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAccountSearchResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      if (struct.accountIds != null) {
        if (struct.isSetAccountIds()) {
          oprot.writeFieldBegin(ACCOUNT_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.accountIds.size()));
            for (java.lang.String _iter105 : struct.accountIds)
            {
              oprot.writeString(_iter105);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.accountNames != null) {
        if (struct.isSetAccountNames()) {
          oprot.writeFieldBegin(ACCOUNT_NAMES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.accountNames.size()));
            for (java.lang.String _iter106 : struct.accountNames)
            {
              oprot.writeString(_iter106);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.accounts != null) {
        if (struct.isSetAccounts()) {
          oprot.writeFieldBegin(ACCOUNTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.accounts.size()));
            for (TAccountObject _iter107 : struct.accounts)
            {
              _iter107.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        oprot.writeBool(struct.success);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAccountSearchResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAccountSearchResponseTupleScheme getScheme() {
      return new TAccountSearchResponseTupleScheme();
    }
  }

  private static class TAccountSearchResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAccountSearchResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAccountSearchResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.count);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAccountIds()) {
        optionals.set(0);
      }
      if (struct.isSetAccountNames()) {
        optionals.set(1);
      }
      if (struct.isSetAccounts()) {
        optionals.set(2);
      }
      if (struct.isSetSuccess()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAccountIds()) {
        {
          oprot.writeI32(struct.accountIds.size());
          for (java.lang.String _iter108 : struct.accountIds)
          {
            oprot.writeString(_iter108);
          }
        }
      }
      if (struct.isSetAccountNames()) {
        {
          oprot.writeI32(struct.accountNames.size());
          for (java.lang.String _iter109 : struct.accountNames)
          {
            oprot.writeString(_iter109);
          }
        }
      }
      if (struct.isSetAccounts()) {
        {
          oprot.writeI32(struct.accounts.size());
          for (TAccountObject _iter110 : struct.accounts)
          {
            _iter110.write(oprot);
          }
        }
      }
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAccountSearchResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.count = iprot.readI32();
      struct.setCountIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list111 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.accountIds = new java.util.ArrayList<java.lang.String>(_list111.size);
          java.lang.String _elem112;
          for (int _i113 = 0; _i113 < _list111.size; ++_i113)
          {
            _elem112 = iprot.readString();
            struct.accountIds.add(_elem112);
          }
        }
        struct.setAccountIdsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list114 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.accountNames = new java.util.ArrayList<java.lang.String>(_list114.size);
          java.lang.String _elem115;
          for (int _i116 = 0; _i116 < _list114.size; ++_i116)
          {
            _elem115 = iprot.readString();
            struct.accountNames.add(_elem115);
          }
        }
        struct.setAccountNamesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.accounts = new java.util.ArrayList<TAccountObject>(_list117.size);
          TAccountObject _elem118;
          for (int _i119 = 0; _i119 < _list117.size; ++_i119)
          {
            _elem118 = new TAccountObject();
            _elem118.read(iprot);
            struct.accounts.add(_elem118);
          }
        }
        struct.setAccountsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

