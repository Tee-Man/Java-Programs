package com.company;

import java.io.IOException;
import java.io.ObjectInput;
import java.util.ArrayList;

public class ClientDetails extends GetSysLogic {
    private ArrayList<String> tempKeystore = new ArrayList<>();
    private static int duplicateDetected = 1;

    void CreateClient(String Surname, String Name, String MiddleName){
        String surname = Surname.toLowerCase();
        String name = Name.toLowerCase();
        String middleName = MiddleName.toLowerCase();
        GetSysLogic.client_age = GetSysLogic.year + "" + GetSysLogic.month + "" + GetSysLogic.day;

        String cName, cMiddle, cLast;
        cName = name; cMiddle = middleName; cLast = surname;

        if (surname.length() < 1){
            surname += "...";
        }
        else{
            surname = surname.substring(0, 5) + (surname.length() - 5);
            name = name.substring(0,1) + (name.length() - 1);
            middleName = middleName.substring(0,1);
        }

        String CKey = surname + name + middleName;
        String finalCKey = cName + ", " + cMiddle + ", " + cLast + ", " + GetSysLogic.client_age + ", " + CKey;

        //Temp keystore
        tempKeystore.add(CKey);

        //Test if duplicate
        for (int indexCount = 0; indexCount < tempKeystore.size(); indexCount++){
            if (tempKeystore.get(indexCount).contentEquals(CKey)) {
                ShowResult.finalKeysList.add(finalCKey + "-"
                                            + duplicateDetected++
                                            + ", "
                                            + GetSysLogic.age);
                break;
            }

            ShowResult.finalKeysList.add(finalCKey + ", " + GetSysLogic.age);
            break;
        }
    }
}