/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.X$hostSummaryByFileIoRecord;

import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$hostSummaryByFileIo extends TableImpl<X$hostSummaryByFileIoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$host_summary_by_file_io</code>
     */
    public static final X$hostSummaryByFileIo X$HOST_SUMMARY_BY_FILE_IO = new X$hostSummaryByFileIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryByFileIoRecord> getRecordType() {
        return X$hostSummaryByFileIoRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_file_io.host</code>.
     */
    public final TableField<X$hostSummaryByFileIoRecord, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io.ios</code>.
     */
    public final TableField<X$hostSummaryByFileIoRecord, BigInteger> IOS = createField(DSL.name("ios"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io.io_latency</code>.
     */
    public final TableField<X$hostSummaryByFileIoRecord, BigInteger> IO_LATENCY = createField(DSL.name("io_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    private X$hostSummaryByFileIo(Name alias, Table<X$hostSummaryByFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByFileIo(Name alias, Table<X$hostSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$host_summary_by_file_io` as select if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR`) AS `ios`,sum(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `io_latency` from `performance_schema`.`events_waits_summary_by_host_by_event_name` where (`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') group by if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) desc"));
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io</code> table reference
     */
    public X$hostSummaryByFileIo(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io</code> table reference
     */
    public X$hostSummaryByFileIo(Name alias) {
        this(alias, X$HOST_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create a <code>sys.x$host_summary_by_file_io</code> table reference
     */
    public X$hostSummaryByFileIo() {
        this(DSL.name("x$host_summary_by_file_io"), null);
    }

    public <O extends Record> X$hostSummaryByFileIo(Table<O> child, ForeignKey<O, X$hostSummaryByFileIoRecord> key) {
        super(child, key, X$HOST_SUMMARY_BY_FILE_IO);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$hostSummaryByFileIo as(String alias) {
        return new X$hostSummaryByFileIo(DSL.name(alias), this);
    }

    @Override
    public X$hostSummaryByFileIo as(Name alias) {
        return new X$hostSummaryByFileIo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIo rename(String name) {
        return new X$hostSummaryByFileIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIo rename(Name name) {
        return new X$hostSummaryByFileIo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, BigInteger, BigInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
