package com.company;

import java.util.Scanner;

public class GetMenu extends Main{

    static Scanner getInput = new Scanner(System.in);

    static void initApp() {
        char a;
        System.out.println("\n\t\t\t\t\t\t||======================================||");
        System.out.println("\t\t\t\t\t\t||======================================||");
        System.out.println("\t\t\t\t\t\t||========= Client Key creator =========||");
        System.out.println("\t\t\t\t\t\t||======================================||");
        System.out.println("\n\nWould you like to add a client?");
        System.out.println("\n(Y) = Yes");
        System.out.println("(N) = No");
        System.out.print("\nChoose: ");
        a = getInput.next().charAt(0);

        switch (a) {
            case 'y', 'Y' -> GetSysLogic.start();
            case 'n', 'N' -> ShowResult.displayResults();
            default -> System.out.println("\nInvalid option!");
        }
    }
}
