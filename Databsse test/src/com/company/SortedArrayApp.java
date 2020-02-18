package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayApp implements SortedIntegers {

    private final int[] intList = new int[5];

    public void getIntegers() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int tempContainer;
        for (int idx = 0; idx < intList.length; idx++) {
            System.out.print(++count + ". Enter number: ");
            tempContainer = sc.nextInt();
            intList[idx] = tempContainer;
        }
    }

    public void printArray() {
        int count = 0;
        System.out.println("\n\n== collected numbers ==");
        for (int displayNumbers : intList
        ) {
            System.out.println(++count + ". " + displayNumbers);
        }
    }

    public void sortIntegers() {
        Arrays.sort(intList);
        int count = 0;
        System.out.println("\n\n== Sorted numbers ==");
        for (int sortedNumbers : intList
        ) {
            System.out.println(++count + ". " + sortedNumbers);
        }
    }
}
