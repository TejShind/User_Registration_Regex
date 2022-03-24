package com.blz.user.registration.regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.To Validate the First name");
        System.out.println("2.To Validate the Second name");
        System.out.println("3.To Validate the Email address");
        System.out.println("4.To Validate the Mobile Number");
        System.out.println("Enter the option to perform the operation");
        int checkOption = sc.nextInt();

        switch (checkOption) {
            case 1:
                System.out.println("1.Enter the First name /Note: Name starts with Cap and has minimun 3 characters");
                String firstName = sc.next();
                userRegistration.validateFirstName(firstName);
                break;
            case 2:
                System.out.println("2.Enter the Last name /Note: Name starts with Cap and has minimun 3 characters");
                String lastName = sc.next();
                userRegistration.validateLastName(lastName);
                break;
            case 3:
                System.out.println("3.Enter the Email address");
                String email = sc.next();
                userRegistration.validateEmail(email);
                break;
            case 4:
                System.out.println("4.Enter the Mobile number");
                sc.nextLine();
                String num =sc.nextLine();
                userRegistration.validateMobileNumber(num);
                break;

            default:
                System.out.println("Please Enter valid option");
                break;
        }

    }
}
