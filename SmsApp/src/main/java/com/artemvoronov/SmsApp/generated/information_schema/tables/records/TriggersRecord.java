/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.information_schema.tables.records;


import com.artemvoronov.SmsApp.generated.information_schema.enums.TriggersActionTiming;
import com.artemvoronov.SmsApp.generated.information_schema.enums.TriggersEventManipulation;
import com.artemvoronov.SmsApp.generated.information_schema.tables.Triggers;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TriggersRecord extends TableRecordImpl<TriggersRecord> implements Record22<String, String, String, TriggersEventManipulation, String, String, String, UInteger, byte[], String, String, TriggersActionTiming, byte[], byte[], String, String, LocalDateTime, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
     */
    public void setTriggerCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
     */
    public String getTriggerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
     */
    public void setTriggerSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
     */
    public String getTriggerSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
     */
    public void setTriggerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
     */
    public String getTriggerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
     */
    public void setEventManipulation(TriggersEventManipulation value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
     */
    public TriggersEventManipulation getEventManipulation() {
        return (TriggersEventManipulation) get(3);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
     */
    public void setEventObjectCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
     */
    public String getEventObjectCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
     */
    public void setEventObjectSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
     */
    public String getEventObjectSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
     */
    public void setEventObjectTable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
     */
    public String getEventObjectTable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
     */
    public void setActionOrder(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
     */
    public UInteger getActionOrder() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
     */
    public void setActionCondition(byte[] value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
     */
    public byte[] getActionCondition() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
     */
    public void setActionStatement(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
     */
    public String getActionStatement() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
     */
    public void setActionOrientation(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
     */
    public String getActionOrientation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
     */
    public void setActionTiming(TriggersActionTiming value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
     */
    public TriggersActionTiming getActionTiming() {
        return (TriggersActionTiming) get(11);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
     */
    public void setActionReferenceOldTable(byte[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
     */
    public byte[] getActionReferenceOldTable() {
        return (byte[]) get(12);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
     */
    public void setActionReferenceNewTable(byte[] value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
     */
    public byte[] getActionReferenceNewTable() {
        return (byte[]) get(13);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
     */
    public void setActionReferenceOldRow(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
     */
    public String getActionReferenceOldRow() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
     */
    public void setActionReferenceNewRow(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
     */
    public String getActionReferenceNewRow() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.CREATED</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.CREATED</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
     */
    public void setSqlMode(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.DEFINER</code>.
     */
    public void setDefiner(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
     */
    public void setCharacterSetClient(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
     */
    public void setCollationConnection(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
     */
    public void setDatabaseCollation(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, TriggersEventManipulation, String, String, String, UInteger, byte[], String, String, TriggersActionTiming, byte[], byte[], String, String, LocalDateTime, String, String, String, String, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, TriggersEventManipulation, String, String, String, UInteger, byte[], String, String, TriggersActionTiming, byte[], byte[], String, String, LocalDateTime, String, String, String, String, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Triggers.TRIGGERS.TRIGGER_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Triggers.TRIGGERS.TRIGGER_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Triggers.TRIGGERS.TRIGGER_NAME;
    }

    @Override
    public Field<TriggersEventManipulation> field4() {
        return Triggers.TRIGGERS.EVENT_MANIPULATION;
    }

    @Override
    public Field<String> field5() {
        return Triggers.TRIGGERS.EVENT_OBJECT_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return Triggers.TRIGGERS.EVENT_OBJECT_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return Triggers.TRIGGERS.EVENT_OBJECT_TABLE;
    }

    @Override
    public Field<UInteger> field8() {
        return Triggers.TRIGGERS.ACTION_ORDER;
    }

    @Override
    public Field<byte[]> field9() {
        return Triggers.TRIGGERS.ACTION_CONDITION;
    }

    @Override
    public Field<String> field10() {
        return Triggers.TRIGGERS.ACTION_STATEMENT;
    }

    @Override
    public Field<String> field11() {
        return Triggers.TRIGGERS.ACTION_ORIENTATION;
    }

    @Override
    public Field<TriggersActionTiming> field12() {
        return Triggers.TRIGGERS.ACTION_TIMING;
    }

    @Override
    public Field<byte[]> field13() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_TABLE;
    }

    @Override
    public Field<byte[]> field14() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_TABLE;
    }

    @Override
    public Field<String> field15() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_ROW;
    }

    @Override
    public Field<String> field16() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_ROW;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return Triggers.TRIGGERS.CREATED;
    }

    @Override
    public Field<String> field18() {
        return Triggers.TRIGGERS.SQL_MODE;
    }

    @Override
    public Field<String> field19() {
        return Triggers.TRIGGERS.DEFINER;
    }

    @Override
    public Field<String> field20() {
        return Triggers.TRIGGERS.CHARACTER_SET_CLIENT;
    }

    @Override
    public Field<String> field21() {
        return Triggers.TRIGGERS.COLLATION_CONNECTION;
    }

    @Override
    public Field<String> field22() {
        return Triggers.TRIGGERS.DATABASE_COLLATION;
    }

    @Override
    public String component1() {
        return getTriggerCatalog();
    }

    @Override
    public String component2() {
        return getTriggerSchema();
    }

    @Override
    public String component3() {
        return getTriggerName();
    }

    @Override
    public TriggersEventManipulation component4() {
        return getEventManipulation();
    }

    @Override
    public String component5() {
        return getEventObjectCatalog();
    }

    @Override
    public String component6() {
        return getEventObjectSchema();
    }

    @Override
    public String component7() {
        return getEventObjectTable();
    }

    @Override
    public UInteger component8() {
        return getActionOrder();
    }

    @Override
    public byte[] component9() {
        return getActionCondition();
    }

    @Override
    public String component10() {
        return getActionStatement();
    }

    @Override
    public String component11() {
        return getActionOrientation();
    }

    @Override
    public TriggersActionTiming component12() {
        return getActionTiming();
    }

    @Override
    public byte[] component13() {
        return getActionReferenceOldTable();
    }

    @Override
    public byte[] component14() {
        return getActionReferenceNewTable();
    }

    @Override
    public String component15() {
        return getActionReferenceOldRow();
    }

    @Override
    public String component16() {
        return getActionReferenceNewRow();
    }

    @Override
    public LocalDateTime component17() {
        return getCreated();
    }

    @Override
    public String component18() {
        return getSqlMode();
    }

    @Override
    public String component19() {
        return getDefiner();
    }

    @Override
    public String component20() {
        return getCharacterSetClient();
    }

    @Override
    public String component21() {
        return getCollationConnection();
    }

    @Override
    public String component22() {
        return getDatabaseCollation();
    }

    @Override
    public String value1() {
        return getTriggerCatalog();
    }

    @Override
    public String value2() {
        return getTriggerSchema();
    }

    @Override
    public String value3() {
        return getTriggerName();
    }

    @Override
    public TriggersEventManipulation value4() {
        return getEventManipulation();
    }

    @Override
    public String value5() {
        return getEventObjectCatalog();
    }

    @Override
    public String value6() {
        return getEventObjectSchema();
    }

    @Override
    public String value7() {
        return getEventObjectTable();
    }

    @Override
    public UInteger value8() {
        return getActionOrder();
    }

    @Override
    public byte[] value9() {
        return getActionCondition();
    }

    @Override
    public String value10() {
        return getActionStatement();
    }

    @Override
    public String value11() {
        return getActionOrientation();
    }

    @Override
    public TriggersActionTiming value12() {
        return getActionTiming();
    }

    @Override
    public byte[] value13() {
        return getActionReferenceOldTable();
    }

    @Override
    public byte[] value14() {
        return getActionReferenceNewTable();
    }

    @Override
    public String value15() {
        return getActionReferenceOldRow();
    }

    @Override
    public String value16() {
        return getActionReferenceNewRow();
    }

    @Override
    public LocalDateTime value17() {
        return getCreated();
    }

    @Override
    public String value18() {
        return getSqlMode();
    }

    @Override
    public String value19() {
        return getDefiner();
    }

    @Override
    public String value20() {
        return getCharacterSetClient();
    }

    @Override
    public String value21() {
        return getCollationConnection();
    }

    @Override
    public String value22() {
        return getDatabaseCollation();
    }

    @Override
    public TriggersRecord value1(String value) {
        setTriggerCatalog(value);
        return this;
    }

    @Override
    public TriggersRecord value2(String value) {
        setTriggerSchema(value);
        return this;
    }

    @Override
    public TriggersRecord value3(String value) {
        setTriggerName(value);
        return this;
    }

    @Override
    public TriggersRecord value4(TriggersEventManipulation value) {
        setEventManipulation(value);
        return this;
    }

    @Override
    public TriggersRecord value5(String value) {
        setEventObjectCatalog(value);
        return this;
    }

    @Override
    public TriggersRecord value6(String value) {
        setEventObjectSchema(value);
        return this;
    }

    @Override
    public TriggersRecord value7(String value) {
        setEventObjectTable(value);
        return this;
    }

    @Override
    public TriggersRecord value8(UInteger value) {
        setActionOrder(value);
        return this;
    }

    @Override
    public TriggersRecord value9(byte[] value) {
        setActionCondition(value);
        return this;
    }

    @Override
    public TriggersRecord value10(String value) {
        setActionStatement(value);
        return this;
    }

    @Override
    public TriggersRecord value11(String value) {
        setActionOrientation(value);
        return this;
    }

    @Override
    public TriggersRecord value12(TriggersActionTiming value) {
        setActionTiming(value);
        return this;
    }

    @Override
    public TriggersRecord value13(byte[] value) {
        setActionReferenceOldTable(value);
        return this;
    }

    @Override
    public TriggersRecord value14(byte[] value) {
        setActionReferenceNewTable(value);
        return this;
    }

    @Override
    public TriggersRecord value15(String value) {
        setActionReferenceOldRow(value);
        return this;
    }

    @Override
    public TriggersRecord value16(String value) {
        setActionReferenceNewRow(value);
        return this;
    }

    @Override
    public TriggersRecord value17(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TriggersRecord value18(String value) {
        setSqlMode(value);
        return this;
    }

    @Override
    public TriggersRecord value19(String value) {
        setDefiner(value);
        return this;
    }

    @Override
    public TriggersRecord value20(String value) {
        setCharacterSetClient(value);
        return this;
    }

    @Override
    public TriggersRecord value21(String value) {
        setCollationConnection(value);
        return this;
    }

    @Override
    public TriggersRecord value22(String value) {
        setDatabaseCollation(value);
        return this;
    }

    @Override
    public TriggersRecord values(String value1, String value2, String value3, TriggersEventManipulation value4, String value5, String value6, String value7, UInteger value8, byte[] value9, String value10, String value11, TriggersActionTiming value12, byte[] value13, byte[] value14, String value15, String value16, LocalDateTime value17, String value18, String value19, String value20, String value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TriggersRecord
     */
    public TriggersRecord() {
        super(Triggers.TRIGGERS);
    }

    /**
     * Create a detached, initialised TriggersRecord
     */
    public TriggersRecord(String triggerCatalog, String triggerSchema, String triggerName, TriggersEventManipulation eventManipulation, String eventObjectCatalog, String eventObjectSchema, String eventObjectTable, UInteger actionOrder, byte[] actionCondition, String actionStatement, String actionOrientation, TriggersActionTiming actionTiming, byte[] actionReferenceOldTable, byte[] actionReferenceNewTable, String actionReferenceOldRow, String actionReferenceNewRow, LocalDateTime created, String sqlMode, String definer, String characterSetClient, String collationConnection, String databaseCollation) {
        super(Triggers.TRIGGERS);

        setTriggerCatalog(triggerCatalog);
        setTriggerSchema(triggerSchema);
        setTriggerName(triggerName);
        setEventManipulation(eventManipulation);
        setEventObjectCatalog(eventObjectCatalog);
        setEventObjectSchema(eventObjectSchema);
        setEventObjectTable(eventObjectTable);
        setActionOrder(actionOrder);
        setActionCondition(actionCondition);
        setActionStatement(actionStatement);
        setActionOrientation(actionOrientation);
        setActionTiming(actionTiming);
        setActionReferenceOldTable(actionReferenceOldTable);
        setActionReferenceNewTable(actionReferenceNewTable);
        setActionReferenceOldRow(actionReferenceOldRow);
        setActionReferenceNewRow(actionReferenceNewRow);
        setCreated(created);
        setSqlMode(sqlMode);
        setDefiner(definer);
        setCharacterSetClient(characterSetClient);
        setCollationConnection(collationConnection);
        setDatabaseCollation(databaseCollation);
    }
}
