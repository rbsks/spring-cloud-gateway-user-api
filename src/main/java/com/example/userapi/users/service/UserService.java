package com.example.userapi.users.service;

import com.example.userapi.common.dto.ApiResDto;
import com.example.userapi.users.dto.UserDto;

public interface UserService {

    void addUser(UserDto.Request userDto);
    ApiResDto<UserDto.Response> getUser(Long id);
}
