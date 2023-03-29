package com.example.userapi.common.dto;

import com.example.userapi.common.exception.ServiceError;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.*;
import org.springframework.http.HttpStatus;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ApiResDto<T> {

    @Builder.Default
    private HttpStatus status = HttpStatus.OK;

    @Builder.Default
    private String code = ServiceError.OK.getCode();

    @Builder.Default
    private String message = ServiceError.OK.getMessage();

    @JsonUnwrapped
    @JsonInclude(value= NON_NULL)
    private T body;

    /**
     * create ServiceError
     * @param serviceError ServiceError
     * @return ApiResDto - 공통 응답 객체
     */
    public static ApiResDto createApiResDto(ServiceError serviceError) {
        return ApiResDto.builder()
                .status(serviceError.getStatus())
                .code(serviceError.getCode())
                .message(serviceError.getMessage())
                .build();
    }
}
