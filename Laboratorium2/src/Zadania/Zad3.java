package Zadania;

import java.util.Scanner;

public class Zad3 {
    Scanner sc= new Scanner(System.in);
    public void zad3(){

        int i =0;
        int suma = 0;

        System.out.println("Podaj liczbe ciągu n");
        int n = sc.nextInt();

        if (n<0){
            System.out.println("Wprowadzona liczba nie może być ujemna ");
        }else{
            while (i < n){
                System.out.println("Wprowadz liczbze");
                int liczby = sc.nextInt();

                if (liczby % 2 == 0){
                    suma += liczby;
                }
                ++i;
            }
        }
        System.out.println("Wszystkich liczb parzystych jest " + suma);
    }
}
