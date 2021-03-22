/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sms.tables;


import com.artemvoronov.SmsApp.generated.sms.Keys;
import com.artemvoronov.SmsApp.generated.sms.Sms;
import com.artemvoronov.SmsApp.generated.sms.tables.records.MessageRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Message extends TableImpl<MessageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>SMS.Message</code>
     */
    public static final Message MESSAGE = new Message();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MessageRecord> getRecordType() {
        return MessageRecord.class;
    }

    /**
     * The column <code>SMS.Message.ID</code>.
     */
    public final TableField<MessageRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>SMS.Message.CreatedDate</code>.
     */
    public final TableField<MessageRecord, LocalDate> CREATEDDATE = createField(DSL.name("CreatedDate"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>SMS.Message.Text</code>.
     */
    public final TableField<MessageRecord, String> TEXT = createField(DSL.name("Text"), SQLDataType.VARCHAR(255), this, "");

    private Message(Name alias, Table<MessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Message(Name alias, Table<MessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>SMS.Message</code> table reference
     */
    public Message(String alias) {
        this(DSL.name(alias), MESSAGE);
    }

    /**
     * Create an aliased <code>SMS.Message</code> table reference
     */
    public Message(Name alias) {
        this(alias, MESSAGE);
    }

    /**
     * Create a <code>SMS.Message</code> table reference
     */
    public Message() {
        this(DSL.name("Message"), null);
    }

    public <O extends Record> Message(Table<O> child, ForeignKey<O, MessageRecord> key) {
        super(child, key, MESSAGE);
    }

    @Override
    public Schema getSchema() {
        return Sms.SMS;
    }

    @Override
    public Identity<MessageRecord, Integer> getIdentity() {
        return (Identity<MessageRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MessageRecord> getPrimaryKey() {
        return Keys.KEY_MESSAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<MessageRecord>> getKeys() {
        return Arrays.<UniqueKey<MessageRecord>>asList(Keys.KEY_MESSAGE_PRIMARY);
    }

    @Override
    public Message as(String alias) {
        return new Message(DSL.name(alias), this);
    }

    @Override
    public Message as(Name alias) {
        return new Message(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(String name) {
        return new Message(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(Name name) {
        return new Message(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LocalDate, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
