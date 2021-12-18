package com.rafaelvieira.covidopenfeign.controller;


import com.rafaelvieira.covidopenfeign.dto.UserResponseDTO;
import com.rafaelvieira.covidopenfeign.dto.mapper.UserMapper;
import com.rafaelvieira.covidopenfeign.entity.User;
import com.rafaelvieira.covidopenfeign.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping
    public List<UserResponseDTO> getUsersWithConvidInfo() {
        return this.userService.findAllWithCovidInfo();
    }

    @GetMapping("/{id}/covid")
    public UserResponseDTO getUserWithConvidInfo(@PathVariable String id) {
        return this.userService.findByIdWithCovidInfo(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO create(@RequestBody User user) {
        return UserMapper.toDTO(this.userService.create(user));
    }

}
