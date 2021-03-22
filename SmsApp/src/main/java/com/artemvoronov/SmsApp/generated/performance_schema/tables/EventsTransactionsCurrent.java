/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables;


import com.artemvoronov.SmsApp.generated.performance_schema.Keys;
import com.artemvoronov.SmsApp.generated.performance_schema.PerformanceSchema;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentAccessMode;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentAutocommit;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentNestingEventType;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentState;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.records.EventsTransactionsCurrentRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsTransactionsCurrent extends TableImpl<EventsTransactionsCurrentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_transactions_current</code>
     */
    public static final EventsTransactionsCurrent EVENTS_TRANSACTIONS_CURRENT = new EventsTransactionsCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsCurrentRecord> getRecordType() {
        return EventsTransactionsCurrentRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_current.THREAD_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.END_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.STATE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentState> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(11).asEnumDataType(com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentState.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TRX_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TRX_ID = createField(DSL.name("TRX_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.GTID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> GTID = createField(DSL.name("GTID"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XID_FORMAT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, Integer> XID_FORMAT_ID = createField(DSL.name("XID_FORMAT_ID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XID_GTRID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> XID_GTRID = createField(DSL.name("XID_GTRID"), SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XID_BQUAL</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> XID_BQUAL = createField(DSL.name("XID_BQUAL"), SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XA_STATE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> XA_STATE = createField(DSL.name("XA_STATE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.SOURCE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TIMER_START</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TIMER_END</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.ACCESS_MODE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentAccessMode> ACCESS_MODE = createField(DSL.name("ACCESS_MODE"), SQLDataType.VARCHAR(10).asEnumDataType(com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentAccessMode.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.ISOLATION_LEVEL</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> ISOLATION_LEVEL = createField(DSL.name("ISOLATION_LEVEL"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.AUTOCOMMIT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentAutocommit> AUTOCOMMIT = createField(DSL.name("AUTOCOMMIT"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentAutocommit.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NUMBER_OF_SAVEPOINTS</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NUMBER_OF_SAVEPOINTS = createField(DSL.name("NUMBER_OF_SAVEPOINTS"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NUMBER_OF_ROLLBACK_TO_SAVEPOINT = createField(DSL.name("NUMBER_OF_ROLLBACK_TO_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NUMBER_OF_RELEASE_SAVEPOINT = createField(DSL.name("NUMBER_OF_RELEASE_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(com.artemvoronov.SmsApp.generated.performance_schema.enums.EventsTransactionsCurrentNestingEventType.class), this, "");

    private EventsTransactionsCurrent(Name alias, Table<EventsTransactionsCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsCurrent(Name alias, Table<EventsTransactionsCurrentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_current</code> table reference
     */
    public EventsTransactionsCurrent(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_CURRENT);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_current</code> table reference
     */
    public EventsTransactionsCurrent(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_CURRENT);
    }

    /**
     * Create a <code>performance_schema.events_transactions_current</code> table reference
     */
    public EventsTransactionsCurrent() {
        this(DSL.name("events_transactions_current"), null);
    }

    public <O extends Record> EventsTransactionsCurrent(Table<O> child, ForeignKey<O, EventsTransactionsCurrentRecord> key) {
        super(child, key, EVENTS_TRANSACTIONS_CURRENT);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<EventsTransactionsCurrentRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_TRANSACTIONS_CURRENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<EventsTransactionsCurrentRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsTransactionsCurrentRecord>>asList(Keys.KEY_EVENTS_TRANSACTIONS_CURRENT_PRIMARY);
    }

    @Override
    public EventsTransactionsCurrent as(String alias) {
        return new EventsTransactionsCurrent(DSL.name(alias), this);
    }

    @Override
    public EventsTransactionsCurrent as(Name alias) {
        return new EventsTransactionsCurrent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsCurrent rename(String name) {
        return new EventsTransactionsCurrent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsCurrent rename(Name name) {
        return new EventsTransactionsCurrent(name, null);
    }
}
