package Insertion;

import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {

        int[] angka = {10, 20, 30, 40, 50};

        int elemenBaru = 25;
        int posisi = 2;

        int[] hasil = new int[angka.length + 1];

        // Menyalin elemen sebelum posisi penyisipan
        for (int i = 0; i < posisi; i++) {
            hasil[i] = angka[i];
        }

        // Menambahkan elemen baru
        hasil[posisi] = elemenBaru;

        // Menggeser elemen setelah posisi penyisipan
        for (int i = posisi; i < angka.length; i++) {
            hasil[i + 1] = angka[i];
        }

        System.out.println("Sebelum : " + Arrays.toString(angka));
        System.out.println("Sesudah : " + Arrays.toString(hasil));

    }
}