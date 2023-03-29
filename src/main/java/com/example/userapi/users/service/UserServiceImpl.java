package com.example.userapi.users.service;

import com.example.userapi.common.dto.ApiResDto;
import com.example.userapi.common.exception.ServiceError;
import com.example.userapi.common.exception.ServiceException;
import com.example.userapi.users.dto.UserDto;
import com.example.userapi.users.entity.Users;
import com.example.userapi.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void addUser(UserDto.Request userDto) {
        userRepository.save(Users.createUser(userDto));
    }

    @Override
    public ApiResDto<UserDto.Response> getUser(Long id) {
        Users user = userRepository.findById(id).orElseThrow(() -> new ServiceException(ServiceError.BAD_REQUEST));
        return ApiResDto.<UserDto.Response>builder()
                .body(UserDto.Response.builder()
                        .result(UserDto.InternalResponse.createUserResponse(user))
                        .build()
                )
                .build();
    }
}
