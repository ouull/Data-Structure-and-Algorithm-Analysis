package PolymorphismMetodeOverriding;

public class Main {

    public static void main(String[] args) {

        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.bersuara();
        hewan2.bersuara();
    }
}