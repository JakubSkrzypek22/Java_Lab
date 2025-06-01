package  Zadanie2;

// Główna metoda programu
public class Main{

    public static void main(String[] args) {
        Student s1 = new Student("Jan");
        Student s2 = new Student("Andrzej", "Kowalski");
        Student s3 = new Student("Mateusz", "Nowak", "S131231232");
        Student s4 = new Student("Piotr", "Żyła", "S54214214", "Ekonomia", 3);

        s1.wyswietlDane();
        s2.wyswietlDane();
        s3.wyswietlDane();
        s4.wyswietlDane();
    }
}
