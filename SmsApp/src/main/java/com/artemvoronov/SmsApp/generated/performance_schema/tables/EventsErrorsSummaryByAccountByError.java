/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.EventsErrorsSummaryByAccountByErrorRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class EventsErrorsSummaryByAccountByError extends TableImpl<EventsErrorsSummaryByAccountByErrorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_errors_summary_by_account_by_error</code>
     */
    public static final EventsErrorsSummaryByAccountByError EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR = new EventsErrorsSummaryByAccountByError();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsErrorsSummaryByAccountByErrorRecord> getRecordType() {
        return EventsErrorsSummaryByAccountByErrorRecord.class;
    }

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.USER</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.HOST</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.ERROR_NUMBER</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, Integer> ERROR_NUMBER = createField(DSL.name("ERROR_NUMBER"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.ERROR_NAME</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, String> ERROR_NAME = createField(DSL.name("ERROR_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.SQL_STATE</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, String> SQL_STATE = createField(DSL.name("SQL_STATE"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.SUM_ERROR_RAISED</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, ULong> SUM_ERROR_RAISED = createField(DSL.name("SUM_ERROR_RAISED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.SUM_ERROR_HANDLED</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, ULong> SUM_ERROR_HANDLED = createField(DSL.name("SUM_ERROR_HANDLED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.FIRST_SEEN</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, LocalDateTime> FIRST_SEEN = createField(DSL.name("FIRST_SEEN"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_account_by_error.LAST_SEEN</code>.
     */
    public final TableField<EventsErrorsSummaryByAccountByErrorRecord, LocalDateTime> LAST_SEEN = createField(DSL.name("LAST_SEEN"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    private EventsErrorsSummaryByAccountByError(Name alias, Table<EventsErrorsSummaryByAccountByErrorRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsErrorsSummaryByAccountByError(Name alias, Table<EventsErrorsSummaryByAccountByErrorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_errors_summary_by_account_by_error</code> table reference
     */
    public EventsErrorsSummaryByAccountByError(String alias) {
        this(DSL.name(alias), EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR);
    }

    /**
     * Create an aliased <code>performance_schema.events_errors_summary_by_account_by_error</code> table reference
     */
    public EventsErrorsSummaryByAccountByError(Name alias) {
        this(alias, EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR);
    }

    /**
     * Create a <code>performance_schema.events_errors_summary_by_account_by_error</code> table reference
     */
    public EventsErrorsSummaryByAccountByError() {
        this(DSL.name("events_errors_summary_by_account_by_error"), null);
    }

    public <O extends Record> EventsErrorsSummaryByAccountByError(Table<O> child, ForeignKey<O, EventsErrorsSummaryByAccountByErrorRecord> key) {
        super(child, key, EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<EventsErrorsSummaryByAccountByErrorRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsErrorsSummaryByAccountByErrorRecord>>asList(Keys.KEY_EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR_ACCOUNT);
    }

    @Override
    public EventsErrorsSummaryByAccountByError as(String alias) {
        return new EventsErrorsSummaryByAccountByError(DSL.name(alias), this);
    }

    @Override
    public EventsErrorsSummaryByAccountByError as(Name alias) {
        return new EventsErrorsSummaryByAccountByError(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByAccountByError rename(String name) {
        return new EventsErrorsSummaryByAccountByError(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByAccountByError rename(Name name) {
        return new EventsErrorsSummaryByAccountByError(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}