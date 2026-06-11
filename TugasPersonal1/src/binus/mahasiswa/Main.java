package binus.mahasiswa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Membuat array untuk menyimpan 5 objek Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];

        // Inisialisasi data mahasiswa menggunakan constructor
        daftar[0] = new Mahasiswa(
                "Andi Pratama",
                "2440001",
                "Teknik Informatika",
                3.75);

        daftar[1] = new Mahasiswa(
                "Budi Santoso",
                "2440002",
                "Sistem Informasi",
                3.40);

        daftar[2] = new Mahasiswa(
                "Citra Lestari",
                "2440003",
                "Teknik Informatika",
                3.90);

        daftar[3] = new Mahasiswa(
                "Joni Suhartono",
                "2440004",
                "Teknik Industri",
                3.00);

        daftar[4] = new Mahasiswa(
                "Bulan Suci",
                "2440005",
                "Akuntansi",
                3.20);

        System.out.println("=== DATA MAHASISWA ===");

        // Menampilkan seluruh data mahasiswa menggunakan loop
        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            System.out.println("Status   : " + m.cekKelulusan());
            System.out.println("Predikat : " + m.hitungPredikat());
            System.out.println();
        }

        // Meminta pengguna memasukkan NIM mahasiswa yang ingin diperbarui
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        // Variabel untuk mengecek apakah NIM ditemukan
        boolean ditemukan = false;

        // Mencari mahasiswa berdasarkan NIM yang diinput pengguna
        for (Mahasiswa m : daftar) {

            if (m.getNim().equals(cariNim)) {

                // Meminta pengguna memasukkan IPK baru
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                // Memperbarui IPK mahasiswa menggunakan method updateIpk()
                m.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!\n");

                // Menampilkan kembali data mahasiswa setelah IPK diperbarui
                m.tampilkanInfo();
                System.out.println("Status   : " + m.cekKelulusan());
                System.out.println("Predikat : " + m.hitungPredikat());

                ditemukan = true;
                break;
            }
        }

        // Menampilkan pesan jika NIM tidak ditemukan
        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan!");
        }

        // Menutup Scanner untuk menghindari resource leak
        input.close();
    }
}