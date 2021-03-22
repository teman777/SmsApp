/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables;


import com.artemvoronov.SmsApp.generated.mysql.Mysql;
import com.artemvoronov.SmsApp.generated.mysql.tables.records.SlowLogRecord;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Slow log
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlowLog extends TableImpl<SlowLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.slow_log</code>
     */
    public static final SlowLog SLOW_LOG = new SlowLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlowLogRecord> getRecordType() {
        return SlowLogRecord.class;
    }

    /**
     * The column <code>mysql.slow_log.start_time</code>.
     */
    public final TableField<SlowLogRecord, LocalDateTime> START_TIME = createField(DSL.name("start_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP(6)", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.slow_log.user_host</code>.
     */
    public final TableField<SlowLogRecord, String> USER_HOST = createField(DSL.name("user_host"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.query_time</code>.
     */
    public final TableField<SlowLogRecord, LocalTime> QUERY_TIME = createField(DSL.name("query_time"), SQLDataType.LOCALTIME(6).nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.lock_time</code>.
     */
    public final TableField<SlowLogRecord, LocalTime> LOCK_TIME = createField(DSL.name("lock_time"), SQLDataType.LOCALTIME(6).nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.rows_sent</code>.
     */
    public final TableField<SlowLogRecord, Integer> ROWS_SENT = createField(DSL.name("rows_sent"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.rows_examined</code>.
     */
    public final TableField<SlowLogRecord, Integer> ROWS_EXAMINED = createField(DSL.name("rows_examined"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.db</code>.
     */
    public final TableField<SlowLogRecord, String> DB = createField(DSL.name("db"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.last_insert_id</code>.
     */
    public final TableField<SlowLogRecord, Integer> LAST_INSERT_ID = createField(DSL.name("last_insert_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.insert_id</code>.
     */
    public final TableField<SlowLogRecord, Integer> INSERT_ID = createField(DSL.name("insert_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.server_id</code>.
     */
    public final TableField<SlowLogRecord, UInteger> SERVER_ID = createField(DSL.name("server_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.sql_text</code>.
     */
    public final TableField<SlowLogRecord, byte[]> SQL_TEXT = createField(DSL.name("sql_text"), SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slow_log.thread_id</code>.
     */
    public final TableField<SlowLogRecord, ULong> THREAD_ID = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private SlowLog(Name alias, Table<SlowLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private SlowLog(Name alias, Table<SlowLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Slow log"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.slow_log</code> table reference
     */
    public SlowLog(String alias) {
        this(DSL.name(alias), SLOW_LOG);
    }

    /**
     * Create an aliased <code>mysql.slow_log</code> table reference
     */
    public SlowLog(Name alias) {
        this(alias, SLOW_LOG);
    }

    /**
     * Create a <code>mysql.slow_log</code> table reference
     */
    public SlowLog() {
        this(DSL.name("slow_log"), null);
    }

    public <O extends Record> SlowLog(Table<O> child, ForeignKey<O, SlowLogRecord> key) {
        super(child, key, SLOW_LOG);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public SlowLog as(String alias) {
        return new SlowLog(DSL.name(alias), this);
    }

    @Override
    public SlowLog as(Name alias) {
        return new SlowLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlowLog rename(String name) {
        return new SlowLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlowLog rename(Name name) {
        return new SlowLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<LocalDateTime, String, LocalTime, LocalTime, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
