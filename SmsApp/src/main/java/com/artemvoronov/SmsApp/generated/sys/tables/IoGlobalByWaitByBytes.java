/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.IoGlobalByWaitByBytesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IoGlobalByWaitByBytes extends TableImpl<IoGlobalByWaitByBytesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.io_global_by_wait_by_bytes</code>
     */
    public static final IoGlobalByWaitByBytes IO_GLOBAL_BY_WAIT_BY_BYTES = new IoGlobalByWaitByBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IoGlobalByWaitByBytesRecord> getRecordType() {
        return IoGlobalByWaitByBytesRecord.class;
    }

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.event_name</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.min_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> MIN_LATENCY = createField(DSL.name("min_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.max_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.count_read</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, ULong> COUNT_READ = createField(DSL.name("count_read"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_read</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_READ = createField(DSL.name("total_read"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_read</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> AVG_READ = createField(DSL.name("avg_read"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.count_write</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, ULong> COUNT_WRITE = createField(DSL.name("count_write"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_written</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_WRITTEN = createField(DSL.name("total_written"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_written</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> AVG_WRITTEN = createField(DSL.name("avg_written"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_requested</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_REQUESTED = createField(DSL.name("total_requested"), SQLDataType.VARCHAR(11), this, "");

    private IoGlobalByWaitByBytes(Name alias, Table<IoGlobalByWaitByBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private IoGlobalByWaitByBytes(Name alias, Table<IoGlobalByWaitByBytesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `io_global_by_wait_by_bytes` as select substring_index(`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME`,'/',-(2)) AS `event_name`,`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,format_pico_time(`performance_schema`.`file_summary_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,format_pico_time(`performance_schema`.`file_summary_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,format_pico_time(`performance_schema`.`file_summary_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,`performance_schema`.`file_summary_by_event_name`.`COUNT_READ` AS `count_read`,format_bytes(`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`) AS `total_read`,format_bytes(ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_READ`,0)),0)) AS `avg_read`,`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE` AS `count_write`,format_bytes(`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE`) AS `total_written`,format_bytes(ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE`,0)),0)) AS `avg_written`,format_bytes((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` + `performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`)) AS `total_requested` from `performance_schema`.`file_summary_by_event_name` where ((`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` > 0)) order by (`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` + `performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`) desc"));
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes(String alias) {
        this(DSL.name(alias), IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes(Name alias) {
        this(alias, IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    /**
     * Create a <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes() {
        this(DSL.name("io_global_by_wait_by_bytes"), null);
    }

    public <O extends Record> IoGlobalByWaitByBytes(Table<O> child, ForeignKey<O, IoGlobalByWaitByBytesRecord> key) {
        super(child, key, IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public IoGlobalByWaitByBytes as(String alias) {
        return new IoGlobalByWaitByBytes(DSL.name(alias), this);
    }

    @Override
    public IoGlobalByWaitByBytes as(Name alias) {
        return new IoGlobalByWaitByBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByBytes rename(String name) {
        return new IoGlobalByWaitByBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByBytes rename(Name name) {
        return new IoGlobalByWaitByBytes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, ULong, String, String, String, String, ULong, String, String, ULong, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}