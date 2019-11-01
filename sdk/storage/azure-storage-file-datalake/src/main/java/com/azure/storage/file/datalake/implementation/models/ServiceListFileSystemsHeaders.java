// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Defines headers for ListFileSystems operation.
 */
@Fluent
public final class ServiceListFileSystemsHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * If the number of filesystems to be listed exceeds the maxResults limit,
     * a continuation token is returned in this response header.  When a
     * continuation token is returned in the response, it must be specified in
     * a subsequent invocation of the list operation to continue listing the
     * filesystems.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String continuation;

    /*
     * The content type of list filesystem response. The default content type
     * is application/json.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the ServiceListFileSystemsHeaders object itself.
     */
    public ServiceListFileSystemsHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the ServiceListFileSystemsHeaders object itself.
     */
    public ServiceListFileSystemsHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the ServiceListFileSystemsHeaders object itself.
     */
    public ServiceListFileSystemsHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the continuation property: If the number of filesystems to be listed
     * exceeds the maxResults limit, a continuation token is returned in this
     * response header.  When a continuation token is returned in the response,
     * it must be specified in a subsequent invocation of the list operation to
     * continue listing the filesystems.
     *
     * @return the continuation value.
     */
    public String getContinuation() {
        return this.continuation;
    }

    /**
     * Set the continuation property: If the number of filesystems to be listed
     * exceeds the maxResults limit, a continuation token is returned in this
     * response header.  When a continuation token is returned in the response,
     * it must be specified in a subsequent invocation of the list operation to
     * continue listing the filesystems.
     *
     * @param continuation the continuation value to set.
     * @return the ServiceListFileSystemsHeaders object itself.
     */
    public ServiceListFileSystemsHeaders setContinuation(String continuation) {
        this.continuation = continuation;
        return this;
    }

    /**
     * Get the contentType property: The content type of list filesystem
     * response. The default content type is application/json.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type of list filesystem
     * response. The default content type is application/json.
     *
     * @param contentType the contentType value to set.
     * @return the ServiceListFileSystemsHeaders object itself.
     */
    public ServiceListFileSystemsHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the ServiceListFileSystemsHeaders object itself.
     */
    public ServiceListFileSystemsHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
