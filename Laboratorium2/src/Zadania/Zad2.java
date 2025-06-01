package Zadania;

import java.util.Scanner;

public class Zad2 {

    public void zad2(){
        Scanner sc = new Scanner(System.in);
        int i =1;
        int n =10;
        int dodatnia = 0;
        int ujemna = 0;
        int ujemnaSuma = 0;
        int dodatniaSuma = 0;

        System.out.println("Wprowadz 10 liczb");

        while (i <= n){
            System.out.println("Podaj liczbe");
            int a = sc.nextInt();

            if(a>0){
                ++dodatnia;
                dodatniaSuma += a;
            }else if(a<0){
                ++ujemna;
                ujemnaSuma += a;
            }
            ++i;
        }
        System.out.println("Liczb dodatnich jest: " + dodatnia + " a ich suma to: " + dodatniaSuma);
        System.out.println("Liczb ujemnych jest: " + ujemna + " a ich suma to: " + ujemnaSuma);
    }
}
