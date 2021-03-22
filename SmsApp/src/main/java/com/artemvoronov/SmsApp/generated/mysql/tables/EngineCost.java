/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql.tables;


import com.artemvoronov.SmsApp.generated.mysql.Keys;
import com.artemvoronov.SmsApp.generated.mysql.Mysql;
import com.artemvoronov.SmsApp.generated.mysql.tables.records.EngineCostRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EngineCost extends TableImpl<EngineCostRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.engine_cost</code>
     */
    public static final EngineCost ENGINE_COST = new EngineCost();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EngineCostRecord> getRecordType() {
        return EngineCostRecord.class;
    }

    /**
     * The column <code>mysql.engine_cost.engine_name</code>.
     */
    public final TableField<EngineCostRecord, String> ENGINE_NAME = createField(DSL.name("engine_name"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.engine_cost.device_type</code>.
     */
    public final TableField<EngineCostRecord, Integer> DEVICE_TYPE = createField(DSL.name("device_type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mysql.engine_cost.cost_name</code>.
     */
    public final TableField<EngineCostRecord, String> COST_NAME = createField(DSL.name("cost_name"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.engine_cost.cost_value</code>.
     */
    public final TableField<EngineCostRecord, Double> COST_VALUE = createField(DSL.name("cost_value"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>mysql.engine_cost.last_update</code>.
     */
    public final TableField<EngineCostRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.engine_cost.comment</code>.
     */
    public final TableField<EngineCostRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>mysql.engine_cost.default_value</code>.
     */
    public final TableField<EngineCostRecord, Double> DEFAULT_VALUE = createField(DSL.name("default_value"), SQLDataType.FLOAT, this, "");

    private EngineCost(Name alias, Table<EngineCostRecord> aliased) {
        this(alias, aliased, null);
    }

    private EngineCost(Name alias, Table<EngineCostRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.engine_cost</code> table reference
     */
    public EngineCost(String alias) {
        this(DSL.name(alias), ENGINE_COST);
    }

    /**
     * Create an aliased <code>mysql.engine_cost</code> table reference
     */
    public EngineCost(Name alias) {
        this(alias, ENGINE_COST);
    }

    /**
     * Create a <code>mysql.engine_cost</code> table reference
     */
    public EngineCost() {
        this(DSL.name("engine_cost"), null);
    }

    public <O extends Record> EngineCost(Table<O> child, ForeignKey<O, EngineCostRecord> key) {
        super(child, key, ENGINE_COST);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<EngineCostRecord> getPrimaryKey() {
        return Keys.KEY_ENGINE_COST_PRIMARY;
    }

    @Override
    public List<UniqueKey<EngineCostRecord>> getKeys() {
        return Arrays.<UniqueKey<EngineCostRecord>>asList(Keys.KEY_ENGINE_COST_PRIMARY);
    }

    @Override
    public EngineCost as(String alias) {
        return new EngineCost(DSL.name(alias), this);
    }

    @Override
    public EngineCost as(Name alias) {
        return new EngineCost(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EngineCost rename(String name) {
        return new EngineCost(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EngineCost rename(Name name) {
        return new EngineCost(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, String, Double, LocalDateTime, String, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}