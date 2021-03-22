/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TriggersEventManipulation implements EnumType {

    INSERT("INSERT"),

    UPDATE("UPDATE"),

    DELETE("DELETE");

    private final String literal;

    private TriggersEventManipulation(String literal) {
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
        return "TRIGGERS_EVENT_MANIPULATION";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}