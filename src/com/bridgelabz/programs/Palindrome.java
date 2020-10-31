package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Scanner;

/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is palindrome program contains
 *                 value is taken from user and return with
 *                 result of whether number is palindrome or not
 *
 * */
public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int result = utilities.reverse(number);
        if (result == number)
            System.out.println(number+" is palindrome");
        else
            System.out.println(number+" is not palindrome");
    }
}
