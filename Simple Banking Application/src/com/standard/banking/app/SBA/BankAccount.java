package com.standard.banking.app.SBA;

import com.standard.banking.app.Interface.SBA_Interface;

import java.util.Currency;

public class BankAccount implements SBA_Interface {

    //Variables
    private float currentAccountBalance;
    public Currency randsCurrency = Currency.getInstance("ZAR");

    //Methods
    public void withdrawMoney(int amountToWithdraw){
        final float withdrawCharges = 10.50F;
        float tempVal = (float)amountToWithdraw - withdrawCharges;
        currentAccountBalance -= tempVal;
    }

    public void depositMoney(int amountToDeposit){
        final float depositCharges = 5.50F;
        float tempVal = (float)amountToDeposit - depositCharges;
        currentAccountBalance += tempVal;
    }

    public float checkAccountBalance(){
        final float balanceCharges = 2.50F;
        currentAccountBalance -= balanceCharges;
        System.out.println("\n\n==>Current balance: " + randsCurrency.getSymbol() + currentAccountBalance);
        return currentAccountBalance;
    }

    public float getCurrentAccountBalance(){
        return currentAccountBalance;
    }
}
