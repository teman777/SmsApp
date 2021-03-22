/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.UserSummaryByStages;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSummaryByStagesRecord extends TableRecordImpl<UserSummaryByStagesRecord> implements Record5<String, String, ULong, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.user_summary_by_stages.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_stages.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.user_summary_by_stages.event_name</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_stages.event_name</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.user_summary_by_stages.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_stages.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.user_summary_by_stages.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_stages.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.user_summary_by_stages.avg_latency</code>.
     */
    public void setAvgLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_stages.avg_latency</code>.
     */
    public String getAvgLatency() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, ULong, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, ULong, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserSummaryByStages.USER_SUMMARY_BY_STAGES.USER;
    }

    @Override
    public Field<String> field2() {
        return UserSummaryByStages.USER_SUMMARY_BY_STAGES.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return UserSummaryByStages.USER_SUMMARY_BY_STAGES.TOTAL;
    }

    @Override
    public Field<String> field4() {
        return UserSummaryByStages.USER_SUMMARY_BY_STAGES.TOTAL_LATENCY;
    }

    @Override
    public Field<String> field5() {
        return UserSummaryByStages.USER_SUMMARY_BY_STAGES.AVG_LATENCY;
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
    public String component4() {
        return getTotalLatency();
    }

    @Override
    public String component5() {
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
    public String value4() {
        return getTotalLatency();
    }

    @Override
    public String value5() {
        return getAvgLatency();
    }

    @Override
    public UserSummaryByStagesRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public UserSummaryByStagesRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public UserSummaryByStagesRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    @Override
    public UserSummaryByStagesRecord value4(String value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public UserSummaryByStagesRecord value5(String value) {
        setAvgLatency(value);
        return this;
    }

    @Override
    public UserSummaryByStagesRecord values(String value1, String value2, ULong value3, String value4, String value5) {
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
     * Create a detached UserSummaryByStagesRecord
     */
    public UserSummaryByStagesRecord() {
        super(UserSummaryByStages.USER_SUMMARY_BY_STAGES);
    }

    /**
     * Create a detached, initialised UserSummaryByStagesRecord
     */
    public UserSummaryByStagesRecord(String user, String eventName, ULong total, String totalLatency, String avgLatency) {
        super(UserSummaryByStages.USER_SUMMARY_BY_STAGES);

        setUser(user);
        setEventName(eventName);
        setTotal(total);
        setTotalLatency(totalLatency);
        setAvgLatency(avgLatency);
    }
}