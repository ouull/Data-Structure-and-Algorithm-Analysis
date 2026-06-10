package PolymorphismMetodeOverloading;

public class Main {

    public static void main(String[] args) {

        Kalkulator calc = new Kalkulator();

        System.out.println("2 Integer : " + calc.hitung(5, 3));
        System.out.println("3 Integer : " + calc.hitung(5, 3, 2));
        System.out.println("2 Double  : " + calc.hitung(5.5, 3.2));
    }
}
