/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.HostSummary;

import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostSummaryRecord extends TableRecordImpl<HostSummaryRecord> implements Record12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.host_summary.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.host_summary.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.host_summary.statements</code>.
     */
    public void setStatements(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.host_summary.statements</code>.
     */
    public BigInteger getStatements() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.host_summary.statement_latency</code>.
     */
    public void setStatementLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.host_summary.statement_latency</code>.
     */
    public String getStatementLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.host_summary.statement_avg_latency</code>.
     */
    public void setStatementAvgLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.host_summary.statement_avg_latency</code>.
     */
    public String getStatementAvgLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.host_summary.table_scans</code>.
     */
    public void setTableScans(BigInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.host_summary.table_scans</code>.
     */
    public BigInteger getTableScans() {
        return (BigInteger) get(4);
    }

    /**
     * Setter for <code>sys.host_summary.file_ios</code>.
     */
    public void setFileIos(BigInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.host_summary.file_ios</code>.
     */
    public BigInteger getFileIos() {
        return (BigInteger) get(5);
    }

    /**
     * Setter for <code>sys.host_summary.file_io_latency</code>.
     */
    public void setFileIoLatency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.host_summary.file_io_latency</code>.
     */
    public String getFileIoLatency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sys.host_summary.current_connections</code>.
     */
    public void setCurrentConnections(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.host_summary.current_connections</code>.
     */
    public BigInteger getCurrentConnections() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>sys.host_summary.total_connections</code>.
     */
    public void setTotalConnections(BigInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.host_summary.total_connections</code>.
     */
    public BigInteger getTotalConnections() {
        return (BigInteger) get(8);
    }

    /**
     * Setter for <code>sys.host_summary.unique_users</code>.
     */
    public void setUniqueUsers(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.host_summary.unique_users</code>.
     */
    public Long getUniqueUsers() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>sys.host_summary.current_memory</code>.
     */
    public void setCurrentMemory(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.host_summary.current_memory</code>.
     */
    public String getCurrentMemory() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sys.host_summary.total_memory_allocated</code>.
     */
    public void setTotalMemoryAllocated(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.host_summary.total_memory_allocated</code>.
     */
    public String getTotalMemoryAllocated() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return HostSummary.HOST_SUMMARY.HOST;
    }

    @Override
    public Field<BigInteger> field2() {
        return HostSummary.HOST_SUMMARY.STATEMENTS;
    }

    @Override
    public Field<String> field3() {
        return HostSummary.HOST_SUMMARY.STATEMENT_LATENCY;
    }

    @Override
    public Field<String> field4() {
        return HostSummary.HOST_SUMMARY.STATEMENT_AVG_LATENCY;
    }

    @Override
    public Field<BigInteger> field5() {
        return HostSummary.HOST_SUMMARY.TABLE_SCANS;
    }

    @Override
    public Field<BigInteger> field6() {
        return HostSummary.HOST_SUMMARY.FILE_IOS;
    }

    @Override
    public Field<String> field7() {
        return HostSummary.HOST_SUMMARY.FILE_IO_LATENCY;
    }

    @Override
    public Field<BigInteger> field8() {
        return HostSummary.HOST_SUMMARY.CURRENT_CONNECTIONS;
    }

    @Override
    public Field<BigInteger> field9() {
        return HostSummary.HOST_SUMMARY.TOTAL_CONNECTIONS;
    }

    @Override
    public Field<Long> field10() {
        return HostSummary.HOST_SUMMARY.UNIQUE_USERS;
    }

    @Override
    public Field<String> field11() {
        return HostSummary.HOST_SUMMARY.CURRENT_MEMORY;
    }

    @Override
    public Field<String> field12() {
        return HostSummary.HOST_SUMMARY.TOTAL_MEMORY_ALLOCATED;
    }

    @Override
    public String component1() {
        return getHost();
    }

    @Override
    public BigInteger component2() {
        return getStatements();
    }

    @Override
    public String component3() {
        return getStatementLatency();
    }

    @Override
    public String component4() {
        return getStatementAvgLatency();
    }

    @Override
    public BigInteger component5() {
        return getTableScans();
    }

    @Override
    public BigInteger component6() {
        return getFileIos();
    }

    @Override
    public String component7() {
        return getFileIoLatency();
    }

    @Override
    public BigInteger component8() {
        return getCurrentConnections();
    }

    @Override
    public BigInteger component9() {
        return getTotalConnections();
    }

    @Override
    public Long component10() {
        return getUniqueUsers();
    }

    @Override
    public String component11() {
        return getCurrentMemory();
    }

    @Override
    public String component12() {
        return getTotalMemoryAllocated();
    }

    @Override
    public String value1() {
        return getHost();
    }

    @Override
    public BigInteger value2() {
        return getStatements();
    }

    @Override
    public String value3() {
        return getStatementLatency();
    }

    @Override
    public String value4() {
        return getStatementAvgLatency();
    }

    @Override
    public BigInteger value5() {
        return getTableScans();
    }

    @Override
    public BigInteger value6() {
        return getFileIos();
    }

    @Override
    public String value7() {
        return getFileIoLatency();
    }

    @Override
    public BigInteger value8() {
        return getCurrentConnections();
    }

    @Override
    public BigInteger value9() {
        return getTotalConnections();
    }

    @Override
    public Long value10() {
        return getUniqueUsers();
    }

    @Override
    public String value11() {
        return getCurrentMemory();
    }

    @Override
    public String value12() {
        return getTotalMemoryAllocated();
    }

    @Override
    public HostSummaryRecord value1(String value) {
        setHost(value);
        return this;
    }

    @Override
    public HostSummaryRecord value2(BigInteger value) {
        setStatements(value);
        return this;
    }

    @Override
    public HostSummaryRecord value3(String value) {
        setStatementLatency(value);
        return this;
    }

    @Override
    public HostSummaryRecord value4(String value) {
        setStatementAvgLatency(value);
        return this;
    }

    @Override
    public HostSummaryRecord value5(BigInteger value) {
        setTableScans(value);
        return this;
    }

    @Override
    public HostSummaryRecord value6(BigInteger value) {
        setFileIos(value);
        return this;
    }

    @Override
    public HostSummaryRecord value7(String value) {
        setFileIoLatency(value);
        return this;
    }

    @Override
    public HostSummaryRecord value8(BigInteger value) {
        setCurrentConnections(value);
        return this;
    }

    @Override
    public HostSummaryRecord value9(BigInteger value) {
        setTotalConnections(value);
        return this;
    }

    @Override
    public HostSummaryRecord value10(Long value) {
        setUniqueUsers(value);
        return this;
    }

    @Override
    public HostSummaryRecord value11(String value) {
        setCurrentMemory(value);
        return this;
    }

    @Override
    public HostSummaryRecord value12(String value) {
        setTotalMemoryAllocated(value);
        return this;
    }

    @Override
    public HostSummaryRecord values(String value1, BigInteger value2, String value3, String value4, BigInteger value5, BigInteger value6, String value7, BigInteger value8, BigInteger value9, Long value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HostSummaryRecord
     */
    public HostSummaryRecord() {
        super(HostSummary.HOST_SUMMARY);
    }

    /**
     * Create a detached, initialised HostSummaryRecord
     */
    public HostSummaryRecord(String host, BigInteger statements, String statementLatency, String statementAvgLatency, BigInteger tableScans, BigInteger fileIos, String fileIoLatency, BigInteger currentConnections, BigInteger totalConnections, Long uniqueUsers, String currentMemory, String totalMemoryAllocated) {
        super(HostSummary.HOST_SUMMARY);

        setHost(host);
        setStatements(statements);
        setStatementLatency(statementLatency);
        setStatementAvgLatency(statementAvgLatency);
        setTableScans(tableScans);
        setFileIos(fileIos);
        setFileIoLatency(fileIoLatency);
        setCurrentConnections(currentConnections);
        setTotalConnections(totalConnections);
        setUniqueUsers(uniqueUsers);
        setCurrentMemory(currentMemory);
        setTotalMemoryAllocated(totalMemoryAllocated);
    }
}