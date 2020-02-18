package com.company;

import com.sun.tools.attach.AgentInitializationException;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        try {
            var r = new Random();
            int myAge = r.nextInt(18);
            var learner = new Student("", "MKB", myAge, 'M');
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
    }
}
