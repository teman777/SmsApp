/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables.records;


import com.artemvoronov.SmsApp.generated.mysql.tables.ServerCost;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServerCostRecord extends UpdatableRecordImpl<ServerCostRecord> implements Record5<String, Double, LocalDateTime, String, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.server_cost.cost_name</code>.
     */
    public void setCostName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.server_cost.cost_name</code>.
     */
    public String getCostName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.server_cost.cost_value</code>.
     */
    public void setCostValue(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.server_cost.cost_value</code>.
     */
    public Double getCostValue() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>mysql.server_cost.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.server_cost.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>mysql.server_cost.comment</code>.
     */
    public void setComment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.server_cost.comment</code>.
     */
    public String getComment() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.server_cost.default_value</code>.
     */
    public void setDefaultValue(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.server_cost.default_value</code>.
     */
    public Double getDefaultValue() {
        return (Double) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, Double, LocalDateTime, String, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, Double, LocalDateTime, String, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ServerCost.SERVER_COST.COST_NAME;
    }

    @Override
    public Field<Double> field2() {
        return ServerCost.SERVER_COST.COST_VALUE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return ServerCost.SERVER_COST.LAST_UPDATE;
    }

    @Override
    public Field<String> field4() {
        return ServerCost.SERVER_COST.COMMENT;
    }

    @Override
    public Field<Double> field5() {
        return ServerCost.SERVER_COST.DEFAULT_VALUE;
    }

    @Override
    public String component1() {
        return getCostName();
    }

    @Override
    public Double component2() {
        return getCostValue();
    }

    @Override
    public LocalDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public String component4() {
        return getComment();
    }

    @Override
    public Double component5() {
        return getDefaultValue();
    }

    @Override
    public String value1() {
        return getCostName();
    }

    @Override
    public Double value2() {
        return getCostValue();
    }

    @Override
    public LocalDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public String value4() {
        return getComment();
    }

    @Override
    public Double value5() {
        return getDefaultValue();
    }

    @Override
    public ServerCostRecord value1(String value) {
        setCostName(value);
        return this;
    }

    @Override
    public ServerCostRecord value2(Double value) {
        setCostValue(value);
        return this;
    }

    @Override
    public ServerCostRecord value3(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public ServerCostRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public ServerCostRecord value5(Double value) {
        setDefaultValue(value);
        return this;
    }

    @Override
    public ServerCostRecord values(String value1, Double value2, LocalDateTime value3, String value4, Double value5) {
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
     * Create a detached ServerCostRecord
     */
    public ServerCostRecord() {
        super(ServerCost.SERVER_COST);
    }

    /**
     * Create a detached, initialised ServerCostRecord
     */
    public ServerCostRecord(String costName, Double costValue, LocalDateTime lastUpdate, String comment, Double defaultValue) {
        super(ServerCost.SERVER_COST);

        setCostName(costName);
        setCostValue(costValue);
        setLastUpdate(lastUpdate);
        setComment(comment);
        setDefaultValue(defaultValue);
    }
}