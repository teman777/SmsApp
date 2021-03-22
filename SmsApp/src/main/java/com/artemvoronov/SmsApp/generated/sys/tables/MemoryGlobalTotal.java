/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.MemoryGlobalTotalRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
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
public class MemoryGlobalTotal extends TableImpl<MemoryGlobalTotalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.memory_global_total</code>
     */
    public static final MemoryGlobalTotal MEMORY_GLOBAL_TOTAL = new MemoryGlobalTotal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemoryGlobalTotalRecord> getRecordType() {
        return MemoryGlobalTotalRecord.class;
    }

    /**
     * The column <code>sys.memory_global_total.total_allocated</code>.
     */
    public final TableField<MemoryGlobalTotalRecord, String> TOTAL_ALLOCATED = createField(DSL.name("total_allocated"), SQLDataType.VARCHAR(11), this, "");

    private MemoryGlobalTotal(Name alias, Table<MemoryGlobalTotalRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemoryGlobalTotal(Name alias, Table<MemoryGlobalTotalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `memory_global_total` as select format_bytes(sum(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `total_allocated` from `performance_schema`.`memory_summary_global_by_event_name`"));
    }

    /**
     * Create an aliased <code>sys.memory_global_total</code> table reference
     */
    public MemoryGlobalTotal(String alias) {
        this(DSL.name(alias), MEMORY_GLOBAL_TOTAL);
    }

    /**
     * Create an aliased <code>sys.memory_global_total</code> table reference
     */
    public MemoryGlobalTotal(Name alias) {
        this(alias, MEMORY_GLOBAL_TOTAL);
    }

    /**
     * Create a <code>sys.memory_global_total</code> table reference
     */
    public MemoryGlobalTotal() {
        this(DSL.name("memory_global_total"), null);
    }

    public <O extends Record> MemoryGlobalTotal(Table<O> child, ForeignKey<O, MemoryGlobalTotalRecord> key) {
        super(child, key, MEMORY_GLOBAL_TOTAL);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public MemoryGlobalTotal as(String alias) {
        return new MemoryGlobalTotal(DSL.name(alias), this);
    }

    @Override
    public MemoryGlobalTotal as(Name alias) {
        return new MemoryGlobalTotal(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryGlobalTotal rename(String name) {
        return new MemoryGlobalTotal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryGlobalTotal rename(Name name) {
        return new MemoryGlobalTotal(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}