/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.EventsTransactionsSummaryByHostByEventNameRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class EventsTransactionsSummaryByHostByEventName extends TableImpl<EventsTransactionsSummaryByHostByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_transactions_summary_by_host_by_event_name</code>
     */
    public static final EventsTransactionsSummaryByHostByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME = new EventsTransactionsSummaryByHostByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsSummaryByHostByEventNameRecord> getRecordType() {
        return EventsTransactionsSummaryByHostByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.HOST</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> COUNT_READ_WRITE = createField(DSL.name("COUNT_READ_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_READ_WRITE = createField(DSL.name("SUM_TIMER_READ_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_READ_WRITE = createField(DSL.name("MIN_TIMER_READ_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_READ_WRITE = createField(DSL.name("AVG_TIMER_READ_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_READ_WRITE = createField(DSL.name("MAX_TIMER_READ_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> COUNT_READ_ONLY = createField(DSL.name("COUNT_READ_ONLY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_READ_ONLY = createField(DSL.name("SUM_TIMER_READ_ONLY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_READ_ONLY = createField(DSL.name("MIN_TIMER_READ_ONLY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_READ_ONLY = createField(DSL.name("AVG_TIMER_READ_ONLY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_READ_ONLY = createField(DSL.name("MAX_TIMER_READ_ONLY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private EventsTransactionsSummaryByHostByEventName(Name alias, Table<EventsTransactionsSummaryByHostByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsSummaryByHostByEventName(Name alias, Table<EventsTransactionsSummaryByHostByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_host_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByHostByEventName(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_host_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByHostByEventName(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    /**
     * Create a <code>performance_schema.events_transactions_summary_by_host_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByHostByEventName() {
        this(DSL.name("events_transactions_summary_by_host_by_event_name"), null);
    }

    public <O extends Record> EventsTransactionsSummaryByHostByEventName(Table<O> child, ForeignKey<O, EventsTransactionsSummaryByHostByEventNameRecord> key) {
        super(child, key, EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<EventsTransactionsSummaryByHostByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsTransactionsSummaryByHostByEventNameRecord>>asList(Keys.KEY_EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME_HOST);
    }

    @Override
    public EventsTransactionsSummaryByHostByEventName as(String alias) {
        return new EventsTransactionsSummaryByHostByEventName(DSL.name(alias), this);
    }

    @Override
    public EventsTransactionsSummaryByHostByEventName as(Name alias) {
        return new EventsTransactionsSummaryByHostByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsSummaryByHostByEventName rename(String name) {
        return new EventsTransactionsSummaryByHostByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsSummaryByHostByEventName rename(Name name) {
        return new EventsTransactionsSummaryByHostByEventName(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
