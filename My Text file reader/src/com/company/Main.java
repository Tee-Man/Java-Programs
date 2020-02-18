package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.err.println("\n\n====[ Program Start ]====\n");
        try{
            File myTxt = new File("src/Test.txt");
            if(myTxt.exists()){
                Scanner file = new Scanner(myTxt);

                do {
                    System.out.println(file.nextLine());
                }while (file.hasNextLine());
            }
        }catch (Exception err){
            System.out.println("\n===+ Program error +===");
            System.err.println("\n\nError message: " + err.getMessage() +
                                "\nError cause: " + err.getCause());
            System.out.println("\n===+ Program error +===");
        }

        System.err.println("\n\n====[ Program End ]====\n");

    }
}
