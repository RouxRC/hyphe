/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fr.sciencespo.medialab.hci.memorystructure.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebEntityCreationRule implements org.apache.thrift.TBase<WebEntityCreationRule, WebEntityCreationRule._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WebEntityCreationRule");

  private static final org.apache.thrift.protocol.TField REG_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("regExp", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LRU_FIELD_DESC = new org.apache.thrift.protocol.TField("LRU", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CREATION_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("creationDate", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LAST_MODIFICATION_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModificationDate", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WebEntityCreationRuleStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WebEntityCreationRuleTupleSchemeFactory());
  }

  public String regExp; // required
  public String LRU; // required
  public String creationDate; // required
  public String lastModificationDate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REG_EXP((short)1, "regExp"),
    LRU((short)2, "LRU"),
    CREATION_DATE((short)3, "creationDate"),
    LAST_MODIFICATION_DATE((short)4, "lastModificationDate");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REG_EXP
          return REG_EXP;
        case 2: // LRU
          return LRU;
        case 3: // CREATION_DATE
          return CREATION_DATE;
        case 4: // LAST_MODIFICATION_DATE
          return LAST_MODIFICATION_DATE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REG_EXP, new org.apache.thrift.meta_data.FieldMetaData("regExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LRU, new org.apache.thrift.meta_data.FieldMetaData("LRU", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_DATE, new org.apache.thrift.meta_data.FieldMetaData("creationDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_MODIFICATION_DATE, new org.apache.thrift.meta_data.FieldMetaData("lastModificationDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WebEntityCreationRule.class, metaDataMap);
  }

  public WebEntityCreationRule() {
  }

  public WebEntityCreationRule(
    String regExp,
    String LRU,
    String creationDate,
    String lastModificationDate)
  {
    this();
    this.regExp = regExp;
    this.LRU = LRU;
    this.creationDate = creationDate;
    this.lastModificationDate = lastModificationDate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WebEntityCreationRule(WebEntityCreationRule other) {
    if (other.isSetRegExp()) {
      this.regExp = other.regExp;
    }
    if (other.isSetLRU()) {
      this.LRU = other.LRU;
    }
    if (other.isSetCreationDate()) {
      this.creationDate = other.creationDate;
    }
    if (other.isSetLastModificationDate()) {
      this.lastModificationDate = other.lastModificationDate;
    }
  }

  public WebEntityCreationRule deepCopy() {
    return new WebEntityCreationRule(this);
  }

  @Override
  public void clear() {
    this.regExp = null;
    this.LRU = null;
    this.creationDate = null;
    this.lastModificationDate = null;
  }

  public String getRegExp() {
    return this.regExp;
  }

  public WebEntityCreationRule setRegExp(String regExp) {
    this.regExp = regExp;
    return this;
  }

  public void unsetRegExp() {
    this.regExp = null;
  }

  /** Returns true if field regExp is set (has been assigned a value) and false otherwise */
  public boolean isSetRegExp() {
    return this.regExp != null;
  }

  public void setRegExpIsSet(boolean value) {
    if (!value) {
      this.regExp = null;
    }
  }

  public String getLRU() {
    return this.LRU;
  }

  public WebEntityCreationRule setLRU(String LRU) {
    this.LRU = LRU;
    return this;
  }

  public void unsetLRU() {
    this.LRU = null;
  }

  /** Returns true if field LRU is set (has been assigned a value) and false otherwise */
  public boolean isSetLRU() {
    return this.LRU != null;
  }

  public void setLRUIsSet(boolean value) {
    if (!value) {
      this.LRU = null;
    }
  }

  public String getCreationDate() {
    return this.creationDate;
  }

  public WebEntityCreationRule setCreationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  public void unsetCreationDate() {
    this.creationDate = null;
  }

  /** Returns true if field creationDate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationDate() {
    return this.creationDate != null;
  }

  public void setCreationDateIsSet(boolean value) {
    if (!value) {
      this.creationDate = null;
    }
  }

  public String getLastModificationDate() {
    return this.lastModificationDate;
  }

  public WebEntityCreationRule setLastModificationDate(String lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

  public void unsetLastModificationDate() {
    this.lastModificationDate = null;
  }

  /** Returns true if field lastModificationDate is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModificationDate() {
    return this.lastModificationDate != null;
  }

  public void setLastModificationDateIsSet(boolean value) {
    if (!value) {
      this.lastModificationDate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REG_EXP:
      if (value == null) {
        unsetRegExp();
      } else {
        setRegExp((String)value);
      }
      break;

    case LRU:
      if (value == null) {
        unsetLRU();
      } else {
        setLRU((String)value);
      }
      break;

    case CREATION_DATE:
      if (value == null) {
        unsetCreationDate();
      } else {
        setCreationDate((String)value);
      }
      break;

    case LAST_MODIFICATION_DATE:
      if (value == null) {
        unsetLastModificationDate();
      } else {
        setLastModificationDate((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REG_EXP:
      return getRegExp();

    case LRU:
      return getLRU();

    case CREATION_DATE:
      return getCreationDate();

    case LAST_MODIFICATION_DATE:
      return getLastModificationDate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REG_EXP:
      return isSetRegExp();
    case LRU:
      return isSetLRU();
    case CREATION_DATE:
      return isSetCreationDate();
    case LAST_MODIFICATION_DATE:
      return isSetLastModificationDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WebEntityCreationRule)
      return this.equals((WebEntityCreationRule)that);
    return false;
  }

  public boolean equals(WebEntityCreationRule that) {
    if (that == null)
      return false;

    boolean this_present_regExp = true && this.isSetRegExp();
    boolean that_present_regExp = true && that.isSetRegExp();
    if (this_present_regExp || that_present_regExp) {
      if (!(this_present_regExp && that_present_regExp))
        return false;
      if (!this.regExp.equals(that.regExp))
        return false;
    }

    boolean this_present_LRU = true && this.isSetLRU();
    boolean that_present_LRU = true && that.isSetLRU();
    if (this_present_LRU || that_present_LRU) {
      if (!(this_present_LRU && that_present_LRU))
        return false;
      if (!this.LRU.equals(that.LRU))
        return false;
    }

    boolean this_present_creationDate = true && this.isSetCreationDate();
    boolean that_present_creationDate = true && that.isSetCreationDate();
    if (this_present_creationDate || that_present_creationDate) {
      if (!(this_present_creationDate && that_present_creationDate))
        return false;
      if (!this.creationDate.equals(that.creationDate))
        return false;
    }

    boolean this_present_lastModificationDate = true && this.isSetLastModificationDate();
    boolean that_present_lastModificationDate = true && that.isSetLastModificationDate();
    if (this_present_lastModificationDate || that_present_lastModificationDate) {
      if (!(this_present_lastModificationDate && that_present_lastModificationDate))
        return false;
      if (!this.lastModificationDate.equals(that.lastModificationDate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(WebEntityCreationRule other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    WebEntityCreationRule typedOther = (WebEntityCreationRule)other;

    lastComparison = Boolean.valueOf(isSetRegExp()).compareTo(typedOther.isSetRegExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.regExp, typedOther.regExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLRU()).compareTo(typedOther.isSetLRU());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLRU()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.LRU, typedOther.LRU);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreationDate()).compareTo(typedOther.isSetCreationDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationDate, typedOther.creationDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastModificationDate()).compareTo(typedOther.isSetLastModificationDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModificationDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModificationDate, typedOther.lastModificationDate);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WebEntityCreationRule(");
    boolean first = true;

    sb.append("regExp:");
    if (this.regExp == null) {
      sb.append("null");
    } else {
      sb.append(this.regExp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("LRU:");
    if (this.LRU == null) {
      sb.append("null");
    } else {
      sb.append(this.LRU);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creationDate:");
    if (this.creationDate == null) {
      sb.append("null");
    } else {
      sb.append(this.creationDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModificationDate:");
    if (this.lastModificationDate == null) {
      sb.append("null");
    } else {
      sb.append(this.lastModificationDate);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WebEntityCreationRuleStandardSchemeFactory implements SchemeFactory {
    public WebEntityCreationRuleStandardScheme getScheme() {
      return new WebEntityCreationRuleStandardScheme();
    }
  }

  private static class WebEntityCreationRuleStandardScheme extends StandardScheme<WebEntityCreationRule> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WebEntityCreationRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REG_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.regExp = iprot.readString();
              struct.setRegExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LRU
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.LRU = iprot.readString();
              struct.setLRUIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CREATION_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.creationDate = iprot.readString();
              struct.setCreationDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAST_MODIFICATION_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastModificationDate = iprot.readString();
              struct.setLastModificationDateIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WebEntityCreationRule struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.regExp != null) {
        oprot.writeFieldBegin(REG_EXP_FIELD_DESC);
        oprot.writeString(struct.regExp);
        oprot.writeFieldEnd();
      }
      if (struct.LRU != null) {
        oprot.writeFieldBegin(LRU_FIELD_DESC);
        oprot.writeString(struct.LRU);
        oprot.writeFieldEnd();
      }
      if (struct.creationDate != null) {
        oprot.writeFieldBegin(CREATION_DATE_FIELD_DESC);
        oprot.writeString(struct.creationDate);
        oprot.writeFieldEnd();
      }
      if (struct.lastModificationDate != null) {
        oprot.writeFieldBegin(LAST_MODIFICATION_DATE_FIELD_DESC);
        oprot.writeString(struct.lastModificationDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WebEntityCreationRuleTupleSchemeFactory implements SchemeFactory {
    public WebEntityCreationRuleTupleScheme getScheme() {
      return new WebEntityCreationRuleTupleScheme();
    }
  }

  private static class WebEntityCreationRuleTupleScheme extends TupleScheme<WebEntityCreationRule> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WebEntityCreationRule struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRegExp()) {
        optionals.set(0);
      }
      if (struct.isSetLRU()) {
        optionals.set(1);
      }
      if (struct.isSetCreationDate()) {
        optionals.set(2);
      }
      if (struct.isSetLastModificationDate()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRegExp()) {
        oprot.writeString(struct.regExp);
      }
      if (struct.isSetLRU()) {
        oprot.writeString(struct.LRU);
      }
      if (struct.isSetCreationDate()) {
        oprot.writeString(struct.creationDate);
      }
      if (struct.isSetLastModificationDate()) {
        oprot.writeString(struct.lastModificationDate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WebEntityCreationRule struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.regExp = iprot.readString();
        struct.setRegExpIsSet(true);
      }
      if (incoming.get(1)) {
        struct.LRU = iprot.readString();
        struct.setLRUIsSet(true);
      }
      if (incoming.get(2)) {
        struct.creationDate = iprot.readString();
        struct.setCreationDateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.lastModificationDate = iprot.readString();
        struct.setLastModificationDateIsSet(true);
      }
    }
  }

}
