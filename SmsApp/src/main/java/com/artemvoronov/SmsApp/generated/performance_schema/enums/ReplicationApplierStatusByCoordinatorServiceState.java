/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReplicationApplierStatusByCoordinatorServiceState implements EnumType {

    ON("ON"),

    OFF("OFF");

    private final String literal;

    private ReplicationApplierStatusByCoordinatorServiceState(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "replication_applier_status_by_coordinator_SERVICE_STATE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
