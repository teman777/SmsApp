/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables.records;


import com.artemvoronov.SmsApp.generated.mysql.tables.GeneralLog;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * General log
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeneralLogRecord extends TableRecordImpl<GeneralLogRecord> implements Record6<LocalDateTime, String, ULong, UInteger, String, byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.general_log.event_time</code>.
     */
    public void setEventTime(LocalDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.general_log.event_time</code>.
     */
    public LocalDateTime getEventTime() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>mysql.general_log.user_host</code>.
     */
    public void setUserHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.general_log.user_host</code>.
     */
    public String getUserHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.general_log.thread_id</code>.
     */
    public void setThreadId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.general_log.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>mysql.general_log.server_id</code>.
     */
    public void setServerId(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.general_log.server_id</code>.
     */
    public UInteger getServerId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>mysql.general_log.command_type</code>.
     */
    public void setCommandType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.general_log.command_type</code>.
     */
    public String getCommandType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mysql.general_log.argument</code>.
     */
    public void setArgument(byte[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.general_log.argument</code>.
     */
    public byte[] getArgument() {
        return (byte[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<LocalDateTime, String, ULong, UInteger, String, byte[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<LocalDateTime, String, ULong, UInteger, String, byte[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<LocalDateTime> field1() {
        return GeneralLog.GENERAL_LOG.EVENT_TIME;
    }

    @Override
    public Field<String> field2() {
        return GeneralLog.GENERAL_LOG.USER_HOST;
    }

    @Override
    public Field<ULong> field3() {
        return GeneralLog.GENERAL_LOG.THREAD_ID;
    }

    @Override
    public Field<UInteger> field4() {
        return GeneralLog.GENERAL_LOG.SERVER_ID;
    }

    @Override
    public Field<String> field5() {
        return GeneralLog.GENERAL_LOG.COMMAND_TYPE;
    }

    @Override
    public Field<byte[]> field6() {
        return GeneralLog.GENERAL_LOG.ARGUMENT;
    }

    @Override
    public LocalDateTime component1() {
        return getEventTime();
    }

    @Override
    public String component2() {
        return getUserHost();
    }

    @Override
    public ULong component3() {
        return getThreadId();
    }

    @Override
    public UInteger component4() {
        return getServerId();
    }

    @Override
    public String component5() {
        return getCommandType();
    }

    @Override
    public byte[] component6() {
        return getArgument();
    }

    @Override
    public LocalDateTime value1() {
        return getEventTime();
    }

    @Override
    public String value2() {
        return getUserHost();
    }

    @Override
    public ULong value3() {
        return getThreadId();
    }

    @Override
    public UInteger value4() {
        return getServerId();
    }

    @Override
    public String value5() {
        return getCommandType();
    }

    @Override
    public byte[] value6() {
        return getArgument();
    }

    @Override
    public GeneralLogRecord value1(LocalDateTime value) {
        setEventTime(value);
        return this;
    }

    @Override
    public GeneralLogRecord value2(String value) {
        setUserHost(value);
        return this;
    }

    @Override
    public GeneralLogRecord value3(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public GeneralLogRecord value4(UInteger value) {
        setServerId(value);
        return this;
    }

    @Override
    public GeneralLogRecord value5(String value) {
        setCommandType(value);
        return this;
    }

    @Override
    public GeneralLogRecord value6(byte[] value) {
        setArgument(value);
        return this;
    }

    @Override
    public GeneralLogRecord values(LocalDateTime value1, String value2, ULong value3, UInteger value4, String value5, byte[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GeneralLogRecord
     */
    public GeneralLogRecord() {
        super(GeneralLog.GENERAL_LOG);
    }

    /**
     * Create a detached, initialised GeneralLogRecord
     */
    public GeneralLogRecord(LocalDateTime eventTime, String userHost, ULong threadId, UInteger serverId, String commandType, byte[] argument) {
        super(GeneralLog.GENERAL_LOG);

        setEventTime(eventTime);
        setUserHost(userHost);
        setThreadId(threadId);
        setServerId(serverId);
        setCommandType(commandType);
        setArgument(argument);
    }
}