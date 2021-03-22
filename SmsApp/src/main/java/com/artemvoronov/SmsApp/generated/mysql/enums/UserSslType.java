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
public enum UserSslType implements EnumType {



    ANY("ANY"),

    X509("X509"),

    SPECIFIED("SPECIFIED");

    private final String literal;

    private UserSslType(String literal) {
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
        return "user_ssl_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}