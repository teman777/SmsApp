/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables;


import com.artemvoronov.SmsApp.generated.mysql.Keys;
import com.artemvoronov.SmsApp.generated.mysql.Mysql;
import com.artemvoronov.SmsApp.generated.mysql.tables.records.DefaultRolesRecord;

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
 * Default roles
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultRoles extends TableImpl<DefaultRolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.default_roles</code>
     */
    public static final DefaultRoles DEFAULT_ROLES = new DefaultRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DefaultRolesRecord> getRecordType() {
        return DefaultRolesRecord.class;
    }

    /**
     * The column <code>mysql.default_roles.HOST</code>.
     */
    public final TableField<DefaultRolesRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.default_roles.USER</code>.
     */
    public final TableField<DefaultRolesRecord, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.default_roles.DEFAULT_ROLE_HOST</code>.
     */
    public final TableField<DefaultRolesRecord, String> DEFAULT_ROLE_HOST = createField(DSL.name("DEFAULT_ROLE_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("%", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.default_roles.DEFAULT_ROLE_USER</code>.
     */
    public final TableField<DefaultRolesRecord, String> DEFAULT_ROLE_USER = createField(DSL.name("DEFAULT_ROLE_USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    private DefaultRoles(Name alias, Table<DefaultRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DefaultRoles(Name alias, Table<DefaultRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Default roles"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.default_roles</code> table reference
     */
    public DefaultRoles(String alias) {
        this(DSL.name(alias), DEFAULT_ROLES);
    }

    /**
     * Create an aliased <code>mysql.default_roles</code> table reference
     */
    public DefaultRoles(Name alias) {
        this(alias, DEFAULT_ROLES);
    }

    /**
     * Create a <code>mysql.default_roles</code> table reference
     */
    public DefaultRoles() {
        this(DSL.name("default_roles"), null);
    }

    public <O extends Record> DefaultRoles(Table<O> child, ForeignKey<O, DefaultRolesRecord> key) {
        super(child, key, DEFAULT_ROLES);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<DefaultRolesRecord> getPrimaryKey() {
        return Keys.KEY_DEFAULT_ROLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<DefaultRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<DefaultRolesRecord>>asList(Keys.KEY_DEFAULT_ROLES_PRIMARY);
    }

    @Override
    public DefaultRoles as(String alias) {
        return new DefaultRoles(DSL.name(alias), this);
    }

    @Override
    public DefaultRoles as(Name alias) {
        return new DefaultRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultRoles rename(String name) {
        return new DefaultRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultRoles rename(Name name) {
        return new DefaultRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}