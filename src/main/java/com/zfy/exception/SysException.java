package com.zfy.exception;

public class SysException extends Exception {
    private String clientMessage;

    public SysException(String message) {
        super(message);
        this.clientMessage = message;
    }

    public SysException(String message, Throwable cause) {
        super(message, cause);
        this.clientMessage = message;
    }

    public String getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(String clientMessage) {
        this.clientMessage = clientMessage;
    }
}
