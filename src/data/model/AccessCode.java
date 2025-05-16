package data.model;

import java.time.LocalDateTime;

public class AccessCode {
    private String code;
    private LocalDateTime timeCodeIsIssued;
    private LocalDateTime codeExpiredTime;
    private boolean isTheCodeStillActive;
    private AccessType accessType;

    public AccessCode(String code, LocalDateTime timeCodeIsIssued, LocalDateTime codeExpiredTime, boolean isTheStillActive, AccessType accessType) {
        this.code = code;
        this.timeCodeIsIssued = timeCodeIsIssued;
        this.codeExpiredTime = codeExpiredTime;
        this.isTheCodeStillActive = isTheStillActive && LocalDateTime.now().isBefore(codeExpiredTime);
        this.accessType = accessType;
    }
    public void setAccesscode( String newCode) {
        this.code = newCode;
    }
    @Override
    public String toString() {
        return "" + code;
    }


    public boolean isExpired() {
        return LocalDateTime.now().isAfter(codeExpiredTime);
    }

    public void deactivateCode() {
        this.isTheCodeStillActive = false;
    }

    public boolean isActive() {
        return this.isTheCodeStillActive;
    }

    public LocalDateTime getTimeIssued() {
        return timeCodeIsIssued;
    }

    public LocalDateTime getExpiredTime() {
        return codeExpiredTime;
    }
    public AccessType getAccessType() {
        return accessType;
    }
    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }
}
