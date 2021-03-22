/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables;


import com.artemvoronov.SmsApp.generated.information_schema.InformationSchema;
import com.artemvoronov.SmsApp.generated.information_schema.tables.records.PartitionsRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Partitions extends TableImpl<PartitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.PARTITIONS</code>
     */
    public static final Partitions PARTITIONS = new Partitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PartitionsRecord> getRecordType() {
        return PartitionsRecord.class;
    }

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
     */
    public final TableField<PartitionsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
     */
    public final TableField<PartitionsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_NAME = createField(DSL.name("PARTITION_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> SUBPARTITION_NAME = createField(DSL.name("SUBPARTITION_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
     */
    public final TableField<PartitionsRecord, UInteger> PARTITION_ORDINAL_POSITION = createField(DSL.name("PARTITION_ORDINAL_POSITION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
     */
    public final TableField<PartitionsRecord, UInteger> SUBPARTITION_ORDINAL_POSITION = createField(DSL.name("SUBPARTITION_ORDINAL_POSITION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_METHOD = createField(DSL.name("PARTITION_METHOD"), SQLDataType.VARCHAR(13), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
     */
    public final TableField<PartitionsRecord, String> SUBPARTITION_METHOD = createField(DSL.name("SUBPARTITION_METHOD"), SQLDataType.VARCHAR(13), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_EXPRESSION = createField(DSL.name("PARTITION_EXPRESSION"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
     */
    public final TableField<PartitionsRecord, String> SUBPARTITION_EXPRESSION = createField(DSL.name("SUBPARTITION_EXPRESSION"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_DESCRIPTION = createField(DSL.name("PARTITION_DESCRIPTION"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
     */
    public final TableField<PartitionsRecord, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.DATA_FREE</code>.
     */
    public final TableField<PartitionsRecord, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.CREATE_TIME</code>.
     */
    public final TableField<PartitionsRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
     */
    public final TableField<PartitionsRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.CHECK_TIME</code>.
     */
    public final TableField<PartitionsRecord, LocalDateTime> CHECK_TIME = createField(DSL.name("CHECK_TIME"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.CHECKSUM</code>.
     */
    public final TableField<PartitionsRecord, Long> CHECKSUM = createField(DSL.name("CHECKSUM"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_COMMENT = createField(DSL.name("PARTITION_COMMENT"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.NODEGROUP</code>.
     */
    public final TableField<PartitionsRecord, String> NODEGROUP = createField(DSL.name("NODEGROUP"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), SQLDataType.VARCHAR(268), this, "");

    private Partitions(Name alias, Table<PartitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Partitions(Name alias, Table<PartitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.PARTITIONS</code> table reference
     */
    public Partitions(String alias) {
        this(DSL.name(alias), PARTITIONS);
    }

    /**
     * Create an aliased <code>information_schema.PARTITIONS</code> table reference
     */
    public Partitions(Name alias) {
        this(alias, PARTITIONS);
    }

    /**
     * Create a <code>information_schema.PARTITIONS</code> table reference
     */
    public Partitions() {
        this(DSL.name("PARTITIONS"), null);
    }

    public <O extends Record> Partitions(Table<O> child, ForeignKey<O, PartitionsRecord> key) {
        super(child, key, PARTITIONS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Partitions as(String alias) {
        return new Partitions(DSL.name(alias), this);
    }

    @Override
    public Partitions as(Name alias) {
        return new Partitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Partitions rename(String name) {
        return new Partitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Partitions rename(Name name) {
        return new Partitions(name, null);
    }
}