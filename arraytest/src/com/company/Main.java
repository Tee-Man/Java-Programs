package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var s = new arrayTest(14, 20, 79);
        s.addToArray();
    }
}

class arrayTest{

    private int num1,num2,num3;
    int[] numsCollection;

    arrayTest(int in1, int in2, int in3){
        this.num1 = in1;
        this.num2 = in2;
        this.num3 = in3;
        numsCollection = new int[]{num1, num2, num3};
    }

    void addToArray(){
        System.out.println("\nLength of new array: " + numsCollection.length +"\n");
        for (int i = 0; i < numsCollection.length; i++){
            System.out.println((i+1) +". " + numsCollection[i]);
        }
    }
}
