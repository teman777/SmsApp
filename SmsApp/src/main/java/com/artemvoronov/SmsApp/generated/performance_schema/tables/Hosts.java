/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.HostsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Hosts extends TableImpl<HostsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.hosts</code>
     */
    public static final Hosts HOSTS = new Hosts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostsRecord> getRecordType() {
        return HostsRecord.class;
    }

    /**
     * The column <code>performance_schema.hosts.HOST</code>.
     */
    public final TableField<HostsRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.hosts.CURRENT_CONNECTIONS</code>.
     */
    public final TableField<HostsRecord, Long> CURRENT_CONNECTIONS = createField(DSL.name("CURRENT_CONNECTIONS"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.hosts.TOTAL_CONNECTIONS</code>.
     */
    public final TableField<HostsRecord, Long> TOTAL_CONNECTIONS = createField(DSL.name("TOTAL_CONNECTIONS"), SQLDataType.BIGINT.nullable(false), this, "");

    private Hosts(Name alias, Table<HostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hosts(Name alias, Table<HostsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.hosts</code> table reference
     */
    public Hosts(String alias) {
        this(DSL.name(alias), HOSTS);
    }

    /**
     * Create an aliased <code>performance_schema.hosts</code> table reference
     */
    public Hosts(Name alias) {
        this(alias, HOSTS);
    }

    /**
     * Create a <code>performance_schema.hosts</code> table reference
     */
    public Hosts() {
        this(DSL.name("hosts"), null);
    }

    public <O extends Record> Hosts(Table<O> child, ForeignKey<O, HostsRecord> key) {
        super(child, key, HOSTS);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<HostsRecord>> getKeys() {
        return Arrays.<UniqueKey<HostsRecord>>asList(Keys.KEY_HOSTS_HOST);
    }

    @Override
    public Hosts as(String alias) {
        return new Hosts(DSL.name(alias), this);
    }

    @Override
    public Hosts as(Name alias) {
        return new Hosts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(String name) {
        return new Hosts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(Name name) {
        return new Hosts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
