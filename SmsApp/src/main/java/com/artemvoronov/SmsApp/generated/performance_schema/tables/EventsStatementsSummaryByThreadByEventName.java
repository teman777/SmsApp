/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.EventsStatementsSummaryByThreadByEventNameRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class EventsStatementsSummaryByThreadByEventName extends TableImpl<EventsStatementsSummaryByThreadByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>
     */
    public static final EventsStatementsSummaryByThreadByEventName EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME = new EventsStatementsSummaryByThreadByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsSummaryByThreadByEventNameRecord> getRecordType() {
        return EventsStatementsSummaryByThreadByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_LOCK_TIME = createField(DSL.name("SUM_LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_ERRORS</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_ERRORS = createField(DSL.name("SUM_ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_WARNINGS</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_WARNINGS = createField(DSL.name("SUM_WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_ROWS_AFFECTED = createField(DSL.name("SUM_ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_ROWS_SENT = createField(DSL.name("SUM_ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_ROWS_EXAMINED = createField(DSL.name("SUM_ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_CREATED_TMP_DISK_TABLES = createField(DSL.name("SUM_CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_CREATED_TMP_TABLES = createField(DSL.name("SUM_CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SELECT_FULL_JOIN = createField(DSL.name("SUM_SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SELECT_FULL_RANGE_JOIN = createField(DSL.name("SUM_SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SELECT_RANGE = createField(DSL.name("SUM_SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SELECT_RANGE_CHECK = createField(DSL.name("SUM_SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SELECT_SCAN = createField(DSL.name("SUM_SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SORT_MERGE_PASSES = createField(DSL.name("SUM_SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SORT_RANGE = createField(DSL.name("SUM_SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SORT_ROWS = createField(DSL.name("SUM_SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_SORT_SCAN = createField(DSL.name("SUM_SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_NO_INDEX_USED = createField(DSL.name("SUM_NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_thread_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByThreadByEventNameRecord, ULong> SUM_NO_GOOD_INDEX_USED = createField(DSL.name("SUM_NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private EventsStatementsSummaryByThreadByEventName(Name alias, Table<EventsStatementsSummaryByThreadByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsSummaryByThreadByEventName(Name alias, Table<EventsStatementsSummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_by_thread_by_event_name</code> table reference
     */
    public EventsStatementsSummaryByThreadByEventName(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_by_thread_by_event_name</code> table reference
     */
    public EventsStatementsSummaryByThreadByEventName(Name alias) {
        this(alias, EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create a <code>performance_schema.events_statements_summary_by_thread_by_event_name</code> table reference
     */
    public EventsStatementsSummaryByThreadByEventName() {
        this(DSL.name("events_statements_summary_by_thread_by_event_name"), null);
    }

    public <O extends Record> EventsStatementsSummaryByThreadByEventName(Table<O> child, ForeignKey<O, EventsStatementsSummaryByThreadByEventNameRecord> key) {
        super(child, key, EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<EventsStatementsSummaryByThreadByEventNameRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME_PRIMARY;
    }

    @Override
    public List<UniqueKey<EventsStatementsSummaryByThreadByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsStatementsSummaryByThreadByEventNameRecord>>asList(Keys.KEY_EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME_PRIMARY);
    }

    @Override
    public EventsStatementsSummaryByThreadByEventName as(String alias) {
        return new EventsStatementsSummaryByThreadByEventName(DSL.name(alias), this);
    }

    @Override
    public EventsStatementsSummaryByThreadByEventName as(Name alias) {
        return new EventsStatementsSummaryByThreadByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByThreadByEventName rename(String name) {
        return new EventsStatementsSummaryByThreadByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByThreadByEventName rename(Name name) {
        return new EventsStatementsSummaryByThreadByEventName(name, null);
    }
}
