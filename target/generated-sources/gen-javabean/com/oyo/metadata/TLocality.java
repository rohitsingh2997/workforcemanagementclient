/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-23")
public class TLocality implements org.apache.thrift.TBase<TLocality, TLocality._Fields>, java.io.Serializable, Cloneable, Comparable<TLocality> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLocality");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CITY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("cityName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IS_PACKAGE_SEARCHABLE_LOCALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("isPackageSearchableLocality", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField IS_MICE_SEARCHABLE_LOCALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("isMiceSearchableLocality", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLocalityStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLocalityTupleSchemeFactory();

  private java.lang.String id; // required
  private java.lang.String name; // required
  private java.lang.String cityName; // required
  private boolean isPackageSearchableLocality; // required
  private boolean isMiceSearchableLocality; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    CITY_NAME((short)3, "cityName"),
    IS_PACKAGE_SEARCHABLE_LOCALITY((short)4, "isPackageSearchableLocality"),
    IS_MICE_SEARCHABLE_LOCALITY((short)5, "isMiceSearchableLocality");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // CITY_NAME
          return CITY_NAME;
        case 4: // IS_PACKAGE_SEARCHABLE_LOCALITY
          return IS_PACKAGE_SEARCHABLE_LOCALITY;
        case 5: // IS_MICE_SEARCHABLE_LOCALITY
          return IS_MICE_SEARCHABLE_LOCALITY;
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
  private static final int __ISPACKAGESEARCHABLELOCALITY_ISSET_ID = 0;
  private static final int __ISMICESEARCHABLELOCALITY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CITY_NAME, new org.apache.thrift.meta_data.FieldMetaData("cityName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_PACKAGE_SEARCHABLE_LOCALITY, new org.apache.thrift.meta_data.FieldMetaData("isPackageSearchableLocality", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_MICE_SEARCHABLE_LOCALITY, new org.apache.thrift.meta_data.FieldMetaData("isMiceSearchableLocality", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLocality.class, metaDataMap);
  }

  public TLocality() {
  }

  public TLocality(
    java.lang.String id,
    java.lang.String name,
    java.lang.String cityName,
    boolean isPackageSearchableLocality,
    boolean isMiceSearchableLocality)
  {
    this();
    this.id = id;
    this.name = name;
    this.cityName = cityName;
    this.isPackageSearchableLocality = isPackageSearchableLocality;
    setIsPackageSearchableLocalityIsSet(true);
    this.isMiceSearchableLocality = isMiceSearchableLocality;
    setIsMiceSearchableLocalityIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLocality(TLocality other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCityName()) {
      this.cityName = other.cityName;
    }
    this.isPackageSearchableLocality = other.isPackageSearchableLocality;
    this.isMiceSearchableLocality = other.isMiceSearchableLocality;
  }

  public TLocality deepCopy() {
    return new TLocality(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    this.cityName = null;
    setIsPackageSearchableLocalityIsSet(false);
    this.isPackageSearchableLocality = false;
    setIsMiceSearchableLocalityIsSet(false);
    this.isMiceSearchableLocality = false;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
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

  public java.lang.String getCityName() {
    return this.cityName;
  }

  public void setCityName(java.lang.String cityName) {
    this.cityName = cityName;
  }

  public void unsetCityName() {
    this.cityName = null;
  }

  /** Returns true if field cityName is set (has been assigned a value) and false otherwise */
  public boolean isSetCityName() {
    return this.cityName != null;
  }

  public void setCityNameIsSet(boolean value) {
    if (!value) {
      this.cityName = null;
    }
  }

  public boolean isIsPackageSearchableLocality() {
    return this.isPackageSearchableLocality;
  }

  public void setIsPackageSearchableLocality(boolean isPackageSearchableLocality) {
    this.isPackageSearchableLocality = isPackageSearchableLocality;
    setIsPackageSearchableLocalityIsSet(true);
  }

  public void unsetIsPackageSearchableLocality() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISPACKAGESEARCHABLELOCALITY_ISSET_ID);
  }

  /** Returns true if field isPackageSearchableLocality is set (has been assigned a value) and false otherwise */
  public boolean isSetIsPackageSearchableLocality() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISPACKAGESEARCHABLELOCALITY_ISSET_ID);
  }

  public void setIsPackageSearchableLocalityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISPACKAGESEARCHABLELOCALITY_ISSET_ID, value);
  }

  public boolean isIsMiceSearchableLocality() {
    return this.isMiceSearchableLocality;
  }

  public void setIsMiceSearchableLocality(boolean isMiceSearchableLocality) {
    this.isMiceSearchableLocality = isMiceSearchableLocality;
    setIsMiceSearchableLocalityIsSet(true);
  }

  public void unsetIsMiceSearchableLocality() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISMICESEARCHABLELOCALITY_ISSET_ID);
  }

  /** Returns true if field isMiceSearchableLocality is set (has been assigned a value) and false otherwise */
  public boolean isSetIsMiceSearchableLocality() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISMICESEARCHABLELOCALITY_ISSET_ID);
  }

  public void setIsMiceSearchableLocalityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISMICESEARCHABLELOCALITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case CITY_NAME:
      if (value == null) {
        unsetCityName();
      } else {
        setCityName((java.lang.String)value);
      }
      break;

    case IS_PACKAGE_SEARCHABLE_LOCALITY:
      if (value == null) {
        unsetIsPackageSearchableLocality();
      } else {
        setIsPackageSearchableLocality((java.lang.Boolean)value);
      }
      break;

    case IS_MICE_SEARCHABLE_LOCALITY:
      if (value == null) {
        unsetIsMiceSearchableLocality();
      } else {
        setIsMiceSearchableLocality((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case CITY_NAME:
      return getCityName();

    case IS_PACKAGE_SEARCHABLE_LOCALITY:
      return isIsPackageSearchableLocality();

    case IS_MICE_SEARCHABLE_LOCALITY:
      return isIsMiceSearchableLocality();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case CITY_NAME:
      return isSetCityName();
    case IS_PACKAGE_SEARCHABLE_LOCALITY:
      return isSetIsPackageSearchableLocality();
    case IS_MICE_SEARCHABLE_LOCALITY:
      return isSetIsMiceSearchableLocality();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TLocality)
      return this.equals((TLocality)that);
    return false;
  }

  public boolean equals(TLocality that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_cityName = true && this.isSetCityName();
    boolean that_present_cityName = true && that.isSetCityName();
    if (this_present_cityName || that_present_cityName) {
      if (!(this_present_cityName && that_present_cityName))
        return false;
      if (!this.cityName.equals(that.cityName))
        return false;
    }

    boolean this_present_isPackageSearchableLocality = true;
    boolean that_present_isPackageSearchableLocality = true;
    if (this_present_isPackageSearchableLocality || that_present_isPackageSearchableLocality) {
      if (!(this_present_isPackageSearchableLocality && that_present_isPackageSearchableLocality))
        return false;
      if (this.isPackageSearchableLocality != that.isPackageSearchableLocality)
        return false;
    }

    boolean this_present_isMiceSearchableLocality = true;
    boolean that_present_isMiceSearchableLocality = true;
    if (this_present_isMiceSearchableLocality || that_present_isMiceSearchableLocality) {
      if (!(this_present_isMiceSearchableLocality && that_present_isMiceSearchableLocality))
        return false;
      if (this.isMiceSearchableLocality != that.isMiceSearchableLocality)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetCityName()) ? 131071 : 524287);
    if (isSetCityName())
      hashCode = hashCode * 8191 + cityName.hashCode();

    hashCode = hashCode * 8191 + ((isPackageSearchableLocality) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isMiceSearchableLocality) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TLocality other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetCityName()).compareTo(other.isSetCityName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCityName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cityName, other.cityName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsPackageSearchableLocality()).compareTo(other.isSetIsPackageSearchableLocality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsPackageSearchableLocality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isPackageSearchableLocality, other.isPackageSearchableLocality);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsMiceSearchableLocality()).compareTo(other.isSetIsMiceSearchableLocality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsMiceSearchableLocality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isMiceSearchableLocality, other.isMiceSearchableLocality);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLocality(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cityName:");
    if (this.cityName == null) {
      sb.append("null");
    } else {
      sb.append(this.cityName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isPackageSearchableLocality:");
    sb.append(this.isPackageSearchableLocality);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isMiceSearchableLocality:");
    sb.append(this.isMiceSearchableLocality);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TLocalityStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLocalityStandardScheme getScheme() {
      return new TLocalityStandardScheme();
    }
  }

  private static class TLocalityStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLocality> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLocality struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CITY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cityName = iprot.readString();
              struct.setCityNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_PACKAGE_SEARCHABLE_LOCALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isPackageSearchableLocality = iprot.readBool();
              struct.setIsPackageSearchableLocalityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_MICE_SEARCHABLE_LOCALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isMiceSearchableLocality = iprot.readBool();
              struct.setIsMiceSearchableLocalityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLocality struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.cityName != null) {
        oprot.writeFieldBegin(CITY_NAME_FIELD_DESC);
        oprot.writeString(struct.cityName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_PACKAGE_SEARCHABLE_LOCALITY_FIELD_DESC);
      oprot.writeBool(struct.isPackageSearchableLocality);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_MICE_SEARCHABLE_LOCALITY_FIELD_DESC);
      oprot.writeBool(struct.isMiceSearchableLocality);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLocalityTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLocalityTupleScheme getScheme() {
      return new TLocalityTupleScheme();
    }
  }

  private static class TLocalityTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLocality> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLocality struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetCityName()) {
        optionals.set(2);
      }
      if (struct.isSetIsPackageSearchableLocality()) {
        optionals.set(3);
      }
      if (struct.isSetIsMiceSearchableLocality()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCityName()) {
        oprot.writeString(struct.cityName);
      }
      if (struct.isSetIsPackageSearchableLocality()) {
        oprot.writeBool(struct.isPackageSearchableLocality);
      }
      if (struct.isSetIsMiceSearchableLocality()) {
        oprot.writeBool(struct.isMiceSearchableLocality);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLocality struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cityName = iprot.readString();
        struct.setCityNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isPackageSearchableLocality = iprot.readBool();
        struct.setIsPackageSearchableLocalityIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isMiceSearchableLocality = iprot.readBool();
        struct.setIsMiceSearchableLocalityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

