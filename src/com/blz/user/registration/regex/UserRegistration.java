package com.blz.user.registration.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";
    public final String lastName = ("^[A-Z]{1}[a-z]{3,}$");

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
}
