package Searching;

public class ArraySearching {

    public static void main(String[] args) {

        int[] angka = {3, 8, 12, 5, 7};

        int target = 12;

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {

            if (angka[i] == target) {

                ditemukan = true;

                System.out.println("Data ditemukan pada indeks ke-" + i);

                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan");
        }

    }

}