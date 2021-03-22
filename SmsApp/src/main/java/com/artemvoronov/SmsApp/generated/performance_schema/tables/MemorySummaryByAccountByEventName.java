/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.MemorySummaryByAccountByEventNameRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class MemorySummaryByAccountByEventName extends TableImpl<MemorySummaryByAccountByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.memory_summary_by_account_by_event_name</code>
     */
    public static final MemorySummaryByAccountByEventName MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = new MemorySummaryByAccountByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemorySummaryByAccountByEventNameRecord> getRecordType() {
        return MemorySummaryByAccountByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.USER</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.HOST</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.COUNT_ALLOC</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, ULong> COUNT_ALLOC = createField(DSL.name("COUNT_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.COUNT_FREE</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, ULong> COUNT_FREE = createField(DSL.name("COUNT_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_ALLOC = createField(DSL.name("SUM_NUMBER_OF_BYTES_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_FREE = createField(DSL.name("SUM_NUMBER_OF_BYTES_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.LOW_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, Long> LOW_COUNT_USED = createField(DSL.name("LOW_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, Long> CURRENT_COUNT_USED = createField(DSL.name("CURRENT_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.HIGH_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, Long> HIGH_COUNT_USED = createField(DSL.name("HIGH_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, Long> LOW_NUMBER_OF_BYTES_USED = createField(DSL.name("LOW_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, Long> CURRENT_NUMBER_OF_BYTES_USED = createField(DSL.name("CURRENT_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_account_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByAccountByEventNameRecord, Long> HIGH_NUMBER_OF_BYTES_USED = createField(DSL.name("HIGH_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    private MemorySummaryByAccountByEventName(Name alias, Table<MemorySummaryByAccountByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemorySummaryByAccountByEventName(Name alias, Table<MemorySummaryByAccountByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.memory_summary_by_account_by_event_name</code> table reference
     */
    public MemorySummaryByAccountByEventName(String alias) {
        this(DSL.name(alias), MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.memory_summary_by_account_by_event_name</code> table reference
     */
    public MemorySummaryByAccountByEventName(Name alias) {
        this(alias, MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    /**
     * Create a <code>performance_schema.memory_summary_by_account_by_event_name</code> table reference
     */
    public MemorySummaryByAccountByEventName() {
        this(DSL.name("memory_summary_by_account_by_event_name"), null);
    }

    public <O extends Record> MemorySummaryByAccountByEventName(Table<O> child, ForeignKey<O, MemorySummaryByAccountByEventNameRecord> key) {
        super(child, key, MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<MemorySummaryByAccountByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<MemorySummaryByAccountByEventNameRecord>>asList(Keys.KEY_MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME_ACCOUNT);
    }

    @Override
    public MemorySummaryByAccountByEventName as(String alias) {
        return new MemorySummaryByAccountByEventName(DSL.name(alias), this);
    }

    @Override
    public MemorySummaryByAccountByEventName as(Name alias) {
        return new MemorySummaryByAccountByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByAccountByEventName rename(String name) {
        return new MemorySummaryByAccountByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByAccountByEventName rename(Name name) {
        return new MemorySummaryByAccountByEventName(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
