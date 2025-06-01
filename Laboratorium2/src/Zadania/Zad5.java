package Zadania;

import java.util.Scanner;

public class Zad5{

    Scanner sc = new Scanner(System.in);

    public  void zad5(){
        System.out.println("Wprowadz słowo");
        String slowo = sc.nextLine();

        int i = 0;
        int dlugosc = slowo.length();
        boolean Palindrom = true;

        while (i <dlugosc / 2){
            if (slowo.charAt(i) != slowo.charAt(dlugosc -1 -i)){
                Palindrom = false;
                break;
            }
            ++i;
        }
        if(Palindrom){
            System.out.println("To słowo jest palindromem");
        }else{
            System.out.println("To słowo nie jest palindromem");
        }
    }

}
