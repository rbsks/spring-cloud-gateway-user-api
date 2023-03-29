package com.example.userapi.users.dto;

import com.example.userapi.users.entity.Users;
import lombok.*;

public class UserDto {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Request {
        private String name;
        private String email;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class InternalResponse {
        private String name;
        private String email;

        public static UserDto.InternalResponse createUserResponse(Users users) {
            return InternalResponse.builder()
                    .name(users.getName())
                    .email(users.getEmail())
                    .build();
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private InternalResponse result;
    }
}
