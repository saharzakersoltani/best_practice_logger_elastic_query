package com.example.audit_log;

public interface Auditable {

    // 2. Define an interface to ensure entities needing audit logs implement required methods.

    AuditLog getAuditLog(); // You must know how to get audit details!
    void setAuditLog(AuditLog auditLog); //You must know how to set audit details!

}
