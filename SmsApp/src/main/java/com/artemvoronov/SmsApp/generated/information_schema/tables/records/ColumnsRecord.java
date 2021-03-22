/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables.records;


import com.artemvoronov.SmsApp.generated.information_schema.enums.ColumnsColumnKey;
import com.artemvoronov.SmsApp.generated.information_schema.tables.Columns;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> implements Record22<String, String, String, String, UInteger, String, String, String, Long, Long, ULong, ULong, UInteger, String, String, String, ColumnsColumnKey, String, String, String, String, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    public UInteger getOrdinalPosition() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public void setColumnDefault(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public String getColumnDefault() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    public void setIsNullable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    public String getIsNullable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    public void setDataType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public void setCharacterMaximumLength(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Long getCharacterMaximumLength() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public void setCharacterOctetLength(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Long getCharacterOctetLength() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public void setNumericPrecision(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public ULong getNumericPrecision() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    public void setNumericScale(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    public ULong getNumericScale() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    public void setDatetimePrecision(UInteger value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    public UInteger getDatetimePrecision() {
        return (UInteger) get(12);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    public void setCollationName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    public void setColumnType(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    public String getColumnType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    public void setColumnKey(ColumnsColumnKey value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    public ColumnsColumnKey getColumnKey() {
        return (ColumnsColumnKey) get(16);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.EXTRA</code>.
     */
    public void setExtra(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.EXTRA</code>.
     */
    public String getExtra() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    public void setPrivileges(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    public String getPrivileges() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    public void setColumnComment(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    public String getColumnComment() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public void setGenerationExpression(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public String getGenerationExpression() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.COLUMNS.SRS_ID</code>.
     */
    public void setSrsId(UInteger value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.COLUMNS.SRS_ID</code>.
     */
    public UInteger getSrsId() {
        return (UInteger) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, UInteger, String, String, String, Long, Long, ULong, ULong, UInteger, String, String, String, ColumnsColumnKey, String, String, String, String, UInteger> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, UInteger, String, String, String, Long, Long, ULong, ULong, UInteger, String, String, String, ColumnsColumnKey, String, String, String, String, UInteger> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Columns.COLUMNS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Columns.COLUMNS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Columns.COLUMNS.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return Columns.COLUMNS.COLUMN_NAME;
    }

    @Override
    public Field<UInteger> field5() {
        return Columns.COLUMNS.ORDINAL_POSITION;
    }

    @Override
    public Field<String> field6() {
        return Columns.COLUMNS.COLUMN_DEFAULT;
    }

    @Override
    public Field<String> field7() {
        return Columns.COLUMNS.IS_NULLABLE;
    }

    @Override
    public Field<String> field8() {
        return Columns.COLUMNS.DATA_TYPE;
    }

    @Override
    public Field<Long> field9() {
        return Columns.COLUMNS.CHARACTER_MAXIMUM_LENGTH;
    }

    @Override
    public Field<Long> field10() {
        return Columns.COLUMNS.CHARACTER_OCTET_LENGTH;
    }

    @Override
    public Field<ULong> field11() {
        return Columns.COLUMNS.NUMERIC_PRECISION;
    }

    @Override
    public Field<ULong> field12() {
        return Columns.COLUMNS.NUMERIC_SCALE;
    }

    @Override
    public Field<UInteger> field13() {
        return Columns.COLUMNS.DATETIME_PRECISION;
    }

    @Override
    public Field<String> field14() {
        return Columns.COLUMNS.CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field15() {
        return Columns.COLUMNS.COLLATION_NAME;
    }

    @Override
    public Field<String> field16() {
        return Columns.COLUMNS.COLUMN_TYPE;
    }

    @Override
    public Field<ColumnsColumnKey> field17() {
        return Columns.COLUMNS.COLUMN_KEY;
    }

    @Override
    public Field<String> field18() {
        return Columns.COLUMNS.EXTRA;
    }

    @Override
    public Field<String> field19() {
        return Columns.COLUMNS.PRIVILEGES;
    }

    @Override
    public Field<String> field20() {
        return Columns.COLUMNS.COLUMN_COMMENT;
    }

    @Override
    public Field<String> field21() {
        return Columns.COLUMNS.GENERATION_EXPRESSION;
    }

    @Override
    public Field<UInteger> field22() {
        return Columns.COLUMNS.SRS_ID;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getColumnName();
    }

    @Override
    public UInteger component5() {
        return getOrdinalPosition();
    }

    @Override
    public String component6() {
        return getColumnDefault();
    }

    @Override
    public String component7() {
        return getIsNullable();
    }

    @Override
    public String component8() {
        return getDataType();
    }

    @Override
    public Long component9() {
        return getCharacterMaximumLength();
    }

    @Override
    public Long component10() {
        return getCharacterOctetLength();
    }

    @Override
    public ULong component11() {
        return getNumericPrecision();
    }

    @Override
    public ULong component12() {
        return getNumericScale();
    }

    @Override
    public UInteger component13() {
        return getDatetimePrecision();
    }

    @Override
    public String component14() {
        return getCharacterSetName();
    }

    @Override
    public String component15() {
        return getCollationName();
    }

    @Override
    public String component16() {
        return getColumnType();
    }

    @Override
    public ColumnsColumnKey component17() {
        return getColumnKey();
    }

    @Override
    public String component18() {
        return getExtra();
    }

    @Override
    public String component19() {
        return getPrivileges();
    }

    @Override
    public String component20() {
        return getColumnComment();
    }

    @Override
    public String component21() {
        return getGenerationExpression();
    }

    @Override
    public UInteger component22() {
        return getSrsId();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getColumnName();
    }

    @Override
    public UInteger value5() {
        return getOrdinalPosition();
    }

    @Override
    public String value6() {
        return getColumnDefault();
    }

    @Override
    public String value7() {
        return getIsNullable();
    }

    @Override
    public String value8() {
        return getDataType();
    }

    @Override
    public Long value9() {
        return getCharacterMaximumLength();
    }

    @Override
    public Long value10() {
        return getCharacterOctetLength();
    }

    @Override
    public ULong value11() {
        return getNumericPrecision();
    }

    @Override
    public ULong value12() {
        return getNumericScale();
    }

    @Override
    public UInteger value13() {
        return getDatetimePrecision();
    }

    @Override
    public String value14() {
        return getCharacterSetName();
    }

    @Override
    public String value15() {
        return getCollationName();
    }

    @Override
    public String value16() {
        return getColumnType();
    }

    @Override
    public ColumnsColumnKey value17() {
        return getColumnKey();
    }

    @Override
    public String value18() {
        return getExtra();
    }

    @Override
    public String value19() {
        return getPrivileges();
    }

    @Override
    public String value20() {
        return getColumnComment();
    }

    @Override
    public String value21() {
        return getGenerationExpression();
    }

    @Override
    public UInteger value22() {
        return getSrsId();
    }

    @Override
    public ColumnsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ColumnsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ColumnsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ColumnsRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public ColumnsRecord value5(UInteger value) {
        setOrdinalPosition(value);
        return this;
    }

    @Override
    public ColumnsRecord value6(String value) {
        setColumnDefault(value);
        return this;
    }

    @Override
    public ColumnsRecord value7(String value) {
        setIsNullable(value);
        return this;
    }

    @Override
    public ColumnsRecord value8(String value) {
        setDataType(value);
        return this;
    }

    @Override
    public ColumnsRecord value9(Long value) {
        setCharacterMaximumLength(value);
        return this;
    }

    @Override
    public ColumnsRecord value10(Long value) {
        setCharacterOctetLength(value);
        return this;
    }

    @Override
    public ColumnsRecord value11(ULong value) {
        setNumericPrecision(value);
        return this;
    }

    @Override
    public ColumnsRecord value12(ULong value) {
        setNumericScale(value);
        return this;
    }

    @Override
    public ColumnsRecord value13(UInteger value) {
        setDatetimePrecision(value);
        return this;
    }

    @Override
    public ColumnsRecord value14(String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    public ColumnsRecord value15(String value) {
        setCollationName(value);
        return this;
    }

    @Override
    public ColumnsRecord value16(String value) {
        setColumnType(value);
        return this;
    }

    @Override
    public ColumnsRecord value17(ColumnsColumnKey value) {
        setColumnKey(value);
        return this;
    }

    @Override
    public ColumnsRecord value18(String value) {
        setExtra(value);
        return this;
    }

    @Override
    public ColumnsRecord value19(String value) {
        setPrivileges(value);
        return this;
    }

    @Override
    public ColumnsRecord value20(String value) {
        setColumnComment(value);
        return this;
    }

    @Override
    public ColumnsRecord value21(String value) {
        setGenerationExpression(value);
        return this;
    }

    @Override
    public ColumnsRecord value22(UInteger value) {
        setSrsId(value);
        return this;
    }

    @Override
    public ColumnsRecord values(String value1, String value2, String value3, String value4, UInteger value5, String value6, String value7, String value8, Long value9, Long value10, ULong value11, ULong value12, UInteger value13, String value14, String value15, String value16, ColumnsColumnKey value17, String value18, String value19, String value20, String value21, UInteger value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnsRecord
     */
    public ColumnsRecord() {
        super(Columns.COLUMNS);
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    public ColumnsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, UInteger ordinalPosition, String columnDefault, String isNullable, String dataType, Long characterMaximumLength, Long characterOctetLength, ULong numericPrecision, ULong numericScale, UInteger datetimePrecision, String characterSetName, String collationName, String columnType, ColumnsColumnKey columnKey, String extra, String privileges, String columnComment, String generationExpression, UInteger srsId) {
        super(Columns.COLUMNS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOrdinalPosition(ordinalPosition);
        setColumnDefault(columnDefault);
        setIsNullable(isNullable);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setNumericPrecision(numericPrecision);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setCharacterSetName(characterSetName);
        setCollationName(collationName);
        setColumnType(columnType);
        setColumnKey(columnKey);
        setExtra(extra);
        setPrivileges(privileges);
        setColumnComment(columnComment);
        setGenerationExpression(generationExpression);
        setSrsId(srsId);
    }
}
