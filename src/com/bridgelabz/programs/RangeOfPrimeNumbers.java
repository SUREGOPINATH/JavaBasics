package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Scanner;

/**
 *
 * @author : Sure Gopinath
 * Created Date : 16th Oct 2020
 * FUnctionality : This is Range of Prime Number contains
 *                 range is taken from User and return with
 *                 prime Numbers in that range
 * */
public class RangeOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();
        System.out.println("Enter a Range");
        int range = scanner.nextInt();
        int result;
        int counter=2;
        while (counter<=range) {
            result=utilities.prime(counter);
            if (result == 0)
                System.out.println(counter);
            counter++;
        }
    }
}
