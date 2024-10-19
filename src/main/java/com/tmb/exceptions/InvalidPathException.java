package com.tmb.exceptions;

public class InvalidPathException extends FrameworkExceptions{
    public InvalidPathException(String message) {
        super(message);
    }

    public InvalidPathException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
