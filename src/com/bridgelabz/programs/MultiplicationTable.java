package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utilities;
/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is Multiplication table program contains
 *                 value is taken from user and return with
 *                 Multiplication table of number
 *
 * */
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to generate Multiplication table");
        int number = scanner.nextInt();

        Utilities utilities = new Utilities();

        int counter;
        for (counter = 1; counter<=10; counter++) {
            int result = utilities.mulTwoNumbers(counter,number);
            System.out.println(counter+"*"+number+"="+result);
        }
    }
}
