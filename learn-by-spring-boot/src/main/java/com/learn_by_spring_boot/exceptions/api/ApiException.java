package com.learn_by_spring_boot.exceptions.api;

import org.springframework.web.client.RestClientException;

public class ApiException extends RestClientException {
    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
