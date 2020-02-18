package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ShowResult extends GetSysLogic{

    static ArrayList<String> finalKeysList = new ArrayList<>();

    static void displayResults() {

        System.out.println("\n\t\t\t\t\t\t||======================================||");
        System.out.println("\t\t\t\t\t\t||======================================||");
        System.out.println("\t\t\t\t\t\t||========= Client Key creator =========||");
        System.out.println("\t\t\t\t\t\t||======================================||");

        System.out.println("\n\n\t\t\t\t\t\t\t\t==*** Display data ***==");
        Collections.sort(finalKeysList);

        System.out.println("\n[No.] Total Keys: " + finalKeysList.size() + "\n");
        if(finalKeysList.size() < 1){
            for(int i = 0; i < 3; i++){
                System.out.print("====[ No data to display ]==== ");
            }
        }
        else {
            int count = 1;
            for (var key: finalKeysList) {
                System.out.println((count++) + ". " + key.toUpperCase());
            }
        }
        System.out.println("\n\n\t\t\t\t\t\t\t\t==*** Program complete ***==");
    }
}
