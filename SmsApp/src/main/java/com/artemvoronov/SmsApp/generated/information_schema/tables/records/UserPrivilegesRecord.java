/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables.records;


import com.artemvoronov.SmsApp.generated.information_schema.tables.UserPrivileges;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPrivilegesRecord extends TableRecordImpl<UserPrivilegesRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserPrivileges.USER_PRIVILEGES.GRANTEE;
    }

    @Override
    public Field<String> field2() {
        return UserPrivileges.USER_PRIVILEGES.TABLE_CATALOG;
    }

    @Override
    public Field<String> field3() {
        return UserPrivileges.USER_PRIVILEGES.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field4() {
        return UserPrivileges.USER_PRIVILEGES.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantee();
    }

    @Override
    public String component2() {
        return getTableCatalog();
    }

    @Override
    public String component3() {
        return getPrivilegeType();
    }

    @Override
    public String component4() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantee();
    }

    @Override
    public String value2() {
        return getTableCatalog();
    }

    @Override
    public String value3() {
        return getPrivilegeType();
    }

    @Override
    public String value4() {
        return getIsGrantable();
    }

    @Override
    public UserPrivilegesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public UserPrivilegesRecord value2(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public UserPrivilegesRecord value3(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public UserPrivilegesRecord value4(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public UserPrivilegesRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPrivilegesRecord
     */
    public UserPrivilegesRecord() {
        super(UserPrivileges.USER_PRIVILEGES);
    }

    /**
     * Create a detached, initialised UserPrivilegesRecord
     */
    public UserPrivilegesRecord(String grantee, String tableCatalog, String privilegeType, String isGrantable) {
        super(UserPrivileges.USER_PRIVILEGES);

        setGrantee(grantee);
        setTableCatalog(tableCatalog);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
    }
}
