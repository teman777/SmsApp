/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.VersionRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Version extends TableImpl<VersionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.version</code>
     */
    public static final Version VERSION = new Version();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VersionRecord> getRecordType() {
        return VersionRecord.class;
    }

    /**
     * The column <code>sys.version.sys_version</code>.
     */
    public final TableField<VersionRecord, String> SYS_VERSION = createField(DSL.name("sys_version"), SQLDataType.VARCHAR(5).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.version.mysql_version</code>.
     */
    public final TableField<VersionRecord, String> MYSQL_VERSION = createField(DSL.name("mysql_version"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private Version(Name alias, Table<VersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Version(Name alias, Table<VersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `version` as select '2.1.1' AS `sys_version`,version() AS `mysql_version`"));
    }

    /**
     * Create an aliased <code>sys.version</code> table reference
     */
    public Version(String alias) {
        this(DSL.name(alias), VERSION);
    }

    /**
     * Create an aliased <code>sys.version</code> table reference
     */
    public Version(Name alias) {
        this(alias, VERSION);
    }

    /**
     * Create a <code>sys.version</code> table reference
     */
    public Version() {
        this(DSL.name("version"), null);
    }

    public <O extends Record> Version(Table<O> child, ForeignKey<O, VersionRecord> key) {
        super(child, key, VERSION);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public Version as(String alias) {
        return new Version(DSL.name(alias), this);
    }

    @Override
    public Version as(Name alias) {
        return new Version(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(String name) {
        return new Version(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(Name name) {
        return new Version(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
