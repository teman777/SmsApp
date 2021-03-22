/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.performance_schema.tables.records;


import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationConnectionConfigurationAutoPosition;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationConnectionConfigurationGetPublicKey;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationConnectionConfigurationSourceConnectionAutoFailover;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationConnectionConfigurationSslAllowed;
import com.artemvoronov.SmsApp.generated.performance_schema.enums.ReplicationConnectionConfigurationSslVerifyServerCertificate;
import com.artemvoronov.SmsApp.generated.performance_schema.tables.ReplicationConnectionConfiguration;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationConnectionConfigurationRecord extends UpdatableRecordImpl<ReplicationConnectionConfigurationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.HOST</code>.
     */
    public void setHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.HOST</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.PORT</code>.
     */
    public void setPort(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.PORT</code>.
     */
    public Integer getPort() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.USER</code>.
     */
    public void setUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.USER</code>.
     */
    public String getUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.NETWORK_INTERFACE</code>.
     */
    public void setNetworkInterface(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.NETWORK_INTERFACE</code>.
     */
    public String getNetworkInterface() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.AUTO_POSITION</code>.
     */
    public void setAutoPosition(ReplicationConnectionConfigurationAutoPosition value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.AUTO_POSITION</code>.
     */
    public ReplicationConnectionConfigurationAutoPosition getAutoPosition() {
        return (ReplicationConnectionConfigurationAutoPosition) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_ALLOWED</code>.
     */
    public void setSslAllowed(ReplicationConnectionConfigurationSslAllowed value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_ALLOWED</code>.
     */
    public ReplicationConnectionConfigurationSslAllowed getSslAllowed() {
        return (ReplicationConnectionConfigurationSslAllowed) get(6);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CA_FILE</code>.
     */
    public void setSslCaFile(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CA_FILE</code>.
     */
    public String getSslCaFile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CA_PATH</code>.
     */
    public void setSslCaPath(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CA_PATH</code>.
     */
    public String getSslCaPath() {
        return (String) get(8);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CERTIFICATE</code>.
     */
    public void setSslCertificate(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CERTIFICATE</code>.
     */
    public String getSslCertificate() {
        return (String) get(9);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CIPHER</code>.
     */
    public void setSslCipher(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CIPHER</code>.
     */
    public String getSslCipher() {
        return (String) get(10);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_KEY</code>.
     */
    public void setSslKey(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_KEY</code>.
     */
    public String getSslKey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE</code>.
     */
    public void setSslVerifyServerCertificate(ReplicationConnectionConfigurationSslVerifyServerCertificate value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE</code>.
     */
    public ReplicationConnectionConfigurationSslVerifyServerCertificate getSslVerifyServerCertificate() {
        return (ReplicationConnectionConfigurationSslVerifyServerCertificate) get(12);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CRL_FILE</code>.
     */
    public void setSslCrlFile(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CRL_FILE</code>.
     */
    public String getSslCrlFile() {
        return (String) get(13);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CRL_PATH</code>.
     */
    public void setSslCrlPath(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CRL_PATH</code>.
     */
    public String getSslCrlPath() {
        return (String) get(14);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_INTERVAL</code>.
     */
    public void setConnectionRetryInterval(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_INTERVAL</code>.
     */
    public Integer getConnectionRetryInterval() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_COUNT</code>.
     */
    public void setConnectionRetryCount(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_COUNT</code>.
     */
    public ULong getConnectionRetryCount() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.HEARTBEAT_INTERVAL</code>. Number of seconds after which a heartbeat will be sent .
     */
    public void setHeartbeatInterval(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.HEARTBEAT_INTERVAL</code>. Number of seconds after which a heartbeat will be sent .
     */
    public Double getHeartbeatInterval() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.TLS_VERSION</code>.
     */
    public void setTlsVersion(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.TLS_VERSION</code>.
     */
    public String getTlsVersion() {
        return (String) get(18);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.PUBLIC_KEY_PATH</code>.
     */
    public void setPublicKeyPath(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.PUBLIC_KEY_PATH</code>.
     */
    public String getPublicKeyPath() {
        return (String) get(19);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.GET_PUBLIC_KEY</code>.
     */
    public void setGetPublicKey(ReplicationConnectionConfigurationGetPublicKey value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.GET_PUBLIC_KEY</code>.
     */
    public ReplicationConnectionConfigurationGetPublicKey getGetPublicKey() {
        return (ReplicationConnectionConfigurationGetPublicKey) get(20);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.NETWORK_NAMESPACE</code>.
     */
    public void setNetworkNamespace(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.NETWORK_NAMESPACE</code>.
     */
    public String getNetworkNamespace() {
        return (String) get(21);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.COMPRESSION_ALGORITHM</code>. Compression algorithm used for data transfer between master and slave.
     */
    public void setCompressionAlgorithm(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.COMPRESSION_ALGORITHM</code>. Compression algorithm used for data transfer between master and slave.
     */
    public String getCompressionAlgorithm() {
        return (String) get(22);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.ZSTD_COMPRESSION_LEVEL</code>. Compression level associated with zstd compression algorithm.
     */
    public void setZstdCompressionLevel(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.ZSTD_COMPRESSION_LEVEL</code>. Compression level associated with zstd compression algorithm.
     */
    public Integer getZstdCompressionLevel() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.TLS_CIPHERSUITES</code>.
     */
    public void setTlsCiphersuites(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.TLS_CIPHERSUITES</code>.
     */
    public String getTlsCiphersuites() {
        return (String) get(24);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SOURCE_CONNECTION_AUTO_FAILOVER</code>.
     */
    public void setSourceConnectionAutoFailover(ReplicationConnectionConfigurationSourceConnectionAutoFailover value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SOURCE_CONNECTION_AUTO_FAILOVER</code>.
     */
    public ReplicationConnectionConfigurationSourceConnectionAutoFailover getSourceConnectionAutoFailover() {
        return (ReplicationConnectionConfigurationSourceConnectionAutoFailover) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationConnectionConfigurationRecord
     */
    public ReplicationConnectionConfigurationRecord() {
        super(ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION);
    }

    /**
     * Create a detached, initialised ReplicationConnectionConfigurationRecord
     */
    public ReplicationConnectionConfigurationRecord(String channelName, String host, Integer port, String user, String networkInterface, ReplicationConnectionConfigurationAutoPosition autoPosition, ReplicationConnectionConfigurationSslAllowed sslAllowed, String sslCaFile, String sslCaPath, String sslCertificate, String sslCipher, String sslKey, ReplicationConnectionConfigurationSslVerifyServerCertificate sslVerifyServerCertificate, String sslCrlFile, String sslCrlPath, Integer connectionRetryInterval, ULong connectionRetryCount, Double heartbeatInterval, String tlsVersion, String publicKeyPath, ReplicationConnectionConfigurationGetPublicKey getPublicKey, String networkNamespace, String compressionAlgorithm, Integer zstdCompressionLevel, String tlsCiphersuites, ReplicationConnectionConfigurationSourceConnectionAutoFailover sourceConnectionAutoFailover) {
        super(ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION);

        setChannelName(channelName);
        setHost(host);
        setPort(port);
        setUser(user);
        setNetworkInterface(networkInterface);
        setAutoPosition(autoPosition);
        setSslAllowed(sslAllowed);
        setSslCaFile(sslCaFile);
        setSslCaPath(sslCaPath);
        setSslCertificate(sslCertificate);
        setSslCipher(sslCipher);
        setSslKey(sslKey);
        setSslVerifyServerCertificate(sslVerifyServerCertificate);
        setSslCrlFile(sslCrlFile);
        setSslCrlPath(sslCrlPath);
        setConnectionRetryInterval(connectionRetryInterval);
        setConnectionRetryCount(connectionRetryCount);
        setHeartbeatInterval(heartbeatInterval);
        setTlsVersion(tlsVersion);
        setPublicKeyPath(publicKeyPath);
        setGetPublicKey(getPublicKey);
        setNetworkNamespace(networkNamespace);
        setCompressionAlgorithm(compressionAlgorithm);
        setZstdCompressionLevel(zstdCompressionLevel);
        setTlsCiphersuites(tlsCiphersuites);
        setSourceConnectionAutoFailover(sourceConnectionAutoFailover);
    }
}
