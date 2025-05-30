package Zadania;

import java.util.Scanner;

public class Zadanie1 {

    Scanner sc = new Scanner(System.in);
    int i = 0;
    double suma = 0;

    public void rozwiazanie(){

        System.out.println("Podaj liczbę studentów ");
        int n = sc.nextInt();


        while(i < n){
            System.out.println("Podaj liczbe punktów każdego studenta: ");
            double punkty = sc.nextDouble();
            suma += punkty;
            i++;
        }

        double srednia = suma/n;
        System.out.println("Średnia liczba punktów studentów wynosi " + srednia);
    }
}
