package com.company;

public class Main {

    private static int asteriskCount = 0;
    private static String myConsonantString = "blackholes and the higgs experiment trends in science lately";
    private static int VowelScore = 0;
    private static int NeckScore = 0;
    private static int TailScore = 0;
    private static char[] myVowels = {'a', 'e', 'i', 'o', 'u'};
    private static char[] myConsonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    private static char[] myTails = {'g', 'j', 'p', 'q', 'y'};
    private static char[] myNeck = {'b', 'd', 'f', 'h', 'k', 'l'};

    public static void main(String[] args) {
        System.out.println("\n===> Consonant and vowel Ex: <===");
        System.out.println("\n\nOld string: " + myConsonantString + "\n");
        char c;

        //Calculations
        //Cons and vowel count
        for (int i = 0; i < myConsonantString.length(); i++){

            c = myConsonantString.charAt(i);

            //Vowel score
            for (int vow = 0; vow < myVowels.length; vow++)
            {
                if (c == myVowels[vow])
                {
                    VowelScore+=2;
                }
            }

            //Neck score
            for (int neck = 0; neck < myNeck.length; neck++)
            {
                if (c == myNeck[neck])
                {
                    NeckScore+=3;
                }
            }

            //Tail score
            for (int tail = 0; tail < myTails.length; tail++)
            {
                if (c == myTails[tail])
                {
                    TailScore+=4;
                }
            }
        }

        //Total score
        int total = VowelScore + NeckScore + TailScore;

        //Remove vowels
        while(asteriskCount < myConsonantString.length()){
            for (int removeChar = 0; removeChar < myVowels.length; removeChar++){
                myConsonantString = myConsonantString.replace(myVowels[removeChar], '*');
            }
            asteriskCount++;
        }

        //Display output
        System.out.println("\nVowel score: " + VowelScore + "pts");
        System.out.println("\nConsonant with tail score: " + TailScore + "pts");
        System.out.println("\nConsonant with neck score: " + NeckScore + "pts");
        System.out.println("\nTotal score: " + total + "pts");
        System.out.println("\n\nNew string with vowels removed: " + myConsonantString);
        System.out.println("\n\n===>>>>!!! Program complete !!!<<<<===");

    }
}
