/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-27")
public class TSpecificationUpdateRequest implements org.apache.thrift.TBase<TSpecificationUpdateRequest, TSpecificationUpdateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TSpecificationUpdateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSpecificationUpdateRequest");

  private static final org.apache.thrift.protocol.TField METADATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("metadataId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("locale", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSpecificationUpdateRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSpecificationUpdateRequestTupleSchemeFactory();

  private java.lang.String metadataId; // required
  private java.lang.String displayName; // required
  private java.lang.String locale; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA_ID((short)1, "metadataId"),
    DISPLAY_NAME((short)2, "displayName"),
    LOCALE((short)3, "locale");

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
        case 2: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 3: // LOCALE
          return LOCALE;
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
    tmpMap.put(_Fields.METADATA_ID, new org.apache.thrift.meta_data.FieldMetaData("metadataId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCALE, new org.apache.thrift.meta_data.FieldMetaData("locale", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSpecificationUpdateRequest.class, metaDataMap);
  }

  public TSpecificationUpdateRequest() {
  }

  public TSpecificationUpdateRequest(
    java.lang.String metadataId,
    java.lang.String displayName,
    java.lang.String locale)
  {
    this();
    this.metadataId = metadataId;
    this.displayName = displayName;
    this.locale = locale;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSpecificationUpdateRequest(TSpecificationUpdateRequest other) {
    if (other.isSetMetadataId()) {
      this.metadataId = other.metadataId;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetLocale()) {
      this.locale = other.locale;
    }
  }

  public TSpecificationUpdateRequest deepCopy() {
    return new TSpecificationUpdateRequest(this);
  }

  @Override
  public void clear() {
    this.metadataId = null;
    this.displayName = null;
    this.locale = null;
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

  public java.lang.String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public java.lang.String getLocale() {
    return this.locale;
  }

  public void setLocale(java.lang.String locale) {
    this.locale = locale;
  }

  public void unsetLocale() {
    this.locale = null;
  }

  /** Returns true if field locale is set (has been assigned a value) and false otherwise */
  public boolean isSetLocale() {
    return this.locale != null;
  }

  public void setLocaleIsSet(boolean value) {
    if (!value) {
      this.locale = null;
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

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((java.lang.String)value);
      }
      break;

    case LOCALE:
      if (value == null) {
        unsetLocale();
      } else {
        setLocale((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_ID:
      return getMetadataId();

    case DISPLAY_NAME:
      return getDisplayName();

    case LOCALE:
      return getLocale();

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
    case DISPLAY_NAME:
      return isSetDisplayName();
    case LOCALE:
      return isSetLocale();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TSpecificationUpdateRequest)
      return this.equals((TSpecificationUpdateRequest)that);
    return false;
  }

  public boolean equals(TSpecificationUpdateRequest that) {
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

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_locale = true && this.isSetLocale();
    boolean that_present_locale = true && that.isSetLocale();
    if (this_present_locale || that_present_locale) {
      if (!(this_present_locale && that_present_locale))
        return false;
      if (!this.locale.equals(that.locale))
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

    hashCode = hashCode * 8191 + ((isSetDisplayName()) ? 131071 : 524287);
    if (isSetDisplayName())
      hashCode = hashCode * 8191 + displayName.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocale()) ? 131071 : 524287);
    if (isSetLocale())
      hashCode = hashCode * 8191 + locale.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TSpecificationUpdateRequest other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocale()).compareTo(other.isSetLocale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locale, other.locale);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSpecificationUpdateRequest(");
    boolean first = true;

    sb.append("metadataId:");
    if (this.metadataId == null) {
      sb.append("null");
    } else {
      sb.append(this.metadataId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locale:");
    if (this.locale == null) {
      sb.append("null");
    } else {
      sb.append(this.locale);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMetadataId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadataId' is unset! Struct:" + toString());
    }

    if (!isSetDisplayName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'displayName' is unset! Struct:" + toString());
    }

    if (!isSetLocale()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'locale' is unset! Struct:" + toString());
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

  private static class TSpecificationUpdateRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSpecificationUpdateRequestStandardScheme getScheme() {
      return new TSpecificationUpdateRequestStandardScheme();
    }
  }

  private static class TSpecificationUpdateRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSpecificationUpdateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSpecificationUpdateRequest struct) throws org.apache.thrift.TException {
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
          case 2: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locale = iprot.readString();
              struct.setLocaleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSpecificationUpdateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadataId != null) {
        oprot.writeFieldBegin(METADATA_ID_FIELD_DESC);
        oprot.writeString(struct.metadataId);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      if (struct.locale != null) {
        oprot.writeFieldBegin(LOCALE_FIELD_DESC);
        oprot.writeString(struct.locale);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSpecificationUpdateRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSpecificationUpdateRequestTupleScheme getScheme() {
      return new TSpecificationUpdateRequestTupleScheme();
    }
  }

  private static class TSpecificationUpdateRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSpecificationUpdateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSpecificationUpdateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.metadataId);
      oprot.writeString(struct.displayName);
      oprot.writeString(struct.locale);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSpecificationUpdateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.metadataId = iprot.readString();
      struct.setMetadataIdIsSet(true);
      struct.displayName = iprot.readString();
      struct.setDisplayNameIsSet(true);
      struct.locale = iprot.readString();
      struct.setLocaleIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

