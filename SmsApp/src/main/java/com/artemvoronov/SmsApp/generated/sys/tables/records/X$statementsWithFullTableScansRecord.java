/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.X$statementsWithFullTableScans;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$statementsWithFullTableScansRecord extends TableRecordImpl<X$statementsWithFullTableScansRecord> implements Record14<String, String, ULong, ULong, ULong, ULong, BigInteger, ULong, ULong, BigInteger, BigInteger, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.no_index_used_count</code>.
     */
    public void setNoIndexUsedCount(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.no_index_used_count</code>.
     */
    public ULong getNoIndexUsedCount() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.no_good_index_used_count</code>.
     */
    public void setNoGoodIndexUsedCount(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.no_good_index_used_count</code>.
     */
    public ULong getNoGoodIndexUsedCount() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.no_index_used_pct</code>.
     */
    public void setNoIndexUsedPct(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.no_index_used_pct</code>.
     */
    public BigInteger getNoIndexUsedPct() {
        return (BigInteger) get(6);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.rows_sent_avg</code>.
     */
    public void setRowsSentAvg(BigInteger value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.rows_sent_avg</code>.
     */
    public BigInteger getRowsSentAvg() {
        return (BigInteger) get(9);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.rows_examined_avg</code>.
     */
    public void setRowsExaminedAvg(BigInteger value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.rows_examined_avg</code>.
     */
    public BigInteger getRowsExaminedAvg() {
        return (BigInteger) get(10);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.first_seen</code>.
     */
    public void setFirstSeen(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.first_seen</code>.
     */
    public LocalDateTime getFirstSeen() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.last_seen</code>.
     */
    public void setLastSeen(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.last_seen</code>.
     */
    public LocalDateTime getLastSeen() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>sys.x$statements_with_full_table_scans.digest</code>.
     */
    public void setDigest(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_full_table_scans.digest</code>.
     */
    public String getDigest() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, ULong, ULong, ULong, ULong, BigInteger, ULong, ULong, BigInteger, BigInteger, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, ULong, ULong, ULong, ULong, BigInteger, ULong, ULong, BigInteger, BigInteger, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.QUERY;
    }

    @Override
    public Field<String> field2() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.DB;
    }

    @Override
    public Field<ULong> field3() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.EXEC_COUNT;
    }

    @Override
    public Field<ULong> field4() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.TOTAL_LATENCY;
    }

    @Override
    public Field<ULong> field5() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.NO_INDEX_USED_COUNT;
    }

    @Override
    public Field<ULong> field6() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.NO_GOOD_INDEX_USED_COUNT;
    }

    @Override
    public Field<BigInteger> field7() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.NO_INDEX_USED_PCT;
    }

    @Override
    public Field<ULong> field8() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_SENT;
    }

    @Override
    public Field<ULong> field9() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_EXAMINED;
    }

    @Override
    public Field<BigInteger> field10() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_SENT_AVG;
    }

    @Override
    public Field<BigInteger> field11() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_EXAMINED_AVG;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.FIRST_SEEN;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.LAST_SEEN;
    }

    @Override
    public Field<String> field14() {
        return X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS.DIGEST;
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
        return getTotalLatency();
    }

    @Override
    public ULong component5() {
        return getNoIndexUsedCount();
    }

    @Override
    public ULong component6() {
        return getNoGoodIndexUsedCount();
    }

    @Override
    public BigInteger component7() {
        return getNoIndexUsedPct();
    }

    @Override
    public ULong component8() {
        return getRowsSent();
    }

    @Override
    public ULong component9() {
        return getRowsExamined();
    }

    @Override
    public BigInteger component10() {
        return getRowsSentAvg();
    }

    @Override
    public BigInteger component11() {
        return getRowsExaminedAvg();
    }

    @Override
    public LocalDateTime component12() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime component13() {
        return getLastSeen();
    }

    @Override
    public String component14() {
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
        return getTotalLatency();
    }

    @Override
    public ULong value5() {
        return getNoIndexUsedCount();
    }

    @Override
    public ULong value6() {
        return getNoGoodIndexUsedCount();
    }

    @Override
    public BigInteger value7() {
        return getNoIndexUsedPct();
    }

    @Override
    public ULong value8() {
        return getRowsSent();
    }

    @Override
    public ULong value9() {
        return getRowsExamined();
    }

    @Override
    public BigInteger value10() {
        return getRowsSentAvg();
    }

    @Override
    public BigInteger value11() {
        return getRowsExaminedAvg();
    }

    @Override
    public LocalDateTime value12() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime value13() {
        return getLastSeen();
    }

    @Override
    public String value14() {
        return getDigest();
    }

    @Override
    public X$statementsWithFullTableScansRecord value1(String value) {
        setQuery(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value2(String value) {
        setDb(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value3(ULong value) {
        setExecCount(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value5(ULong value) {
        setNoIndexUsedCount(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value6(ULong value) {
        setNoGoodIndexUsedCount(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value7(BigInteger value) {
        setNoIndexUsedPct(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value8(ULong value) {
        setRowsSent(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value9(ULong value) {
        setRowsExamined(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value10(BigInteger value) {
        setRowsSentAvg(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value11(BigInteger value) {
        setRowsExaminedAvg(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value12(LocalDateTime value) {
        setFirstSeen(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value13(LocalDateTime value) {
        setLastSeen(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord value14(String value) {
        setDigest(value);
        return this;
    }

    @Override
    public X$statementsWithFullTableScansRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, BigInteger value7, ULong value8, ULong value9, BigInteger value10, BigInteger value11, LocalDateTime value12, LocalDateTime value13, String value14) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$statementsWithFullTableScansRecord
     */
    public X$statementsWithFullTableScansRecord() {
        super(X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create a detached, initialised X$statementsWithFullTableScansRecord
     */
    public X$statementsWithFullTableScansRecord(String query, String db, ULong execCount, ULong totalLatency, ULong noIndexUsedCount, ULong noGoodIndexUsedCount, BigInteger noIndexUsedPct, ULong rowsSent, ULong rowsExamined, BigInteger rowsSentAvg, BigInteger rowsExaminedAvg, LocalDateTime firstSeen, LocalDateTime lastSeen, String digest) {
        super(X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS);

        setQuery(query);
        setDb(db);
        setExecCount(execCount);
        setTotalLatency(totalLatency);
        setNoIndexUsedCount(noIndexUsedCount);
        setNoGoodIndexUsedCount(noGoodIndexUsedCount);
        setNoIndexUsedPct(noIndexUsedPct);
        setRowsSent(rowsSent);
        setRowsExamined(rowsExamined);
        setRowsSentAvg(rowsSentAvg);
        setRowsExaminedAvg(rowsExaminedAvg);
        setFirstSeen(firstSeen);
        setLastSeen(lastSeen);
        setDigest(digest);
    }
}
