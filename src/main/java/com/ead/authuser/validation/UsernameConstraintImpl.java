package com.ead.authuser.validation;

import jakarta.validation.ConstraintValidator;

public class UsernameConstraintImpl implements ConstraintValidator<UsernameConstraint, String> {
    @Override
    public void initialize(UsernameConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, jakarta.validation.ConstraintValidatorContext constraintValidatorContext) {
        if(username == null || username.trim().isEmpty() || username.contains(" ")){
            return false;
        }
        return true;
    }

}
