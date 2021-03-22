/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationConnectionStatusServiceState;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.ReplicationConnectionStatus;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationConnectionStatusRecord extends UpdatableRecordImpl<ReplicationConnectionStatusRecord> implements Record20<String, String, String, ULong, ReplicationConnectionStatusServiceState, ULong, LocalDateTime, String, Integer, String, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.replication_connection_status.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.GROUP_NAME</code>.
     */
    public void setGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.GROUP_NAME</code>.
     */
    public String getGroupName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.SOURCE_UUID</code>.
     */
    public void setSourceUuid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.SOURCE_UUID</code>.
     */
    public String getSourceUuid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.SERVICE_STATE</code>.
     */
    public void setServiceState(ReplicationConnectionStatusServiceState value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.SERVICE_STATE</code>.
     */
    public ReplicationConnectionStatusServiceState getServiceState() {
        return (ReplicationConnectionStatusServiceState) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.COUNT_RECEIVED_HEARTBEATS</code>.
     */
    public void setCountReceivedHeartbeats(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.COUNT_RECEIVED_HEARTBEATS</code>.
     */
    public ULong getCountReceivedHeartbeats() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_HEARTBEAT_TIMESTAMP</code>. Shows when the most recent heartbeat signal was received.
     */
    public void setLastHeartbeatTimestamp(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_HEARTBEAT_TIMESTAMP</code>. Shows when the most recent heartbeat signal was received.
     */
    public LocalDateTime getLastHeartbeatTimestamp() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.RECEIVED_TRANSACTION_SET</code>.
     */
    public void setReceivedTransactionSet(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.RECEIVED_TRANSACTION_SET</code>.
     */
    public String getReceivedTransactionSet() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_ERROR_NUMBER</code>.
     */
    public void setLastErrorNumber(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_ERROR_NUMBER</code>.
     */
    public Integer getLastErrorNumber() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_ERROR_MESSAGE</code>.
     */
    public void setLastErrorMessage(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_ERROR_MESSAGE</code>.
     */
    public String getLastErrorMessage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_ERROR_TIMESTAMP</code>.
     */
    public void setLastErrorTimestamp(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_ERROR_TIMESTAMP</code>.
     */
    public LocalDateTime getLastErrorTimestamp() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION</code>.
     */
    public void setLastQueuedTransaction(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION</code>.
     */
    public String getLastQueuedTransaction() {
        return (String) get(11);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public void setLastQueuedTransactionOriginalCommitTimestamp(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getLastQueuedTransactionOriginalCommitTimestamp() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public void setLastQueuedTransactionImmediateCommitTimestamp(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getLastQueuedTransactionImmediateCommitTimestamp() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP</code>.
     */
    public void setLastQueuedTransactionStartQueueTimestamp(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP</code>.
     */
    public LocalDateTime getLastQueuedTransactionStartQueueTimestamp() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP</code>.
     */
    public void setLastQueuedTransactionEndQueueTimestamp(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP</code>.
     */
    public LocalDateTime getLastQueuedTransactionEndQueueTimestamp() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION</code>.
     */
    public void setQueueingTransaction(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION</code>.
     */
    public String getQueueingTransaction() {
        return (String) get(16);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public void setQueueingTransactionOriginalCommitTimestamp(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getQueueingTransactionOriginalCommitTimestamp() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public void setQueueingTransactionImmediateCommitTimestamp(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getQueueingTransactionImmediateCommitTimestamp() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP</code>.
     */
    public void setQueueingTransactionStartQueueTimestamp(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP</code>.
     */
    public LocalDateTime getQueueingTransactionStartQueueTimestamp() {
        return (LocalDateTime) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, ULong, ReplicationConnectionStatusServiceState, ULong, LocalDateTime, String, Integer, String, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<String, String, String, ULong, ReplicationConnectionStatusServiceState, ULong, LocalDateTime, String, Integer, String, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.CHANNEL_NAME;
    }

    @Override
    public Field<String> field2() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.GROUP_NAME;
    }

    @Override
    public Field<String> field3() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.SOURCE_UUID;
    }

    @Override
    public Field<ULong> field4() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.THREAD_ID;
    }

    @Override
    public Field<ReplicationConnectionStatusServiceState> field5() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.SERVICE_STATE;
    }

    @Override
    public Field<ULong> field6() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.COUNT_RECEIVED_HEARTBEATS;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_HEARTBEAT_TIMESTAMP;
    }

    @Override
    public Field<String> field8() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.RECEIVED_TRANSACTION_SET;
    }

    @Override
    public Field<Integer> field9() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_ERROR_NUMBER;
    }

    @Override
    public Field<String> field10() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_ERROR_MESSAGE;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_ERROR_TIMESTAMP;
    }

    @Override
    public Field<String> field12() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_QUEUED_TRANSACTION;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP;
    }

    @Override
    public Field<String> field17() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.QUEUEING_TRANSACTION;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field20() {
        return ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP;
    }

    @Override
    public String component1() {
        return getChannelName();
    }

    @Override
    public String component2() {
        return getGroupName();
    }

    @Override
    public String component3() {
        return getSourceUuid();
    }

    @Override
    public ULong component4() {
        return getThreadId();
    }

    @Override
    public ReplicationConnectionStatusServiceState component5() {
        return getServiceState();
    }

    @Override
    public ULong component6() {
        return getCountReceivedHeartbeats();
    }

    @Override
    public LocalDateTime component7() {
        return getLastHeartbeatTimestamp();
    }

    @Override
    public String component8() {
        return getReceivedTransactionSet();
    }

    @Override
    public Integer component9() {
        return getLastErrorNumber();
    }

    @Override
    public String component10() {
        return getLastErrorMessage();
    }

    @Override
    public LocalDateTime component11() {
        return getLastErrorTimestamp();
    }

    @Override
    public String component12() {
        return getLastQueuedTransaction();
    }

    @Override
    public LocalDateTime component13() {
        return getLastQueuedTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime component14() {
        return getLastQueuedTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime component15() {
        return getLastQueuedTransactionStartQueueTimestamp();
    }

    @Override
    public LocalDateTime component16() {
        return getLastQueuedTransactionEndQueueTimestamp();
    }

    @Override
    public String component17() {
        return getQueueingTransaction();
    }

    @Override
    public LocalDateTime component18() {
        return getQueueingTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime component19() {
        return getQueueingTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime component20() {
        return getQueueingTransactionStartQueueTimestamp();
    }

    @Override
    public String value1() {
        return getChannelName();
    }

    @Override
    public String value2() {
        return getGroupName();
    }

    @Override
    public String value3() {
        return getSourceUuid();
    }

    @Override
    public ULong value4() {
        return getThreadId();
    }

    @Override
    public ReplicationConnectionStatusServiceState value5() {
        return getServiceState();
    }

    @Override
    public ULong value6() {
        return getCountReceivedHeartbeats();
    }

    @Override
    public LocalDateTime value7() {
        return getLastHeartbeatTimestamp();
    }

    @Override
    public String value8() {
        return getReceivedTransactionSet();
    }

    @Override
    public Integer value9() {
        return getLastErrorNumber();
    }

    @Override
    public String value10() {
        return getLastErrorMessage();
    }

    @Override
    public LocalDateTime value11() {
        return getLastErrorTimestamp();
    }

    @Override
    public String value12() {
        return getLastQueuedTransaction();
    }

    @Override
    public LocalDateTime value13() {
        return getLastQueuedTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime value14() {
        return getLastQueuedTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime value15() {
        return getLastQueuedTransactionStartQueueTimestamp();
    }

    @Override
    public LocalDateTime value16() {
        return getLastQueuedTransactionEndQueueTimestamp();
    }

    @Override
    public String value17() {
        return getQueueingTransaction();
    }

    @Override
    public LocalDateTime value18() {
        return getQueueingTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime value19() {
        return getQueueingTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime value20() {
        return getQueueingTransactionStartQueueTimestamp();
    }

    @Override
    public ReplicationConnectionStatusRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value2(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value3(String value) {
        setSourceUuid(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value4(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value5(ReplicationConnectionStatusServiceState value) {
        setServiceState(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value6(ULong value) {
        setCountReceivedHeartbeats(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value7(LocalDateTime value) {
        setLastHeartbeatTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value8(String value) {
        setReceivedTransactionSet(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value9(Integer value) {
        setLastErrorNumber(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value10(String value) {
        setLastErrorMessage(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value11(LocalDateTime value) {
        setLastErrorTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value12(String value) {
        setLastQueuedTransaction(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value13(LocalDateTime value) {
        setLastQueuedTransactionOriginalCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value14(LocalDateTime value) {
        setLastQueuedTransactionImmediateCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value15(LocalDateTime value) {
        setLastQueuedTransactionStartQueueTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value16(LocalDateTime value) {
        setLastQueuedTransactionEndQueueTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value17(String value) {
        setQueueingTransaction(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value18(LocalDateTime value) {
        setQueueingTransactionOriginalCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value19(LocalDateTime value) {
        setQueueingTransactionImmediateCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord value20(LocalDateTime value) {
        setQueueingTransactionStartQueueTimestamp(value);
        return this;
    }

    @Override
    public ReplicationConnectionStatusRecord values(String value1, String value2, String value3, ULong value4, ReplicationConnectionStatusServiceState value5, ULong value6, LocalDateTime value7, String value8, Integer value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13, LocalDateTime value14, LocalDateTime value15, LocalDateTime value16, String value17, LocalDateTime value18, LocalDateTime value19, LocalDateTime value20) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationConnectionStatusRecord
     */
    public ReplicationConnectionStatusRecord() {
        super(ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS);
    }

    /**
     * Create a detached, initialised ReplicationConnectionStatusRecord
     */
    public ReplicationConnectionStatusRecord(String channelName, String groupName, String sourceUuid, ULong threadId, ReplicationConnectionStatusServiceState serviceState, ULong countReceivedHeartbeats, LocalDateTime lastHeartbeatTimestamp, String receivedTransactionSet, Integer lastErrorNumber, String lastErrorMessage, LocalDateTime lastErrorTimestamp, String lastQueuedTransaction, LocalDateTime lastQueuedTransactionOriginalCommitTimestamp, LocalDateTime lastQueuedTransactionImmediateCommitTimestamp, LocalDateTime lastQueuedTransactionStartQueueTimestamp, LocalDateTime lastQueuedTransactionEndQueueTimestamp, String queueingTransaction, LocalDateTime queueingTransactionOriginalCommitTimestamp, LocalDateTime queueingTransactionImmediateCommitTimestamp, LocalDateTime queueingTransactionStartQueueTimestamp) {
        super(ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS);

        setChannelName(channelName);
        setGroupName(groupName);
        setSourceUuid(sourceUuid);
        setThreadId(threadId);
        setServiceState(serviceState);
        setCountReceivedHeartbeats(countReceivedHeartbeats);
        setLastHeartbeatTimestamp(lastHeartbeatTimestamp);
        setReceivedTransactionSet(receivedTransactionSet);
        setLastErrorNumber(lastErrorNumber);
        setLastErrorMessage(lastErrorMessage);
        setLastErrorTimestamp(lastErrorTimestamp);
        setLastQueuedTransaction(lastQueuedTransaction);
        setLastQueuedTransactionOriginalCommitTimestamp(lastQueuedTransactionOriginalCommitTimestamp);
        setLastQueuedTransactionImmediateCommitTimestamp(lastQueuedTransactionImmediateCommitTimestamp);
        setLastQueuedTransactionStartQueueTimestamp(lastQueuedTransactionStartQueueTimestamp);
        setLastQueuedTransactionEndQueueTimestamp(lastQueuedTransactionEndQueueTimestamp);
        setQueueingTransaction(queueingTransaction);
        setQueueingTransactionOriginalCommitTimestamp(queueingTransactionOriginalCommitTimestamp);
        setQueueingTransactionImmediateCommitTimestamp(queueingTransactionImmediateCommitTimestamp);
        setQueueingTransactionStartQueueTimestamp(queueingTransactionStartQueueTimestamp);
    }
}
