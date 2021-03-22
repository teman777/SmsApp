/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.X$waitClassesGlobalByAvgLatencyRecord;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class X$waitClassesGlobalByAvgLatency extends TableImpl<X$waitClassesGlobalByAvgLatencyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$wait_classes_global_by_avg_latency</code>
     */
    public static final X$waitClassesGlobalByAvgLatency X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = new X$waitClassesGlobalByAvgLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$waitClassesGlobalByAvgLatencyRecord> getRecordType() {
        return X$waitClassesGlobalByAvgLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.event_class</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, String> EVENT_CLASS = createField(DSL.name("event_class"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.total</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, BigInteger> TOTAL = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, BigInteger> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, ULong> MIN_LATENCY = createField(DSL.name("min_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, BigDecimal> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.DECIMAL(46, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    private X$waitClassesGlobalByAvgLatency(Name alias, Table<X$waitClassesGlobalByAvgLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$waitClassesGlobalByAvgLatency(Name alias, Table<X$waitClassesGlobalByAvgLatencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$wait_classes_global_by_avg_latency` as select substring_index(`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME`,'/',3) AS `event_class`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,min(`performance_schema`.`events_waits_summary_global_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0) AS `avg_latency`,max(`performance_schema`.`events_waits_summary_global_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_global_by_event_name` where ((`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT` > 0) and (`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME` <> 'idle')) group by `event_class` order by ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0) desc"));
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    public X$waitClassesGlobalByAvgLatency(String alias) {
        this(DSL.name(alias), X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    public X$waitClassesGlobalByAvgLatency(Name alias) {
        this(alias, X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    /**
     * Create a <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    public X$waitClassesGlobalByAvgLatency() {
        this(DSL.name("x$wait_classes_global_by_avg_latency"), null);
    }

    public <O extends Record> X$waitClassesGlobalByAvgLatency(Table<O> child, ForeignKey<O, X$waitClassesGlobalByAvgLatencyRecord> key) {
        super(child, key, X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$waitClassesGlobalByAvgLatency as(String alias) {
        return new X$waitClassesGlobalByAvgLatency(DSL.name(alias), this);
    }

    @Override
    public X$waitClassesGlobalByAvgLatency as(Name alias) {
        return new X$waitClassesGlobalByAvgLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitClassesGlobalByAvgLatency rename(String name) {
        return new X$waitClassesGlobalByAvgLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitClassesGlobalByAvgLatency rename(Name name) {
        return new X$waitClassesGlobalByAvgLatency(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, BigInteger, BigInteger, ULong, BigDecimal, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
