package Zadania;

import java.util.Scanner;

public class Zadanie2 {

    Scanner sc = new Scanner(System.in);
    int a, b;
    public void rozwiazanie(){

        System.out.println("Podaj pierwszą liczbe a");
        int a = sc.nextInt();

        System.out.println("Podaj drugą liczbe b");
        int b = sc.nextInt();

        System.out.println("Suma podanych liczb " + (a+b));
        System.out.println("Różnica podanych liczb " + (a-b));
        System.out.println("Iloczyn podanych liczb " + (a*b));

    }
}
