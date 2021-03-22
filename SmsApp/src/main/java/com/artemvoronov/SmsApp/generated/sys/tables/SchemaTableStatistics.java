/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.SchemaTableStatisticsRecord;

import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class SchemaTableStatistics extends TableImpl<SchemaTableStatisticsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_table_statistics</code>
     */
    public static final SchemaTableStatistics SCHEMA_TABLE_STATISTICS = new SchemaTableStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaTableStatisticsRecord> getRecordType() {
        return SchemaTableStatisticsRecord.class;
    }

    /**
     * The column <code>sys.schema_table_statistics.table_schema</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_table_statistics.table_name</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_table_statistics.total_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_fetched</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_FETCHED = createField(DSL.name("rows_fetched"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.fetch_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> FETCH_LATENCY = createField(DSL.name("fetch_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_inserted</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_INSERTED = createField(DSL.name("rows_inserted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.insert_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> INSERT_LATENCY = createField(DSL.name("insert_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_updated</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_UPDATED = createField(DSL.name("rows_updated"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.update_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> UPDATE_LATENCY = createField(DSL.name("update_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_deleted</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_DELETED = createField(DSL.name("rows_deleted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.delete_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> DELETE_LATENCY = createField(DSL.name("delete_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_read_requests</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, BigInteger> IO_READ_REQUESTS = createField(DSL.name("io_read_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_read</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_READ = createField(DSL.name("io_read"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_read_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_READ_LATENCY = createField(DSL.name("io_read_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_write_requests</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, BigInteger> IO_WRITE_REQUESTS = createField(DSL.name("io_write_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_write</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_WRITE = createField(DSL.name("io_write"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_write_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_WRITE_LATENCY = createField(DSL.name("io_write_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_misc_requests</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, BigInteger> IO_MISC_REQUESTS = createField(DSL.name("io_misc_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_misc_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_MISC_LATENCY = createField(DSL.name("io_misc_latency"), SQLDataType.VARCHAR(11), this, "");

    private SchemaTableStatistics(Name alias, Table<SchemaTableStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaTableStatistics(Name alias, Table<SchemaTableStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_table_statistics` as select `pst`.`OBJECT_SCHEMA` AS `table_schema`,`pst`.`OBJECT_NAME` AS `table_name`,format_pico_time(`pst`.`SUM_TIMER_WAIT`) AS `total_latency`,`pst`.`COUNT_FETCH` AS `rows_fetched`,format_pico_time(`pst`.`SUM_TIMER_FETCH`) AS `fetch_latency`,`pst`.`COUNT_INSERT` AS `rows_inserted`,format_pico_time(`pst`.`SUM_TIMER_INSERT`) AS `insert_latency`,`pst`.`COUNT_UPDATE` AS `rows_updated`,format_pico_time(`pst`.`SUM_TIMER_UPDATE`) AS `update_latency`,`pst`.`COUNT_DELETE` AS `rows_deleted`,format_pico_time(`pst`.`SUM_TIMER_DELETE`) AS `delete_latency`,`sys`.`fsbi`.`count_read` AS `io_read_requests`,format_bytes(`sys`.`fsbi`.`sum_number_of_bytes_read`) AS `io_read`,format_pico_time(`sys`.`fsbi`.`sum_timer_read`) AS `io_read_latency`,`sys`.`fsbi`.`count_write` AS `io_write_requests`,format_bytes(`sys`.`fsbi`.`sum_number_of_bytes_write`) AS `io_write`,format_pico_time(`sys`.`fsbi`.`sum_timer_write`) AS `io_write_latency`,`sys`.`fsbi`.`count_misc` AS `io_misc_requests`,format_pico_time(`sys`.`fsbi`.`sum_timer_misc`) AS `io_misc_latency` from (`performance_schema`.`table_io_waits_summary_by_table` `pst` left join `sys`.`x$ps_schema_table_statistics_io` `fsbi` on(((`pst`.`OBJECT_SCHEMA` = `sys`.`fsbi`.`table_schema`) and (`pst`.`OBJECT_NAME` = `sys`.`fsbi`.`table_name`)))) order by `pst`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.schema_table_statistics</code> table reference
     */
    public SchemaTableStatistics(String alias) {
        this(DSL.name(alias), SCHEMA_TABLE_STATISTICS);
    }

    /**
     * Create an aliased <code>sys.schema_table_statistics</code> table reference
     */
    public SchemaTableStatistics(Name alias) {
        this(alias, SCHEMA_TABLE_STATISTICS);
    }

    /**
     * Create a <code>sys.schema_table_statistics</code> table reference
     */
    public SchemaTableStatistics() {
        this(DSL.name("schema_table_statistics"), null);
    }

    public <O extends Record> SchemaTableStatistics(Table<O> child, ForeignKey<O, SchemaTableStatisticsRecord> key) {
        super(child, key, SCHEMA_TABLE_STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SchemaTableStatistics as(String alias) {
        return new SchemaTableStatistics(DSL.name(alias), this);
    }

    @Override
    public SchemaTableStatistics as(Name alias) {
        return new SchemaTableStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTableStatistics rename(String name) {
        return new SchemaTableStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTableStatistics rename(Name name) {
        return new SchemaTableStatistics(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String, BigInteger, String, String, BigInteger, String, String, BigInteger, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
