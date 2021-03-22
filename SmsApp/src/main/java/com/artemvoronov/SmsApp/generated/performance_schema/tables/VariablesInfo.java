/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.VariablesInfoVariableSource;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.VariablesInfoRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VariablesInfo extends TableImpl<VariablesInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.variables_info</code>
     */
    public static final VariablesInfo VARIABLES_INFO = new VariablesInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VariablesInfoRecord> getRecordType() {
        return VariablesInfoRecord.class;
    }

    /**
     * The column <code>performance_schema.variables_info.VARIABLE_NAME</code>.
     */
    public final TableField<VariablesInfoRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.variables_info.VARIABLE_SOURCE</code>.
     */
    public final TableField<VariablesInfoRecord, VariablesInfoVariableSource> VARIABLE_SOURCE = createField(DSL.name("VARIABLE_SOURCE"), SQLDataType.VARCHAR(12).defaultValue(DSL.inline("COMPILED", SQLDataType.VARCHAR)).asEnumDataType(com.artemvoronov.SmsApp.generated.performance_schema.enums.VariablesInfoVariableSource.class), this, "");

    /**
     * The column <code>performance_schema.variables_info.VARIABLE_PATH</code>.
     */
    public final TableField<VariablesInfoRecord, String> VARIABLE_PATH = createField(DSL.name("VARIABLE_PATH"), SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>performance_schema.variables_info.MIN_VALUE</code>.
     */
    public final TableField<VariablesInfoRecord, String> MIN_VALUE = createField(DSL.name("MIN_VALUE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.variables_info.MAX_VALUE</code>.
     */
    public final TableField<VariablesInfoRecord, String> MAX_VALUE = createField(DSL.name("MAX_VALUE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.variables_info.SET_TIME</code>.
     */
    public final TableField<VariablesInfoRecord, LocalDateTime> SET_TIME = createField(DSL.name("SET_TIME"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>performance_schema.variables_info.SET_USER</code>.
     */
    public final TableField<VariablesInfoRecord, String> SET_USER = createField(DSL.name("SET_USER"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.variables_info.SET_HOST</code>.
     */
    public final TableField<VariablesInfoRecord, String> SET_HOST = createField(DSL.name("SET_HOST"), SQLDataType.CHAR(255), this, "");

    private VariablesInfo(Name alias, Table<VariablesInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private VariablesInfo(Name alias, Table<VariablesInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.variables_info</code> table reference
     */
    public VariablesInfo(String alias) {
        this(DSL.name(alias), VARIABLES_INFO);
    }

    /**
     * Create an aliased <code>performance_schema.variables_info</code> table reference
     */
    public VariablesInfo(Name alias) {
        this(alias, VARIABLES_INFO);
    }

    /**
     * Create a <code>performance_schema.variables_info</code> table reference
     */
    public VariablesInfo() {
        this(DSL.name("variables_info"), null);
    }

    public <O extends Record> VariablesInfo(Table<O> child, ForeignKey<O, VariablesInfoRecord> key) {
        super(child, key, VARIABLES_INFO);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public VariablesInfo as(String alias) {
        return new VariablesInfo(DSL.name(alias), this);
    }

    @Override
    public VariablesInfo as(Name alias) {
        return new VariablesInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesInfo rename(String name) {
        return new VariablesInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesInfo rename(Name name) {
        return new VariablesInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, VariablesInfoVariableSource, String, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
