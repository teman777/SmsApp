/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TimeZoneUseLeapSeconds implements EnumType {

    Y("Y"),

    N("N");

    private final String literal;

    private TimeZoneUseLeapSeconds(String literal) {
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
        return "time_zone_Use_leap_seconds";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}