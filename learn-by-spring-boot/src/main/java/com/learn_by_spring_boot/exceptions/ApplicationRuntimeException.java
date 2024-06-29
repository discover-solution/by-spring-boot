package com.learn_by_spring_boot.exceptions;

public class ApplicationRuntimeException extends RuntimeException{
    public ApplicationRuntimeException(String message){
        super(message);
    }

    public ApplicationRuntimeException(Throwable cause){
        super(cause);//String message, Throwable cause
    }

    public ApplicationRuntimeException(String message, Throwable cause){
        super(message, cause);
    }
}
