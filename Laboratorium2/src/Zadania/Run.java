package Zadania;

import java.util.Scanner;

public class Run {

    Scanner sc = new Scanner(System.in);
    Zad1 zad1 = new Zad1();
    Zad2 zad2 = new Zad2();
    Zad3 zad3 = new Zad3();
    Zad4 zad4 = new Zad4();
    Zad5 zad5 = new Zad5();
    public void start(){

        boolean exit = true;

        while (exit){
            System.out.println("--- Menu ---");
            System.out.println("Wybierz jedno z zadań");
            System.out.println("1.Zad");
            System.out.println("2.Zad");
            System.out.println("3.Zad");
            System.out.println("4.Zad");
            System.out.println("5.Zad");
            System.out.println("6.Zakończ działanie programu");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    zad1.zad1();
                    break;
                case 2:
                    zad2.zad2();
                    break;
                case 3:
                    zad3.zad3();
                    break;
                case 4:
                    zad4.zad4();
                    break;
                case 5:
                    zad5.zad5();
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("Koniec Pracy Progamu");
            }
        } sc.close();
    }
}
