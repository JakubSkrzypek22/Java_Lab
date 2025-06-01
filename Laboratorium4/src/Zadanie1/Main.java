package Zadanie1;

public class Main {
    public static void main(String[] args){

        Osoba osoba1 = new Osoba("Jakub" , "Skrzypek" , 23);
        osoba1.pokazDane();


        Osoba osoba2 = new Osoba("Mateusz" , 31);
        osoba2.pokazDane();

        Osoba osoba3 = new Osoba();
        osoba3.pokazDane();
    }
}