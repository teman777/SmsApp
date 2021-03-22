/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables.records;


import com.artemvoronov.SmsApp.generated.information_schema.enums.ResourceGroupsResourceGroupType;
import com.artemvoronov.SmsApp.generated.information_schema.tables.ResourceGroups;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourceGroupsRecord extends TableRecordImpl<ResourceGroupsRecord> implements Record5<String, ResourceGroupsResourceGroupType, Byte, byte[], Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_NAME</code>.
     */
    public void setResourceGroupName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_NAME</code>.
     */
    public String getResourceGroupName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_TYPE</code>.
     */
    public void setResourceGroupType(ResourceGroupsResourceGroupType value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_TYPE</code>.
     */
    public ResourceGroupsResourceGroupType getResourceGroupType() {
        return (ResourceGroupsResourceGroupType) get(1);
    }

    /**
     * Setter for <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED</code>.
     */
    public void setResourceGroupEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED</code>.
     */
    public Byte getResourceGroupEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>information_schema.RESOURCE_GROUPS.VCPU_IDS</code>.
     */
    public void setVcpuIds(byte[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.RESOURCE_GROUPS.VCPU_IDS</code>.
     */
    public byte[] getVcpuIds() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>information_schema.RESOURCE_GROUPS.THREAD_PRIORITY</code>.
     */
    public void setThreadPriority(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.RESOURCE_GROUPS.THREAD_PRIORITY</code>.
     */
    public Integer getThreadPriority() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, ResourceGroupsResourceGroupType, Byte, byte[], Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, ResourceGroupsResourceGroupType, Byte, byte[], Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ResourceGroups.RESOURCE_GROUPS.RESOURCE_GROUP_NAME;
    }

    @Override
    public Field<ResourceGroupsResourceGroupType> field2() {
        return ResourceGroups.RESOURCE_GROUPS.RESOURCE_GROUP_TYPE;
    }

    @Override
    public Field<Byte> field3() {
        return ResourceGroups.RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED;
    }

    @Override
    public Field<byte[]> field4() {
        return ResourceGroups.RESOURCE_GROUPS.VCPU_IDS;
    }

    @Override
    public Field<Integer> field5() {
        return ResourceGroups.RESOURCE_GROUPS.THREAD_PRIORITY;
    }

    @Override
    public String component1() {
        return getResourceGroupName();
    }

    @Override
    public ResourceGroupsResourceGroupType component2() {
        return getResourceGroupType();
    }

    @Override
    public Byte component3() {
        return getResourceGroupEnabled();
    }

    @Override
    public byte[] component4() {
        return getVcpuIds();
    }

    @Override
    public Integer component5() {
        return getThreadPriority();
    }

    @Override
    public String value1() {
        return getResourceGroupName();
    }

    @Override
    public ResourceGroupsResourceGroupType value2() {
        return getResourceGroupType();
    }

    @Override
    public Byte value3() {
        return getResourceGroupEnabled();
    }

    @Override
    public byte[] value4() {
        return getVcpuIds();
    }

    @Override
    public Integer value5() {
        return getThreadPriority();
    }

    @Override
    public ResourceGroupsRecord value1(String value) {
        setResourceGroupName(value);
        return this;
    }

    @Override
    public ResourceGroupsRecord value2(ResourceGroupsResourceGroupType value) {
        setResourceGroupType(value);
        return this;
    }

    @Override
    public ResourceGroupsRecord value3(Byte value) {
        setResourceGroupEnabled(value);
        return this;
    }

    @Override
    public ResourceGroupsRecord value4(byte[] value) {
        setVcpuIds(value);
        return this;
    }

    @Override
    public ResourceGroupsRecord value5(Integer value) {
        setThreadPriority(value);
        return this;
    }

    @Override
    public ResourceGroupsRecord values(String value1, ResourceGroupsResourceGroupType value2, Byte value3, byte[] value4, Integer value5) {
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
     * Create a detached ResourceGroupsRecord
     */
    public ResourceGroupsRecord() {
        super(ResourceGroups.RESOURCE_GROUPS);
    }

    /**
     * Create a detached, initialised ResourceGroupsRecord
     */
    public ResourceGroupsRecord(String resourceGroupName, ResourceGroupsResourceGroupType resourceGroupType, Byte resourceGroupEnabled, byte[] vcpuIds, Integer threadPriority) {
        super(ResourceGroups.RESOURCE_GROUPS);

        setResourceGroupName(resourceGroupName);
        setResourceGroupType(resourceGroupType);
        setResourceGroupEnabled(resourceGroupEnabled);
        setVcpuIds(vcpuIds);
        setThreadPriority(threadPriority);
    }
}
