/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.X$statementAnalysis;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$statementAnalysisRecord extends TableRecordImpl<X$statementAnalysisRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.x$statement_analysis.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.full_scan</code>.
     */
    public void setFullScan(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.full_scan</code>.
     */
    public String getFullScan() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.err_count</code>.
     */
    public void setErrCount(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.err_count</code>.
     */
    public ULong getErrCount() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.warn_count</code>.
     */
    public void setWarnCount(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.warn_count</code>.
     */
    public ULong getWarnCount() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.lock_latency</code>.
     */
    public void setLockLatency(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.lock_latency</code>.
     */
    public ULong getLockLatency() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_sent_avg</code>.
     */
    public void setRowsSentAvg(BigInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_sent_avg</code>.
     */
    public BigInteger getRowsSentAvg() {
        return (BigInteger) get(11);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_examined_avg</code>.
     */
    public void setRowsExaminedAvg(BigInteger value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_examined_avg</code>.
     */
    public BigInteger getRowsExaminedAvg() {
        return (BigInteger) get(13);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_affected</code>.
     */
    public void setRowsAffected(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_affected</code>.
     */
    public ULong getRowsAffected() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_affected_avg</code>.
     */
    public void setRowsAffectedAvg(BigInteger value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_affected_avg</code>.
     */
    public BigInteger getRowsAffectedAvg() {
        return (BigInteger) get(15);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.tmp_tables</code>.
     */
    public void setTmpTables(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.tmp_tables</code>.
     */
    public ULong getTmpTables() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.tmp_disk_tables</code>.
     */
    public void setTmpDiskTables(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.tmp_disk_tables</code>.
     */
    public ULong getTmpDiskTables() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_sorted</code>.
     */
    public void setRowsSorted(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_sorted</code>.
     */
    public ULong getRowsSorted() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.sort_merge_passes</code>.
     */
    public void setSortMergePasses(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.sort_merge_passes</code>.
     */
    public ULong getSortMergePasses() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.digest</code>.
     */
    public void setDigest(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.digest</code>.
     */
    public String getDigest() {
        return (String) get(20);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.first_seen</code>.
     */
    public void setFirstSeen(LocalDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.first_seen</code>.
     */
    public LocalDateTime getFirstSeen() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.last_seen</code>.
     */
    public void setLastSeen(LocalDateTime value) {
        set(22, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.last_seen</code>.
     */
    public LocalDateTime getLastSeen() {
        return (LocalDateTime) get(22);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$statementAnalysisRecord
     */
    public X$statementAnalysisRecord() {
        super(X$statementAnalysis.X$STATEMENT_ANALYSIS);
    }

    /**
     * Create a detached, initialised X$statementAnalysisRecord
     */
    public X$statementAnalysisRecord(String query, String db, String fullScan, ULong execCount, ULong errCount, ULong warnCount, ULong totalLatency, ULong maxLatency, ULong avgLatency, ULong lockLatency, ULong rowsSent, BigInteger rowsSentAvg, ULong rowsExamined, BigInteger rowsExaminedAvg, ULong rowsAffected, BigInteger rowsAffectedAvg, ULong tmpTables, ULong tmpDiskTables, ULong rowsSorted, ULong sortMergePasses, String digest, LocalDateTime firstSeen, LocalDateTime lastSeen) {
        super(X$statementAnalysis.X$STATEMENT_ANALYSIS);

        setQuery(query);
        setDb(db);
        setFullScan(fullScan);
        setExecCount(execCount);
        setErrCount(errCount);
        setWarnCount(warnCount);
        setTotalLatency(totalLatency);
        setMaxLatency(maxLatency);
        setAvgLatency(avgLatency);
        setLockLatency(lockLatency);
        setRowsSent(rowsSent);
        setRowsSentAvg(rowsSentAvg);
        setRowsExamined(rowsExamined);
        setRowsExaminedAvg(rowsExaminedAvg);
        setRowsAffected(rowsAffected);
        setRowsAffectedAvg(rowsAffectedAvg);
        setTmpTables(tmpTables);
        setTmpDiskTables(tmpDiskTables);
        setRowsSorted(rowsSorted);
        setSortMergePasses(sortMergePasses);
        setDigest(digest);
        setFirstSeen(firstSeen);
        setLastSeen(lastSeen);
    }
}
