package com.riwi.WorkShop_01.mapper;

import com.riwi.WorkShop_01.api.dto.UserDto;
import com.riwi.WorkShop_01.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

// Se de le dice que se inyecten en el contenedor de dependencias de Spring

@Mapper
public interface UserMapper {
    /*@Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "username", target = "userName"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "fullName", target = "fullName"),
        @Mapping(source = "role", target = "role")
    })
    UserDto toUserDto(User user);*/
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);

}
