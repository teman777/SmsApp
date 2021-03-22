/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.mysql;


import com.artemvoronov.SmsApp.generated.mysql.tables.Db;
import com.artemvoronov.SmsApp.generated.mysql.tables.ProcsPriv;
import com.artemvoronov.SmsApp.generated.mysql.tables.ProxiesPriv;
import com.artemvoronov.SmsApp.generated.mysql.tables.ReplicationAsynchronousConnectionFailover;
import com.artemvoronov.SmsApp.generated.mysql.tables.TablesPriv;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in mysql.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME = Internal.createIndex(DSL.name("Channel_name"), ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER, new OrderField[] { ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.CHANNEL_NAME, ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.MANAGED_NAME }, false);
    public static final Index PROCS_PRIV_GRANTOR = Internal.createIndex(DSL.name("Grantor"), ProcsPriv.PROCS_PRIV, new OrderField[] { ProcsPriv.PROCS_PRIV.GRANTOR }, false);
    public static final Index PROXIES_PRIV_GRANTOR = Internal.createIndex(DSL.name("Grantor"), ProxiesPriv.PROXIES_PRIV, new OrderField[] { ProxiesPriv.PROXIES_PRIV.GRANTOR }, false);
    public static final Index TABLES_PRIV_GRANTOR = Internal.createIndex(DSL.name("Grantor"), TablesPriv.TABLES_PRIV, new OrderField[] { TablesPriv.TABLES_PRIV.GRANTOR }, false);
    public static final Index DB_USER = Internal.createIndex(DSL.name("User"), Db.DB, new OrderField[] { Db.DB.USER }, false);
}
