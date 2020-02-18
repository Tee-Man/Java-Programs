package com.company;

import java.util.*;

public class Student {
    private int studentID;
    private String studentName;
    private String studentSurname;
    private int studentAge;
    private char studentGender;
    private boolean registrationState;



    public Student(String Name, String Surname, int Age, char Gender) throws Exception {
        if (!Name.isBlank() || Surname.isBlank() || Age < 5 ||
                !Name.isEmpty() || Surname.isEmpty()) {
            this.studentName = Name;
            this.studentSurname = Surname;
            this.studentAge = Age;
            this.studentGender = Gender;
            registerStudent();
        }
        else {
            System.out.println("Error detected. Please check and try again.");
        }
    }

    private boolean registerStudent()
    {
        var r = new Random();
        studentID = r.nextInt(9999);
        registrationState = true;
        System.out.println("Name: " + studentName + "\nSurname: " + studentSurname + "\nStudent ID: " + studentID +
                "\nAge: " + studentAge + "\nGender: " + studentGender + "\nRegistration: " + registrationState);
        return registrationState;
    }
}
