package com.rafaelvieira.covidopenfeign.dto.mapper;

import com.rafaelvieira.covidopenfeign.dto.UserResponseDTO;
import com.rafaelvieira.covidopenfeign.entity.User;

public class UserMapper {

    public static UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setZipCode(user.getZipCode());
        dto.setAddress(user.getAddress());
        dto.setDistrict(user.getDistrict());
        dto.setCity(user.getCity());
        dto.setState(user.getState());
        dto.setCreatedAt(user.getCreatedAt());
        return dto;
    }

}
