/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.SchemaAutoIncrementColumnsRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemaAutoIncrementColumns extends TableImpl<SchemaAutoIncrementColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_auto_increment_columns</code>
     */
    public static final SchemaAutoIncrementColumns SCHEMA_AUTO_INCREMENT_COLUMNS = new SchemaAutoIncrementColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaAutoIncrementColumnsRecord> getRecordType() {
        return SchemaAutoIncrementColumnsRecord.class;
    }

    /**
     * The column <code>sys.schema_auto_increment_columns.table_schema</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.table_name</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.column_name</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.data_type</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.column_type</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, String> COLUMN_TYPE = createField(DSL.name("column_type"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.is_signed</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, Integer> IS_SIGNED = createField(DSL.name("is_signed"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.is_unsigned</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, Integer> IS_UNSIGNED = createField(DSL.name("is_unsigned"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.max_value</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, ULong> MAX_VALUE = createField(DSL.name("max_value"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.auto_increment</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, ULong> AUTO_INCREMENT = createField(DSL.name("auto_increment"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_auto_increment_columns.auto_increment_ratio</code>.
     */
    public final TableField<SchemaAutoIncrementColumnsRecord, BigDecimal> AUTO_INCREMENT_RATIO = createField(DSL.name("auto_increment_ratio"), SQLDataType.DECIMAL(25, 4), this, "");

    private SchemaAutoIncrementColumns(Name alias, Table<SchemaAutoIncrementColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaAutoIncrementColumns(Name alias, Table<SchemaAutoIncrementColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_auto_increment_columns` as select `information_schema`.`COLUMNS`.`TABLE_SCHEMA` AS `TABLE_SCHEMA`,`information_schema`.`COLUMNS`.`TABLE_NAME` AS `TABLE_NAME`,`information_schema`.`COLUMNS`.`COLUMN_NAME` AS `COLUMN_NAME`,`information_schema`.`COLUMNS`.`DATA_TYPE` AS `DATA_TYPE`,`information_schema`.`COLUMNS`.`COLUMN_TYPE` AS `COLUMN_TYPE`,(locate('unsigned',`information_schema`.`COLUMNS`.`COLUMN_TYPE`) = 0) AS `is_signed`,(locate('unsigned',`information_schema`.`COLUMNS`.`COLUMN_TYPE`) > 0) AS `is_unsigned`,((case `information_schema`.`COLUMNS`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`COLUMNS`.`COLUMN_TYPE`) > 0),0,1)) AS `max_value`,`information_schema`.`TABLES`.`AUTO_INCREMENT` AS `AUTO_INCREMENT`,(`information_schema`.`TABLES`.`AUTO_INCREMENT` / ((case `information_schema`.`COLUMNS`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`COLUMNS`.`COLUMN_TYPE`) > 0),0,1))) AS `auto_increment_ratio` from (`information_schema`.`COLUMNS` join `information_schema`.`TABLES` on(((`information_schema`.`COLUMNS`.`TABLE_SCHEMA` = `information_schema`.`TABLES`.`TABLE_SCHEMA`) and (`information_schema`.`COLUMNS`.`TABLE_NAME` = `information_schema`.`TABLES`.`TABLE_NAME`)))) where ((`information_schema`.`COLUMNS`.`TABLE_SCHEMA` not in ('mysql','sys','INFORMATION_SCHEMA','performance_schema')) and (`information_schema`.`TABLES`.`TABLE_TYPE` = 'BASE TABLE') and (`information_schema`.`COLUMNS`.`EXTRA` = 'auto_increment')) order by (`information_schema`.`TABLES`.`AUTO_INCREMENT` / ((case `information_schema`.`COLUMNS`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`COLUMNS`.`COLUMN_TYPE`) > 0),0,1))) desc,((case `information_schema`.`COLUMNS`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`COLUMNS`.`COLUMN_TYPE`) > 0),0,1))"));
    }

    /**
     * Create an aliased <code>sys.schema_auto_increment_columns</code> table reference
     */
    public SchemaAutoIncrementColumns(String alias) {
        this(DSL.name(alias), SCHEMA_AUTO_INCREMENT_COLUMNS);
    }

    /**
     * Create an aliased <code>sys.schema_auto_increment_columns</code> table reference
     */
    public SchemaAutoIncrementColumns(Name alias) {
        this(alias, SCHEMA_AUTO_INCREMENT_COLUMNS);
    }

    /**
     * Create a <code>sys.schema_auto_increment_columns</code> table reference
     */
    public SchemaAutoIncrementColumns() {
        this(DSL.name("schema_auto_increment_columns"), null);
    }

    public <O extends Record> SchemaAutoIncrementColumns(Table<O> child, ForeignKey<O, SchemaAutoIncrementColumnsRecord> key) {
        super(child, key, SCHEMA_AUTO_INCREMENT_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SchemaAutoIncrementColumns as(String alias) {
        return new SchemaAutoIncrementColumns(DSL.name(alias), this);
    }

    @Override
    public SchemaAutoIncrementColumns as(Name alias) {
        return new SchemaAutoIncrementColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaAutoIncrementColumns rename(String name) {
        return new SchemaAutoIncrementColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaAutoIncrementColumns rename(Name name) {
        return new SchemaAutoIncrementColumns(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, Integer, Integer, ULong, ULong, BigDecimal> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}