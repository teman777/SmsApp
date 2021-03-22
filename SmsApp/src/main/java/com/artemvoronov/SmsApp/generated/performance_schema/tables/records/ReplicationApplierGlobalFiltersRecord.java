/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationApplierGlobalFiltersConfiguredBy;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.ReplicationApplierGlobalFilters;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierGlobalFiltersRecord extends TableRecordImpl<ReplicationApplierGlobalFiltersRecord> implements Record4<String, String, ReplicationApplierGlobalFiltersConfiguredBy, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.FILTER_NAME</code>.
     */
    public void setFilterName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.FILTER_NAME</code>.
     */
    public String getFilterName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.FILTER_RULE</code>.
     */
    public void setFilterRule(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.FILTER_RULE</code>.
     */
    public String getFilterRule() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.CONFIGURED_BY</code>.
     */
    public void setConfiguredBy(ReplicationApplierGlobalFiltersConfiguredBy value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.CONFIGURED_BY</code>.
     */
    public ReplicationApplierGlobalFiltersConfiguredBy getConfiguredBy() {
        return (ReplicationApplierGlobalFiltersConfiguredBy) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.ACTIVE_SINCE</code>.
     */
    public void setActiveSince(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.ACTIVE_SINCE</code>.
     */
    public LocalDateTime getActiveSince() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, ReplicationApplierGlobalFiltersConfiguredBy, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, ReplicationApplierGlobalFiltersConfiguredBy, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.FILTER_NAME;
    }

    @Override
    public Field<String> field2() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.FILTER_RULE;
    }

    @Override
    public Field<ReplicationApplierGlobalFiltersConfiguredBy> field3() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.CONFIGURED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.ACTIVE_SINCE;
    }

    @Override
    public String component1() {
        return getFilterName();
    }

    @Override
    public String component2() {
        return getFilterRule();
    }

    @Override
    public ReplicationApplierGlobalFiltersConfiguredBy component3() {
        return getConfiguredBy();
    }

    @Override
    public LocalDateTime component4() {
        return getActiveSince();
    }

    @Override
    public String value1() {
        return getFilterName();
    }

    @Override
    public String value2() {
        return getFilterRule();
    }

    @Override
    public ReplicationApplierGlobalFiltersConfiguredBy value3() {
        return getConfiguredBy();
    }

    @Override
    public LocalDateTime value4() {
        return getActiveSince();
    }

    @Override
    public ReplicationApplierGlobalFiltersRecord value1(String value) {
        setFilterName(value);
        return this;
    }

    @Override
    public ReplicationApplierGlobalFiltersRecord value2(String value) {
        setFilterRule(value);
        return this;
    }

    @Override
    public ReplicationApplierGlobalFiltersRecord value3(ReplicationApplierGlobalFiltersConfiguredBy value) {
        setConfiguredBy(value);
        return this;
    }

    @Override
    public ReplicationApplierGlobalFiltersRecord value4(LocalDateTime value) {
        setActiveSince(value);
        return this;
    }

    @Override
    public ReplicationApplierGlobalFiltersRecord values(String value1, String value2, ReplicationApplierGlobalFiltersConfiguredBy value3, LocalDateTime value4) {
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
     * Create a detached ReplicationApplierGlobalFiltersRecord
     */
    public ReplicationApplierGlobalFiltersRecord() {
        super(ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS);
    }

    /**
     * Create a detached, initialised ReplicationApplierGlobalFiltersRecord
     */
    public ReplicationApplierGlobalFiltersRecord(String filterName, String filterRule, ReplicationApplierGlobalFiltersConfiguredBy configuredBy, LocalDateTime activeSince) {
        super(ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS);

        setFilterName(filterName);
        setFilterRule(filterRule);
        setConfiguredBy(configuredBy);
        setActiveSince(activeSince);
    }
}