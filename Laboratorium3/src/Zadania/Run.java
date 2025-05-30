package Zadania;

import java.util.Scanner;

public class Run {

    Scanner sc = new Scanner(System.in);
    Zadanie1 zadanie1 = new Zadanie1();
    Zadanie2 zadanie2 = new Zadanie2();
    Zadanie3 zadanie3 = new Zadanie3();
    Zadanie4 zadanie4 = new Zadanie4();
    Zadanie5 zadanie5 = new Zadanie5();
    public void start(){

        boolean exit = true;

        while (exit){
            System.out.println("=== Menu ===");
            System.out.println("Wybierz Zadanie");
            System.out.println("1.Zadanie ");
            System.out.println("2.Zadanie ");
            System.out.println("3.Zadanie ");
            System.out.println("4.Zadanie ");
            System.out.println("5.Zadanie ");
            System.out.println("6.Zakończ działanie programu");

            int wybor = sc.nextInt();

            switch (wybor){
                case 1:
                    zadanie1.rozwiazanie();
                    break;
                case 2:
                    zadanie2.rozwiazanie();
                    break;
                case 3:
                    zadanie3.rozwiazanie();
                    break;
                case 4:
                    zadanie4.rozwiazanie();
                    break;
                case 5:
                    zadanie5.rozwiazanie();
                    break;
                case 6:
                    exit = false;
                    System.out.println("Koniec pracy programu");
                    break;
                default:
                    System.out.println("Wybrano błędna opcje");
            }
        } sc.close();
    }
}
