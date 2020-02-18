package com.company;

import java.time.LocalDate;

public class CalculateAge extends Main {

    static int CurrentYear = LocalDate.now().getYear();

    static int calculateAge(int clientYear){
        return (CurrentYear - clientYear);
    }
}
