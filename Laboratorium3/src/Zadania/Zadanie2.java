package Zadania;

import java.util.Scanner;

public class Zadanie2 {
    Scanner sc = new Scanner(System.in);

    public void rozwiazanie(){


        int dodatnie = 0;
        int ujemne =0;
        int i =0;

        System.out.println("Podaj 10 liczb:");
        int n = 10;


        while (i <n){
            System.out.println("Podaj liczbe");
            int liczba = sc.nextInt();

            if(liczba >0){
                dodatnie++;
            }else{
                ujemne++;
            }
            ++i;
        }

        System.out.println("Liczb dodatnich jest dokładnie: " + dodatnie);
        System.out.println("Liczb ujemntch jest dokładnie " + ujemne);
    }
}
