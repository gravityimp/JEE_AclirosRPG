package com.example.mrpg.converters;

import com.example.mrpg.model.UserDao;
import com.example.mrpg.model.UserDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    UserDao mapUserDtoToDao(UserDto user);
    UserDto mapUserDaoToDto(UserDao user);
}
