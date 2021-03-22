/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.tables.EventsStatementsHistogramGlobal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsStatementsHistogramGlobalRecord extends UpdatableRecordImpl<EventsStatementsHistogramGlobalRecord> implements Record6<UInteger, ULong, ULong, ULong, ULong, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.events_statements_histogram_global.BUCKET_NUMBER</code>.
     */
    public void setBucketNumber(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_histogram_global.BUCKET_NUMBER</code>.
     */
    public UInteger getBucketNumber() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_statements_histogram_global.BUCKET_TIMER_LOW</code>.
     */
    public void setBucketTimerLow(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_histogram_global.BUCKET_TIMER_LOW</code>.
     */
    public ULong getBucketTimerLow() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_statements_histogram_global.BUCKET_TIMER_HIGH</code>.
     */
    public void setBucketTimerHigh(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_histogram_global.BUCKET_TIMER_HIGH</code>.
     */
    public ULong getBucketTimerHigh() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_statements_histogram_global.COUNT_BUCKET</code>.
     */
    public void setCountBucket(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_histogram_global.COUNT_BUCKET</code>.
     */
    public ULong getCountBucket() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_statements_histogram_global.COUNT_BUCKET_AND_LOWER</code>.
     */
    public void setCountBucketAndLower(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_histogram_global.COUNT_BUCKET_AND_LOWER</code>.
     */
    public ULong getCountBucketAndLower() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_statements_histogram_global.BUCKET_QUANTILE</code>.
     */
    public void setBucketQuantile(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_histogram_global.BUCKET_QUANTILE</code>.
     */
    public Double getBucketQuantile() {
        return (Double) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, ULong, ULong, ULong, ULong, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UInteger, ULong, ULong, ULong, ULong, Double> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL.BUCKET_NUMBER;
    }

    @Override
    public Field<ULong> field2() {
        return EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL.BUCKET_TIMER_LOW;
    }

    @Override
    public Field<ULong> field3() {
        return EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL.BUCKET_TIMER_HIGH;
    }

    @Override
    public Field<ULong> field4() {
        return EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL.COUNT_BUCKET;
    }

    @Override
    public Field<ULong> field5() {
        return EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL.COUNT_BUCKET_AND_LOWER;
    }

    @Override
    public Field<Double> field6() {
        return EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL.BUCKET_QUANTILE;
    }

    @Override
    public UInteger component1() {
        return getBucketNumber();
    }

    @Override
    public ULong component2() {
        return getBucketTimerLow();
    }

    @Override
    public ULong component3() {
        return getBucketTimerHigh();
    }

    @Override
    public ULong component4() {
        return getCountBucket();
    }

    @Override
    public ULong component5() {
        return getCountBucketAndLower();
    }

    @Override
    public Double component6() {
        return getBucketQuantile();
    }

    @Override
    public UInteger value1() {
        return getBucketNumber();
    }

    @Override
    public ULong value2() {
        return getBucketTimerLow();
    }

    @Override
    public ULong value3() {
        return getBucketTimerHigh();
    }

    @Override
    public ULong value4() {
        return getCountBucket();
    }

    @Override
    public ULong value5() {
        return getCountBucketAndLower();
    }

    @Override
    public Double value6() {
        return getBucketQuantile();
    }

    @Override
    public EventsStatementsHistogramGlobalRecord value1(UInteger value) {
        setBucketNumber(value);
        return this;
    }

    @Override
    public EventsStatementsHistogramGlobalRecord value2(ULong value) {
        setBucketTimerLow(value);
        return this;
    }

    @Override
    public EventsStatementsHistogramGlobalRecord value3(ULong value) {
        setBucketTimerHigh(value);
        return this;
    }

    @Override
    public EventsStatementsHistogramGlobalRecord value4(ULong value) {
        setCountBucket(value);
        return this;
    }

    @Override
    public EventsStatementsHistogramGlobalRecord value5(ULong value) {
        setCountBucketAndLower(value);
        return this;
    }

    @Override
    public EventsStatementsHistogramGlobalRecord value6(Double value) {
        setBucketQuantile(value);
        return this;
    }

    @Override
    public EventsStatementsHistogramGlobalRecord values(UInteger value1, ULong value2, ULong value3, ULong value4, ULong value5, Double value6) {
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
     * Create a detached EventsStatementsHistogramGlobalRecord
     */
    public EventsStatementsHistogramGlobalRecord() {
        super(EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL);
    }

    /**
     * Create a detached, initialised EventsStatementsHistogramGlobalRecord
     */
    public EventsStatementsHistogramGlobalRecord(UInteger bucketNumber, ULong bucketTimerLow, ULong bucketTimerHigh, ULong countBucket, ULong countBucketAndLower, Double bucketQuantile) {
        super(EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL);

        setBucketNumber(bucketNumber);
        setBucketTimerLow(bucketTimerLow);
        setBucketTimerHigh(bucketTimerHigh);
        setCountBucket(countBucket);
        setCountBucketAndLower(countBucketAndLower);
        setBucketQuantile(bucketQuantile);
    }
}
