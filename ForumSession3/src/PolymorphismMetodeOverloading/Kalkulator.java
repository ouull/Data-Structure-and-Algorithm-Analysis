package PolymorphismMetodeOverloading;

public class Kalkulator {

    public int hitung(int a, int b) {
        return a + b;
    }

    public int hitung(int a, int b, int c) {
        return a + b + c;
    }

    public double hitung(double a, double b) {
        return a + b;
    }
}