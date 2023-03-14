package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {

    private String name;

    private String lastName;

    private String identityDocument;

    private String cellPhone;

    private String email;

    private String password;
}
