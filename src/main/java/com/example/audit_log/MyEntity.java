package com.example.audit_log;

import jakarta.persistence.*;

@Entity
@EntityListeners(AuditLogListener.class)
public class MyEntity implements Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private AuditLog auditLog;

    // Getters and Setters
    @Override
    public AuditLog getAuditLog() {
        return auditLog;
    }

    @Override
    public void setAuditLog(AuditLog auditLog) {
        this.auditLog = auditLog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
