package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var start = new EQTest();
        int testCount = 0;
        System.out.println("\n==**Running Tests**==\n");
        while(testCount < 3){
            System.out.print("\nTest: " + (testCount+1));
            start.EQTes();
            testCount++;
        }
    }
}
