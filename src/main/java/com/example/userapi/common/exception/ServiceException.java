package com.example.userapi.common.exception;


public class ServiceException extends RuntimeException {

    private final ServiceError serviceError;

    public ServiceException(ServiceError serviceError) {
        super();
        this.serviceError = serviceError;
    }

    public ServiceException(ServiceError serviceError, String message) {
        super(message);
        this.serviceError = serviceError;
    }

    public ServiceException(ServiceError serviceError, Throwable cause) {
        super(serviceError.getMessage(), cause);
        this.serviceError = serviceError;
    }

    public ServiceException(ServiceError serviceError, String message, Throwable cause) {
        super(message, cause);
        this.serviceError = serviceError;
    }

    public ServiceError getServiceError() {
        return serviceError;
    }

}
