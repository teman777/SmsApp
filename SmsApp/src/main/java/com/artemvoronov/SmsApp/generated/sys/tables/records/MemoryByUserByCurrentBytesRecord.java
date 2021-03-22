/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.MemoryByUserByCurrentBytes;

import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemoryByUserByCurrentBytesRecord extends TableRecordImpl<MemoryByUserByCurrentBytesRecord> implements Record6<String, BigInteger, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.memory_by_user_by_current_bytes.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.memory_by_user_by_current_bytes.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.memory_by_user_by_current_bytes.current_count_used</code>.
     */
    public void setCurrentCountUsed(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.memory_by_user_by_current_bytes.current_count_used</code>.
     */
    public BigInteger getCurrentCountUsed() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.memory_by_user_by_current_bytes.current_allocated</code>.
     */
    public void setCurrentAllocated(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.memory_by_user_by_current_bytes.current_allocated</code>.
     */
    public String getCurrentAllocated() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.memory_by_user_by_current_bytes.current_avg_alloc</code>.
     */
    public void setCurrentAvgAlloc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.memory_by_user_by_current_bytes.current_avg_alloc</code>.
     */
    public String getCurrentAvgAlloc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.memory_by_user_by_current_bytes.current_max_alloc</code>.
     */
    public void setCurrentMaxAlloc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.memory_by_user_by_current_bytes.current_max_alloc</code>.
     */
    public String getCurrentMaxAlloc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.memory_by_user_by_current_bytes.total_allocated</code>.
     */
    public void setTotalAllocated(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.memory_by_user_by_current_bytes.total_allocated</code>.
     */
    public String getTotalAllocated() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, BigInteger, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, BigInteger, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES.USER;
    }

    @Override
    public Field<BigInteger> field2() {
        return MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_COUNT_USED;
    }

    @Override
    public Field<String> field3() {
        return MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_ALLOCATED;
    }

    @Override
    public Field<String> field4() {
        return MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_AVG_ALLOC;
    }

    @Override
    public Field<String> field5() {
        return MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_MAX_ALLOC;
    }

    @Override
    public Field<String> field6() {
        return MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES.TOTAL_ALLOCATED;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public BigInteger component2() {
        return getCurrentCountUsed();
    }

    @Override
    public String component3() {
        return getCurrentAllocated();
    }

    @Override
    public String component4() {
        return getCurrentAvgAlloc();
    }

    @Override
    public String component5() {
        return getCurrentMaxAlloc();
    }

    @Override
    public String component6() {
        return getTotalAllocated();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public BigInteger value2() {
        return getCurrentCountUsed();
    }

    @Override
    public String value3() {
        return getCurrentAllocated();
    }

    @Override
    public String value4() {
        return getCurrentAvgAlloc();
    }

    @Override
    public String value5() {
        return getCurrentMaxAlloc();
    }

    @Override
    public String value6() {
        return getTotalAllocated();
    }

    @Override
    public MemoryByUserByCurrentBytesRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public MemoryByUserByCurrentBytesRecord value2(BigInteger value) {
        setCurrentCountUsed(value);
        return this;
    }

    @Override
    public MemoryByUserByCurrentBytesRecord value3(String value) {
        setCurrentAllocated(value);
        return this;
    }

    @Override
    public MemoryByUserByCurrentBytesRecord value4(String value) {
        setCurrentAvgAlloc(value);
        return this;
    }

    @Override
    public MemoryByUserByCurrentBytesRecord value5(String value) {
        setCurrentMaxAlloc(value);
        return this;
    }

    @Override
    public MemoryByUserByCurrentBytesRecord value6(String value) {
        setTotalAllocated(value);
        return this;
    }

    @Override
    public MemoryByUserByCurrentBytesRecord values(String value1, BigInteger value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached MemoryByUserByCurrentBytesRecord
     */
    public MemoryByUserByCurrentBytesRecord() {
        super(MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES);
    }

    /**
     * Create a detached, initialised MemoryByUserByCurrentBytesRecord
     */
    public MemoryByUserByCurrentBytesRecord(String user, BigInteger currentCountUsed, String currentAllocated, String currentAvgAlloc, String currentMaxAlloc, String totalAllocated) {
        super(MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES);

        setUser(user);
        setCurrentCountUsed(currentCountUsed);
        setCurrentAllocated(currentAllocated);
        setCurrentAvgAlloc(currentAvgAlloc);
        setCurrentMaxAlloc(currentMaxAlloc);
        setTotalAllocated(totalAllocated);
    }
}
