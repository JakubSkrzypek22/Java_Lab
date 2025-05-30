package Zadania;

import java.util.Scanner;

public class Zadanie4 {

    Scanner sc = new Scanner(System.in);
    int a;
    boolean wartosc = true;

    public void rozwiazanie(){

        System.out.println("Podaj liczbe a");
        int a = sc.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.println(wartosc);
        }else if(a % 3 !=0){
            System.out.println("Liczba nie jest podzielna przez 3");
        }else if(a % 5 != 0){
            System.out.println("Liczba nie jest podzielna przez 5");
        }else{
            System.out.println("Liczba nie jest podzielna ani przez 3 ani przez 5");
        }
    }
}
