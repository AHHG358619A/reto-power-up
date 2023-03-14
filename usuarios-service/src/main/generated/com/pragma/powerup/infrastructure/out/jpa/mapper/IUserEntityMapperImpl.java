package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.UserModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T16:29:59-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IUserEntityMapperImpl implements IUserEntityMapper {

    @Override
    public UserEntity toEntity(UserModel user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setRole( userModelToRoleEntity( user ) );
        userEntity.setId( user.getId() );
        userEntity.setName( user.getName() );
        userEntity.setLastName( user.getLastName() );
        userEntity.setIdentityDocument( user.getIdentityDocument() );
        userEntity.setCellPhone( user.getCellPhone() );
        userEntity.setEmail( user.getEmail() );
        userEntity.setPassword( user.getPassword() );

        return userEntity;
    }

    @Override
    public UserModel toUserModel(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setRol( userEntityRoleId( userEntity ) );
        userModel.setId( userEntity.getId() );
        userModel.setName( userEntity.getName() );
        userModel.setLastName( userEntity.getLastName() );
        userModel.setIdentityDocument( userEntity.getIdentityDocument() );
        userModel.setCellPhone( userEntity.getCellPhone() );
        userModel.setEmail( userEntity.getEmail() );
        userModel.setPassword( userEntity.getPassword() );

        return userModel;
    }

    @Override
    public List<UserModel> toUserModelList(List<UserEntity> userEntityList) {
        if ( userEntityList == null ) {
            return null;
        }

        List<UserModel> list = new ArrayList<UserModel>( userEntityList.size() );
        for ( UserEntity userEntity : userEntityList ) {
            list.add( toUserModel( userEntity ) );
        }

        return list;
    }

    protected RoleEntity userModelToRoleEntity(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setId( userModel.getRol() );

        return roleEntity;
    }

    private Long userEntityRoleId(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }
        RoleEntity role = userEntity.getRole();
        if ( role == null ) {
            return null;
        }
        Long id = role.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
