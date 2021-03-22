/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummaryByFileIoType;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$hostSummaryByFileIoTypeRecord extends TableRecordImpl<X$hostSummaryByFileIoTypeRecord> implements Record5<String, String, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public ULong getMaxLatency() {
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
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.HOST;
    }

    @Override
    public Field<String> field2() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.TOTAL;
    }

    @Override
    public Field<ULong> field4() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.TOTAL_LATENCY;
    }

    @Override
    public Field<ULong> field5() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.MAX_LATENCY;
    }

    @Override
    public String component1() {
        return getHost();
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
        return getMaxLatency();
    }

    @Override
    public String value1() {
        return getHost();
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
        return getMaxLatency();
    }

    @Override
    public X$hostSummaryByFileIoTypeRecord value1(String value) {
        setHost(value);
        return this;
    }

    @Override
    public X$hostSummaryByFileIoTypeRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public X$hostSummaryByFileIoTypeRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    @Override
    public X$hostSummaryByFileIoTypeRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    @Override
    public X$hostSummaryByFileIoTypeRecord value5(ULong value) {
        setMaxLatency(value);
        return this;
    }

    @Override
    public X$hostSummaryByFileIoTypeRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5) {
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
     * Create a detached X$hostSummaryByFileIoTypeRecord
     */
    public X$hostSummaryByFileIoTypeRecord() {
        super(X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create a detached, initialised X$hostSummaryByFileIoTypeRecord
     */
    public X$hostSummaryByFileIoTypeRecord(String host, String eventName, ULong total, ULong totalLatency, ULong maxLatency) {
        super(X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE);

        setHost(host);
        setEventName(eventName);
        setTotal(total);
        setTotalLatency(totalLatency);
        setMaxLatency(maxLatency);
    }
}