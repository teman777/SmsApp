/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.tables.GlobalStatus;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalStatusRecord extends UpdatableRecordImpl<GlobalStatusRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.global_status.VARIABLE_NAME</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.global_status.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.global_status.VARIABLE_VALUE</code>.
     */
    public void setVariableValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.global_status.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GlobalStatus.GLOBAL_STATUS.VARIABLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return GlobalStatus.GLOBAL_STATUS.VARIABLE_VALUE;
    }

    @Override
    public String component1() {
        return getVariableName();
    }

    @Override
    public String component2() {
        return getVariableValue();
    }

    @Override
    public String value1() {
        return getVariableName();
    }

    @Override
    public String value2() {
        return getVariableValue();
    }

    @Override
    public GlobalStatusRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public GlobalStatusRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public GlobalStatusRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GlobalStatusRecord
     */
    public GlobalStatusRecord() {
        super(GlobalStatus.GLOBAL_STATUS);
    }

    /**
     * Create a detached, initialised GlobalStatusRecord
     */
    public GlobalStatusRecord(String variableName, String variableValue) {
        super(GlobalStatus.GLOBAL_STATUS);

        setVariableName(variableName);
        setVariableValue(variableValue);
    }
}