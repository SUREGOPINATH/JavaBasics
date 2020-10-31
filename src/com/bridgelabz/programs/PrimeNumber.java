package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Scanner;

/**
 *
 * @author : Sure Gopinath
 * Created Date : 16th Oct 2020
 * Functionality : This is Prime Number program contains
 *                 number is taken from user and return with
 *                 number is prime or not
 * */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int result = utilities.prime(number);
        if (result==0)
            System.out.println(number+" is Prime Number");
        else
            System.out.println(number+" is not Prime Number");
    }
}
