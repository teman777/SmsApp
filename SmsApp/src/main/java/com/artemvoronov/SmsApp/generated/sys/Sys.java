/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys;


import com.artemvoronov.SmsApp.generated.DefaultCatalog;
import com.artemvoronov.SmsApp.generated.sys.tables.HostSummary;
import com.artemvoronov.SmsApp.generated.sys.tables.HostSummaryByFileIo;
import com.artemvoronov.SmsApp.generated.sys.tables.HostSummaryByFileIoType;
import com.artemvoronov.SmsApp.generated.sys.tables.HostSummaryByStages;
import com.artemvoronov.SmsApp.generated.sys.tables.HostSummaryByStatementLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.HostSummaryByStatementType;
import com.artemvoronov.SmsApp.generated.sys.tables.InnodbBufferStatsBySchema;
import com.artemvoronov.SmsApp.generated.sys.tables.InnodbBufferStatsByTable;
import com.artemvoronov.SmsApp.generated.sys.tables.InnodbLockWaits;
import com.artemvoronov.SmsApp.generated.sys.tables.IoByThreadByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.IoGlobalByFileByBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.IoGlobalByFileByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.IoGlobalByWaitByBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.IoGlobalByWaitByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.LatestFileIo;
import com.artemvoronov.SmsApp.generated.sys.tables.MemoryByHostByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.MemoryByThreadByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.MemoryByUserByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.MemoryGlobalByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.MemoryGlobalTotal;
import com.artemvoronov.SmsApp.generated.sys.tables.Metrics;
import com.artemvoronov.SmsApp.generated.sys.tables.Processlist;
import com.artemvoronov.SmsApp.generated.sys.tables.PsCheckLostInstrumentation;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaAutoIncrementColumns;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaIndexStatistics;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaObjectOverview;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaRedundantIndexes;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaTableLockWaits;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaTableStatistics;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaTableStatisticsWithBuffer;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaTablesWithFullTableScans;
import com.artemvoronov.SmsApp.generated.sys.tables.SchemaUnusedIndexes;
import com.artemvoronov.SmsApp.generated.sys.tables.Session;
import com.artemvoronov.SmsApp.generated.sys.tables.SessionSslStatus;
import com.artemvoronov.SmsApp.generated.sys.tables.StatementAnalysis;
import com.artemvoronov.SmsApp.generated.sys.tables.StatementsWithErrorsOrWarnings;
import com.artemvoronov.SmsApp.generated.sys.tables.StatementsWithFullTableScans;
import com.artemvoronov.SmsApp.generated.sys.tables.StatementsWithRuntimesIn_95thPercentile;
import com.artemvoronov.SmsApp.generated.sys.tables.StatementsWithSorting;
import com.artemvoronov.SmsApp.generated.sys.tables.StatementsWithTempTables;
import com.artemvoronov.SmsApp.generated.sys.tables.SysConfig;
import com.artemvoronov.SmsApp.generated.sys.tables.UserSummary;
import com.artemvoronov.SmsApp.generated.sys.tables.UserSummaryByFileIo;
import com.artemvoronov.SmsApp.generated.sys.tables.UserSummaryByFileIoType;
import com.artemvoronov.SmsApp.generated.sys.tables.UserSummaryByStages;
import com.artemvoronov.SmsApp.generated.sys.tables.UserSummaryByStatementLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.UserSummaryByStatementType;
import com.artemvoronov.SmsApp.generated.sys.tables.Version;
import com.artemvoronov.SmsApp.generated.sys.tables.WaitClassesGlobalByAvgLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.WaitClassesGlobalByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.WaitsByHostByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.WaitsByUserByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.WaitsGlobalByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummary;
import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummaryByFileIo;
import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummaryByFileIoType;
import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummaryByStages;
import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummaryByStatementLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$hostSummaryByStatementType;
import com.artemvoronov.SmsApp.generated.sys.tables.X$innodbBufferStatsBySchema;
import com.artemvoronov.SmsApp.generated.sys.tables.X$innodbBufferStatsByTable;
import com.artemvoronov.SmsApp.generated.sys.tables.X$innodbLockWaits;
import com.artemvoronov.SmsApp.generated.sys.tables.X$ioByThreadByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$ioGlobalByFileByBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.X$ioGlobalByFileByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$ioGlobalByWaitByBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.X$ioGlobalByWaitByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$latestFileIo;
import com.artemvoronov.SmsApp.generated.sys.tables.X$memoryByHostByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.X$memoryByThreadByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.X$memoryByUserByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.X$memoryGlobalByCurrentBytes;
import com.artemvoronov.SmsApp.generated.sys.tables.X$memoryGlobalTotal;
import com.artemvoronov.SmsApp.generated.sys.tables.X$processlist;
import com.artemvoronov.SmsApp.generated.sys.tables.X$psDigestAvgLatencyDistribution;
import com.artemvoronov.SmsApp.generated.sys.tables.X$psDigest_95thPercentileByAvgUs;
import com.artemvoronov.SmsApp.generated.sys.tables.X$psSchemaTableStatisticsIo;
import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaFlattenedKeys;
import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaIndexStatistics;
import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaTableLockWaits;
import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaTableStatistics;
import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaTableStatisticsWithBuffer;
import com.artemvoronov.SmsApp.generated.sys.tables.X$schemaTablesWithFullTableScans;
import com.artemvoronov.SmsApp.generated.sys.tables.X$session;
import com.artemvoronov.SmsApp.generated.sys.tables.X$statementAnalysis;
import com.artemvoronov.SmsApp.generated.sys.tables.X$statementsWithErrorsOrWarnings;
import com.artemvoronov.SmsApp.generated.sys.tables.X$statementsWithFullTableScans;
import com.artemvoronov.SmsApp.generated.sys.tables.X$statementsWithRuntimesIn_95thPercentile;
import com.artemvoronov.SmsApp.generated.sys.tables.X$statementsWithSorting;
import com.artemvoronov.SmsApp.generated.sys.tables.X$statementsWithTempTables;
import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummary;
import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByFileIo;
import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByFileIoType;
import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByStages;
import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByStatementLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$userSummaryByStatementType;
import com.artemvoronov.SmsApp.generated.sys.tables.X$waitClassesGlobalByAvgLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$waitClassesGlobalByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$waitsByHostByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$waitsByUserByLatency;
import com.artemvoronov.SmsApp.generated.sys.tables.X$waitsGlobalByLatency;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sys extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys</code>
     */
    public static final Sys SYS = new Sys();

    /**
     * VIEW
     */
    public final HostSummary HOST_SUMMARY = HostSummary.HOST_SUMMARY;

    /**
     * VIEW
     */
    public final HostSummaryByFileIo HOST_SUMMARY_BY_FILE_IO = HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public final HostSummaryByFileIoType HOST_SUMMARY_BY_FILE_IO_TYPE = HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public final HostSummaryByStages HOST_SUMMARY_BY_STAGES = HostSummaryByStages.HOST_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public final HostSummaryByStatementLatency HOST_SUMMARY_BY_STATEMENT_LATENCY = HostSummaryByStatementLatency.HOST_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public final HostSummaryByStatementType HOST_SUMMARY_BY_STATEMENT_TYPE = HostSummaryByStatementType.HOST_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public final InnodbBufferStatsBySchema INNODB_BUFFER_STATS_BY_SCHEMA = InnodbBufferStatsBySchema.INNODB_BUFFER_STATS_BY_SCHEMA;

    /**
     * VIEW
     */
    public final InnodbBufferStatsByTable INNODB_BUFFER_STATS_BY_TABLE = InnodbBufferStatsByTable.INNODB_BUFFER_STATS_BY_TABLE;

    /**
     * VIEW
     */
    public final InnodbLockWaits INNODB_LOCK_WAITS = InnodbLockWaits.INNODB_LOCK_WAITS;

    /**
     * VIEW
     */
    public final IoByThreadByLatency IO_BY_THREAD_BY_LATENCY = IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY;

    /**
     * VIEW
     */
    public final IoGlobalByFileByBytes IO_GLOBAL_BY_FILE_BY_BYTES = IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES;

    /**
     * VIEW
     */
    public final IoGlobalByFileByLatency IO_GLOBAL_BY_FILE_BY_LATENCY = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY;

    /**
     * VIEW
     */
    public final IoGlobalByWaitByBytes IO_GLOBAL_BY_WAIT_BY_BYTES = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES;

    /**
     * VIEW
     */
    public final IoGlobalByWaitByLatency IO_GLOBAL_BY_WAIT_BY_LATENCY = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY;

    /**
     * VIEW
     */
    public final LatestFileIo LATEST_FILE_IO = LatestFileIo.LATEST_FILE_IO;

    /**
     * VIEW
     */
    public final MemoryByHostByCurrentBytes MEMORY_BY_HOST_BY_CURRENT_BYTES = MemoryByHostByCurrentBytes.MEMORY_BY_HOST_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final MemoryByThreadByCurrentBytes MEMORY_BY_THREAD_BY_CURRENT_BYTES = MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final MemoryByUserByCurrentBytes MEMORY_BY_USER_BY_CURRENT_BYTES = MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final MemoryGlobalByCurrentBytes MEMORY_GLOBAL_BY_CURRENT_BYTES = MemoryGlobalByCurrentBytes.MEMORY_GLOBAL_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final MemoryGlobalTotal MEMORY_GLOBAL_TOTAL = MemoryGlobalTotal.MEMORY_GLOBAL_TOTAL;

    /**
     * VIEW
     */
    public final Metrics METRICS = Metrics.METRICS;

    /**
     * VIEW
     */
    public final Processlist PROCESSLIST = Processlist.PROCESSLIST;

    /**
     * VIEW
     */
    public final PsCheckLostInstrumentation PS_CHECK_LOST_INSTRUMENTATION = PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION;

    /**
     * VIEW
     */
    public final SchemaAutoIncrementColumns SCHEMA_AUTO_INCREMENT_COLUMNS = SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS;

    /**
     * VIEW
     */
    public final SchemaIndexStatistics SCHEMA_INDEX_STATISTICS = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS;

    /**
     * VIEW
     */
    public final SchemaObjectOverview SCHEMA_OBJECT_OVERVIEW = SchemaObjectOverview.SCHEMA_OBJECT_OVERVIEW;

    /**
     * VIEW
     */
    public final SchemaRedundantIndexes SCHEMA_REDUNDANT_INDEXES = SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES;

    /**
     * VIEW
     */
    public final SchemaTableLockWaits SCHEMA_TABLE_LOCK_WAITS = SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS;

    /**
     * VIEW
     */
    public final SchemaTableStatistics SCHEMA_TABLE_STATISTICS = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS;

    /**
     * VIEW
     */
    public final SchemaTableStatisticsWithBuffer SCHEMA_TABLE_STATISTICS_WITH_BUFFER = SchemaTableStatisticsWithBuffer.SCHEMA_TABLE_STATISTICS_WITH_BUFFER;

    /**
     * VIEW
     */
    public final SchemaTablesWithFullTableScans SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public final SchemaUnusedIndexes SCHEMA_UNUSED_INDEXES = SchemaUnusedIndexes.SCHEMA_UNUSED_INDEXES;

    /**
     * VIEW
     */
    public final Session SESSION = Session.SESSION;

    /**
     * VIEW
     */
    public final SessionSslStatus SESSION_SSL_STATUS = SessionSslStatus.SESSION_SSL_STATUS;

    /**
     * VIEW
     */
    public final StatementAnalysis STATEMENT_ANALYSIS = StatementAnalysis.STATEMENT_ANALYSIS;

    /**
     * VIEW
     */
    public final StatementsWithErrorsOrWarnings STATEMENTS_WITH_ERRORS_OR_WARNINGS = StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS;

    /**
     * VIEW
     */
    public final StatementsWithFullTableScans STATEMENTS_WITH_FULL_TABLE_SCANS = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public final StatementsWithRuntimesIn_95thPercentile STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE;

    /**
     * VIEW
     */
    public final StatementsWithSorting STATEMENTS_WITH_SORTING = StatementsWithSorting.STATEMENTS_WITH_SORTING;

    /**
     * VIEW
     */
    public final StatementsWithTempTables STATEMENTS_WITH_TEMP_TABLES = StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES;

    /**
     * The table <code>sys.sys_config</code>.
     */
    public final SysConfig SYS_CONFIG = SysConfig.SYS_CONFIG;

    /**
     * VIEW
     */
    public final UserSummary USER_SUMMARY = UserSummary.USER_SUMMARY;

    /**
     * VIEW
     */
    public final UserSummaryByFileIo USER_SUMMARY_BY_FILE_IO = UserSummaryByFileIo.USER_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public final UserSummaryByFileIoType USER_SUMMARY_BY_FILE_IO_TYPE = UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public final UserSummaryByStages USER_SUMMARY_BY_STAGES = UserSummaryByStages.USER_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public final UserSummaryByStatementLatency USER_SUMMARY_BY_STATEMENT_LATENCY = UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public final UserSummaryByStatementType USER_SUMMARY_BY_STATEMENT_TYPE = UserSummaryByStatementType.USER_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public final Version VERSION = Version.VERSION;

    /**
     * VIEW
     */
    public final WaitClassesGlobalByAvgLatency WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY;

    /**
     * VIEW
     */
    public final WaitClassesGlobalByLatency WAIT_CLASSES_GLOBAL_BY_LATENCY = WaitClassesGlobalByLatency.WAIT_CLASSES_GLOBAL_BY_LATENCY;

    /**
     * VIEW
     */
    public final WaitsByHostByLatency WAITS_BY_HOST_BY_LATENCY = WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY;

    /**
     * VIEW
     */
    public final WaitsByUserByLatency WAITS_BY_USER_BY_LATENCY = WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY;

    /**
     * VIEW
     */
    public final WaitsGlobalByLatency WAITS_GLOBAL_BY_LATENCY = WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$hostSummary X$HOST_SUMMARY = X$hostSummary.X$HOST_SUMMARY;

    /**
     * VIEW
     */
    public final X$hostSummaryByFileIo X$HOST_SUMMARY_BY_FILE_IO = X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public final X$hostSummaryByFileIoType X$HOST_SUMMARY_BY_FILE_IO_TYPE = X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public final X$hostSummaryByStages X$HOST_SUMMARY_BY_STAGES = X$hostSummaryByStages.X$HOST_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public final X$hostSummaryByStatementLatency X$HOST_SUMMARY_BY_STATEMENT_LATENCY = X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public final X$hostSummaryByStatementType X$HOST_SUMMARY_BY_STATEMENT_TYPE = X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public final X$innodbBufferStatsBySchema X$INNODB_BUFFER_STATS_BY_SCHEMA = X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA;

    /**
     * VIEW
     */
    public final X$innodbBufferStatsByTable X$INNODB_BUFFER_STATS_BY_TABLE = X$innodbBufferStatsByTable.X$INNODB_BUFFER_STATS_BY_TABLE;

    /**
     * VIEW
     */
    public final X$innodbLockWaits X$INNODB_LOCK_WAITS = X$innodbLockWaits.X$INNODB_LOCK_WAITS;

    /**
     * VIEW
     */
    public final X$ioByThreadByLatency X$IO_BY_THREAD_BY_LATENCY = X$ioByThreadByLatency.X$IO_BY_THREAD_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$ioGlobalByFileByBytes X$IO_GLOBAL_BY_FILE_BY_BYTES = X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES;

    /**
     * VIEW
     */
    public final X$ioGlobalByFileByLatency X$IO_GLOBAL_BY_FILE_BY_LATENCY = X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$ioGlobalByWaitByBytes X$IO_GLOBAL_BY_WAIT_BY_BYTES = X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES;

    /**
     * VIEW
     */
    public final X$ioGlobalByWaitByLatency X$IO_GLOBAL_BY_WAIT_BY_LATENCY = X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$latestFileIo X$LATEST_FILE_IO = X$latestFileIo.X$LATEST_FILE_IO;

    /**
     * VIEW
     */
    public final X$memoryByHostByCurrentBytes X$MEMORY_BY_HOST_BY_CURRENT_BYTES = X$memoryByHostByCurrentBytes.X$MEMORY_BY_HOST_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final X$memoryByThreadByCurrentBytes X$MEMORY_BY_THREAD_BY_CURRENT_BYTES = X$memoryByThreadByCurrentBytes.X$MEMORY_BY_THREAD_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final X$memoryByUserByCurrentBytes X$MEMORY_BY_USER_BY_CURRENT_BYTES = X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final X$memoryGlobalByCurrentBytes X$MEMORY_GLOBAL_BY_CURRENT_BYTES = X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES;

    /**
     * VIEW
     */
    public final X$memoryGlobalTotal X$MEMORY_GLOBAL_TOTAL = X$memoryGlobalTotal.X$MEMORY_GLOBAL_TOTAL;

    /**
     * VIEW
     */
    public final X$processlist X$PROCESSLIST = X$processlist.X$PROCESSLIST;

    /**
     * VIEW
     */
    public final X$psDigest_95thPercentileByAvgUs X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US = X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US;

    /**
     * VIEW
     */
    public final X$psDigestAvgLatencyDistribution X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION = X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION;

    /**
     * VIEW
     */
    public final X$psSchemaTableStatisticsIo X$PS_SCHEMA_TABLE_STATISTICS_IO = X$psSchemaTableStatisticsIo.X$PS_SCHEMA_TABLE_STATISTICS_IO;

    /**
     * VIEW
     */
    public final X$schemaFlattenedKeys X$SCHEMA_FLATTENED_KEYS = X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS;

    /**
     * VIEW
     */
    public final X$schemaIndexStatistics X$SCHEMA_INDEX_STATISTICS = X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS;

    /**
     * VIEW
     */
    public final X$schemaTableLockWaits X$SCHEMA_TABLE_LOCK_WAITS = X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS;

    /**
     * VIEW
     */
    public final X$schemaTableStatistics X$SCHEMA_TABLE_STATISTICS = X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS;

    /**
     * VIEW
     */
    public final X$schemaTableStatisticsWithBuffer X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER = X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER;

    /**
     * VIEW
     */
    public final X$schemaTablesWithFullTableScans X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public final X$session X$SESSION = X$session.X$SESSION;

    /**
     * VIEW
     */
    public final X$statementAnalysis X$STATEMENT_ANALYSIS = X$statementAnalysis.X$STATEMENT_ANALYSIS;

    /**
     * VIEW
     */
    public final X$statementsWithErrorsOrWarnings X$STATEMENTS_WITH_ERRORS_OR_WARNINGS = X$statementsWithErrorsOrWarnings.X$STATEMENTS_WITH_ERRORS_OR_WARNINGS;

    /**
     * VIEW
     */
    public final X$statementsWithFullTableScans X$STATEMENTS_WITH_FULL_TABLE_SCANS = X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS;

    /**
     * VIEW
     */
    public final X$statementsWithRuntimesIn_95thPercentile X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE;

    /**
     * VIEW
     */
    public final X$statementsWithSorting X$STATEMENTS_WITH_SORTING = X$statementsWithSorting.X$STATEMENTS_WITH_SORTING;

    /**
     * VIEW
     */
    public final X$statementsWithTempTables X$STATEMENTS_WITH_TEMP_TABLES = X$statementsWithTempTables.X$STATEMENTS_WITH_TEMP_TABLES;

    /**
     * VIEW
     */
    public final X$userSummary X$USER_SUMMARY = X$userSummary.X$USER_SUMMARY;

    /**
     * VIEW
     */
    public final X$userSummaryByFileIo X$USER_SUMMARY_BY_FILE_IO = X$userSummaryByFileIo.X$USER_SUMMARY_BY_FILE_IO;

    /**
     * VIEW
     */
    public final X$userSummaryByFileIoType X$USER_SUMMARY_BY_FILE_IO_TYPE = X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE;

    /**
     * VIEW
     */
    public final X$userSummaryByStages X$USER_SUMMARY_BY_STAGES = X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES;

    /**
     * VIEW
     */
    public final X$userSummaryByStatementLatency X$USER_SUMMARY_BY_STATEMENT_LATENCY = X$userSummaryByStatementLatency.X$USER_SUMMARY_BY_STATEMENT_LATENCY;

    /**
     * VIEW
     */
    public final X$userSummaryByStatementType X$USER_SUMMARY_BY_STATEMENT_TYPE = X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE;

    /**
     * VIEW
     */
    public final X$waitClassesGlobalByAvgLatency X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = X$waitClassesGlobalByAvgLatency.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY;

    /**
     * VIEW
     */
    public final X$waitClassesGlobalByLatency X$WAIT_CLASSES_GLOBAL_BY_LATENCY = X$waitClassesGlobalByLatency.X$WAIT_CLASSES_GLOBAL_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$waitsByHostByLatency X$WAITS_BY_HOST_BY_LATENCY = X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$waitsByUserByLatency X$WAITS_BY_USER_BY_LATENCY = X$waitsByUserByLatency.X$WAITS_BY_USER_BY_LATENCY;

    /**
     * VIEW
     */
    public final X$waitsGlobalByLatency X$WAITS_GLOBAL_BY_LATENCY = X$waitsGlobalByLatency.X$WAITS_GLOBAL_BY_LATENCY;

    /**
     * No further instances allowed
     */
    private Sys() {
        super("sys", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            HostSummary.HOST_SUMMARY,
            HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO,
            HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE,
            HostSummaryByStages.HOST_SUMMARY_BY_STAGES,
            HostSummaryByStatementLatency.HOST_SUMMARY_BY_STATEMENT_LATENCY,
            HostSummaryByStatementType.HOST_SUMMARY_BY_STATEMENT_TYPE,
            InnodbBufferStatsBySchema.INNODB_BUFFER_STATS_BY_SCHEMA,
            InnodbBufferStatsByTable.INNODB_BUFFER_STATS_BY_TABLE,
            InnodbLockWaits.INNODB_LOCK_WAITS,
            IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY,
            IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES,
            IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY,
            IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES,
            IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY,
            LatestFileIo.LATEST_FILE_IO,
            MemoryByHostByCurrentBytes.MEMORY_BY_HOST_BY_CURRENT_BYTES,
            MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES,
            MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES,
            MemoryGlobalByCurrentBytes.MEMORY_GLOBAL_BY_CURRENT_BYTES,
            MemoryGlobalTotal.MEMORY_GLOBAL_TOTAL,
            Metrics.METRICS,
            Processlist.PROCESSLIST,
            PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION,
            SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS,
            SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS,
            SchemaObjectOverview.SCHEMA_OBJECT_OVERVIEW,
            SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES,
            SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS,
            SchemaTableStatistics.SCHEMA_TABLE_STATISTICS,
            SchemaTableStatisticsWithBuffer.SCHEMA_TABLE_STATISTICS_WITH_BUFFER,
            SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS,
            SchemaUnusedIndexes.SCHEMA_UNUSED_INDEXES,
            Session.SESSION,
            SessionSslStatus.SESSION_SSL_STATUS,
            StatementAnalysis.STATEMENT_ANALYSIS,
            StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS,
            StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS,
            StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE,
            StatementsWithSorting.STATEMENTS_WITH_SORTING,
            StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES,
            SysConfig.SYS_CONFIG,
            UserSummary.USER_SUMMARY,
            UserSummaryByFileIo.USER_SUMMARY_BY_FILE_IO,
            UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE,
            UserSummaryByStages.USER_SUMMARY_BY_STAGES,
            UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY,
            UserSummaryByStatementType.USER_SUMMARY_BY_STATEMENT_TYPE,
            Version.VERSION,
            WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY,
            WaitClassesGlobalByLatency.WAIT_CLASSES_GLOBAL_BY_LATENCY,
            WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY,
            WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY,
            WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY,
            X$hostSummary.X$HOST_SUMMARY,
            X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO,
            X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE,
            X$hostSummaryByStages.X$HOST_SUMMARY_BY_STAGES,
            X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY,
            X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE,
            X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA,
            X$innodbBufferStatsByTable.X$INNODB_BUFFER_STATS_BY_TABLE,
            X$innodbLockWaits.X$INNODB_LOCK_WAITS,
            X$ioByThreadByLatency.X$IO_BY_THREAD_BY_LATENCY,
            X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES,
            X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY,
            X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES,
            X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY,
            X$latestFileIo.X$LATEST_FILE_IO,
            X$memoryByHostByCurrentBytes.X$MEMORY_BY_HOST_BY_CURRENT_BYTES,
            X$memoryByThreadByCurrentBytes.X$MEMORY_BY_THREAD_BY_CURRENT_BYTES,
            X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES,
            X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES,
            X$memoryGlobalTotal.X$MEMORY_GLOBAL_TOTAL,
            X$processlist.X$PROCESSLIST,
            X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US,
            X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION,
            X$psSchemaTableStatisticsIo.X$PS_SCHEMA_TABLE_STATISTICS_IO,
            X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS,
            X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS,
            X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS,
            X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS,
            X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER,
            X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS,
            X$session.X$SESSION,
            X$statementAnalysis.X$STATEMENT_ANALYSIS,
            X$statementsWithErrorsOrWarnings.X$STATEMENTS_WITH_ERRORS_OR_WARNINGS,
            X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS,
            X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE,
            X$statementsWithSorting.X$STATEMENTS_WITH_SORTING,
            X$statementsWithTempTables.X$STATEMENTS_WITH_TEMP_TABLES,
            X$userSummary.X$USER_SUMMARY,
            X$userSummaryByFileIo.X$USER_SUMMARY_BY_FILE_IO,
            X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE,
            X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES,
            X$userSummaryByStatementLatency.X$USER_SUMMARY_BY_STATEMENT_LATENCY,
            X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE,
            X$waitClassesGlobalByAvgLatency.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY,
            X$waitClassesGlobalByLatency.X$WAIT_CLASSES_GLOBAL_BY_LATENCY,
            X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY,
            X$waitsByUserByLatency.X$WAITS_BY_USER_BY_LATENCY,
            X$waitsGlobalByLatency.X$WAITS_GLOBAL_BY_LATENCY);
    }
}