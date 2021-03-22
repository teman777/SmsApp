/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationApplierStatusByCoordinatorServiceState;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.ReplicationApplierStatusByCoordinator;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatusByCoordinatorRecord extends UpdatableRecordImpl<ReplicationApplierStatusByCoordinatorRecord> implements Record15<String, ULong, ReplicationApplierStatusByCoordinatorServiceState, Integer, String, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.SERVICE_STATE</code>.
     */
    public void setServiceState(ReplicationApplierStatusByCoordinatorServiceState value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.SERVICE_STATE</code>.
     */
    public ReplicationApplierStatusByCoordinatorServiceState getServiceState() {
        return (ReplicationApplierStatusByCoordinatorServiceState) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_NUMBER</code>.
     */
    public void setLastErrorNumber(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_NUMBER</code>.
     */
    public Integer getLastErrorNumber() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE</code>.
     */
    public void setLastErrorMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE</code>.
     */
    public String getLastErrorMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP</code>.
     */
    public void setLastErrorTimestamp(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP</code>.
     */
    public LocalDateTime getLastErrorTimestamp() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION</code>.
     */
    public void setLastProcessedTransaction(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION</code>.
     */
    public String getLastProcessedTransaction() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public void setLastProcessedTransactionOriginalCommitTimestamp(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getLastProcessedTransactionOriginalCommitTimestamp() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public void setLastProcessedTransactionImmediateCommitTimestamp(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getLastProcessedTransactionImmediateCommitTimestamp() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP</code>.
     */
    public void setLastProcessedTransactionStartBufferTimestamp(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP</code>.
     */
    public LocalDateTime getLastProcessedTransactionStartBufferTimestamp() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP</code>.
     */
    public void setLastProcessedTransactionEndBufferTimestamp(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP</code>.
     */
    public LocalDateTime getLastProcessedTransactionEndBufferTimestamp() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION</code>.
     */
    public void setProcessingTransaction(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION</code>.
     */
    public String getProcessingTransaction() {
        return (String) get(11);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public void setProcessingTransactionOriginalCommitTimestamp(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getProcessingTransactionOriginalCommitTimestamp() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public void setProcessingTransactionImmediateCommitTimestamp(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getProcessingTransactionImmediateCommitTimestamp() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP</code>.
     */
    public void setProcessingTransactionStartBufferTimestamp(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP</code>.
     */
    public LocalDateTime getProcessingTransactionStartBufferTimestamp() {
        return (LocalDateTime) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, ULong, ReplicationApplierStatusByCoordinatorServiceState, Integer, String, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, ULong, ReplicationApplierStatusByCoordinatorServiceState, Integer, String, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.CHANNEL_NAME;
    }

    @Override
    public Field<ULong> field2() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.THREAD_ID;
    }

    @Override
    public Field<ReplicationApplierStatusByCoordinatorServiceState> field3() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.SERVICE_STATE;
    }

    @Override
    public Field<Integer> field4() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_NUMBER;
    }

    @Override
    public Field<String> field5() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_MESSAGE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_TIMESTAMP;
    }

    @Override
    public Field<String> field7() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP;
    }

    @Override
    public Field<String> field12() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP;
    }

    @Override
    public String component1() {
        return getChannelName();
    }

    @Override
    public ULong component2() {
        return getThreadId();
    }

    @Override
    public ReplicationApplierStatusByCoordinatorServiceState component3() {
        return getServiceState();
    }

    @Override
    public Integer component4() {
        return getLastErrorNumber();
    }

    @Override
    public String component5() {
        return getLastErrorMessage();
    }

    @Override
    public LocalDateTime component6() {
        return getLastErrorTimestamp();
    }

    @Override
    public String component7() {
        return getLastProcessedTransaction();
    }

    @Override
    public LocalDateTime component8() {
        return getLastProcessedTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime component9() {
        return getLastProcessedTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime component10() {
        return getLastProcessedTransactionStartBufferTimestamp();
    }

    @Override
    public LocalDateTime component11() {
        return getLastProcessedTransactionEndBufferTimestamp();
    }

    @Override
    public String component12() {
        return getProcessingTransaction();
    }

    @Override
    public LocalDateTime component13() {
        return getProcessingTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime component14() {
        return getProcessingTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime component15() {
        return getProcessingTransactionStartBufferTimestamp();
    }

    @Override
    public String value1() {
        return getChannelName();
    }

    @Override
    public ULong value2() {
        return getThreadId();
    }

    @Override
    public ReplicationApplierStatusByCoordinatorServiceState value3() {
        return getServiceState();
    }

    @Override
    public Integer value4() {
        return getLastErrorNumber();
    }

    @Override
    public String value5() {
        return getLastErrorMessage();
    }

    @Override
    public LocalDateTime value6() {
        return getLastErrorTimestamp();
    }

    @Override
    public String value7() {
        return getLastProcessedTransaction();
    }

    @Override
    public LocalDateTime value8() {
        return getLastProcessedTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime value9() {
        return getLastProcessedTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime value10() {
        return getLastProcessedTransactionStartBufferTimestamp();
    }

    @Override
    public LocalDateTime value11() {
        return getLastProcessedTransactionEndBufferTimestamp();
    }

    @Override
    public String value12() {
        return getProcessingTransaction();
    }

    @Override
    public LocalDateTime value13() {
        return getProcessingTransactionOriginalCommitTimestamp();
    }

    @Override
    public LocalDateTime value14() {
        return getProcessingTransactionImmediateCommitTimestamp();
    }

    @Override
    public LocalDateTime value15() {
        return getProcessingTransactionStartBufferTimestamp();
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value2(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value3(ReplicationApplierStatusByCoordinatorServiceState value) {
        setServiceState(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value4(Integer value) {
        setLastErrorNumber(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value5(String value) {
        setLastErrorMessage(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value6(LocalDateTime value) {
        setLastErrorTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value7(String value) {
        setLastProcessedTransaction(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value8(LocalDateTime value) {
        setLastProcessedTransactionOriginalCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value9(LocalDateTime value) {
        setLastProcessedTransactionImmediateCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value10(LocalDateTime value) {
        setLastProcessedTransactionStartBufferTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value11(LocalDateTime value) {
        setLastProcessedTransactionEndBufferTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value12(String value) {
        setProcessingTransaction(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value13(LocalDateTime value) {
        setProcessingTransactionOriginalCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value14(LocalDateTime value) {
        setProcessingTransactionImmediateCommitTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord value15(LocalDateTime value) {
        setProcessingTransactionStartBufferTimestamp(value);
        return this;
    }

    @Override
    public ReplicationApplierStatusByCoordinatorRecord values(String value1, ULong value2, ReplicationApplierStatusByCoordinatorServiceState value3, Integer value4, String value5, LocalDateTime value6, String value7, LocalDateTime value8, LocalDateTime value9, LocalDateTime value10, LocalDateTime value11, String value12, LocalDateTime value13, LocalDateTime value14, LocalDateTime value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationApplierStatusByCoordinatorRecord
     */
    public ReplicationApplierStatusByCoordinatorRecord() {
        super(ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR);
    }

    /**
     * Create a detached, initialised ReplicationApplierStatusByCoordinatorRecord
     */
    public ReplicationApplierStatusByCoordinatorRecord(String channelName, ULong threadId, ReplicationApplierStatusByCoordinatorServiceState serviceState, Integer lastErrorNumber, String lastErrorMessage, LocalDateTime lastErrorTimestamp, String lastProcessedTransaction, LocalDateTime lastProcessedTransactionOriginalCommitTimestamp, LocalDateTime lastProcessedTransactionImmediateCommitTimestamp, LocalDateTime lastProcessedTransactionStartBufferTimestamp, LocalDateTime lastProcessedTransactionEndBufferTimestamp, String processingTransaction, LocalDateTime processingTransactionOriginalCommitTimestamp, LocalDateTime processingTransactionImmediateCommitTimestamp, LocalDateTime processingTransactionStartBufferTimestamp) {
        super(ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR);

        setChannelName(channelName);
        setThreadId(threadId);
        setServiceState(serviceState);
        setLastErrorNumber(lastErrorNumber);
        setLastErrorMessage(lastErrorMessage);
        setLastErrorTimestamp(lastErrorTimestamp);
        setLastProcessedTransaction(lastProcessedTransaction);
        setLastProcessedTransactionOriginalCommitTimestamp(lastProcessedTransactionOriginalCommitTimestamp);
        setLastProcessedTransactionImmediateCommitTimestamp(lastProcessedTransactionImmediateCommitTimestamp);
        setLastProcessedTransactionStartBufferTimestamp(lastProcessedTransactionStartBufferTimestamp);
        setLastProcessedTransactionEndBufferTimestamp(lastProcessedTransactionEndBufferTimestamp);
        setProcessingTransaction(processingTransaction);
        setProcessingTransactionOriginalCommitTimestamp(processingTransactionOriginalCommitTimestamp);
        setProcessingTransactionImmediateCommitTimestamp(processingTransactionImmediateCommitTimestamp);
        setProcessingTransactionStartBufferTimestamp(processingTransactionStartBufferTimestamp);
    }
}
