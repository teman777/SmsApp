/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum X$processlistTrxAutocommit implements EnumType {

    YES("YES"),

    NO("NO");

    private final String literal;

    private X$processlistTrxAutocommit(String literal) {
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
        return "x$processlist_trx_autocommit";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
