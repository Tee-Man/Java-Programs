package com.standard.banking.app;

import com.standard.banking.app.SBA.ApplicationMenu;

public class Main {

    public static void main(String[] args) {

        ApplicationMenu startApplication = new ApplicationMenu(); //init class

        try{
            startApplication.drawMenu();
        }catch(Exception err){
            System.out.println("\n\nException: " + err.getMessage() + "\nSource: " + err.getCause());
        }
    }
}
