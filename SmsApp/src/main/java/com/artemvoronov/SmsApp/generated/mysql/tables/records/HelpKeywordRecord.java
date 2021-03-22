/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables.records;


import com.artemvoronov.SmsApp.generated.mysql.tables.HelpKeyword;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * help keywords
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpKeywordRecord extends UpdatableRecordImpl<HelpKeywordRecord> implements Record2<UInteger, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.help_keyword.help_keyword_id</code>.
     */
    public void setHelpKeywordId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.help_keyword.help_keyword_id</code>.
     */
    public UInteger getHelpKeywordId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.help_keyword.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.help_keyword.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UInteger, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UInteger, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return HelpKeyword.HELP_KEYWORD.HELP_KEYWORD_ID;
    }

    @Override
    public Field<String> field2() {
        return HelpKeyword.HELP_KEYWORD.NAME;
    }

    @Override
    public UInteger component1() {
        return getHelpKeywordId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UInteger value1() {
        return getHelpKeywordId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public HelpKeywordRecord value1(UInteger value) {
        setHelpKeywordId(value);
        return this;
    }

    @Override
    public HelpKeywordRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public HelpKeywordRecord values(UInteger value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HelpKeywordRecord
     */
    public HelpKeywordRecord() {
        super(HelpKeyword.HELP_KEYWORD);
    }

    /**
     * Create a detached, initialised HelpKeywordRecord
     */
    public HelpKeywordRecord(UInteger helpKeywordId, String name) {
        super(HelpKeyword.HELP_KEYWORD);

        setHelpKeywordId(helpKeywordId);
        setName(name);
    }
}