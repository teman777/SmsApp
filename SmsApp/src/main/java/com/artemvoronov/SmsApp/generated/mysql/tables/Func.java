/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables;


import com.artemvoronov.SmsApp.generated.mysql.Keys;
import com.artemvoronov.SmsApp.generated.mysql.Mysql;
import com.artemvoronov.SmsApp.generated.mysql.enums.FuncType;
import com.artemvoronov.SmsApp.generated.mysql.tables.records.FuncRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * User defined functions
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Func extends TableImpl<FuncRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.func</code>
     */
    public static final Func FUNC = new Func();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FuncRecord> getRecordType() {
        return FuncRecord.class;
    }

    /**
     * The column <code>mysql.func.name</code>.
     */
    public final TableField<FuncRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.func.ret</code>.
     */
    public final TableField<FuncRecord, Byte> RET = createField(DSL.name("ret"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mysql.func.dl</code>.
     */
    public final TableField<FuncRecord, String> DL = createField(DSL.name("dl"), SQLDataType.CHAR(128).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.func.type</code>.
     */
    public final TableField<FuncRecord, FuncType> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(9).nullable(false).asEnumDataType(com.artemvoronov.SmsApp.generated.mysql.enums.FuncType.class), this, "");

    private Func(Name alias, Table<FuncRecord> aliased) {
        this(alias, aliased, null);
    }

    private Func(Name alias, Table<FuncRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("User defined functions"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.func</code> table reference
     */
    public Func(String alias) {
        this(DSL.name(alias), FUNC);
    }

    /**
     * Create an aliased <code>mysql.func</code> table reference
     */
    public Func(Name alias) {
        this(alias, FUNC);
    }

    /**
     * Create a <code>mysql.func</code> table reference
     */
    public Func() {
        this(DSL.name("func"), null);
    }

    public <O extends Record> Func(Table<O> child, ForeignKey<O, FuncRecord> key) {
        super(child, key, FUNC);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<FuncRecord> getPrimaryKey() {
        return Keys.KEY_FUNC_PRIMARY;
    }

    @Override
    public List<UniqueKey<FuncRecord>> getKeys() {
        return Arrays.<UniqueKey<FuncRecord>>asList(Keys.KEY_FUNC_PRIMARY);
    }

    @Override
    public Func as(String alias) {
        return new Func(DSL.name(alias), this);
    }

    @Override
    public Func as(Name alias) {
        return new Func(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Func rename(String name) {
        return new Func(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Func rename(Name name) {
        return new Func(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Byte, String, FuncType> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
