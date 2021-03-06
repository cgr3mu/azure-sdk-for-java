/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The base class for a restore request. Workload-specific restore requests are
 * derived from this class.
 */
@SkipParentValidation
public class RestoreRequestResource extends Resource {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private RestoreRequest properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Resource ID represents the complete path to the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Resource name associated with the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type represents the complete path of the form
     * Namespace/ResourceType/ResourceType/...
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public RestoreRequest properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withProperties(RestoreRequest properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get resource ID represents the complete path to the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID represents the complete path to the resource.
     *
     * @param id the id value to set
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get resource name associated with the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name associated with the resource.
     *
     * @param name the name value to set
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     *
     * @param type the type value to set
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withType(String type) {
        this.type = type;
        return this;
    }

}
