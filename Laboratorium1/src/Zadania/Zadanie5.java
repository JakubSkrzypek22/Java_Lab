package Zadania;

import java.util.Scanner;

public class Zadanie5 {

    Scanner sc = new Scanner(System.in);
    int a;

    public void rozwiazanie(){

        System.out.println("Podaj liczbe a");
        int a = sc.nextInt();

        System.out.println("Liczba a podniesiona do 3 potęgi to " + (a*a*a));


    }

}
