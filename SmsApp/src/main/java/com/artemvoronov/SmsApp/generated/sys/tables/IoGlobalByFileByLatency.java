/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.IoGlobalByFileByLatencyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class IoGlobalByFileByLatency extends TableImpl<IoGlobalByFileByLatencyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.io_global_by_file_by_latency</code>
     */
    public static final IoGlobalByFileByLatency IO_GLOBAL_BY_FILE_BY_LATENCY = new IoGlobalByFileByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IoGlobalByFileByLatencyRecord> getRecordType() {
        return IoGlobalByFileByLatencyRecord.class;
    }

    /**
     * The column <code>sys.io_global_by_file_by_latency.file</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> FILE = createField(DSL.name("file"), SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.total</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.total_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.count_read</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> COUNT_READ = createField(DSL.name("count_read"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.read_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> READ_LATENCY = createField(DSL.name("read_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.count_write</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> COUNT_WRITE = createField(DSL.name("count_write"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.write_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> WRITE_LATENCY = createField(DSL.name("write_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.count_misc</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> COUNT_MISC = createField(DSL.name("count_misc"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.misc_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> MISC_LATENCY = createField(DSL.name("misc_latency"), SQLDataType.VARCHAR(11), this, "");

    private IoGlobalByFileByLatency(Name alias, Table<IoGlobalByFileByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private IoGlobalByFileByLatency(Name alias, Table<IoGlobalByFileByLatencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `io_global_by_file_by_latency` as select `sys`.`format_path`(`performance_schema`.`file_summary_by_instance`.`FILE_NAME`) AS `file`,`performance_schema`.`file_summary_by_instance`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_WAIT`) AS `total_latency`,`performance_schema`.`file_summary_by_instance`.`COUNT_READ` AS `count_read`,format_pico_time(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_READ`) AS `read_latency`,`performance_schema`.`file_summary_by_instance`.`COUNT_WRITE` AS `count_write`,format_pico_time(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_WRITE`) AS `write_latency`,`performance_schema`.`file_summary_by_instance`.`COUNT_MISC` AS `count_misc`,format_pico_time(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_MISC`) AS `misc_latency` from `performance_schema`.`file_summary_by_instance` order by `performance_schema`.`file_summary_by_instance`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.io_global_by_file_by_latency</code> table reference
     */
    public IoGlobalByFileByLatency(String alias) {
        this(DSL.name(alias), IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.io_global_by_file_by_latency</code> table reference
     */
    public IoGlobalByFileByLatency(Name alias) {
        this(alias, IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    /**
     * Create a <code>sys.io_global_by_file_by_latency</code> table reference
     */
    public IoGlobalByFileByLatency() {
        this(DSL.name("io_global_by_file_by_latency"), null);
    }

    public <O extends Record> IoGlobalByFileByLatency(Table<O> child, ForeignKey<O, IoGlobalByFileByLatencyRecord> key) {
        super(child, key, IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public IoGlobalByFileByLatency as(String alias) {
        return new IoGlobalByFileByLatency(DSL.name(alias), this);
    }

    @Override
    public IoGlobalByFileByLatency as(Name alias) {
        return new IoGlobalByFileByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByFileByLatency rename(String name) {
        return new IoGlobalByFileByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByFileByLatency rename(Name name) {
        return new IoGlobalByFileByLatency(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, ULong, String, ULong, String, ULong, String, ULong, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
