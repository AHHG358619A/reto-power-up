package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.domain.model.ObjectModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-13T17:41:37-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class IObjectRequestMapperImpl implements IObjectRequestMapper {

    @Override
    public ObjectModel toObject(ObjectRequestDto objectRequestDto) {
        if ( objectRequestDto == null ) {
            return null;
        }

        ObjectModel objectModel = new ObjectModel();

        objectModel.setName( objectRequestDto.getName() );

        return objectModel;
    }
}
