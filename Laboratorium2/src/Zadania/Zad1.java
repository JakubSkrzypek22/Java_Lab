package Zadania;

import java.util.Scanner;

public class Zad1 {

    Scanner sc = new Scanner(System.in);
    int i = 0;
    int suma;

    public void zad1(){


        System.out.println("Podaj wartość n");
        int n = sc.nextInt();

        while( i < n){
            System.out.println("Podaj ilosc punktów otrzymanych przez studenta");
            int punkty = sc.nextInt();
            suma += punkty;
            ++i;
        }

        System.out.println("Liczba punktów każdego studenta wynosi : " + suma);

    }
}
