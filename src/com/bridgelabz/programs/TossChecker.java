package com.bridgelabz.programs;

import java.util.Random;

/**
 *
 * @author : Sure Gopinath
 * Created Date : 16th Oct 2020
 * Functionality : This is tossChecker program contains
 *                 using random function generating 0 or 1
 *                 0 -> Represents Heads
 *                 1 -> Represents Tails
 *
 * */
public class TossChecker {

    public static void main (String[] args) {

        Random random = new Random();
        int tossChecker = random.nextInt(2);
        if (tossChecker == 0)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }
}
