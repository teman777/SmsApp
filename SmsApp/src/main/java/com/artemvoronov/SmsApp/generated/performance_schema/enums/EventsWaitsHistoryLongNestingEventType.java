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
public enum EventsWaitsHistoryLongNestingEventType implements EnumType {

    TRANSACTION("TRANSACTION"),

    STATEMENT("STATEMENT"),

    STAGE("STAGE"),

    WAIT("WAIT");

    private final String literal;

    private EventsWaitsHistoryLongNestingEventType(String literal) {
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
        return "events_waits_history_long_NESTING_EVENT_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
