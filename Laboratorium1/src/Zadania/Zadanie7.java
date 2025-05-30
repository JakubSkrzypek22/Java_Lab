package Zadania;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {

    public void rozwiazanie(){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

        System.out.println("Podaj a:");
    int a = sc.nextInt();

        System.out.println("Podaj b:");
    int b = sc.nextInt();

    int x = rand.nextInt(b - a + 1) + a;
    int y = rand.nextInt(b - a + 1) + a;
    int z = rand.nextInt(b - a + 1) + a;

        System.out.println("Wylosowane boki: " + x + ", " + y + ", " + z);

    int[] boki = {x, y, z};
        Arrays.sort(boki);

    boolean wynik = boki[0]*boki[0] + boki[1]*boki[1] == boki[2]*boki[2];

        System.out.println("Mozna zbudowac trojkat prostokatny? " + wynik);
 }
}
