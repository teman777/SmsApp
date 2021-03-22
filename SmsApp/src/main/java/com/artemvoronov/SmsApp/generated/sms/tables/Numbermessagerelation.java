/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sms.tables;


import com.artemvoronov.SmsApp.generated.sms.Indexes;
import com.artemvoronov.SmsApp.generated.sms.Keys;
import com.artemvoronov.SmsApp.generated.sms.Sms;
import com.artemvoronov.SmsApp.generated.sms.tables.records.NumbermessagerelationRecord;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Numbermessagerelation extends TableImpl<NumbermessagerelationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>SMS.NumberMessageRelation</code>
     */
    public static final Numbermessagerelation NUMBERMESSAGERELATION = new Numbermessagerelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NumbermessagerelationRecord> getRecordType() {
        return NumbermessagerelationRecord.class;
    }

    /**
     * The column <code>SMS.NumberMessageRelation.ID</code>.
     */
    public final TableField<NumbermessagerelationRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>SMS.NumberMessageRelation.Number</code>.
     */
    public final TableField<NumbermessagerelationRecord, BigInteger> NUMBER = createField(DSL.name("Number"), SQLDataType.DECIMAL_INTEGER(20), this, "");

    /**
     * The column <code>SMS.NumberMessageRelation.MessageID</code>.
     */
    public final TableField<NumbermessagerelationRecord, Integer> MESSAGEID = createField(DSL.name("MessageID"), SQLDataType.INTEGER, this, "");

    private Numbermessagerelation(Name alias, Table<NumbermessagerelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Numbermessagerelation(Name alias, Table<NumbermessagerelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>SMS.NumberMessageRelation</code> table reference
     */
    public Numbermessagerelation(String alias) {
        this(DSL.name(alias), NUMBERMESSAGERELATION);
    }

    /**
     * Create an aliased <code>SMS.NumberMessageRelation</code> table reference
     */
    public Numbermessagerelation(Name alias) {
        this(alias, NUMBERMESSAGERELATION);
    }

    /**
     * Create a <code>SMS.NumberMessageRelation</code> table reference
     */
    public Numbermessagerelation() {
        this(DSL.name("NumberMessageRelation"), null);
    }

    public <O extends Record> Numbermessagerelation(Table<O> child, ForeignKey<O, NumbermessagerelationRecord> key) {
        super(child, key, NUMBERMESSAGERELATION);
    }

    @Override
    public Schema getSchema() {
        return Sms.SMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NUMBERMESSAGERELATION_MESSAGEID);
    }

    @Override
    public Identity<NumbermessagerelationRecord, Integer> getIdentity() {
        return (Identity<NumbermessagerelationRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<NumbermessagerelationRecord> getPrimaryKey() {
        return Keys.KEY_NUMBERMESSAGERELATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<NumbermessagerelationRecord>> getKeys() {
        return Arrays.<UniqueKey<NumbermessagerelationRecord>>asList(Keys.KEY_NUMBERMESSAGERELATION_PRIMARY);
    }

    @Override
    public List<ForeignKey<NumbermessagerelationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NumbermessagerelationRecord, ?>>asList(Keys.NUMBERMESSAGERELATION_IBFK_1);
    }

    private transient Message _message;

    public Message message() {
        if (_message == null)
            _message = new Message(this, Keys.NUMBERMESSAGERELATION_IBFK_1);

        return _message;
    }

    @Override
    public Numbermessagerelation as(String alias) {
        return new Numbermessagerelation(DSL.name(alias), this);
    }

    @Override
    public Numbermessagerelation as(Name alias) {
        return new Numbermessagerelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Numbermessagerelation rename(String name) {
        return new Numbermessagerelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Numbermessagerelation rename(Name name) {
        return new Numbermessagerelation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, BigInteger, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
