/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package server;

//@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
//@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-04-24")
public class Sales implements org.apache.thrift.TBase<Sales, Sales._Fields>, java.io.Serializable, Cloneable, Comparable<Sales> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Sales");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("codeStock", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CODE_INVENTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("codeInventory", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField NUMBER_OF_INVENTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("numberOfInventory", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField WORKER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("workerName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField WORKER_POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("workerPosition", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SalesStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SalesTupleSchemeFactory();

  public int code; // required
  public int codeStock; // required
  public int codeInventory; // required
  public int numberOfInventory; // required
  public java.lang.String workerName; // required
  public java.lang.String workerPosition; // required
  public java.lang.String date; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    CODE_STOCK((short)2, "codeStock"),
    CODE_INVENTORY((short)3, "codeInventory"),
    NUMBER_OF_INVENTORY((short)4, "numberOfInventory"),
    WORKER_NAME((short)5, "workerName"),
    WORKER_POSITION((short)6, "workerPosition"),
    DATE((short)7, "date");

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
        case 1: // CODE
          return CODE;
        case 2: // CODE_STOCK
          return CODE_STOCK;
        case 3: // CODE_INVENTORY
          return CODE_INVENTORY;
        case 4: // NUMBER_OF_INVENTORY
          return NUMBER_OF_INVENTORY;
        case 5: // WORKER_NAME
          return WORKER_NAME;
        case 6: // WORKER_POSITION
          return WORKER_POSITION;
        case 7: // DATE
          return DATE;
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
  private static final int __CODE_ISSET_ID = 0;
  private static final int __CODESTOCK_ISSET_ID = 1;
  private static final int __CODEINVENTORY_ISSET_ID = 2;
  private static final int __NUMBEROFINVENTORY_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.CODE_STOCK, new org.apache.thrift.meta_data.FieldMetaData("codeStock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.CODE_INVENTORY, new org.apache.thrift.meta_data.FieldMetaData("codeInventory", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.NUMBER_OF_INVENTORY, new org.apache.thrift.meta_data.FieldMetaData("numberOfInventory", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.WORKER_NAME, new org.apache.thrift.meta_data.FieldMetaData("workerName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORKER_POSITION, new org.apache.thrift.meta_data.FieldMetaData("workerPosition", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Sales.class, metaDataMap);
  }

  public Sales() {
  }

  public Sales(
    int code,
    int codeStock,
    int codeInventory,
    int numberOfInventory,
    java.lang.String workerName,
    java.lang.String workerPosition,
    java.lang.String date)
  {
    this();
    this.code = code;
    setCodeIsSet(true);
    this.codeStock = codeStock;
    setCodeStockIsSet(true);
    this.codeInventory = codeInventory;
    setCodeInventoryIsSet(true);
    this.numberOfInventory = numberOfInventory;
    setNumberOfInventoryIsSet(true);
    this.workerName = workerName;
    this.workerPosition = workerPosition;
    this.date = date;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Sales(Sales other) {
    __isset_bitfield = other.__isset_bitfield;
    this.code = other.code;
    this.codeStock = other.codeStock;
    this.codeInventory = other.codeInventory;
    this.numberOfInventory = other.numberOfInventory;
    if (other.isSetWorkerName()) {
      this.workerName = other.workerName;
    }
    if (other.isSetWorkerPosition()) {
      this.workerPosition = other.workerPosition;
    }
    if (other.isSetDate()) {
      this.date = other.date;
    }
  }

  public Sales deepCopy() {
    return new Sales(this);
  }

  @Override
  public void clear() {
    setCodeIsSet(false);
    this.code = 0;
    setCodeStockIsSet(false);
    this.codeStock = 0;
    setCodeInventoryIsSet(false);
    this.codeInventory = 0;
    setNumberOfInventoryIsSet(false);
    this.numberOfInventory = 0;
    this.workerName = null;
    this.workerPosition = null;
    this.date = null;
  }

  public int getCode() {
    return this.code;
  }

  public Sales setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  public int getCodeStock() {
    return this.codeStock;
  }

  public Sales setCodeStock(int codeStock) {
    this.codeStock = codeStock;
    setCodeStockIsSet(true);
    return this;
  }

  public void unsetCodeStock() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODESTOCK_ISSET_ID);
  }

  /** Returns true if field codeStock is set (has been assigned a value) and false otherwise */
  public boolean isSetCodeStock() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODESTOCK_ISSET_ID);
  }

  public void setCodeStockIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODESTOCK_ISSET_ID, value);
  }

  public int getCodeInventory() {
    return this.codeInventory;
  }

  public Sales setCodeInventory(int codeInventory) {
    this.codeInventory = codeInventory;
    setCodeInventoryIsSet(true);
    return this;
  }

  public void unsetCodeInventory() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODEINVENTORY_ISSET_ID);
  }

  /** Returns true if field codeInventory is set (has been assigned a value) and false otherwise */
  public boolean isSetCodeInventory() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODEINVENTORY_ISSET_ID);
  }

  public void setCodeInventoryIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODEINVENTORY_ISSET_ID, value);
  }

  public int getNumberOfInventory() {
    return this.numberOfInventory;
  }

  public Sales setNumberOfInventory(int numberOfInventory) {
    this.numberOfInventory = numberOfInventory;
    setNumberOfInventoryIsSet(true);
    return this;
  }

  public void unsetNumberOfInventory() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUMBEROFINVENTORY_ISSET_ID);
  }

  /** Returns true if field numberOfInventory is set (has been assigned a value) and false otherwise */
  public boolean isSetNumberOfInventory() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUMBEROFINVENTORY_ISSET_ID);
  }

  public void setNumberOfInventoryIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUMBEROFINVENTORY_ISSET_ID, value);
  }

  public java.lang.String getWorkerName() {
    return this.workerName;
  }

  public Sales setWorkerName(java.lang.String workerName) {
    this.workerName = workerName;
    return this;
  }

  public void unsetWorkerName() {
    this.workerName = null;
  }

  /** Returns true if field workerName is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerName() {
    return this.workerName != null;
  }

  public void setWorkerNameIsSet(boolean value) {
    if (!value) {
      this.workerName = null;
    }
  }

  public java.lang.String getWorkerPosition() {
    return this.workerPosition;
  }

  public Sales setWorkerPosition(java.lang.String workerPosition) {
    this.workerPosition = workerPosition;
    return this;
  }

  public void unsetWorkerPosition() {
    this.workerPosition = null;
  }

  /** Returns true if field workerPosition is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerPosition() {
    return this.workerPosition != null;
  }

  public void setWorkerPositionIsSet(boolean value) {
    if (!value) {
      this.workerPosition = null;
    }
  }

  public java.lang.String getDate() {
    return this.date;
  }

  public Sales setDate(java.lang.String date) {
    this.date = date;
    return this;
  }

  public void unsetDate() {
    this.date = null;
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return this.date != null;
  }

  public void setDateIsSet(boolean value) {
    if (!value) {
      this.date = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.Integer)value);
      }
      break;

    case CODE_STOCK:
      if (value == null) {
        unsetCodeStock();
      } else {
        setCodeStock((java.lang.Integer)value);
      }
      break;

    case CODE_INVENTORY:
      if (value == null) {
        unsetCodeInventory();
      } else {
        setCodeInventory((java.lang.Integer)value);
      }
      break;

    case NUMBER_OF_INVENTORY:
      if (value == null) {
        unsetNumberOfInventory();
      } else {
        setNumberOfInventory((java.lang.Integer)value);
      }
      break;

    case WORKER_NAME:
      if (value == null) {
        unsetWorkerName();
      } else {
        setWorkerName((java.lang.String)value);
      }
      break;

    case WORKER_POSITION:
      if (value == null) {
        unsetWorkerPosition();
      } else {
        setWorkerPosition((java.lang.String)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case CODE_STOCK:
      return getCodeStock();

    case CODE_INVENTORY:
      return getCodeInventory();

    case NUMBER_OF_INVENTORY:
      return getNumberOfInventory();

    case WORKER_NAME:
      return getWorkerName();

    case WORKER_POSITION:
      return getWorkerPosition();

    case DATE:
      return getDate();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case CODE_STOCK:
      return isSetCodeStock();
    case CODE_INVENTORY:
      return isSetCodeInventory();
    case NUMBER_OF_INVENTORY:
      return isSetNumberOfInventory();
    case WORKER_NAME:
      return isSetWorkerName();
    case WORKER_POSITION:
      return isSetWorkerPosition();
    case DATE:
      return isSetDate();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Sales)
      return this.equals((Sales)that);
    return false;
  }

  public boolean equals(Sales that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_codeStock = true;
    boolean that_present_codeStock = true;
    if (this_present_codeStock || that_present_codeStock) {
      if (!(this_present_codeStock && that_present_codeStock))
        return false;
      if (this.codeStock != that.codeStock)
        return false;
    }

    boolean this_present_codeInventory = true;
    boolean that_present_codeInventory = true;
    if (this_present_codeInventory || that_present_codeInventory) {
      if (!(this_present_codeInventory && that_present_codeInventory))
        return false;
      if (this.codeInventory != that.codeInventory)
        return false;
    }

    boolean this_present_numberOfInventory = true;
    boolean that_present_numberOfInventory = true;
    if (this_present_numberOfInventory || that_present_numberOfInventory) {
      if (!(this_present_numberOfInventory && that_present_numberOfInventory))
        return false;
      if (this.numberOfInventory != that.numberOfInventory)
        return false;
    }

    boolean this_present_workerName = true && this.isSetWorkerName();
    boolean that_present_workerName = true && that.isSetWorkerName();
    if (this_present_workerName || that_present_workerName) {
      if (!(this_present_workerName && that_present_workerName))
        return false;
      if (!this.workerName.equals(that.workerName))
        return false;
    }

    boolean this_present_workerPosition = true && this.isSetWorkerPosition();
    boolean that_present_workerPosition = true && that.isSetWorkerPosition();
    if (this_present_workerPosition || that_present_workerPosition) {
      if (!(this_present_workerPosition && that_present_workerPosition))
        return false;
      if (!this.workerPosition.equals(that.workerPosition))
        return false;
    }

    boolean this_present_date = true && this.isSetDate();
    boolean that_present_date = true && that.isSetDate();
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (!this.date.equals(that.date))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + code;

    hashCode = hashCode * 8191 + codeStock;

    hashCode = hashCode * 8191 + codeInventory;

    hashCode = hashCode * 8191 + numberOfInventory;

    hashCode = hashCode * 8191 + ((isSetWorkerName()) ? 131071 : 524287);
    if (isSetWorkerName())
      hashCode = hashCode * 8191 + workerName.hashCode();

    hashCode = hashCode * 8191 + ((isSetWorkerPosition()) ? 131071 : 524287);
    if (isSetWorkerPosition())
      hashCode = hashCode * 8191 + workerPosition.hashCode();

    hashCode = hashCode * 8191 + ((isSetDate()) ? 131071 : 524287);
    if (isSetDate())
      hashCode = hashCode * 8191 + date.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Sales other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCodeStock()).compareTo(other.isSetCodeStock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodeStock()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codeStock, other.codeStock);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCodeInventory()).compareTo(other.isSetCodeInventory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodeInventory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codeInventory, other.codeInventory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNumberOfInventory()).compareTo(other.isSetNumberOfInventory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumberOfInventory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numberOfInventory, other.numberOfInventory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWorkerName()).compareTo(other.isSetWorkerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerName, other.workerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWorkerPosition()).compareTo(other.isSetWorkerPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerPosition, other.workerPosition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Sales(");
    boolean first = true;

    sb.append("code:");
    sb.append(this.code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("codeStock:");
    sb.append(this.codeStock);
    first = false;
    if (!first) sb.append(", ");
    sb.append("codeInventory:");
    sb.append(this.codeInventory);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numberOfInventory:");
    sb.append(this.numberOfInventory);
    first = false;
    if (!first) sb.append(", ");
    sb.append("workerName:");
    if (this.workerName == null) {
      sb.append("null");
    } else {
      sb.append(this.workerName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workerPosition:");
    if (this.workerPosition == null) {
      sb.append("null");
    } else {
      sb.append(this.workerPosition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    if (this.date == null) {
      sb.append("null");
    } else {
      sb.append(this.date);
    }
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

  private static class SalesStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SalesStandardScheme getScheme() {
      return new SalesStandardScheme();
    }
  }

  private static class SalesStandardScheme extends org.apache.thrift.scheme.StandardScheme<Sales> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Sales struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE_STOCK
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.codeStock = iprot.readI32();
              struct.setCodeStockIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CODE_INVENTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.codeInventory = iprot.readI32();
              struct.setCodeInventoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NUMBER_OF_INVENTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numberOfInventory = iprot.readI32();
              struct.setNumberOfInventoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // WORKER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.workerName = iprot.readString();
              struct.setWorkerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WORKER_POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.workerPosition = iprot.readString();
              struct.setWorkerPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.date = iprot.readString();
              struct.setDateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Sales struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(struct.code);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CODE_STOCK_FIELD_DESC);
      oprot.writeI32(struct.codeStock);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CODE_INVENTORY_FIELD_DESC);
      oprot.writeI32(struct.codeInventory);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUMBER_OF_INVENTORY_FIELD_DESC);
      oprot.writeI32(struct.numberOfInventory);
      oprot.writeFieldEnd();
      if (struct.workerName != null) {
        oprot.writeFieldBegin(WORKER_NAME_FIELD_DESC);
        oprot.writeString(struct.workerName);
        oprot.writeFieldEnd();
      }
      if (struct.workerPosition != null) {
        oprot.writeFieldBegin(WORKER_POSITION_FIELD_DESC);
        oprot.writeString(struct.workerPosition);
        oprot.writeFieldEnd();
      }
      if (struct.date != null) {
        oprot.writeFieldBegin(DATE_FIELD_DESC);
        oprot.writeString(struct.date);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SalesTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SalesTupleScheme getScheme() {
      return new SalesTupleScheme();
    }
  }

  private static class SalesTupleScheme extends org.apache.thrift.scheme.TupleScheme<Sales> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Sales struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetCodeStock()) {
        optionals.set(1);
      }
      if (struct.isSetCodeInventory()) {
        optionals.set(2);
      }
      if (struct.isSetNumberOfInventory()) {
        optionals.set(3);
      }
      if (struct.isSetWorkerName()) {
        optionals.set(4);
      }
      if (struct.isSetWorkerPosition()) {
        optionals.set(5);
      }
      if (struct.isSetDate()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code);
      }
      if (struct.isSetCodeStock()) {
        oprot.writeI32(struct.codeStock);
      }
      if (struct.isSetCodeInventory()) {
        oprot.writeI32(struct.codeInventory);
      }
      if (struct.isSetNumberOfInventory()) {
        oprot.writeI32(struct.numberOfInventory);
      }
      if (struct.isSetWorkerName()) {
        oprot.writeString(struct.workerName);
      }
      if (struct.isSetWorkerPosition()) {
        oprot.writeString(struct.workerPosition);
      }
      if (struct.isSetDate()) {
        oprot.writeString(struct.date);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Sales struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.code = iprot.readI32();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.codeStock = iprot.readI32();
        struct.setCodeStockIsSet(true);
      }
      if (incoming.get(2)) {
        struct.codeInventory = iprot.readI32();
        struct.setCodeInventoryIsSet(true);
      }
      if (incoming.get(3)) {
        struct.numberOfInventory = iprot.readI32();
        struct.setNumberOfInventoryIsSet(true);
      }
      if (incoming.get(4)) {
        struct.workerName = iprot.readString();
        struct.setWorkerNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.workerPosition = iprot.readString();
        struct.setWorkerPositionIsSet(true);
      }
      if (incoming.get(6)) {
        struct.date = iprot.readString();
        struct.setDateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
