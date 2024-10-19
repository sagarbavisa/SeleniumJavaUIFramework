package com.tmb.exceptions;

public class PropertyFileUsageException extends FrameworkExceptions{
    public PropertyFileUsageException(String message) {
        super(message);
    }

    public PropertyFileUsageException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
