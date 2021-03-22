/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.X$schemaTableLockWaitsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class X$schemaTableLockWaits extends TableImpl<X$schemaTableLockWaitsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$schema_table_lock_waits</code>
     */
    public static final X$schemaTableLockWaits X$SCHEMA_TABLE_LOCK_WAITS = new X$schemaTableLockWaits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$schemaTableLockWaitsRecord> getRecordType() {
        return X$schemaTableLockWaitsRecord.class;
    }

    /**
     * The column <code>sys.x$schema_table_lock_waits.object_schema</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.object_name</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_thread_id</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_THREAD_ID = createField(DSL.name("waiting_thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_pid</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_PID = createField(DSL.name("waiting_pid"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_account</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_ACCOUNT = createField(DSL.name("waiting_account"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_lock_type</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_LOCK_TYPE = createField(DSL.name("waiting_lock_type"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_lock_duration</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_LOCK_DURATION = createField(DSL.name("waiting_lock_duration"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_QUERY = createField(DSL.name("waiting_query"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query_secs</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, Long> WAITING_QUERY_SECS = createField(DSL.name("waiting_query_secs"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query_rows_affected</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_AFFECTED = createField(DSL.name("waiting_query_rows_affected"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query_rows_examined</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_EXAMINED = createField(DSL.name("waiting_query_rows_examined"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_thread_id</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> BLOCKING_THREAD_ID = createField(DSL.name("blocking_thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_pid</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> BLOCKING_PID = createField(DSL.name("blocking_pid"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_account</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> BLOCKING_ACCOUNT = createField(DSL.name("blocking_account"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_lock_type</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> BLOCKING_LOCK_TYPE = createField(DSL.name("blocking_lock_type"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_lock_duration</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> BLOCKING_LOCK_DURATION = createField(DSL.name("blocking_lock_duration"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.sql_kill_blocking_query</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_QUERY = createField(DSL.name("sql_kill_blocking_query"), SQLDataType.VARCHAR(31), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.sql_kill_blocking_connection</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_CONNECTION = createField(DSL.name("sql_kill_blocking_connection"), SQLDataType.VARCHAR(25), this, "");

    private X$schemaTableLockWaits(Name alias, Table<X$schemaTableLockWaitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$schemaTableLockWaits(Name alias, Table<X$schemaTableLockWaitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$schema_table_lock_waits` as select `g`.`OBJECT_SCHEMA` AS `object_schema`,`g`.`OBJECT_NAME` AS `object_name`,`pt`.`THREAD_ID` AS `waiting_thread_id`,`pt`.`PROCESSLIST_ID` AS `waiting_pid`,`sys`.`ps_thread_account`(`p`.`OWNER_THREAD_ID`) AS `waiting_account`,`p`.`LOCK_TYPE` AS `waiting_lock_type`,`p`.`LOCK_DURATION` AS `waiting_lock_duration`,`pt`.`PROCESSLIST_INFO` AS `waiting_query`,`pt`.`PROCESSLIST_TIME` AS `waiting_query_secs`,`ps`.`ROWS_AFFECTED` AS `waiting_query_rows_affected`,`ps`.`ROWS_EXAMINED` AS `waiting_query_rows_examined`,`gt`.`THREAD_ID` AS `blocking_thread_id`,`gt`.`PROCESSLIST_ID` AS `blocking_pid`,`sys`.`ps_thread_account`(`g`.`OWNER_THREAD_ID`) AS `blocking_account`,`g`.`LOCK_TYPE` AS `blocking_lock_type`,`g`.`LOCK_DURATION` AS `blocking_lock_duration`,concat('KILL QUERY ',`gt`.`PROCESSLIST_ID`) AS `sql_kill_blocking_query`,concat('KILL ',`gt`.`PROCESSLIST_ID`) AS `sql_kill_blocking_connection` from (((((`performance_schema`.`metadata_locks` `g` join `performance_schema`.`metadata_locks` `p` on(((`g`.`OBJECT_TYPE` = `p`.`OBJECT_TYPE`) and (`g`.`OBJECT_SCHEMA` = `p`.`OBJECT_SCHEMA`) and (`g`.`OBJECT_NAME` = `p`.`OBJECT_NAME`) and (`g`.`LOCK_STATUS` = 'GRANTED') and (`p`.`LOCK_STATUS` = 'PENDING')))) join `performance_schema`.`threads` `gt` on((`g`.`OWNER_THREAD_ID` = `gt`.`THREAD_ID`))) join `performance_schema`.`threads` `pt` on((`p`.`OWNER_THREAD_ID` = `pt`.`THREAD_ID`))) left join `performance_schema`.`events_statements_current` `gs` on((`g`.`OWNER_THREAD_ID` = `gs`.`THREAD_ID`))) left join `performance_schema`.`events_statements_current` `ps` on((`p`.`OWNER_THREAD_ID` = `ps`.`THREAD_ID`))) where (`g`.`OBJECT_TYPE` = 'TABLE')"));
    }

    /**
     * Create an aliased <code>sys.x$schema_table_lock_waits</code> table reference
     */
    public X$schemaTableLockWaits(String alias) {
        this(DSL.name(alias), X$SCHEMA_TABLE_LOCK_WAITS);
    }

    /**
     * Create an aliased <code>sys.x$schema_table_lock_waits</code> table reference
     */
    public X$schemaTableLockWaits(Name alias) {
        this(alias, X$SCHEMA_TABLE_LOCK_WAITS);
    }

    /**
     * Create a <code>sys.x$schema_table_lock_waits</code> table reference
     */
    public X$schemaTableLockWaits() {
        this(DSL.name("x$schema_table_lock_waits"), null);
    }

    public <O extends Record> X$schemaTableLockWaits(Table<O> child, ForeignKey<O, X$schemaTableLockWaitsRecord> key) {
        super(child, key, X$SCHEMA_TABLE_LOCK_WAITS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$schemaTableLockWaits as(String alias) {
        return new X$schemaTableLockWaits(DSL.name(alias), this);
    }

    @Override
    public X$schemaTableLockWaits as(Name alias) {
        return new X$schemaTableLockWaits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableLockWaits rename(String name) {
        return new X$schemaTableLockWaits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableLockWaits rename(Name name) {
        return new X$schemaTableLockWaits(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
