/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.X$memoryByHostByCurrentBytesRecord;

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


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$memoryByHostByCurrentBytes extends TableImpl<X$memoryByHostByCurrentBytesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$memory_by_host_by_current_bytes</code>
     */
    public static final X$memoryByHostByCurrentBytes X$MEMORY_BY_HOST_BY_CURRENT_BYTES = new X$memoryByHostByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$memoryByHostByCurrentBytesRecord> getRecordType() {
        return X$memoryByHostByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.host</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_count_used</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigInteger> CURRENT_COUNT_USED = createField(DSL.name("current_count_used"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_allocated</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigInteger> CURRENT_ALLOCATED = createField(DSL.name("current_allocated"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigDecimal> CURRENT_AVG_ALLOC = createField(DSL.name("current_avg_alloc"), SQLDataType.DECIMAL(45, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, Long> CURRENT_MAX_ALLOC = createField(DSL.name("current_max_alloc"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.total_allocated</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigInteger> TOTAL_ALLOCATED = createField(DSL.name("total_allocated"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    private X$memoryByHostByCurrentBytes(Name alias, Table<X$memoryByHostByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$memoryByHostByCurrentBytes(Name alias, Table<X$memoryByHostByCurrentBytesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$memory_by_host_by_current_bytes` as select if((`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_COUNT_USED`) AS `current_count_used`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `current_allocated`,ifnull((sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) / nullif(sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_COUNT_USED`),0)),0) AS `current_avg_alloc`,max(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `current_max_alloc`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`SUM_NUMBER_OF_BYTES_ALLOC`) AS `total_allocated` from `performance_schema`.`memory_summary_by_host_by_event_name` group by if((`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) desc"));
    }

    /**
     * Create an aliased <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    public X$memoryByHostByCurrentBytes(String alias) {
        this(DSL.name(alias), X$MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    public X$memoryByHostByCurrentBytes(Name alias) {
        this(alias, X$MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    /**
     * Create a <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    public X$memoryByHostByCurrentBytes() {
        this(DSL.name("x$memory_by_host_by_current_bytes"), null);
    }

    public <O extends Record> X$memoryByHostByCurrentBytes(Table<O> child, ForeignKey<O, X$memoryByHostByCurrentBytesRecord> key) {
        super(child, key, X$MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$memoryByHostByCurrentBytes as(String alias) {
        return new X$memoryByHostByCurrentBytes(DSL.name(alias), this);
    }

    @Override
    public X$memoryByHostByCurrentBytes as(Name alias) {
        return new X$memoryByHostByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$memoryByHostByCurrentBytes rename(String name) {
        return new X$memoryByHostByCurrentBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$memoryByHostByCurrentBytes rename(Name name) {
        return new X$memoryByHostByCurrentBytes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, BigInteger, BigInteger, BigDecimal, Long, BigInteger> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}