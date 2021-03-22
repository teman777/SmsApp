/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.StatementsWithErrorsOrWarnings;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatementsWithErrorsOrWarningsRecord extends TableRecordImpl<StatementsWithErrorsOrWarningsRecord> implements Record10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.errors</code>.
     */
    public void setErrors(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.errors</code>.
     */
    public ULong getErrors() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.error_pct</code>.
     */
    public void setErrorPct(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.error_pct</code>.
     */
    public BigDecimal getErrorPct() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.warnings</code>.
     */
    public void setWarnings(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.warnings</code>.
     */
    public ULong getWarnings() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.warning_pct</code>.
     */
    public void setWarningPct(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.warning_pct</code>.
     */
    public BigDecimal getWarningPct() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.first_seen</code>.
     */
    public void setFirstSeen(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.first_seen</code>.
     */
    public LocalDateTime getFirstSeen() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.last_seen</code>.
     */
    public void setLastSeen(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.last_seen</code>.
     */
    public LocalDateTime getLastSeen() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.digest</code>.
     */
    public void setDigest(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.digest</code>.
     */
    public String getDigest() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.QUERY;
    }

    @Override
    public Field<String> field2() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.DB;
    }

    @Override
    public Field<ULong> field3() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.EXEC_COUNT;
    }

    @Override
    public Field<ULong> field4() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.ERRORS;
    }

    @Override
    public Field<BigDecimal> field5() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.ERROR_PCT;
    }

    @Override
    public Field<ULong> field6() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.WARNINGS;
    }

    @Override
    public Field<BigDecimal> field7() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.WARNING_PCT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.FIRST_SEEN;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.LAST_SEEN;
    }

    @Override
    public Field<String> field10() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.DIGEST;
    }

    @Override
    public String component1() {
        return getQuery();
    }

    @Override
    public String component2() {
        return getDb();
    }

    @Override
    public ULong component3() {
        return getExecCount();
    }

    @Override
    public ULong component4() {
        return getErrors();
    }

    @Override
    public BigDecimal component5() {
        return getErrorPct();
    }

    @Override
    public ULong component6() {
        return getWarnings();
    }

    @Override
    public BigDecimal component7() {
        return getWarningPct();
    }

    @Override
    public LocalDateTime component8() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime component9() {
        return getLastSeen();
    }

    @Override
    public String component10() {
        return getDigest();
    }

    @Override
    public String value1() {
        return getQuery();
    }

    @Override
    public String value2() {
        return getDb();
    }

    @Override
    public ULong value3() {
        return getExecCount();
    }

    @Override
    public ULong value4() {
        return getErrors();
    }

    @Override
    public BigDecimal value5() {
        return getErrorPct();
    }

    @Override
    public ULong value6() {
        return getWarnings();
    }

    @Override
    public BigDecimal value7() {
        return getWarningPct();
    }

    @Override
    public LocalDateTime value8() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime value9() {
        return getLastSeen();
    }

    @Override
    public String value10() {
        return getDigest();
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value1(String value) {
        setQuery(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value2(String value) {
        setDb(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value3(ULong value) {
        setExecCount(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value4(ULong value) {
        setErrors(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value5(BigDecimal value) {
        setErrorPct(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value6(ULong value) {
        setWarnings(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value7(BigDecimal value) {
        setWarningPct(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value8(LocalDateTime value) {
        setFirstSeen(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value9(LocalDateTime value) {
        setLastSeen(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord value10(String value) {
        setDigest(value);
        return this;
    }

    @Override
    public StatementsWithErrorsOrWarningsRecord values(String value1, String value2, ULong value3, ULong value4, BigDecimal value5, ULong value6, BigDecimal value7, LocalDateTime value8, LocalDateTime value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatementsWithErrorsOrWarningsRecord
     */
    public StatementsWithErrorsOrWarningsRecord() {
        super(StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    /**
     * Create a detached, initialised StatementsWithErrorsOrWarningsRecord
     */
    public StatementsWithErrorsOrWarningsRecord(String query, String db, ULong execCount, ULong errors, BigDecimal errorPct, ULong warnings, BigDecimal warningPct, LocalDateTime firstSeen, LocalDateTime lastSeen, String digest) {
        super(StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS);

        setQuery(query);
        setDb(db);
        setExecCount(execCount);
        setErrors(errors);
        setErrorPct(errorPct);
        setWarnings(warnings);
        setWarningPct(warningPct);
        setFirstSeen(firstSeen);
        setLastSeen(lastSeen);
        setDigest(digest);
    }
}