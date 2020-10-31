package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utilities;

/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is fibonacci program contains
 *                 range is taken from user and return
 *                 with fibanacci series of range
 *
 * */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();
        System.out.println("Enter range to generate Fibonacci series");
        int range = scanner.nextInt();
        int first=0;
        int second=1;
        System.out.println("The fibonacci series is ");
        System.out.println(first+"\n"+second);
        for (int counter=2; counter<=range; counter++) {
            int third = utilities.addTwoNumbers(first,second);
            first=second;
            second=third;
            System.out.println(third);
        }
    }
}
