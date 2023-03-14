package com.pragma.powerup.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private Long id;

    private String name;

    private String lastName;

    private String identityDocument;

    private String cellPhone;

    private String email;

    private String password;

    private Long rol;
}
