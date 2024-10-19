package com.tmb.exceptions;

public class FrameworkExceptions extends RuntimeException{
    public FrameworkExceptions(String message)
    {
        super(message);
    }
    public FrameworkExceptions(String message,Throwable throwable)
    {
        super(message,throwable);
    }
}
