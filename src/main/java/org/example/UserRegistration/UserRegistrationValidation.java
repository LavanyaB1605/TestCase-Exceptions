package org.example.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    static Scanner sc = new Scanner(System.in);
    public static void firstNameValidation() {
        System.out.println("Enter First name ");
        String first_name = sc.nextLine();
        String firstNamePattern = "[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(first_name);
        if (matcher.matches()) {
            System.out.println("Entered Name is Valid");
        } else {
            System.out.println("Entered Name is Invalid");
        }
    }
    public static void validateLastName() {
        System.out.println("Enter Last name ");
        String last_name = sc.nextLine();
        String lastNamePattern = "[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(last_name);
        if (matcher.matches()) {
            System.out.println("Entered Name is Valid");
        } else {
            System.out.println("Entered Name is Invalid");
        }
    }
    public static void validateEmail () {
        System.out.println("Enter email ");
        String email = sc.nextLine();
        String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]{2}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Entered ID is Valid");
        } else {
            System.out.println("Entered ID is Invalid");
        }
    }
    public static void validatePhoneNumber() {
        System.out.println("Enter user mobile number: ");
        String phoneNumber = sc.nextLine();
        String phoneNumberPattern = "^[0-9]{2}[ ]+[6-9]{1}[0-9]{9}}";
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Entered Number is Valid");
        } else {
            System.out.println("Entered Number is Invalid");
        }
    }
    public static void main(String[] args) {
        firstNameValidation();
        validateLastName();
        validateEmail();
        validatePhoneNumber();
    }

}
