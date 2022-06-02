package application;

import entities.Disease;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Disease> list = new ArrayList<>();

        System.out.println("Enter with a symptom: ");
        String symptom = sc.nextLine();

        sc.close();
    }
}
