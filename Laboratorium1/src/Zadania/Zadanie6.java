package Zadania;

import java.util.Scanner;

public class Zadanie6 {

    Scanner sc = new Scanner(System.in);



    public void rozwiazanie(){

        System.out.println("Podaj liczbe ");
        int liczba = sc.nextInt();

        double wynik = Math.sqrt(liczba);
        System.out.println("Liczba " + liczba +  " podniesiona do pierwiastka kwadratowego to  " + wynik );

    }

}
