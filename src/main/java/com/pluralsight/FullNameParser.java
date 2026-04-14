package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        // 1. Taking fullName input and trim
        System.out.print("Please enter your name: ");
        String fullName = get.nextLine().trim();

        // 2. Split them into parts using \s+
        String[] nameParts = fullName.split("\\s+");

        parseName(nameParts);
    }

    public static void parseName(String[] nameParts) {

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (nameParts.length == 1) {
            firstName = nameParts[0];
        } else if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length >= 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[nameParts.length - 1];
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }
}
