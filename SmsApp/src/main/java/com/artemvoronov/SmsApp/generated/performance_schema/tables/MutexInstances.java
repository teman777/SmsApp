/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Indexes;
import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.MutexInstancesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MutexInstances extends TableImpl<MutexInstancesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.mutex_instances</code>
     */
    public static final MutexInstances MUTEX_INSTANCES = new MutexInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MutexInstancesRecord> getRecordType() {
        return MutexInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.mutex_instances.NAME</code>.
     */
    public final TableField<MutexInstancesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.mutex_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<MutexInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.mutex_instances.LOCKED_BY_THREAD_ID</code>.
     */
    public final TableField<MutexInstancesRecord, ULong> LOCKED_BY_THREAD_ID = createField(DSL.name("LOCKED_BY_THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    private MutexInstances(Name alias, Table<MutexInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MutexInstances(Name alias, Table<MutexInstancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.mutex_instances</code> table reference
     */
    public MutexInstances(String alias) {
        this(DSL.name(alias), MUTEX_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.mutex_instances</code> table reference
     */
    public MutexInstances(Name alias) {
        this(alias, MUTEX_INSTANCES);
    }

    /**
     * Create a <code>performance_schema.mutex_instances</code> table reference
     */
    public MutexInstances() {
        this(DSL.name("mutex_instances"), null);
    }

    public <O extends Record> MutexInstances(Table<O> child, ForeignKey<O, MutexInstancesRecord> key) {
        super(child, key, MUTEX_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MUTEX_INSTANCES_LOCKED_BY_THREAD_ID, Indexes.MUTEX_INSTANCES_NAME);
    }

    @Override
    public UniqueKey<MutexInstancesRecord> getPrimaryKey() {
        return Keys.KEY_MUTEX_INSTANCES_PRIMARY;
    }

    @Override
    public List<UniqueKey<MutexInstancesRecord>> getKeys() {
        return Arrays.<UniqueKey<MutexInstancesRecord>>asList(Keys.KEY_MUTEX_INSTANCES_PRIMARY);
    }

    @Override
    public MutexInstances as(String alias) {
        return new MutexInstances(DSL.name(alias), this);
    }

    @Override
    public MutexInstances as(Name alias) {
        return new MutexInstances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MutexInstances rename(String name) {
        return new MutexInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MutexInstances rename(Name name) {
        return new MutexInstances(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, ULong, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}