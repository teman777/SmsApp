/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByStatementType;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$userSummaryByStatementTypeRecord extends TableRecordImpl<X$userSummaryByStatementTypeRecord> implements Record10<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.lock_latency</code>.
     */
    public void setLockLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.lock_latency</code>.
     */
    public ULong getLockLatency() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.rows_affected</code>.
     */
    public void setRowsAffected(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.rows_affected</code>.
     */
    public ULong getRowsAffected() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_statement_type.full_scans</code>.
     */
    public void setFullScans(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_statement_type.full_scans</code>.
     */
    public ULong getFullScans() {
        return (ULong) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.USER;
    }

    @Override
    public Field<String> field2() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.STATEMENT;
    }

    @Override
    public Field<ULong> field3() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.TOTAL;
    }

    @Override
    public Field<ULong> field4() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.TOTAL_LATENCY;
    }

    @Override
    public Field<ULong> field5() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.MAX_LATENCY;
    }

    @Override
    public Field<ULong> field6() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.LOCK_LATENCY;
    }

    @Override
    public Field<ULong> field7() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.ROWS_SENT;
    }

    @Override
    public Field<ULong> field8() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.ROWS_EXAMINED;
    }

    @Override
    public Field<ULong> field9() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.ROWS_AFFECTED;
    }

    @Override
    public Field<ULong> field10() {
        return X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE.FULL_SCANS;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public String component2() {
        return getStatement();
    }

    @Override
    public ULong component3() {
        return getTotal();
    }

    @Override
    public ULong component4() {
        return getTotalLatency();
    }

    @Override
    public ULong component5() {
        return getMaxLatency();
    }

    @Override
    public ULong component6() {
        return getLockLatency();
    }

    @Override
    public ULong component7() {
        return getRowsSent();
    }

    @Override
    public ULong component8() {
        return getRowsExamined();
    }

    @Override
    public ULong component9() {
        return getRowsAffected();
    }

    @Override
    public ULong component10() {
        return getFullScans();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public String value2() {
        return getStatement();
    }

    @Override
    public ULong value3() {
        return getTotal();
    }

    @Override
    public ULong value4() {
        return getTotalLatency();
    }

    @Override
    public ULong value5() {
        return getMaxLatency();
    }

    @Override
    public ULong value6() {
        return getLockLatency();
    }

    @Override
    public ULong value7() {
        return getRowsSent();
    }

    @Override
    public ULong value8() {
        return getRowsExamined();
    }

    @Override
    public ULong value9() {
        return getRowsAffected();
    }

    @Override
    public ULong value10() {
        return getFullScans();
    }

    @Override
    public X$userSummaryByStatementTypeRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value2(String value) {
        setStatement(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value5(ULong value) {
        setMaxLatency(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value6(ULong value) {
        setLockLatency(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value7(ULong value) {
        setRowsSent(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value8(ULong value) {
        setRowsExamined(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value9(ULong value) {
        setRowsAffected(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord value10(ULong value) {
        setFullScans(value);
        return this;
    }

    @Override
    public X$userSummaryByStatementTypeRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10) {
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
     * Create a detached X$userSummaryByStatementTypeRecord
     */
    public X$userSummaryByStatementTypeRecord() {
        super(X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create a detached, initialised X$userSummaryByStatementTypeRecord
     */
    public X$userSummaryByStatementTypeRecord(String user, String statement, ULong total, ULong totalLatency, ULong maxLatency, ULong lockLatency, ULong rowsSent, ULong rowsExamined, ULong rowsAffected, ULong fullScans) {
        super(X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE);

        setUser(user);
        setStatement(statement);
        setTotal(total);
        setTotalLatency(totalLatency);
        setMaxLatency(maxLatency);
        setLockLatency(lockLatency);
        setRowsSent(rowsSent);
        setRowsExamined(rowsExamined);
        setRowsAffected(rowsAffected);
        setFullScans(fullScans);
    }
}
