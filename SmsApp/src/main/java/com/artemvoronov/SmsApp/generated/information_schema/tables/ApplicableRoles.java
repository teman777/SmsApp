/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables;


import com.artemvoronov.SmsApp.generated.information_schema.InformationSchema;
import com.artemvoronov.SmsApp.generated.information_schema.tables.records.ApplicableRolesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApplicableRoles extends TableImpl<ApplicableRolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.APPLICABLE_ROLES</code>
     */
    public static final ApplicableRoles APPLICABLE_ROLES = new ApplicableRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicableRolesRecord> getRecordType() {
        return ApplicableRolesRecord.class;
    }

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.USER</code>.
     */
    public final TableField<ApplicableRolesRecord, String> USER = createField(DSL.name("USER"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.HOST</code>.
     */
    public final TableField<ApplicableRolesRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.GRANTEE</code>.
     */
    public final TableField<ApplicableRolesRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.GRANTEE_HOST</code>.
     */
    public final TableField<ApplicableRolesRecord, String> GRANTEE_HOST = createField(DSL.name("GRANTEE_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.ROLE_NAME</code>.
     */
    public final TableField<ApplicableRolesRecord, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.ROLE_HOST</code>.
     */
    public final TableField<ApplicableRolesRecord, String> ROLE_HOST = createField(DSL.name("ROLE_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.IS_GRANTABLE</code>.
     */
    public final TableField<ApplicableRolesRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.IS_DEFAULT</code>.
     */
    public final TableField<ApplicableRolesRecord, String> IS_DEFAULT = createField(DSL.name("IS_DEFAULT"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.IS_MANDATORY</code>.
     */
    public final TableField<ApplicableRolesRecord, String> IS_MANDATORY = createField(DSL.name("IS_MANDATORY"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private ApplicableRoles(Name alias, Table<ApplicableRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicableRoles(Name alias, Table<ApplicableRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.APPLICABLE_ROLES</code> table reference
     */
    public ApplicableRoles(String alias) {
        this(DSL.name(alias), APPLICABLE_ROLES);
    }

    /**
     * Create an aliased <code>information_schema.APPLICABLE_ROLES</code> table reference
     */
    public ApplicableRoles(Name alias) {
        this(alias, APPLICABLE_ROLES);
    }

    /**
     * Create a <code>information_schema.APPLICABLE_ROLES</code> table reference
     */
    public ApplicableRoles() {
        this(DSL.name("APPLICABLE_ROLES"), null);
    }

    public <O extends Record> ApplicableRoles(Table<O> child, ForeignKey<O, ApplicableRolesRecord> key) {
        super(child, key, APPLICABLE_ROLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ApplicableRoles as(String alias) {
        return new ApplicableRoles(DSL.name(alias), this);
    }

    @Override
    public ApplicableRoles as(Name alias) {
        return new ApplicableRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicableRoles rename(String name) {
        return new ApplicableRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicableRoles rename(Name name) {
        return new ApplicableRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}