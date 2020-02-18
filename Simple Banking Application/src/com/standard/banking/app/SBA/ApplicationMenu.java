package com.standard.banking.app.SBA;

import java.util.Scanner;

import static java.lang.System.*;

public class ApplicationMenu {

    private BankAccount bankAccountTasks = new BankAccount(); //init private class

    public void drawMenu(){
        Scanner scanner = new Scanner(in); //get input
        char userInput;
        int withdraw, deposit = 0;

        //app logic
        do{
            out.println("\n\n\n\n====*** --- ***====|====*** --- ***===");
            out.println("[====*** Simple Banking v1.0 ***====]");
            out.println("====*** --- ***====|====*** --- ***===");
            out.println("\n==> Select an option to continue <==");
            out.println("\n1. ==> Withdraw");
            out.println("2. ==> Deposit");
            out.println("3. ==> Balance check");
            out.print("\n==> Select option: ");
            userInput = scanner.next().charAt(0);

            switch(userInput){
                case '1':
                    out.println("\n\n\n====*** --- ***====|====*** --- ***===");
                    out.println("\t  [====*** Withdraw ***====]");
                    out.println("====*** --- ***====|====*** --- ***===");
                    if(bankAccountTasks.getCurrentAccountBalance() < 10.0F){
                        out.println("\n\n==>Current balance: " +
                                            bankAccountTasks.randsCurrency.getSymbol() +
                                            bankAccountTasks.getCurrentAccountBalance());
                        out.println("\n\nInfo: Insufficient funds to make withdrawal. Please make a deposit instead.");
                    }
                    else{
                        out.println("\n\n==>Current balance: " +
                                bankAccountTasks.randsCurrency.getSymbol() +
                                bankAccountTasks.getCurrentAccountBalance());
                        out.print("\n\nWithdraw: ");
                        withdraw = scanner.nextInt();
                        bankAccountTasks.withdrawMoney(withdraw);
                    }
                    break;

                case '2':
                    out.println("\n\n\n====*** --- ***====|====*** --- ***===");
                    out.println("\t   [====*** Deposit ***====]");
                    out.println("====*** --- ***====|====*** --- ***===");
                    out.print("\n\n==>Deposit: ");
                    deposit = scanner.nextInt();
                    bankAccountTasks.depositMoney(deposit);
                    break;

                case '3':
                    out.println("\n\n\n====*** --- ***====|====*** --- ***===");
                    out.println("  [====*** Account balance ***====]");
                    out.println("====*** --- ***====|====*** --- ***===");
                    bankAccountTasks.checkAccountBalance();
                    break;

                default:
                    out.println("\n\nMessage: Invalid selection made. Please try again.");
                    break;
            }

        }while(true);
    }
}
