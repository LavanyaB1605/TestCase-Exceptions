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

/*    @Test
    public void firstNameValidation_WithNumeric_ShouldFail() {
        try {
            userValidation.firstNameValidation("1234");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }*/
/*    @Test
    public void lastNameValidation_WithSplChar_ShouldFail() {
        try {
            userValidation.lastNameValidation("Lava!");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }*/

    @Test
    public void lastNameValidation_WithNumeric_ShouldFail() {
        try {
            userValidation.lastNameValidation("1234");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void EmailValidation_WithoutDomain_ShouldFail() {
        try {
            userValidation.emailValidation("abc.com");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void phoneNumberValidation_WhenShort_ShouldFail() {
        try {
            userValidation.phoneNumberValidation("98765");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void phoneNumberValidation_WithoutCountryCode_ShouldFail() {
        try {
            userValidation.phoneNumberValidation("9087654321");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void passwordValidation_WithoutUpperCase_ShouldFail() {
        try {
            userValidation.passwordValidation("lavnaya16@97");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void passwordValidation_WithoutNumeric_ShouldFail() {
        try {
            userValidation.passwordValidation("lavnaya007");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

}