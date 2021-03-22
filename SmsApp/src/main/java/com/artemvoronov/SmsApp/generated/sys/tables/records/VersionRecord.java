/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.tables.records;


import com.artemvoronov.SmsApp.generated.sys.tables.Version;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VersionRecord extends TableRecordImpl<VersionRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sys.version.sys_version</code>.
     */
    public void setSysVersion(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.version.sys_version</code>.
     */
    public String getSysVersion() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.version.mysql_version</code>.
     */
    public void setMysqlVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.version.mysql_version</code>.
     */
    public String getMysqlVersion() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Version.VERSION.SYS_VERSION;
    }

    @Override
    public Field<String> field2() {
        return Version.VERSION.MYSQL_VERSION;
    }

    @Override
    public String component1() {
        return getSysVersion();
    }

    @Override
    public String component2() {
        return getMysqlVersion();
    }

    @Override
    public String value1() {
        return getSysVersion();
    }

    @Override
    public String value2() {
        return getMysqlVersion();
    }

    @Override
    public VersionRecord value1(String value) {
        setSysVersion(value);
        return this;
    }

    @Override
    public VersionRecord value2(String value) {
        setMysqlVersion(value);
        return this;
    }

    @Override
    public VersionRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VersionRecord
     */
    public VersionRecord() {
        super(Version.VERSION);
    }

    /**
     * Create a detached, initialised VersionRecord
     */
    public VersionRecord(String sysVersion, String mysqlVersion) {
        super(Version.VERSION);

        setSysVersion(sysVersion);
        setMysqlVersion(mysqlVersion);
    }
}
