/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables.records;


import com.artemvoronov.SmsApp.generated.information_schema.tables.Engines;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnginesRecord extends TableRecordImpl<EnginesRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.ENGINES.ENGINE</code>.
     */
    public void setEngine(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ENGINES.ENGINE</code>.
     */
    public String getEngine() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ENGINES.SUPPORT</code>.
     */
    public void setSupport(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ENGINES.SUPPORT</code>.
     */
    public String getSupport() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ENGINES.COMMENT</code>.
     */
    public void setComment(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ENGINES.COMMENT</code>.
     */
    public String getComment() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.ENGINES.TRANSACTIONS</code>.
     */
    public void setTransactions(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.ENGINES.TRANSACTIONS</code>.
     */
    public String getTransactions() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.ENGINES.XA</code>.
     */
    public void setXa(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.ENGINES.XA</code>.
     */
    public String getXa() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.ENGINES.SAVEPOINTS</code>.
     */
    public void setSavepoints(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.ENGINES.SAVEPOINTS</code>.
     */
    public String getSavepoints() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Engines.ENGINES.ENGINE;
    }

    @Override
    public Field<String> field2() {
        return Engines.ENGINES.SUPPORT;
    }

    @Override
    public Field<String> field3() {
        return Engines.ENGINES.COMMENT;
    }

    @Override
    public Field<String> field4() {
        return Engines.ENGINES.TRANSACTIONS;
    }

    @Override
    public Field<String> field5() {
        return Engines.ENGINES.XA;
    }

    @Override
    public Field<String> field6() {
        return Engines.ENGINES.SAVEPOINTS;
    }

    @Override
    public String component1() {
        return getEngine();
    }

    @Override
    public String component2() {
        return getSupport();
    }

    @Override
    public String component3() {
        return getComment();
    }

    @Override
    public String component4() {
        return getTransactions();
    }

    @Override
    public String component5() {
        return getXa();
    }

    @Override
    public String component6() {
        return getSavepoints();
    }

    @Override
    public String value1() {
        return getEngine();
    }

    @Override
    public String value2() {
        return getSupport();
    }

    @Override
    public String value3() {
        return getComment();
    }

    @Override
    public String value4() {
        return getTransactions();
    }

    @Override
    public String value5() {
        return getXa();
    }

    @Override
    public String value6() {
        return getSavepoints();
    }

    @Override
    public EnginesRecord value1(String value) {
        setEngine(value);
        return this;
    }

    @Override
    public EnginesRecord value2(String value) {
        setSupport(value);
        return this;
    }

    @Override
    public EnginesRecord value3(String value) {
        setComment(value);
        return this;
    }

    @Override
    public EnginesRecord value4(String value) {
        setTransactions(value);
        return this;
    }

    @Override
    public EnginesRecord value5(String value) {
        setXa(value);
        return this;
    }

    @Override
    public EnginesRecord value6(String value) {
        setSavepoints(value);
        return this;
    }

    @Override
    public EnginesRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached EnginesRecord
     */
    public EnginesRecord() {
        super(Engines.ENGINES);
    }

    /**
     * Create a detached, initialised EnginesRecord
     */
    public EnginesRecord(String engine, String support, String comment, String transactions, String xa, String savepoints) {
        super(Engines.ENGINES);

        setEngine(engine);
        setSupport(support);
        setComment(comment);
        setTransactions(transactions);
        setXa(xa);
        setSavepoints(savepoints);
    }
}
