package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utilities;
/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is Add two integers program cointains
 *                 values taken from user and return with result
 * */
public class AddIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();

        Utilities utilities = new Utilities();
        int result = utilities.addTwoNumbers(number1,number2);

        System.out.println("The addition of two numbers is "+result);
    }
}
