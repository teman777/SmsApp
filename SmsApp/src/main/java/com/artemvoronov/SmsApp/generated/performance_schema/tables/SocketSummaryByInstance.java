/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Indexes;
import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.SocketSummaryByInstanceRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
public class SocketSummaryByInstance extends TableImpl<SocketSummaryByInstanceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.socket_summary_by_instance</code>
     */
    public static final SocketSummaryByInstance SOCKET_SUMMARY_BY_INSTANCE = new SocketSummaryByInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SocketSummaryByInstanceRecord> getRecordType() {
        return SocketSummaryByInstanceRecord.class;
    }

    /**
     * The column <code>performance_schema.socket_summary_by_instance.EVENT_NAME</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_STAR</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_READ</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> COUNT_READ = createField(DSL.name("COUNT_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_READ</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> SUM_TIMER_READ = createField(DSL.name("SUM_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_READ</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MIN_TIMER_READ = createField(DSL.name("MIN_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_READ</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> AVG_TIMER_READ = createField(DSL.name("AVG_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_READ</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MAX_TIMER_READ = createField(DSL.name("MAX_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> SUM_NUMBER_OF_BYTES_READ = createField(DSL.name("SUM_NUMBER_OF_BYTES_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_WRITE</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> COUNT_WRITE = createField(DSL.name("COUNT_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WRITE</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> SUM_TIMER_WRITE = createField(DSL.name("SUM_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WRITE</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MIN_TIMER_WRITE = createField(DSL.name("MIN_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WRITE</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> AVG_TIMER_WRITE = createField(DSL.name("AVG_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WRITE</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MAX_TIMER_WRITE = createField(DSL.name("MAX_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> SUM_NUMBER_OF_BYTES_WRITE = createField(DSL.name("SUM_NUMBER_OF_BYTES_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_MISC</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> COUNT_MISC = createField(DSL.name("COUNT_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_MISC</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> SUM_TIMER_MISC = createField(DSL.name("SUM_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_MISC</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MIN_TIMER_MISC = createField(DSL.name("MIN_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_MISC</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> AVG_TIMER_MISC = createField(DSL.name("AVG_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_MISC</code>.
     */
    public final TableField<SocketSummaryByInstanceRecord, ULong> MAX_TIMER_MISC = createField(DSL.name("MAX_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private SocketSummaryByInstance(Name alias, Table<SocketSummaryByInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SocketSummaryByInstance(Name alias, Table<SocketSummaryByInstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.socket_summary_by_instance</code> table reference
     */
    public SocketSummaryByInstance(String alias) {
        this(DSL.name(alias), SOCKET_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create an aliased <code>performance_schema.socket_summary_by_instance</code> table reference
     */
    public SocketSummaryByInstance(Name alias) {
        this(alias, SOCKET_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create a <code>performance_schema.socket_summary_by_instance</code> table reference
     */
    public SocketSummaryByInstance() {
        this(DSL.name("socket_summary_by_instance"), null);
    }

    public <O extends Record> SocketSummaryByInstance(Table<O> child, ForeignKey<O, SocketSummaryByInstanceRecord> key) {
        super(child, key, SOCKET_SUMMARY_BY_INSTANCE);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SOCKET_SUMMARY_BY_INSTANCE_EVENT_NAME);
    }

    @Override
    public UniqueKey<SocketSummaryByInstanceRecord> getPrimaryKey() {
        return Keys.KEY_SOCKET_SUMMARY_BY_INSTANCE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SocketSummaryByInstanceRecord>> getKeys() {
        return Arrays.<UniqueKey<SocketSummaryByInstanceRecord>>asList(Keys.KEY_SOCKET_SUMMARY_BY_INSTANCE_PRIMARY);
    }

    @Override
    public SocketSummaryByInstance as(String alias) {
        return new SocketSummaryByInstance(DSL.name(alias), this);
    }

    @Override
    public SocketSummaryByInstance as(Name alias) {
        return new SocketSummaryByInstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SocketSummaryByInstance rename(String name) {
        return new SocketSummaryByInstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SocketSummaryByInstance rename(Name name) {
        return new SocketSummaryByInstance(name, null);
    }
}
