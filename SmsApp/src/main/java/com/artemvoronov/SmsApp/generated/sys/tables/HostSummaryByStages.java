/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.HostSummaryByStagesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class HostSummaryByStages extends TableImpl<HostSummaryByStagesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.host_summary_by_stages</code>
     */
    public static final HostSummaryByStages HOST_SUMMARY_BY_STAGES = new HostSummaryByStages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryByStagesRecord> getRecordType() {
        return HostSummaryByStagesRecord.class;
    }

    /**
     * The column <code>sys.host_summary_by_stages.host</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.event_name</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.total</code>.
     */
    public final TableField<HostSummaryByStagesRecord, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.total_latency</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.avg_latency</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.VARCHAR(11), this, "");

    private HostSummaryByStages(Name alias, Table<HostSummaryByStagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostSummaryByStages(Name alias, Table<HostSummaryByStagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `host_summary_by_stages` as select if((`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST`) AS `host`,`performance_schema`.`events_stages_summary_by_host_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_stages_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`events_stages_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,format_pico_time(`performance_schema`.`events_stages_summary_by_host_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency` from `performance_schema`.`events_stages_summary_by_host_by_event_name` where (`performance_schema`.`events_stages_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` <> 0) order by if((`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_stages_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.host_summary_by_stages</code> table reference
     */
    public HostSummaryByStages(String alias) {
        this(DSL.name(alias), HOST_SUMMARY_BY_STAGES);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_stages</code> table reference
     */
    public HostSummaryByStages(Name alias) {
        this(alias, HOST_SUMMARY_BY_STAGES);
    }

    /**
     * Create a <code>sys.host_summary_by_stages</code> table reference
     */
    public HostSummaryByStages() {
        this(DSL.name("host_summary_by_stages"), null);
    }

    public <O extends Record> HostSummaryByStages(Table<O> child, ForeignKey<O, HostSummaryByStagesRecord> key) {
        super(child, key, HOST_SUMMARY_BY_STAGES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public HostSummaryByStages as(String alias) {
        return new HostSummaryByStages(DSL.name(alias), this);
    }

    @Override
    public HostSummaryByStages as(Name alias) {
        return new HostSummaryByStages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStages rename(String name) {
        return new HostSummaryByStages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStages rename(Name name) {
        return new HostSummaryByStages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, ULong, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
