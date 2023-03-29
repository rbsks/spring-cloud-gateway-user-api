package com.example.userapi.users.entity;

import com.example.userapi.users.dto.UserDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    public static Users createUser(UserDto.Request userDto) {
        return Users.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .build();
    }
}
