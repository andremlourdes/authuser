package com.ead.authuser.validation;

import jakarta.validation.ConstraintValidator;

public class UsernameConstraintImpl implements ConstraintValidator<Usernameconstraint, String> {
    @Override
    public void initialize(Usernameconstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, jakarta.validation.ConstraintValidatorContext constraintValidatorContext) {
        if(username == null || username.trim().isEmpty() || username.contains(" ")){
            return false;
        }
        return true;
    }

}
