/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables.records;


import com.artemvoronov.SmsApp.generated.mysql.tables.EngineCost;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EngineCostRecord extends UpdatableRecordImpl<EngineCostRecord> implements Record7<String, Integer, String, Double, LocalDateTime, String, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.engine_cost.engine_name</code>.
     */
    public void setEngineName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.engine_name</code>.
     */
    public String getEngineName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.engine_cost.device_type</code>.
     */
    public void setDeviceType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.device_type</code>.
     */
    public Integer getDeviceType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mysql.engine_cost.cost_name</code>.
     */
    public void setCostName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.cost_name</code>.
     */
    public String getCostName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.engine_cost.cost_value</code>.
     */
    public void setCostValue(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.cost_value</code>.
     */
    public Double getCostValue() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>mysql.engine_cost.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>mysql.engine_cost.comment</code>.
     */
    public void setComment(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.comment</code>.
     */
    public String getComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mysql.engine_cost.default_value</code>.
     */
    public void setDefaultValue(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.engine_cost.default_value</code>.
     */
    public Double getDefaultValue() {
        return (Double) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, String, Double, LocalDateTime, String, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, Integer, String, Double, LocalDateTime, String, Double> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EngineCost.ENGINE_COST.ENGINE_NAME;
    }

    @Override
    public Field<Integer> field2() {
        return EngineCost.ENGINE_COST.DEVICE_TYPE;
    }

    @Override
    public Field<String> field3() {
        return EngineCost.ENGINE_COST.COST_NAME;
    }

    @Override
    public Field<Double> field4() {
        return EngineCost.ENGINE_COST.COST_VALUE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return EngineCost.ENGINE_COST.LAST_UPDATE;
    }

    @Override
    public Field<String> field6() {
        return EngineCost.ENGINE_COST.COMMENT;
    }

    @Override
    public Field<Double> field7() {
        return EngineCost.ENGINE_COST.DEFAULT_VALUE;
    }

    @Override
    public String component1() {
        return getEngineName();
    }

    @Override
    public Integer component2() {
        return getDeviceType();
    }

    @Override
    public String component3() {
        return getCostName();
    }

    @Override
    public Double component4() {
        return getCostValue();
    }

    @Override
    public LocalDateTime component5() {
        return getLastUpdate();
    }

    @Override
    public String component6() {
        return getComment();
    }

    @Override
    public Double component7() {
        return getDefaultValue();
    }

    @Override
    public String value1() {
        return getEngineName();
    }

    @Override
    public Integer value2() {
        return getDeviceType();
    }

    @Override
    public String value3() {
        return getCostName();
    }

    @Override
    public Double value4() {
        return getCostValue();
    }

    @Override
    public LocalDateTime value5() {
        return getLastUpdate();
    }

    @Override
    public String value6() {
        return getComment();
    }

    @Override
    public Double value7() {
        return getDefaultValue();
    }

    @Override
    public EngineCostRecord value1(String value) {
        setEngineName(value);
        return this;
    }

    @Override
    public EngineCostRecord value2(Integer value) {
        setDeviceType(value);
        return this;
    }

    @Override
    public EngineCostRecord value3(String value) {
        setCostName(value);
        return this;
    }

    @Override
    public EngineCostRecord value4(Double value) {
        setCostValue(value);
        return this;
    }

    @Override
    public EngineCostRecord value5(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public EngineCostRecord value6(String value) {
        setComment(value);
        return this;
    }

    @Override
    public EngineCostRecord value7(Double value) {
        setDefaultValue(value);
        return this;
    }

    @Override
    public EngineCostRecord values(String value1, Integer value2, String value3, Double value4, LocalDateTime value5, String value6, Double value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EngineCostRecord
     */
    public EngineCostRecord() {
        super(EngineCost.ENGINE_COST);
    }

    /**
     * Create a detached, initialised EngineCostRecord
     */
    public EngineCostRecord(String engineName, Integer deviceType, String costName, Double costValue, LocalDateTime lastUpdate, String comment, Double defaultValue) {
        super(EngineCost.ENGINE_COST);

        setEngineName(engineName);
        setDeviceType(deviceType);
        setCostName(costName);
        setCostValue(costValue);
        setLastUpdate(lastUpdate);
        setComment(comment);
        setDefaultValue(defaultValue);
    }
}
