package Zadania;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public void rozwiazanie(){

        int i = 0;
        int suma = 0;


        System.out.println("Podaj ile liczb chcesz wylosować ");
        int n = sc.nextInt();

        while  (i < n){

            int liczba = rand.nextInt(56)-10;

            System.out.println("Wylosowana liczba to: " + liczba);

            if(liczba % 2 == 0){
                suma += liczba;
            }

            ++i;
        }

        System.out.println("\n Suma liczb parzystych z wylosowanej liczby wynosi " + suma);

    }
}
