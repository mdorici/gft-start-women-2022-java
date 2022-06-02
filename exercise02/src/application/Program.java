package application;

import entities.Animal;
import entities.LivingCreature;
import entities.Vegetal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LivingCreature livingCreature1 = new LivingCreature();
        Animal animal = new Animal();
        Vegetal vegetal = new Vegetal();

        LivingCreature.creature(animal);
        LivingCreature.creature(vegetal);

        sc.close();
    }
}
