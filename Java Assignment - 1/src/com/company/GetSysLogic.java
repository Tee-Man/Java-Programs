package com.company;

import java.time.DateTimeException;
import java.util.ArrayList;

public class GetSysLogic extends Main {

    private static String mid_name;
    static String client_age;
    static int year, month, day;
    private static ClientDetails createNewClientDetails = new ClientDetails();
    public static String age;

    private static char[]specialChars = {'1','2','3','4','5','6','7','8','9','0','!', '@', '#', '$','%','^', '&', '*','<', '>', '?', '-', '+','=','(',')','`','~',';',':','/','{','}','[',']'};

    static void start() {
        try {

            char MidChoice;
            System.out.println("\n\t\t\t\t\t\t||======================================||");
            System.out.println("\t\t\t\t\t\t||======================================||");
            System.out.println("\t\t\t\t\t\t||========= Client Key creator =========||");
            System.out.println("\t\t\t\t\t\t||======================================||");
            System.out.println("\n\n===> Create customer key <===");

           /*Get user input*/
            System.out.print("\nEnter name: ");
            String first_name = GetMenu.getInput.next();

            System.out.print("\nDo you have a middle name?");
            System.out.println("\nY = Yes");
            System.out.println("N = No");
            System.out.print("\nOption: ");
            MidChoice = GetMenu.getInput.next().charAt(0);
            switch (MidChoice) {
                case 'Y', 'y' -> {
                    System.out.print("\nEnter middle name: ");
                    mid_name = GetMenu.getInput.next().trim();
                }

                case 'N', 'n' -> mid_name = "0";

                default -> System.out.println("\nInvalid option!!!");
            }

            System.out.print("\nEnter surname: ");
            String last_name = GetMenu.getInput.next().trim();

            System.out.print("\n===Date of birth===: ");
            System.out.print("\nYear: ");
            year = GetMenu.getInput.nextInt();

            System.out.print("Month: ");
            month = GetMenu.getInput.nextInt();

            System.out.print("Date: ");
            day = GetMenu.getInput.nextInt();

            /*Date validation*/
            try {
                if (year <= CalculateAge.CurrentYear) {
                    age = "Y " + CalculateAge.calculateAge(year) + " 0 0";
                } else {
                    System.out.println("\n\n====Date error==== \nYear of birth is invalid!");
                    age = "N 0 0";
                }
            } catch (DateTimeException dateError) {
                System.out.println("\n\n====Date error==== \nMessage: " +
                        dateError.getMessage() + "\nCause: " +
                        dateError.getCause());
            }

            /*Create new key. Add key to TEMP-KEYSTORE and test if duplicate*/
            createNewClientDetails.CreateClient(last_name, first_name, mid_name);

            /*Back to menu*/
            GetMenu.initApp();

        } catch (Exception err) {
            System.out.println("\n\n===> Error <===" + "\nMessage " + err.getMessage() + "\nSource: " + err.getCause());
        }
    }
}
