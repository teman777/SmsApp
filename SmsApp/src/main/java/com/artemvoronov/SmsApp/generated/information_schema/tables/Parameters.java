/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables;


import com.artemvoronov.SmsApp.generated.information_schema.InformationSchema;
import com.artemvoronov.SmsApp.generated.information_schema.enums.ParametersRoutineType;
import com.artemvoronov.SmsApp.generated.information_schema.tables.records.ParametersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends TableImpl<ParametersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.PARAMETERS</code>
     */
    public static final Parameters PARAMETERS = new Parameters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParametersRecord> getRecordType() {
        return ParametersRecord.class;
    }

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public final TableField<ParametersRecord, ULong> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_MODE = createField(DSL.name("PARAMETER_MODE"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_NAME = createField(DSL.name("PARAMETER_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.DATA_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<ParametersRecord, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<ParametersRecord, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public final TableField<ParametersRecord, UInteger> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public final TableField<ParametersRecord, Long> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public final TableField<ParametersRecord, UInteger> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public final TableField<ParametersRecord, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
     */
    public final TableField<ParametersRecord, ParametersRoutineType> ROUTINE_TYPE = createField(DSL.name("ROUTINE_TYPE"), SQLDataType.VARCHAR(9).nullable(false).asEnumDataType(com.artemvoronov.SmsApp.generated.information_schema.enums.ParametersRoutineType.class), this, "");

    private Parameters(Name alias, Table<ParametersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.PARAMETERS</code> table reference
     */
    public Parameters(String alias) {
        this(DSL.name(alias), PARAMETERS);
    }

    /**
     * Create an aliased <code>information_schema.PARAMETERS</code> table reference
     */
    public Parameters(Name alias) {
        this(alias, PARAMETERS);
    }

    /**
     * Create a <code>information_schema.PARAMETERS</code> table reference
     */
    public Parameters() {
        this(DSL.name("PARAMETERS"), null);
    }

    public <O extends Record> Parameters(Table<O> child, ForeignKey<O, ParametersRecord> key) {
        super(child, key, PARAMETERS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Parameters as(String alias) {
        return new Parameters(DSL.name(alias), this);
    }

    @Override
    public Parameters as(Name alias) {
        return new Parameters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(String name) {
        return new Parameters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(Name name) {
        return new Parameters(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, ULong, String, String, String, Long, Long, UInteger, Long, UInteger, String, String, String, ParametersRoutineType> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}