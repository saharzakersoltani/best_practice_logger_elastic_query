package com.example.audit_log;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class AuditLogListener {

    @PrePersist
    public void prePersist(Auditable auditable) {
        AuditLog auditLog = auditable.getAuditLog();
        if (auditLog == null) {
            auditLog = new AuditLog();
            auditable.setAuditLog(auditLog);
        }
        auditLog.setCreatedAt(LocalDateTime.now());
        auditLog.setCreatedBy("System");
    }

    @PreUpdate
    public void preUpdate(Auditable auditable) {
        AuditLog auditLog = auditable.getAuditLog();
        if (auditLog != null) {
            auditLog.setUpdatedAt(LocalDateTime.now());
            auditLog.setUpdatedBy("System");
        }
    }
}
