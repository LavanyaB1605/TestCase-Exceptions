package org.example.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    static Scanner sc = new Scanner(System.in);
    public static boolean firstNameValidation(String first_name) throws UserRegistrationException {
        String firstNamePattern = "[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(first_name);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Entered Invalid Name");
        }
    }
    public static boolean validateLastName(String last_name) throws UserRegistrationException {
        String lastNamePattern = "[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(last_name);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Entered Invalid Name");
        }
    }
    public static boolean validateEmail(String email) throws UserRegistrationException {
        String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]{2}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Entered Invalid Email ID");
        }
    }
    public static boolean validatePhoneNumber(String phoneNumber) throws UserRegistrationException {
        String phoneNumberPattern = "^[0-9]{2}[ ]+[6-9]{1}[0-9]{9}}";
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Entered Invalid PhoneNumber");
        }
    }
    public static boolean validatePassword(String password) throws UserRegistrationException {
        String passwordPattern =  "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Entered Invalid Password");
        }
    }
    public static void main(String[] args) throws UserRegistrationException {
        System.out.println("Enter First name ");
        firstNameValidation(sc.nextLine());
        System.out.println("Enter Last name ");
        validateLastName(sc.nextLine());
        System.out.println("Enter email ");
        validateEmail(sc.nextLine());
        System.out.println("Enter phone number: ");
        validatePhoneNumber(sc.nextLine());
        System.out.println("Enter Password");
        validatePassword(sc.nextLine());
    }

}
