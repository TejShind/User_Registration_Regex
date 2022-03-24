package com.blz.user.registration.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";
    public final String lastName = ("^[A-Z]{1}[a-z]{3,}$");
    public final String email = "^[a-z]{3,}[1-9]{0,4}[@][a-z]{4,}[.][a-z]{2,3}$";
    public final String mobileNumber = "^[0-9]{2}\s?[0-9]{10}$";//e.g 91 9919819801.
    public final String passWord = "^[A-Za-z]{0,}[@]{1}[a-zA-Z1-9]{1}[a-zA-Z0-9]{7,}$";//Exactly one special character,minimum 8 characters,One uppercase character, One Numeric number
    public void validateFirstName(String enteredFirstName) {
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher(enteredFirstName);
        if (matcher.matches())
            System.out.println("Entered firstName " + enteredFirstName + " is valid");
        else
            System.out.println("firstName " + enteredFirstName + " is invalid");
    }

    public void validateLastName(String enteredLastName) {
        Pattern pattern = Pattern.compile(lastName);
        Matcher matcher = pattern.matcher(enteredLastName);
        if (matcher.matches())
            System.out.println("Entered lastName " + enteredLastName + " is valid");
        else
            System.out.println("lastName " + enteredLastName + " is invalid");

    }

    public void validateEmail(String enteredEmail) {
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(enteredEmail);
        if (matcher.matches())
            System.out.println("Entered email " + enteredEmail + " is valid");
        else
            System.out.println("email " + enteredEmail + " is invalid");

    }

    public void validateMobileNumber(String in) {
        Pattern pattern = Pattern.compile(mobileNumber);
        Matcher matcher = pattern.matcher(in);
        if (matcher.matches())
            System.out.println("Entered mobileNumber " + in + " is valid");
        else
            System.out.println("MobileNumber " + in + " is invalid");

    }

    public void validatePassword(String password) {
        Pattern pattern = Pattern.compile(passWord);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            System.out.println("Entered Password " + password + " is valid ");
        else
            System.out.println("Password " + password + " is invalid ");

    }
}