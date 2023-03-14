package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.UserRequestDto;
import com.pragma.powerup.domain.model.UserModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T12:02:26-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IUserRequestMapperImpl implements IUserRequestMapper {

    @Override
    public UserModel toUser(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setName( userRequestDto.getName() );
        userModel.setLastName( userRequestDto.getLastName() );
        userModel.setDescription( userRequestDto.getDescription() );
        userModel.setCellPhone( userRequestDto.getCellPhone() );
        userModel.setEmail( userRequestDto.getEmail() );
        userModel.setPassword( userRequestDto.getPassword() );

        return userModel;
    }
}
