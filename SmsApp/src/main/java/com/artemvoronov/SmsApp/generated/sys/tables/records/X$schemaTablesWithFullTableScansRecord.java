/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaTablesWithFullTableScans;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$schemaTablesWithFullTableScansRecord extends TableRecordImpl<X$schemaTablesWithFullTableScansRecord> implements Record4<String, String, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.x$schema_tables_with_full_table_scans.object_schema</code>.
     */
    public void setObjectSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$schema_tables_with_full_table_scans.object_schema</code>.
     */
    public String getObjectSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$schema_tables_with_full_table_scans.object_name</code>.
     */
    public void setObjectName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$schema_tables_with_full_table_scans.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public void setRowsFullScanned(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public ULong getRowsFullScanned() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$schema_tables_with_full_table_scans.latency</code>.
     */
    public void setLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$schema_tables_with_full_table_scans.latency</code>.
     */
    public ULong getLatency() {
        return (ULong) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, ULong, ULong> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, ULong, ULong> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.OBJECT_SCHEMA;
    }

    @Override
    public Field<String> field2() {
        return X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.OBJECT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.ROWS_FULL_SCANNED;
    }

    @Override
    public Field<ULong> field4() {
        return X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.LATENCY;
    }

    @Override
    public String component1() {
        return getObjectSchema();
    }

    @Override
    public String component2() {
        return getObjectName();
    }

    @Override
    public ULong component3() {
        return getRowsFullScanned();
    }

    @Override
    public ULong component4() {
        return getLatency();
    }

    @Override
    public String value1() {
        return getObjectSchema();
    }

    @Override
    public String value2() {
        return getObjectName();
    }

    @Override
    public ULong value3() {
        return getRowsFullScanned();
    }

    @Override
    public ULong value4() {
        return getLatency();
    }

    @Override
    public X$schemaTablesWithFullTableScansRecord value1(String value) {
        setObjectSchema(value);
        return this;
    }

    @Override
    public X$schemaTablesWithFullTableScansRecord value2(String value) {
        setObjectName(value);
        return this;
    }

    @Override
    public X$schemaTablesWithFullTableScansRecord value3(ULong value) {
        setRowsFullScanned(value);
        return this;
    }

    @Override
    public X$schemaTablesWithFullTableScansRecord value4(ULong value) {
        setLatency(value);
        return this;
    }

    @Override
    public X$schemaTablesWithFullTableScansRecord values(String value1, String value2, ULong value3, ULong value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$schemaTablesWithFullTableScansRecord
     */
    public X$schemaTablesWithFullTableScansRecord() {
        super(X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create a detached, initialised X$schemaTablesWithFullTableScansRecord
     */
    public X$schemaTablesWithFullTableScansRecord(String objectSchema, String objectName, ULong rowsFullScanned, ULong latency) {
        super(X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);

        setObjectSchema(objectSchema);
        setObjectName(objectName);
        setRowsFullScanned(rowsFullScanned);
        setLatency(latency);
    }
}
