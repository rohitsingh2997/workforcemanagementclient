/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-14")
public class TDataBaseError extends org.apache.thrift.TException implements org.apache.thrift.TBase<TDataBaseError, TDataBaseError._Fields>, java.io.Serializable, Cloneable, Comparable<TDataBaseError> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataBaseError");

  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDataBaseErrorStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDataBaseErrorTupleSchemeFactory();

  private java.lang.String errorMessage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_MESSAGE((short)1, "errorMessage");

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
        case 1: // ERROR_MESSAGE
          return ERROR_MESSAGE;
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
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "ErrorMessage")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataBaseError.class, metaDataMap);
  }

  public TDataBaseError() {
  }

  public TDataBaseError(
    java.lang.String errorMessage)
  {
    this();
    this.errorMessage = errorMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataBaseError(TDataBaseError other) {
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
  }

  public TDataBaseError deepCopy() {
    return new TDataBaseError(this);
  }

  @Override
  public void clear() {
    this.errorMessage = null;
  }

  public java.lang.String getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_MESSAGE:
      return getErrorMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDataBaseError)
      return this.equals((TDataBaseError)that);
    return false;
  }

  public boolean equals(TDataBaseError that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetErrorMessage()) ? 131071 : 524287);
    if (isSetErrorMessage())
      hashCode = hashCode * 8191 + errorMessage.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDataBaseError other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDataBaseError(");
    boolean first = true;

    sb.append("errorMessage:");
    if (this.errorMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.errorMessage);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetErrorMessage()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'errorMessage' is unset! Struct:" + toString());
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

  private static class TDataBaseErrorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDataBaseErrorStandardScheme getScheme() {
      return new TDataBaseErrorStandardScheme();
    }
  }

  private static class TDataBaseErrorStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDataBaseError> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataBaseError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataBaseError struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errorMessage != null) {
        oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.errorMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataBaseErrorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDataBaseErrorTupleScheme getScheme() {
      return new TDataBaseErrorTupleScheme();
    }
  }

  private static class TDataBaseErrorTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDataBaseError> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataBaseError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.errorMessage);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataBaseError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.errorMessage = iprot.readString();
      struct.setErrorMessageIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

