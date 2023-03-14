package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.UserResponseDto;
import com.pragma.powerup.domain.model.UserModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T12:02:26-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IUserResponseMapperImpl implements IUserResponseMapper {

    @Override
    public UserResponseDto toResponse(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setId( userModel.getId() );
        userResponseDto.setName( userModel.getName() );
        userResponseDto.setLastName( userModel.getLastName() );
        userResponseDto.setDescription( userModel.getDescription() );
        userResponseDto.setCellPhone( userModel.getCellPhone() );
        userResponseDto.setEmail( userModel.getEmail() );
        userResponseDto.setPassword( userModel.getPassword() );

        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> toResponseList(List<UserModel> userModelList) {
        if ( userModelList == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( userModelList.size() );
        for ( UserModel userModel : userModelList ) {
            list.add( toResponse( userModel ) );
        }

        return list;
    }
}
