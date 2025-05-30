package Zadania;

import java.util.Scanner;

public class Zadanie5 {

    Scanner sc = new Scanner(System.in);

    public void rozwiazanie(){

        System.out.println("Podaj słowo które chcesz sprawdzić");
        String slowo = sc.nextLine();

        int dlugosc = slowo.length();
        int i = 0 ;
        boolean Palindrom = true;


        while(i <dlugosc / 2){
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 -i)){
                Palindrom = false;
                break;
            }
            ++i;
        }

        if (Palindrom){
            System.out.println("Podanae słowo jest palindromem ");
        } else {
            System.out.println("Podane słowo nie jest palindromem ");
        }
    }
}
