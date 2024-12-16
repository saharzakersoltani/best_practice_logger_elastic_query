package com.example.audit_log;


import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

// 1. Create embeddable class in order to save the audit log details.

@Embeddable
public class AuditLog {
    private String createdBy; //Who created the record
    private LocalDateTime createdAt;  //When it was created
    private String updatedBy;  //Who updated the record
    private LocalDateTime updatedAt;  //When it was updated

    //Getters and Setters
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
