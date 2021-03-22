/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables;


import com.artemvoronov.SmsApp.generated.information_schema.InformationSchema;
import com.artemvoronov.SmsApp.generated.information_schema.tables.records.InnodbColumnsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbColumns extends TableImpl<InnodbColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_COLUMNS</code>
     */
    public static final InnodbColumns INNODB_COLUMNS = new InnodbColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbColumnsRecord> getRecordType() {
        return InnodbColumnsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_COLUMNS.TABLE_ID</code>.
     */
    public final TableField<InnodbColumnsRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.NAME</code>.
     */
    public final TableField<InnodbColumnsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.POS</code>.
     */
    public final TableField<InnodbColumnsRecord, ULong> POS = createField(DSL.name("POS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.MTYPE</code>.
     */
    public final TableField<InnodbColumnsRecord, Integer> MTYPE = createField(DSL.name("MTYPE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.PRTYPE</code>.
     */
    public final TableField<InnodbColumnsRecord, Integer> PRTYPE = createField(DSL.name("PRTYPE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.LEN</code>.
     */
    public final TableField<InnodbColumnsRecord, Integer> LEN = createField(DSL.name("LEN"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.HAS_DEFAULT</code>.
     */
    public final TableField<InnodbColumnsRecord, Integer> HAS_DEFAULT = createField(DSL.name("HAS_DEFAULT"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_COLUMNS.DEFAULT_VALUE</code>.
     */
    public final TableField<InnodbColumnsRecord, String> DEFAULT_VALUE = createField(DSL.name("DEFAULT_VALUE"), SQLDataType.CLOB.defaultValue(DSL.inline("", SQLDataType.CLOB)), this, "");

    private InnodbColumns(Name alias, Table<InnodbColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbColumns(Name alias, Table<InnodbColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_COLUMNS</code> table reference
     */
    public InnodbColumns(String alias) {
        this(DSL.name(alias), INNODB_COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_COLUMNS</code> table reference
     */
    public InnodbColumns(Name alias) {
        this(alias, INNODB_COLUMNS);
    }

    /**
     * Create a <code>information_schema.INNODB_COLUMNS</code> table reference
     */
    public InnodbColumns() {
        this(DSL.name("INNODB_COLUMNS"), null);
    }

    public <O extends Record> InnodbColumns(Table<O> child, ForeignKey<O, InnodbColumnsRecord> key) {
        super(child, key, INNODB_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbColumns as(String alias) {
        return new InnodbColumns(DSL.name(alias), this);
    }

    @Override
    public InnodbColumns as(Name alias) {
        return new InnodbColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbColumns rename(String name) {
        return new InnodbColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbColumns rename(Name name) {
        return new InnodbColumns(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, ULong, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
