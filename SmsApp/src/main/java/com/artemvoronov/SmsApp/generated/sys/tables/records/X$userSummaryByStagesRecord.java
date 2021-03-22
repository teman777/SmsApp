/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByStages;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$userSummaryByStagesRecord extends TableRecordImpl<X$userSummaryByStagesRecord> implements Record5<String, String, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.x$user_summary_by_stages.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_stages.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_stages.event_name</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_stages.event_name</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_stages.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_stages.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_stages.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_stages.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_stages.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_stages.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, ULong, ULong, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, ULong, ULong, ULong> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES.USER;
    }

    @Override
    public Field<String> field2() {
        return X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES.TOTAL;
    }

    @Override
    public Field<ULong> field4() {
        return X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES.TOTAL_LATENCY;
    }

    @Override
    public Field<ULong> field5() {
        return X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES.AVG_LATENCY;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public String component2() {
        return getEventName();
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
        return getAvgLatency();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public String value2() {
        return getEventName();
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
        return getAvgLatency();
    }

    @Override
    public X$userSummaryByStagesRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public X$userSummaryByStagesRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public X$userSummaryByStagesRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    @Override
    public X$userSummaryByStagesRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public X$userSummaryByStagesRecord value5(ULong value) {
        setAvgLatency(value);
        return this;
    }

    @Override
    public X$userSummaryByStagesRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$userSummaryByStagesRecord
     */
    public X$userSummaryByStagesRecord() {
        super(X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES);
    }

    /**
     * Create a detached, initialised X$userSummaryByStagesRecord
     */
    public X$userSummaryByStagesRecord(String user, String eventName, ULong total, ULong totalLatency, ULong avgLatency) {
        super(X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES);

        setUser(user);
        setEventName(eventName);
        setTotal(total);
        setTotalLatency(totalLatency);
        setAvgLatency(avgLatency);
    }
}
