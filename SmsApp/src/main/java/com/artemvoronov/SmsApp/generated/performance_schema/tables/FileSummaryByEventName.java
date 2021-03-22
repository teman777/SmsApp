/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.FileSummaryByEventNameRecord;

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
public class FileSummaryByEventName extends TableImpl<FileSummaryByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.file_summary_by_event_name</code>
     */
    public static final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = new FileSummaryByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileSummaryByEventNameRecord> getRecordType() {
        return FileSummaryByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.file_summary_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_READ = createField(DSL.name("COUNT_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_READ = createField(DSL.name("SUM_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_READ = createField(DSL.name("MIN_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_READ = createField(DSL.name("AVG_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_READ = createField(DSL.name("MAX_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, Long> SUM_NUMBER_OF_BYTES_READ = createField(DSL.name("SUM_NUMBER_OF_BYTES_READ"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_WRITE = createField(DSL.name("COUNT_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_WRITE = createField(DSL.name("SUM_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_WRITE = createField(DSL.name("MIN_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_WRITE = createField(DSL.name("AVG_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_WRITE = createField(DSL.name("MAX_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, Long> SUM_NUMBER_OF_BYTES_WRITE = createField(DSL.name("SUM_NUMBER_OF_BYTES_WRITE"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_MISC = createField(DSL.name("COUNT_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_MISC = createField(DSL.name("SUM_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_MISC = createField(DSL.name("MIN_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_MISC = createField(DSL.name("AVG_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_MISC = createField(DSL.name("MAX_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private FileSummaryByEventName(Name alias, Table<FileSummaryByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileSummaryByEventName(Name alias, Table<FileSummaryByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.file_summary_by_event_name</code> table reference
     */
    public FileSummaryByEventName(String alias) {
        this(DSL.name(alias), FILE_SUMMARY_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.file_summary_by_event_name</code> table reference
     */
    public FileSummaryByEventName(Name alias) {
        this(alias, FILE_SUMMARY_BY_EVENT_NAME);
    }

    /**
     * Create a <code>performance_schema.file_summary_by_event_name</code> table reference
     */
    public FileSummaryByEventName() {
        this(DSL.name("file_summary_by_event_name"), null);
    }

    public <O extends Record> FileSummaryByEventName(Table<O> child, ForeignKey<O, FileSummaryByEventNameRecord> key) {
        super(child, key, FILE_SUMMARY_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<FileSummaryByEventNameRecord> getPrimaryKey() {
        return Keys.KEY_FILE_SUMMARY_BY_EVENT_NAME_PRIMARY;
    }

    @Override
    public List<UniqueKey<FileSummaryByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<FileSummaryByEventNameRecord>>asList(Keys.KEY_FILE_SUMMARY_BY_EVENT_NAME_PRIMARY);
    }

    @Override
    public FileSummaryByEventName as(String alias) {
        return new FileSummaryByEventName(DSL.name(alias), this);
    }

    @Override
    public FileSummaryByEventName as(Name alias) {
        return new FileSummaryByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileSummaryByEventName rename(String name) {
        return new FileSummaryByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileSummaryByEventName rename(Name name) {
        return new FileSummaryByEventName(name, null);
    }
}