package com.example.userapi.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * ServiceError
 *
 * @author Ahn Seong-jin
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum ServiceError {
    // HTTP 오류
    OK(HttpStatus.OK, "20000", "Success"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "40000", HttpStatus.BAD_REQUEST.getReasonPhrase()),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "40001", HttpStatus.UNAUTHORIZED.getReasonPhrase()),
    FORBIDDEN(HttpStatus.FORBIDDEN, "40003", HttpStatus.FORBIDDEN.getReasonPhrase()),
    NOT_FOUND(HttpStatus.NOT_FOUND,"40004", HttpStatus.NOT_FOUND.getReasonPhrase()),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED,"40005", HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase()),
    NOT_ACCEPTABLE(HttpStatus.NOT_ACCEPTABLE, "40006", HttpStatus.NOT_ACCEPTABLE.getReasonPhrase()),
    UNSUPPORTED_MEDIA_TYPE(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "40015", HttpStatus.UNSUPPORTED_MEDIA_TYPE.getReasonPhrase()),
    SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE, "50003", HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase());


    private HttpStatus status;
    private String code;
    private String message;
}
