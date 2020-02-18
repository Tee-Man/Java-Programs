package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var userInput = new Scanner(System.in);
        System.out.print("Enter text: ");
        String capturedInput = userInput.next();
        System.out.println("String with whitespace:" + capturedInput);
        System.out.println("String with removed whitespace:" + capturedInput.trim());

        StringBuilder alpha = new StringBuilder();
        for(char current = '0'; current <= '9'; current++){
            alpha.append(current);
            System.out.println(alpha);
        }
    }
}
