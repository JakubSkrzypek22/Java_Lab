package Zadania;

import java.util.Scanner;

public class Zadanie3 {

    Scanner sc = new Scanner(System.in);

    public void rozwiazanie() {


        int i = 0;
        int suma = 0;


        System.out.println("Podaj długośc ciągu liczb n");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Podana liczba nie może być ujemna");
        } else {

            while (i < n) {

                System.out.println("Podaj liczbe");
                int liczba = sc.nextInt();

                if (liczba % 2 == 0) {
                    suma += liczba;
                }

                ++i;
            }
        }
        System.out.println("Suma liczb parzystych jest równa " + suma );
        }
    }

