package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IUserServicePort;
import com.pragma.powerup.domain.exception.DomainException;
import com.pragma.powerup.domain.model.UserModel;
import com.pragma.powerup.domain.spi.IUserPersistencePort;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(UserModel userModel) {
        validateFields(userModel);
        userPersistencePort.saveUser(userModel);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    private void validateFields(UserModel userModel) {
        if (userModel.getName() == null || userModel.getName().isEmpty()) {
            throw new DomainException("El campo Nombre es obligatorio");
        } else if (userModel.getLastName() == null || userModel.getLastName().isEmpty()) {
            throw new DomainException("El campo Apellido es obligatorio");
        } else if (userModel.getIdentityDocument() == null || userModel.getIdentityDocument().isEmpty()) {
            throw new DomainException("El campo Documento de identidad es obligatorio");
        } else if (userModel.getCellPhone() == null || userModel.getCellPhone().isEmpty()) {
            throw new DomainException("El campo Celular es obligatorio");
        } else if (userModel.getEmail() == null || userModel.getEmail().isEmpty()) {
            throw new DomainException("El campo Correo es obligatorio");
        } else if (userModel.getPassword() == null || userModel.getPassword().isEmpty()) {
            throw new DomainException("El campo Clave es obligatorio");
        }

        validateMail(userModel.getEmail());
        validateCellPhone(userModel.getCellPhone());
        validateIdentityDocument(userModel.getIdentityDocument());
    }

    private void validateMail(String email) {
        String regXMail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        if (!validateRegX(regXMail, email)) {
            throw new DomainException("El formato del correo es incorrecto");
        }
    }

    private void validateCellPhone(String cellPhone) {
        String regXCellPhone = "^\\+?(\\d{1,12})$";
        if (!validateRegX(regXCellPhone, cellPhone)) {
            throw new DomainException("El formato del celular es incorrecto");
        }
    }

    private void validateIdentityDocument(String identityDocument) {
        String regXIdentityDocument = "^\\d*$";
        if (!validateRegX(regXIdentityDocument, identityDocument)) {
            throw new DomainException("El formato del documento de identidad es incorrecto");
        }
    }

    private boolean validateRegX(String regx, String value) {
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

}
