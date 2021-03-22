/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.tables.TableHandles;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableHandlesRecord extends UpdatableRecordImpl<TableHandlesRecord> implements Record8<String, String, String, ULong, ULong, ULong, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.table_handles.OBJECT_TYPE</code>.
     */
    public void setObjectType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.table_handles.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.table_handles.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.table_handles.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.table_handles.OWNER_THREAD_ID</code>.
     */
    public void setOwnerThreadId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.OWNER_THREAD_ID</code>.
     */
    public ULong getOwnerThreadId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.table_handles.OWNER_EVENT_ID</code>.
     */
    public void setOwnerEventId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.OWNER_EVENT_ID</code>.
     */
    public ULong getOwnerEventId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.table_handles.INTERNAL_LOCK</code>.
     */
    public void setInternalLock(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.INTERNAL_LOCK</code>.
     */
    public String getInternalLock() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.table_handles.EXTERNAL_LOCK</code>.
     */
    public void setExternalLock(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.table_handles.EXTERNAL_LOCK</code>.
     */
    public String getExternalLock() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, ULong, ULong, ULong, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, ULong, ULong, ULong, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TableHandles.TABLE_HANDLES.OBJECT_TYPE;
    }

    @Override
    public Field<String> field2() {
        return TableHandles.TABLE_HANDLES.OBJECT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return TableHandles.TABLE_HANDLES.OBJECT_NAME;
    }

    @Override
    public Field<ULong> field4() {
        return TableHandles.TABLE_HANDLES.OBJECT_INSTANCE_BEGIN;
    }

    @Override
    public Field<ULong> field5() {
        return TableHandles.TABLE_HANDLES.OWNER_THREAD_ID;
    }

    @Override
    public Field<ULong> field6() {
        return TableHandles.TABLE_HANDLES.OWNER_EVENT_ID;
    }

    @Override
    public Field<String> field7() {
        return TableHandles.TABLE_HANDLES.INTERNAL_LOCK;
    }

    @Override
    public Field<String> field8() {
        return TableHandles.TABLE_HANDLES.EXTERNAL_LOCK;
    }

    @Override
    public String component1() {
        return getObjectType();
    }

    @Override
    public String component2() {
        return getObjectSchema();
    }

    @Override
    public String component3() {
        return getObjectName();
    }

    @Override
    public ULong component4() {
        return getObjectInstanceBegin();
    }

    @Override
    public ULong component5() {
        return getOwnerThreadId();
    }

    @Override
    public ULong component6() {
        return getOwnerEventId();
    }

    @Override
    public String component7() {
        return getInternalLock();
    }

    @Override
    public String component8() {
        return getExternalLock();
    }

    @Override
    public String value1() {
        return getObjectType();
    }

    @Override
    public String value2() {
        return getObjectSchema();
    }

    @Override
    public String value3() {
        return getObjectName();
    }

    @Override
    public ULong value4() {
        return getObjectInstanceBegin();
    }

    @Override
    public ULong value5() {
        return getOwnerThreadId();
    }

    @Override
    public ULong value6() {
        return getOwnerEventId();
    }

    @Override
    public String value7() {
        return getInternalLock();
    }

    @Override
    public String value8() {
        return getExternalLock();
    }

    @Override
    public TableHandlesRecord value1(String value) {
        setObjectType(value);
        return this;
    }

    @Override
    public TableHandlesRecord value2(String value) {
        setObjectSchema(value);
        return this;
    }

    @Override
    public TableHandlesRecord value3(String value) {
        setObjectName(value);
        return this;
    }

    @Override
    public TableHandlesRecord value4(ULong value) {
        setObjectInstanceBegin(value);
        return this;
    }

    @Override
    public TableHandlesRecord value5(ULong value) {
        setOwnerThreadId(value);
        return this;
    }

    @Override
    public TableHandlesRecord value6(ULong value) {
        setOwnerEventId(value);
        return this;
    }

    @Override
    public TableHandlesRecord value7(String value) {
        setInternalLock(value);
        return this;
    }

    @Override
    public TableHandlesRecord value8(String value) {
        setExternalLock(value);
        return this;
    }

    @Override
    public TableHandlesRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, String value7, String value8) {
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
     * Create a detached TableHandlesRecord
     */
    public TableHandlesRecord() {
        super(TableHandles.TABLE_HANDLES);
    }

    /**
     * Create a detached, initialised TableHandlesRecord
     */
    public TableHandlesRecord(String objectType, String objectSchema, String objectName, ULong objectInstanceBegin, ULong ownerThreadId, ULong ownerEventId, String internalLock, String externalLock) {
        super(TableHandles.TABLE_HANDLES);

        setObjectType(objectType);
        setObjectSchema(objectSchema);
        setObjectName(objectName);
        setObjectInstanceBegin(objectInstanceBegin);
        setOwnerThreadId(ownerThreadId);
        setOwnerEventId(ownerEventId);
        setInternalLock(internalLock);
        setExternalLock(externalLock);
    }
}
