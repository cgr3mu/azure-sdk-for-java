package com.microsoft.azure.services.blob;

public class DeleteContainerOptions {
    private AccessCondition accessCondition;

    public AccessCondition getAccessCondition() {
        return accessCondition;
    }

    public DeleteContainerOptions setAccessCondition(AccessCondition accessCondition) {
        this.accessCondition = accessCondition;
        return this;
    }
}
