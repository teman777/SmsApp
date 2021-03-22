/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables.records;


import com.artemvoronov.SmsApp.generated.mysql.tables.ReplicationAsynchronousConnectionFailoverManaged;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * The managed source configuration details
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationAsynchronousConnectionFailoverManagedRecord extends UpdatableRecordImpl<ReplicationAsynchronousConnectionFailoverManagedRecord> implements Record4<String, String, String, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.replication_asynchronous_connection_failover_managed.Channel_name</code>. The replication channel name that connects source and replica.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.replication_asynchronous_connection_failover_managed.Channel_name</code>. The replication channel name that connects source and replica.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.replication_asynchronous_connection_failover_managed.Managed_name</code>. The name of the source which needs to be managed.
     */
    public void setManagedName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.replication_asynchronous_connection_failover_managed.Managed_name</code>. The name of the source which needs to be managed.
     */
    public String getManagedName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.replication_asynchronous_connection_failover_managed.Managed_type</code>. Determines the managed type.
     */
    public void setManagedType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.replication_asynchronous_connection_failover_managed.Managed_type</code>. Determines the managed type.
     */
    public String getManagedType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.replication_asynchronous_connection_failover_managed.Configuration</code>. The data to help manage group. For Managed_type = GroupReplication, Configuration value should contain {"Primary_weight": 80, "Secondary_weight": 60}, so that it assigns weight=80 to PRIMARY of the group, and weight=60 for rest of the members in mysql.replication_asynchronous_connection_failover table.
     */
    public void setConfiguration(JSON value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.replication_asynchronous_connection_failover_managed.Configuration</code>. The data to help manage group. For Managed_type = GroupReplication, Configuration value should contain {"Primary_weight": 80, "Secondary_weight": 60}, so that it assigns weight=80 to PRIMARY of the group, and weight=60 for rest of the members in mysql.replication_asynchronous_connection_failover table.
     */
    public JSON getConfiguration() {
        return (JSON) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, JSON> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, JSON> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CHANNEL_NAME;
    }

    @Override
    public Field<String> field2() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_NAME;
    }

    @Override
    public Field<String> field3() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_TYPE;
    }

    @Override
    public Field<JSON> field4() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CONFIGURATION;
    }

    @Override
    public String component1() {
        return getChannelName();
    }

    @Override
    public String component2() {
        return getManagedName();
    }

    @Override
    public String component3() {
        return getManagedType();
    }

    @Override
    public JSON component4() {
        return getConfiguration();
    }

    @Override
    public String value1() {
        return getChannelName();
    }

    @Override
    public String value2() {
        return getManagedName();
    }

    @Override
    public String value3() {
        return getManagedType();
    }

    @Override
    public JSON value4() {
        return getConfiguration();
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value2(String value) {
        setManagedName(value);
        return this;
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value3(String value) {
        setManagedType(value);
        return this;
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value4(JSON value) {
        setConfiguration(value);
        return this;
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord values(String value1, String value2, String value3, JSON value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationAsynchronousConnectionFailoverManagedRecord
     */
    public ReplicationAsynchronousConnectionFailoverManagedRecord() {
        super(ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    /**
     * Create a detached, initialised ReplicationAsynchronousConnectionFailoverManagedRecord
     */
    public ReplicationAsynchronousConnectionFailoverManagedRecord(String channelName, String managedName, String managedType, JSON configuration) {
        super(ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);

        setChannelName(channelName);
        setManagedName(managedName);
        setManagedType(managedType);
        setConfiguration(configuration);
    }
}