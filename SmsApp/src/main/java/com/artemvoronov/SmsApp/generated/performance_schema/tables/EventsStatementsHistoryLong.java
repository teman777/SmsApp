/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsStatementsHistoryLongNestingEventType;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.EventsStatementsHistoryLongRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsStatementsHistoryLong extends TableImpl<EventsStatementsHistoryLongRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_statements_history_long</code>
     */
    public static final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = new EventsStatementsHistoryLong();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsHistoryLongRecord> getRecordType() {
        return EventsStatementsHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SOURCE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_START</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_END</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> LOCK_TIME = createField(DSL.name("LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SQL_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> SQL_TEXT = createField(DSL.name("SQL_TEXT"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.DIGEST</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> DIGEST = createField(DSL.name("DIGEST"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.DIGEST_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> DIGEST_TEXT = createField(DSL.name("DIGEST_TEXT"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CURRENT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> CURRENT_SCHEMA = createField(DSL.name("CURRENT_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_TYPE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_NAME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.MYSQL_ERRNO</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, Integer> MYSQL_ERRNO = createField(DSL.name("MYSQL_ERRNO"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.RETURNED_SQLSTATE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> RETURNED_SQLSTATE = createField(DSL.name("RETURNED_SQLSTATE"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.MESSAGE_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> MESSAGE_TEXT = createField(DSL.name("MESSAGE_TEXT"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ERRORS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ERRORS = createField(DSL.name("ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.WARNINGS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> WARNINGS = createField(DSL.name("WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_AFFECTED = createField(DSL.name("ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_SENT = createField(DSL.name("ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_EXAMINED = createField(DSL.name("ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> CREATED_TMP_DISK_TABLES = createField(DSL.name("CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> CREATED_TMP_TABLES = createField(DSL.name("CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_FULL_JOIN = createField(DSL.name("SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_FULL_RANGE_JOIN = createField(DSL.name("SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_RANGE = createField(DSL.name("SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_RANGE_CHECK = createField(DSL.name("SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_SCAN = createField(DSL.name("SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_MERGE_PASSES = createField(DSL.name("SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_RANGE = createField(DSL.name("SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_ROWS = createField(DSL.name("SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_SCAN = createField(DSL.name("SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NO_INDEX_USED = createField(DSL.name("NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NO_GOOD_INDEX_USED = createField(DSL.name("NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, EventsStatementsHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsStatementsHistoryLongNestingEventType.class), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_LEVEL</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, Integer> NESTING_EVENT_LEVEL = createField(DSL.name("NESTING_EVENT_LEVEL"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.STATEMENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> STATEMENT_ID = createField(DSL.name("STATEMENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    private EventsStatementsHistoryLong(Name alias, Table<EventsStatementsHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsHistoryLong(Name alias, Table<EventsStatementsHistoryLongRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EventsStatementsHistoryLong(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_HISTORY_LONG);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EventsStatementsHistoryLong(Name alias) {
        this(alias, EVENTS_STATEMENTS_HISTORY_LONG);
    }

    /**
     * Create a <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EventsStatementsHistoryLong() {
        this(DSL.name("events_statements_history_long"), null);
    }

    public <O extends Record> EventsStatementsHistoryLong(Table<O> child, ForeignKey<O, EventsStatementsHistoryLongRecord> key) {
        super(child, key, EVENTS_STATEMENTS_HISTORY_LONG);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EventsStatementsHistoryLong as(String alias) {
        return new EventsStatementsHistoryLong(DSL.name(alias), this);
    }

    @Override
    public EventsStatementsHistoryLong as(Name alias) {
        return new EventsStatementsHistoryLong(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistoryLong rename(String name) {
        return new EventsStatementsHistoryLong(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistoryLong rename(Name name) {
        return new EventsStatementsHistoryLong(name, null);
    }
}