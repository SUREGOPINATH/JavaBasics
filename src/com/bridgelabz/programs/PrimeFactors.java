package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author : Sure Gopinath
 * Created Date : 16th Oct 2020
 * Functionality : This is Prime Factors program contains
 *                 number is taken from user and return with
 *                 Facors which are prime Numbers only
 * */
public class PrimeFactors {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();

        System.out.println("Enter a Number to find factors");
        int number = scanner.nextInt();

        List<Integer> factors = utilities.factors(number);
        System.out.println(Arrays.toString(factors.toArray() ) );
        int result;
        for (int factor : factors) {
            result = utilities.prime(factor);
            if (result == 0)
                System.out.println(factor);
        }
    }
}
