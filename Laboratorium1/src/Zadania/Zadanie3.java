package Zadania;

import java.util.Scanner;

public class Zadanie3 {

    Scanner sc = new Scanner(System.in);
    int a;
    boolean parzysta = true;

    public void rozwiazanie(){

        System.out.println("Podaj Pierwszą liczbe a ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println(parzysta);
        }else{
            System.out.println("Podana liczba nie jest parzysta (Fałsz)");
        }
    }
}
