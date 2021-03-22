/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables;


import com.artemvoronov.SmsApp.generated.sys.Sys;
import com.artemvoronov.SmsApp.generated.sys.tables.records.StatementsWithErrorsOrWarningsRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class StatementsWithErrorsOrWarnings extends TableImpl<StatementsWithErrorsOrWarningsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.statements_with_errors_or_warnings</code>
     */
    public static final StatementsWithErrorsOrWarnings STATEMENTS_WITH_ERRORS_OR_WARNINGS = new StatementsWithErrorsOrWarnings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatementsWithErrorsOrWarningsRecord> getRecordType() {
        return StatementsWithErrorsOrWarningsRecord.class;
    }

    /**
     * The column <code>sys.statements_with_errors_or_warnings.query</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, String> QUERY = createField(DSL.name("query"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.db</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, String> DB = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.exec_count</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, ULong> EXEC_COUNT = createField(DSL.name("exec_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.errors</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, ULong> ERRORS = createField(DSL.name("errors"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.error_pct</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, BigDecimal> ERROR_PCT = createField(DSL.name("error_pct"), SQLDataType.DECIMAL(27, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.warnings</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, ULong> WARNINGS = createField(DSL.name("warnings"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.warning_pct</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, BigDecimal> WARNING_PCT = createField(DSL.name("warning_pct"), SQLDataType.DECIMAL(27, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.first_seen</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, LocalDateTime> FIRST_SEEN = createField(DSL.name("first_seen"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00.000000", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.last_seen</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, LocalDateTime> LAST_SEEN = createField(DSL.name("last_seen"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00.000000", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.digest</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, String> DIGEST = createField(DSL.name("digest"), SQLDataType.VARCHAR(64), this, "");

    private StatementsWithErrorsOrWarnings(Name alias, Table<StatementsWithErrorsOrWarningsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StatementsWithErrorsOrWarnings(Name alias, Table<StatementsWithErrorsOrWarningsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `statements_with_errors_or_warnings` as select `sys`.`format_statement`(`performance_schema`.`events_statements_summary_by_digest`.`DIGEST_TEXT`) AS `query`,`performance_schema`.`events_statements_summary_by_digest`.`SCHEMA_NAME` AS `db`,`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR` AS `exec_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` AS `errors`,(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0) * 100) AS `error_pct`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` AS `warnings`,(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0) * 100) AS `warning_pct`,`performance_schema`.`events_statements_summary_by_digest`.`FIRST_SEEN` AS `first_seen`,`performance_schema`.`events_statements_summary_by_digest`.`LAST_SEEN` AS `last_seen`,`performance_schema`.`events_statements_summary_by_digest`.`DIGEST` AS `digest` from `performance_schema`.`events_statements_summary_by_digest` where ((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` > 0) or (`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` > 0)) order by `performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` desc,`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` desc"));
    }

    /**
     * Create an aliased <code>sys.statements_with_errors_or_warnings</code> table reference
     */
    public StatementsWithErrorsOrWarnings(String alias) {
        this(DSL.name(alias), STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    /**
     * Create an aliased <code>sys.statements_with_errors_or_warnings</code> table reference
     */
    public StatementsWithErrorsOrWarnings(Name alias) {
        this(alias, STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    /**
     * Create a <code>sys.statements_with_errors_or_warnings</code> table reference
     */
    public StatementsWithErrorsOrWarnings() {
        this(DSL.name("statements_with_errors_or_warnings"), null);
    }

    public <O extends Record> StatementsWithErrorsOrWarnings(Table<O> child, ForeignKey<O, StatementsWithErrorsOrWarningsRecord> key) {
        super(child, key, STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public StatementsWithErrorsOrWarnings as(String alias) {
        return new StatementsWithErrorsOrWarnings(DSL.name(alias), this);
    }

    @Override
    public StatementsWithErrorsOrWarnings as(Name alias) {
        return new StatementsWithErrorsOrWarnings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithErrorsOrWarnings rename(String name) {
        return new StatementsWithErrorsOrWarnings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithErrorsOrWarnings rename(Name name) {
        return new StatementsWithErrorsOrWarnings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
