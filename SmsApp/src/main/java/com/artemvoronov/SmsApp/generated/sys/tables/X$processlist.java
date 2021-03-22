/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.enums.X$processlistTrxAutocommit;
import com.artemvoronov.SmsApp.generated.sys.enums.X$processlistTrxState;
import com.artemvoronov.SmsApp.generated.sys.tables.records.X$processlistRecord;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class X$processlist extends TableImpl<X$processlistRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$processlist</code>
     */
    public static final X$processlist X$PROCESSLIST = new X$processlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$processlistRecord> getRecordType() {
        return X$processlistRecord.class;
    }

    /**
     * The column <code>sys.x$processlist.thd_id</code>.
     */
    public final TableField<X$processlistRecord, ULong> THD_ID = createField(DSL.name("thd_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$processlist.conn_id</code>.
     */
    public final TableField<X$processlistRecord, ULong> CONN_ID = createField(DSL.name("conn_id"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.user</code>.
     */
    public final TableField<X$processlistRecord, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(288), this, "");

    /**
     * The column <code>sys.x$processlist.db</code>.
     */
    public final TableField<X$processlistRecord, String> DB = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$processlist.command</code>.
     */
    public final TableField<X$processlistRecord, String> COMMAND = createField(DSL.name("command"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>sys.x$processlist.state</code>.
     */
    public final TableField<X$processlistRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$processlist.time</code>.
     */
    public final TableField<X$processlistRecord, Long> TIME = createField(DSL.name("time"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.x$processlist.current_statement</code>.
     */
    public final TableField<X$processlistRecord, String> CURRENT_STATEMENT = createField(DSL.name("current_statement"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$processlist.statement_latency</code>.
     */
    public final TableField<X$processlistRecord, ULong> STATEMENT_LATENCY = createField(DSL.name("statement_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.progress</code>.
     */
    public final TableField<X$processlistRecord, BigDecimal> PROGRESS = createField(DSL.name("progress"), SQLDataType.DECIMAL(26, 2), this, "");

    /**
     * The column <code>sys.x$processlist.lock_latency</code>.
     */
    public final TableField<X$processlistRecord, ULong> LOCK_LATENCY = createField(DSL.name("lock_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.rows_examined</code>.
     */
    public final TableField<X$processlistRecord, ULong> ROWS_EXAMINED = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.rows_sent</code>.
     */
    public final TableField<X$processlistRecord, ULong> ROWS_SENT = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.rows_affected</code>.
     */
    public final TableField<X$processlistRecord, ULong> ROWS_AFFECTED = createField(DSL.name("rows_affected"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.tmp_tables</code>.
     */
    public final TableField<X$processlistRecord, ULong> TMP_TABLES = createField(DSL.name("tmp_tables"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.tmp_disk_tables</code>.
     */
    public final TableField<X$processlistRecord, ULong> TMP_DISK_TABLES = createField(DSL.name("tmp_disk_tables"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.full_scan</code>.
     */
    public final TableField<X$processlistRecord, String> FULL_SCAN = createField(DSL.name("full_scan"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.x$processlist.last_statement</code>.
     */
    public final TableField<X$processlistRecord, String> LAST_STATEMENT = createField(DSL.name("last_statement"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$processlist.last_statement_latency</code>.
     */
    public final TableField<X$processlistRecord, ULong> LAST_STATEMENT_LATENCY = createField(DSL.name("last_statement_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.current_memory</code>.
     */
    public final TableField<X$processlistRecord, BigInteger> CURRENT_MEMORY = createField(DSL.name("current_memory"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.x$processlist.last_wait</code>.
     */
    public final TableField<X$processlistRecord, String> LAST_WAIT = createField(DSL.name("last_wait"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$processlist.last_wait_latency</code>.
     */
    public final TableField<X$processlistRecord, String> LAST_WAIT_LATENCY = createField(DSL.name("last_wait_latency"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>sys.x$processlist.source</code>.
     */
    public final TableField<X$processlistRecord, String> SOURCE = createField(DSL.name("source"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$processlist.trx_latency</code>.
     */
    public final TableField<X$processlistRecord, ULong> TRX_LATENCY = createField(DSL.name("trx_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$processlist.trx_state</code>.
     */
    public final TableField<X$processlistRecord, X$processlistTrxState> TRX_STATE = createField(DSL.name("trx_state"), SQLDataType.VARCHAR(11).asEnumDataType(com.artemvoronov.SmsApp.generated.sys.enums.X$processlistTrxState.class), this, "");

    /**
     * The column <code>sys.x$processlist.trx_autocommit</code>.
     */
    public final TableField<X$processlistRecord, X$processlistTrxAutocommit> TRX_AUTOCOMMIT = createField(DSL.name("trx_autocommit"), SQLDataType.VARCHAR(3).asEnumDataType(com.artemvoronov.SmsApp.generated.sys.enums.X$processlistTrxAutocommit.class), this, "");

    /**
     * The column <code>sys.x$processlist.pid</code>.
     */
    public final TableField<X$processlistRecord, String> PID = createField(DSL.name("pid"), SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>sys.x$processlist.program_name</code>.
     */
    public final TableField<X$processlistRecord, String> PROGRAM_NAME = createField(DSL.name("program_name"), SQLDataType.VARCHAR(1024), this, "");

    private X$processlist(Name alias, Table<X$processlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$processlist(Name alias, Table<X$processlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$processlist` as select `pps`.`THREAD_ID` AS `thd_id`,`pps`.`PROCESSLIST_ID` AS `conn_id`,if((`pps`.`NAME` in ('thread/sql/one_connection','thread/thread_pool/tp_one_connection')),concat(`pps`.`PROCESSLIST_USER`,'@',convert(`pps`.`PROCESSLIST_HOST` using utf8mb4)),replace(`pps`.`NAME`,'thread/','')) AS `user`,`pps`.`PROCESSLIST_DB` AS `db`,`pps`.`PROCESSLIST_COMMAND` AS `command`,`pps`.`PROCESSLIST_STATE` AS `state`,`pps`.`PROCESSLIST_TIME` AS `time`,`pps`.`PROCESSLIST_INFO` AS `current_statement`,if((`esc`.`END_EVENT_ID` is null),`esc`.`TIMER_WAIT`,NULL) AS `statement_latency`,if((`esc`.`END_EVENT_ID` is null),round((100 * (`estc`.`WORK_COMPLETED` / `estc`.`WORK_ESTIMATED`)),2),NULL) AS `progress`,`esc`.`LOCK_TIME` AS `lock_latency`,`esc`.`ROWS_EXAMINED` AS `rows_examined`,`esc`.`ROWS_SENT` AS `rows_sent`,`esc`.`ROWS_AFFECTED` AS `rows_affected`,`esc`.`CREATED_TMP_TABLES` AS `tmp_tables`,`esc`.`CREATED_TMP_DISK_TABLES` AS `tmp_disk_tables`,if(((`esc`.`NO_GOOD_INDEX_USED` > 0) or (`esc`.`NO_INDEX_USED` > 0)),'YES','NO') AS `full_scan`,if((`esc`.`END_EVENT_ID` is not null),`esc`.`SQL_TEXT`,NULL) AS `last_statement`,if((`esc`.`END_EVENT_ID` is not null),`esc`.`TIMER_WAIT`,NULL) AS `last_statement_latency`,`sys`.`mem`.`current_allocated` AS `current_memory`,`ewc`.`EVENT_NAME` AS `last_wait`,if(((`ewc`.`END_EVENT_ID` is null) and (`ewc`.`EVENT_NAME` is not null)),'Still Waiting',`ewc`.`TIMER_WAIT`) AS `last_wait_latency`,`ewc`.`SOURCE` AS `source`,`etc`.`TIMER_WAIT` AS `trx_latency`,`etc`.`STATE` AS `trx_state`,`etc`.`AUTOCOMMIT` AS `trx_autocommit`,`conattr_pid`.`ATTR_VALUE` AS `pid`,`conattr_progname`.`ATTR_VALUE` AS `program_name` from (((((((`performance_schema`.`threads` `pps` left join `performance_schema`.`events_waits_current` `ewc` on((`pps`.`THREAD_ID` = `ewc`.`THREAD_ID`))) left join `performance_schema`.`events_stages_current` `estc` on((`pps`.`THREAD_ID` = `estc`.`THREAD_ID`))) left join `performance_schema`.`events_statements_current` `esc` on((`pps`.`THREAD_ID` = `esc`.`THREAD_ID`))) left join `performance_schema`.`events_transactions_current` `etc` on((`pps`.`THREAD_ID` = `etc`.`THREAD_ID`))) left join `sys`.`x$memory_by_thread_by_current_bytes` `mem` on((`pps`.`THREAD_ID` = `sys`.`mem`.`thread_id`))) left join `performance_schema`.`session_connect_attrs` `conattr_pid` on(((`conattr_pid`.`PROCESSLIST_ID` = `pps`.`PROCESSLIST_ID`) and (`conattr_pid`.`ATTR_NAME` = '_pid')))) left join `performance_schema`.`session_connect_attrs` `conattr_progname` on(((`conattr_progname`.`PROCESSLIST_ID` = `pps`.`PROCESSLIST_ID`) and (`conattr_progname`.`ATTR_NAME` = 'program_name')))) order by `pps`.`PROCESSLIST_TIME` desc,`last_wait_latency` desc"));
    }

    /**
     * Create an aliased <code>sys.x$processlist</code> table reference
     */
    public X$processlist(String alias) {
        this(DSL.name(alias), X$PROCESSLIST);
    }

    /**
     * Create an aliased <code>sys.x$processlist</code> table reference
     */
    public X$processlist(Name alias) {
        this(alias, X$PROCESSLIST);
    }

    /**
     * Create a <code>sys.x$processlist</code> table reference
     */
    public X$processlist() {
        this(DSL.name("x$processlist"), null);
    }

    public <O extends Record> X$processlist(Table<O> child, ForeignKey<O, X$processlistRecord> key) {
        super(child, key, X$PROCESSLIST);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$processlist as(String alias) {
        return new X$processlist(DSL.name(alias), this);
    }

    @Override
    public X$processlist as(Name alias) {
        return new X$processlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$processlist rename(String name) {
        return new X$processlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$processlist rename(Name name) {
        return new X$processlist(name, null);
    }
}