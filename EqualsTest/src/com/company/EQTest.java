package com.company;

import java.util.Random;

class EQTest {
    private char [] charsToTest= {'a', 'b', 'c', 'd', 'e','f'};
    private Random r = new Random(charsToTest.length);

    void EQTes() {
        System.out.println("\n==== Equals Test ====\n");
        for(int inx = 1; inx < charsToTest.length; inx++){
            char chars2 = charsToTest[r.nextInt(charsToTest.length)];
            System.out.println(
                    (chars2 == 'a') ?
                    (inx + ". Pass: Character [" + chars2 + "] is equals to 'A'.") :
                    (inx + ". Fail: Character [" + chars2 + "] is not equals to 'A'."));
        }
        System.out.println("\n==== Program complete ====\n");
    }
}
