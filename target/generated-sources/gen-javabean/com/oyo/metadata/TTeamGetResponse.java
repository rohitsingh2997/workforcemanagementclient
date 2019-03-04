/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-03")
public class TTeamGetResponse implements org.apache.thrift.TBase<TTeamGetResponse, TTeamGetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TTeamGetResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTeamGetResponse");

  private static final org.apache.thrift.protocol.TField TEAM_METADATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("teamMetadataId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TEAM_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("teamName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTeamGetResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTeamGetResponseTupleSchemeFactory();

  private java.lang.String teamMetadataId; // required
  private java.lang.String teamName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEAM_METADATA_ID((short)1, "teamMetadataId"),
    TEAM_NAME((short)2, "teamName");

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
        case 1: // TEAM_METADATA_ID
          return TEAM_METADATA_ID;
        case 2: // TEAM_NAME
          return TEAM_NAME;
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
    tmpMap.put(_Fields.TEAM_METADATA_ID, new org.apache.thrift.meta_data.FieldMetaData("teamMetadataId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "CallCenterMetadataId")));
    tmpMap.put(_Fields.TEAM_NAME, new org.apache.thrift.meta_data.FieldMetaData("teamName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTeamGetResponse.class, metaDataMap);
  }

  public TTeamGetResponse() {
  }

  public TTeamGetResponse(
    java.lang.String teamMetadataId,
    java.lang.String teamName)
  {
    this();
    this.teamMetadataId = teamMetadataId;
    this.teamName = teamName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTeamGetResponse(TTeamGetResponse other) {
    if (other.isSetTeamMetadataId()) {
      this.teamMetadataId = other.teamMetadataId;
    }
    if (other.isSetTeamName()) {
      this.teamName = other.teamName;
    }
  }

  public TTeamGetResponse deepCopy() {
    return new TTeamGetResponse(this);
  }

  @Override
  public void clear() {
    this.teamMetadataId = null;
    this.teamName = null;
  }

  public java.lang.String getTeamMetadataId() {
    return this.teamMetadataId;
  }

  public void setTeamMetadataId(java.lang.String teamMetadataId) {
    this.teamMetadataId = teamMetadataId;
  }

  public void unsetTeamMetadataId() {
    this.teamMetadataId = null;
  }

  /** Returns true if field teamMetadataId is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamMetadataId() {
    return this.teamMetadataId != null;
  }

  public void setTeamMetadataIdIsSet(boolean value) {
    if (!value) {
      this.teamMetadataId = null;
    }
  }

  public java.lang.String getTeamName() {
    return this.teamName;
  }

  public void setTeamName(java.lang.String teamName) {
    this.teamName = teamName;
  }

  public void unsetTeamName() {
    this.teamName = null;
  }

  /** Returns true if field teamName is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamName() {
    return this.teamName != null;
  }

  public void setTeamNameIsSet(boolean value) {
    if (!value) {
      this.teamName = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TEAM_METADATA_ID:
      if (value == null) {
        unsetTeamMetadataId();
      } else {
        setTeamMetadataId((java.lang.String)value);
      }
      break;

    case TEAM_NAME:
      if (value == null) {
        unsetTeamName();
      } else {
        setTeamName((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TEAM_METADATA_ID:
      return getTeamMetadataId();

    case TEAM_NAME:
      return getTeamName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TEAM_METADATA_ID:
      return isSetTeamMetadataId();
    case TEAM_NAME:
      return isSetTeamName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TTeamGetResponse)
      return this.equals((TTeamGetResponse)that);
    return false;
  }

  public boolean equals(TTeamGetResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_teamMetadataId = true && this.isSetTeamMetadataId();
    boolean that_present_teamMetadataId = true && that.isSetTeamMetadataId();
    if (this_present_teamMetadataId || that_present_teamMetadataId) {
      if (!(this_present_teamMetadataId && that_present_teamMetadataId))
        return false;
      if (!this.teamMetadataId.equals(that.teamMetadataId))
        return false;
    }

    boolean this_present_teamName = true && this.isSetTeamName();
    boolean that_present_teamName = true && that.isSetTeamName();
    if (this_present_teamName || that_present_teamName) {
      if (!(this_present_teamName && that_present_teamName))
        return false;
      if (!this.teamName.equals(that.teamName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTeamMetadataId()) ? 131071 : 524287);
    if (isSetTeamMetadataId())
      hashCode = hashCode * 8191 + teamMetadataId.hashCode();

    hashCode = hashCode * 8191 + ((isSetTeamName()) ? 131071 : 524287);
    if (isSetTeamName())
      hashCode = hashCode * 8191 + teamName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTeamGetResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTeamMetadataId()).compareTo(other.isSetTeamMetadataId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamMetadataId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamMetadataId, other.teamMetadataId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTeamName()).compareTo(other.isSetTeamName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamName, other.teamName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTeamGetResponse(");
    boolean first = true;

    sb.append("teamMetadataId:");
    if (this.teamMetadataId == null) {
      sb.append("null");
    } else {
      sb.append(this.teamMetadataId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("teamName:");
    if (this.teamName == null) {
      sb.append("null");
    } else {
      sb.append(this.teamName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTeamMetadataId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'teamMetadataId' is unset! Struct:" + toString());
    }

    if (!isSetTeamName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'teamName' is unset! Struct:" + toString());
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

  private static class TTeamGetResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTeamGetResponseStandardScheme getScheme() {
      return new TTeamGetResponseStandardScheme();
    }
  }

  private static class TTeamGetResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTeamGetResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTeamGetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEAM_METADATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.teamMetadataId = iprot.readString();
              struct.setTeamMetadataIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TEAM_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.teamName = iprot.readString();
              struct.setTeamNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTeamGetResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.teamMetadataId != null) {
        oprot.writeFieldBegin(TEAM_METADATA_ID_FIELD_DESC);
        oprot.writeString(struct.teamMetadataId);
        oprot.writeFieldEnd();
      }
      if (struct.teamName != null) {
        oprot.writeFieldBegin(TEAM_NAME_FIELD_DESC);
        oprot.writeString(struct.teamName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTeamGetResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTeamGetResponseTupleScheme getScheme() {
      return new TTeamGetResponseTupleScheme();
    }
  }

  private static class TTeamGetResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTeamGetResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTeamGetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.teamMetadataId);
      oprot.writeString(struct.teamName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTeamGetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.teamMetadataId = iprot.readString();
      struct.setTeamMetadataIdIsSet(true);
      struct.teamName = iprot.readString();
      struct.setTeamNameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

