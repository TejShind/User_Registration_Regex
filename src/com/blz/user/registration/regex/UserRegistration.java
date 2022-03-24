package com.blz.user.registration.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";
    public final String lastName = ("^[A-Z]{1}[a-z]{3,}$");
    public final String email = "^[a-z]{3,}[1-9]{0,4}[@][a-z]{4,}[.][a-z]{2,3}$";

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
}