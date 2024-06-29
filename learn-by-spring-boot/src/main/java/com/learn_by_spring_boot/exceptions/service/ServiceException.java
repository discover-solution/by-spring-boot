package com.learn_by_spring_boot.exceptions.service;

import javax.naming.ServiceUnavailableException;

public class ServiceException extends ServiceUnavailableException {
    public ServiceException(String message){
        super(message);
    }
}
