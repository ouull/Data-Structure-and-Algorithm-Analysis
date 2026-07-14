package linkedlist;

import java.util.Scanner;

/*
 * Class Main
 * Program utama Sistem Pengelolaan Daftar Buku Perpustakaan.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedList daftarBuku = new LinkedList();

        int pilihan;

        do {

            System.out.println("\n========================================");
            System.out.println(" SISTEM PENGELOLAAN DAFTAR BUKU");
            System.out.println("========================================");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku Terakhir");
            System.out.println("3. Cari Buku");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Total Buku");
            System.out.println("6. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

            case 1:

                System.out.print("Masukkan Kode Buku : ");
                String kode = input.nextLine();

                // Validasi maksimal 5 karakter
                if (kode.length() > 5) {

                    System.out.println("Kode buku maksimal 5 karakter.");
                    break;

                }

                System.out.print("Masukkan Judul Buku : ");
                String judul = input.nextLine();

                System.out.print("Masukkan Nama Penulis : ");
                String penulis = input.nextLine();

                daftarBuku.tambahBuku(kode, judul, penulis);

                break;

            case 2:

                daftarBuku.hapusBukuTerakhir();

                break;

            case 3:

                System.out.print("Masukkan Kode Buku yang dicari : ");
                String cari = input.nextLine();

                daftarBuku.cariBuku(cari);

                break;

            case 4:

                daftarBuku.tampilkanSemuaBuku();

                break;

            case 5:

                System.out.println("Total Buku : "
                        + daftarBuku.hitungTotalBuku());

                break;

            case 6:

                System.out.println("Terima kasih telah menggunakan program.");

                break;

            default:

                System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 6);

        input.close();

    }

}