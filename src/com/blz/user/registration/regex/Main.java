package com.blz.user.registration.regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        userRegistration.ValidateFirstName(firstName);
    }
}
