package com.blz.user.registration.regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.To Validate the First name");
        System.out.println("2.To Validate the Second name");
        System.out.println("Enter the option to perform the operation");
        int check = sc.nextInt();
        System.out.println("Note: Name starts with Cap and has minimun 3 characters");
        switch (check) {
            case 1:
                System.out.println("Enter the First name");
                String firstName = sc.next();
                userRegistration.validateFirstName(firstName);
                break;
            case 2:
                System.out.println("2.Enter the Last name");
                String lastName = sc.next();
                userRegistration.validateLastName(lastName);
                break;
            default:
                System.out.println("Please Enter valid option");
                break;
        }

    }
}
