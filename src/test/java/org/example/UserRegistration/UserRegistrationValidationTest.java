package org.example.UserRegistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationValidationTest {
    UserRegistrationValidation userValidation = new UserRegistrationValidation();
    @Test
    public void firstNameValidation_WithSplChar_ShouldFail() {
        try {
            userValidation.firstNameValidation("Lava!");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void firstNameValidation_WithNumeric_ShouldFail() {
        try {
            userValidation.firstNameValidation("1234");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

}