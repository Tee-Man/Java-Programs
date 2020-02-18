package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("\n\n==* Sorted list test *==\n");
        System.out.println("\nDate/Time: " + now + "\n");
        SortedArrayApp myApp = new SortedArrayApp();
        myApp.getIntegers();
        myApp.printArray();
        myApp.sortIntegers();
        System.out.println("\n\n==* Execution complete *==\n");
    }
}
