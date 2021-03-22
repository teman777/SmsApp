/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.X$ioGlobalByWaitByLatencyRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class X$ioGlobalByWaitByLatency extends TableImpl<X$ioGlobalByWaitByLatencyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$io_global_by_wait_by_latency</code>
     */
    public static final X$ioGlobalByWaitByLatency X$IO_GLOBAL_BY_WAIT_BY_LATENCY = new X$ioGlobalByWaitByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$ioGlobalByWaitByLatencyRecord> getRecordType() {
        return X$ioGlobalByWaitByLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.event_name</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.avg_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.max_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.read_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> READ_LATENCY = createField(DSL.name("read_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.write_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> WRITE_LATENCY = createField(DSL.name("write_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.misc_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> MISC_LATENCY = createField(DSL.name("misc_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.count_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> COUNT_READ = createField(DSL.name("count_read"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, Long> TOTAL_READ = createField(DSL.name("total_read"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.avg_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, BigDecimal> AVG_READ = createField(DSL.name("avg_read"), SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.count_write</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> COUNT_WRITE = createField(DSL.name("count_write"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total_written</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, Long> TOTAL_WRITTEN = createField(DSL.name("total_written"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.avg_written</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, BigDecimal> AVG_WRITTEN = createField(DSL.name("avg_written"), SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    private X$ioGlobalByWaitByLatency(Name alias, Table<X$ioGlobalByWaitByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$ioGlobalByWaitByLatency(Name alias, Table<X$ioGlobalByWaitByLatencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$io_global_by_wait_by_latency` as select substring_index(`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME`,'/',-(2)) AS `event_name`,`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` AS `total`,`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`file_summary_by_event_name`.`AVG_TIMER_WAIT` AS `avg_latency`,`performance_schema`.`file_summary_by_event_name`.`MAX_TIMER_WAIT` AS `max_latency`,`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_READ` AS `read_latency`,`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WRITE` AS `write_latency`,`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_MISC` AS `misc_latency`,`performance_schema`.`file_summary_by_event_name`.`COUNT_READ` AS `count_read`,`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ` AS `total_read`,ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_READ`,0)),0) AS `avg_read`,`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE` AS `count_write`,`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` AS `total_written`,ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE`,0)),0) AS `avg_written` from `performance_schema`.`file_summary_by_event_name` where ((`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` > 0)) order by `performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_wait_by_latency</code> table reference
     */
    public X$ioGlobalByWaitByLatency(String alias) {
        this(DSL.name(alias), X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_wait_by_latency</code> table reference
     */
    public X$ioGlobalByWaitByLatency(Name alias) {
        this(alias, X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * Create a <code>sys.x$io_global_by_wait_by_latency</code> table reference
     */
    public X$ioGlobalByWaitByLatency() {
        this(DSL.name("x$io_global_by_wait_by_latency"), null);
    }

    public <O extends Record> X$ioGlobalByWaitByLatency(Table<O> child, ForeignKey<O, X$ioGlobalByWaitByLatencyRecord> key) {
        super(child, key, X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$ioGlobalByWaitByLatency as(String alias) {
        return new X$ioGlobalByWaitByLatency(DSL.name(alias), this);
    }

    @Override
    public X$ioGlobalByWaitByLatency as(Name alias) {
        return new X$ioGlobalByWaitByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByWaitByLatency rename(String name) {
        return new X$ioGlobalByWaitByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByWaitByLatency rename(Name name) {
        return new X$ioGlobalByWaitByLatency(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
