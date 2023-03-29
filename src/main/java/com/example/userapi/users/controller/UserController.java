package com.example.userapi.users.controller;

import com.example.userapi.common.dto.ApiResDto;
import com.example.userapi.users.dto.UserDto;
import com.example.userapi.users.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity addUser(@RequestBody UserDto.Request userDto) {
        userService.addUser(userDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ApiResDto<UserDto.Response> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
