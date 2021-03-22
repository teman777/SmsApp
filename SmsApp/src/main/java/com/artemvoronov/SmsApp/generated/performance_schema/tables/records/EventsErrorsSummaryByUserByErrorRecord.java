/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.tables.EventsErrorsSummaryByUserByError;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsErrorsSummaryByUserByErrorRecord extends TableRecordImpl<EventsErrorsSummaryByUserByErrorRecord> implements Record8<String, Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.USER</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.ERROR_NUMBER</code>.
     */
    public void setErrorNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.ERROR_NUMBER</code>.
     */
    public Integer getErrorNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.ERROR_NAME</code>.
     */
    public void setErrorName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.ERROR_NAME</code>.
     */
    public String getErrorName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.SQL_STATE</code>.
     */
    public void setSqlState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.SQL_STATE</code>.
     */
    public String getSqlState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.SUM_ERROR_RAISED</code>.
     */
    public void setSumErrorRaised(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.SUM_ERROR_RAISED</code>.
     */
    public ULong getSumErrorRaised() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED</code>.
     */
    public void setSumErrorHandled(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED</code>.
     */
    public ULong getSumErrorHandled() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.FIRST_SEEN</code>.
     */
    public void setFirstSeen(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.FIRST_SEEN</code>.
     */
    public LocalDateTime getFirstSeen() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_user_by_error.LAST_SEEN</code>.
     */
    public void setLastSeen(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_user_by_error.LAST_SEEN</code>.
     */
    public LocalDateTime getLastSeen() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.USER;
    }

    @Override
    public Field<Integer> field2() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.ERROR_NUMBER;
    }

    @Override
    public Field<String> field3() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.ERROR_NAME;
    }

    @Override
    public Field<String> field4() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.SQL_STATE;
    }

    @Override
    public Field<ULong> field5() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.SUM_ERROR_RAISED;
    }

    @Override
    public Field<ULong> field6() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.SUM_ERROR_HANDLED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.FIRST_SEEN;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR.LAST_SEEN;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public Integer component2() {
        return getErrorNumber();
    }

    @Override
    public String component3() {
        return getErrorName();
    }

    @Override
    public String component4() {
        return getSqlState();
    }

    @Override
    public ULong component5() {
        return getSumErrorRaised();
    }

    @Override
    public ULong component6() {
        return getSumErrorHandled();
    }

    @Override
    public LocalDateTime component7() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime component8() {
        return getLastSeen();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public Integer value2() {
        return getErrorNumber();
    }

    @Override
    public String value3() {
        return getErrorName();
    }

    @Override
    public String value4() {
        return getSqlState();
    }

    @Override
    public ULong value5() {
        return getSumErrorRaised();
    }

    @Override
    public ULong value6() {
        return getSumErrorHandled();
    }

    @Override
    public LocalDateTime value7() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime value8() {
        return getLastSeen();
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value2(Integer value) {
        setErrorNumber(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value3(String value) {
        setErrorName(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value4(String value) {
        setSqlState(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value5(ULong value) {
        setSumErrorRaised(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value6(ULong value) {
        setSumErrorHandled(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value7(LocalDateTime value) {
        setFirstSeen(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord value8(LocalDateTime value) {
        setLastSeen(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryByUserByErrorRecord values(String value1, Integer value2, String value3, String value4, ULong value5, ULong value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsErrorsSummaryByUserByErrorRecord
     */
    public EventsErrorsSummaryByUserByErrorRecord() {
        super(EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR);
    }

    /**
     * Create a detached, initialised EventsErrorsSummaryByUserByErrorRecord
     */
    public EventsErrorsSummaryByUserByErrorRecord(String user, Integer errorNumber, String errorName, String sqlState, ULong sumErrorRaised, ULong sumErrorHandled, LocalDateTime firstSeen, LocalDateTime lastSeen) {
        super(EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR);

        setUser(user);
        setErrorNumber(errorNumber);
        setErrorName(errorName);
        setSqlState(sqlState);
        setSumErrorRaised(sumErrorRaised);
        setSumErrorHandled(sumErrorHandled);
        setFirstSeen(firstSeen);
        setLastSeen(lastSeen);
    }
}
