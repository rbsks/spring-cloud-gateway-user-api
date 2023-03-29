package com.example.userapi.common.exception;

import com.example.userapi.common.dto.ApiResDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ApiResDto> handleException(ServiceException ex) {
        ApiResDto<?> response = ApiResDto.createApiResDto(ex.getServiceError());
        return new ResponseEntity<>(response, response.getStatus());
    }
}
