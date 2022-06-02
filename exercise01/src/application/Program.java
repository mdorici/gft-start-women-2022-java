package application;

import entities.Account;
import entities.CurrentAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrentAccount currentAccount = new CurrentAccount(01, "Maria", 1000.0);
        currentAccount.income();
        SavingsAccount savingsAccount = new SavingsAccount(02, "João", 2000.0);
        savingsAccount.income();

        System.out.println(currentAccount);
        System.out.println(savingsAccount);

        sc.close();
    }
}
