package Deletion;

import java.util.Arrays;

public class ArrayDeletion {

    public static void main(String[] args) {

        int[] angka = {10, 20, 30, 40, 50};

        int posisi = 2;

        int[] hasil = new int[angka.length - 1];

        // Menyalin elemen sebelum penghapusan
        for (int i = 0; i < posisi; i++) {
            hasil[i] = angka[i];
        }

        // Menggeser elemen setelah penghapusan
        for (int i = posisi; i < angka.length - 1; i++) {
            hasil[i] = angka[i + 1];
        }

        System.out.println("Sebelum : " + Arrays.toString(angka));
        System.out.println("Sesudah : " + Arrays.toString(hasil));

    }

}
