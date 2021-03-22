/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Keys;
import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.SysConfigRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysConfig extends TableImpl<SysConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.sys_config</code>
     */
    public static final SysConfig SYS_CONFIG = new SysConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysConfigRecord> getRecordType() {
        return SysConfigRecord.class;
    }

    /**
     * The column <code>sys.sys_config.variable</code>.
     */
    public final TableField<SysConfigRecord, String> VARIABLE = createField(DSL.name("variable"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.sys_config.value</code>.
     */
    public final TableField<SysConfigRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.sys_config.set_time</code>.
     */
    public final TableField<SysConfigRecord, LocalDateTime> SET_TIME = createField(DSL.name("set_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>sys.sys_config.set_by</code>.
     */
    public final TableField<SysConfigRecord, String> SET_BY = createField(DSL.name("set_by"), SQLDataType.VARCHAR(128), this, "");

    private SysConfig(Name alias, Table<SysConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysConfig(Name alias, Table<SysConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>sys.sys_config</code> table reference
     */
    public SysConfig(String alias) {
        this(DSL.name(alias), SYS_CONFIG);
    }

    /**
     * Create an aliased <code>sys.sys_config</code> table reference
     */
    public SysConfig(Name alias) {
        this(alias, SYS_CONFIG);
    }

    /**
     * Create a <code>sys.sys_config</code> table reference
     */
    public SysConfig() {
        this(DSL.name("sys_config"), null);
    }

    public <O extends Record> SysConfig(Table<O> child, ForeignKey<O, SysConfigRecord> key) {
        super(child, key, SYS_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public UniqueKey<SysConfigRecord> getPrimaryKey() {
        return Keys.KEY_SYS_CONFIG_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<SysConfigRecord>>asList(Keys.KEY_SYS_CONFIG_PRIMARY);
    }

    @Override
    public SysConfig as(String alias) {
        return new SysConfig(DSL.name(alias), this);
    }

    @Override
    public SysConfig as(Name alias) {
        return new SysConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(String name) {
        return new SysConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(Name name) {
        return new SysConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}