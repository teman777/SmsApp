/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsStatementsSummaryByAccountByEventNameRecord extends TableRecordImpl<EventsStatementsSummaryByAccountByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.USER</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.HOST</code>.
     */
    public void setHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.HOST</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_LOCK_TIME</code>.
     */
    public void setSumLockTime(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_LOCK_TIME</code>.
     */
    public ULong getSumLockTime() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ERRORS</code>.
     */
    public void setSumErrors(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ERRORS</code>.
     */
    public ULong getSumErrors() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_WARNINGS</code>.
     */
    public void setSumWarnings(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_WARNINGS</code>.
     */
    public ULong getSumWarnings() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    public void setSumRowsAffected(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    public ULong getSumRowsAffected() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_SENT</code>.
     */
    public void setSumRowsSent(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_SENT</code>.
     */
    public ULong getSumRowsSent() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    public void setSumRowsExamined(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    public ULong getSumRowsExamined() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public void setSumCreatedTmpDiskTables(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public ULong getSumCreatedTmpDiskTables() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    public void setSumCreatedTmpTables(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    public ULong getSumCreatedTmpTables() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    public void setSumSelectFullJoin(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    public ULong getSumSelectFullJoin() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public void setSumSelectFullRangeJoin(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public ULong getSumSelectFullRangeJoin() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE</code>.
     */
    public void setSumSelectRange(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE</code>.
     */
    public ULong getSumSelectRange() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    public void setSumSelectRangeCheck(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    public ULong getSumSelectRangeCheck() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_SCAN</code>.
     */
    public void setSumSelectScan(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_SCAN</code>.
     */
    public ULong getSumSelectScan() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    public void setSumSortMergePasses(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    public ULong getSumSortMergePasses() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_RANGE</code>.
     */
    public void setSumSortRange(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_RANGE</code>.
     */
    public ULong getSumSortRange() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_ROWS</code>.
     */
    public void setSumSortRows(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_ROWS</code>.
     */
    public ULong getSumSortRows() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_SCAN</code>.
     */
    public void setSumSortScan(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_SCAN</code>.
     */
    public ULong getSumSortScan() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    public void setSumNoIndexUsed(ULong value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    public ULong getSumNoIndexUsed() {
        return (ULong) get(25);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public void setSumNoGoodIndexUsed(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public ULong getSumNoGoodIndexUsed() {
        return (ULong) get(26);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsStatementsSummaryByAccountByEventNameRecord
     */
    public EventsStatementsSummaryByAccountByEventNameRecord() {
        super(EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised EventsStatementsSummaryByAccountByEventNameRecord
     */
    public EventsStatementsSummaryByAccountByEventNameRecord(String user, String host, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong sumLockTime, ULong sumErrors, ULong sumWarnings, ULong sumRowsAffected, ULong sumRowsSent, ULong sumRowsExamined, ULong sumCreatedTmpDiskTables, ULong sumCreatedTmpTables, ULong sumSelectFullJoin, ULong sumSelectFullRangeJoin, ULong sumSelectRange, ULong sumSelectRangeCheck, ULong sumSelectScan, ULong sumSortMergePasses, ULong sumSortRange, ULong sumSortRows, ULong sumSortScan, ULong sumNoIndexUsed, ULong sumNoGoodIndexUsed) {
        super(EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);

        setUser(user);
        setHost(host);
        setEventName(eventName);
        setCountStar(countStar);
        setSumTimerWait(sumTimerWait);
        setMinTimerWait(minTimerWait);
        setAvgTimerWait(avgTimerWait);
        setMaxTimerWait(maxTimerWait);
        setSumLockTime(sumLockTime);
        setSumErrors(sumErrors);
        setSumWarnings(sumWarnings);
        setSumRowsAffected(sumRowsAffected);
        setSumRowsSent(sumRowsSent);
        setSumRowsExamined(sumRowsExamined);
        setSumCreatedTmpDiskTables(sumCreatedTmpDiskTables);
        setSumCreatedTmpTables(sumCreatedTmpTables);
        setSumSelectFullJoin(sumSelectFullJoin);
        setSumSelectFullRangeJoin(sumSelectFullRangeJoin);
        setSumSelectRange(sumSelectRange);
        setSumSelectRangeCheck(sumSelectRangeCheck);
        setSumSelectScan(sumSelectScan);
        setSumSortMergePasses(sumSortMergePasses);
        setSumSortRange(sumSortRange);
        setSumSortRows(sumSortRows);
        setSumSortScan(sumSortScan);
        setSumNoIndexUsed(sumNoIndexUsed);
        setSumNoGoodIndexUsed(sumNoGoodIndexUsed);
    }
}
