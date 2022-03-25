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
        System.out.println("5.To Validate the Password ");
        System.out.println("6.To Validate the Email Sample list ");
        System.out.println("Enter the option to perform the operation");
        int checkOption = sc.nextInt();

        switch (checkOption) {
            case 1:
                System.out.println("Enter the First name /Note: Name starts with Cap and has minimum 3 characters");
                String firstName = sc.next();
                userRegistration.validateFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter the Last name /Note: Name starts with Cap and has minimum 3 characters");
                String lastName = sc.next();
                userRegistration.validateLastName(lastName);
                break;
            case 3:
                System.out.println("Enter the Email address");
                String email = sc.next();
                userRegistration.validateEmail(email);
                break;
            case 4:
                System.out.println("Enter the Mobile number");
                sc.nextLine();
                String num = sc.nextLine();
                userRegistration.validateMobileNumber(num);
                break;

            case 5:
                System.out.println("Enter the Password /Note : Required minimum 8 characters, 1 Upper case , 1 numeric number and exact one special character");
                sc.nextLine();
                String password = sc.nextLine();
                userRegistration.validatePassword(password);
                break;
            case 6:
                System.out.println("Validating all sample Emails list");
                String[] emails={"abc@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc-100@yahoo.com","abc.100@yahoo.com","abc@gmail.com.com","abc+100@gmail.com","abc","abc@.com.my","abc()*@gmail.com","abc@gmail.com.1a"};
                UserRegistration.validateEmailsSampleList(emails);
                break;
            default:
                System.out.println("Please Enter valid option");
                break;
        }

    }
}
