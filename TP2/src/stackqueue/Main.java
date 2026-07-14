package stackqueue;

import java.util.Scanner;

/*
 * Class Main
 * Program utama Sistem Kasir Toko
 * menggunakan Queue dan Stack.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Queue queue = new Queue();
        Stack stack = new Stack();

        int pilihan;

        do {

            System.out.println("\n========================================");
            System.out.println("         SISTEM KASIR TOKO");
            System.out.println("========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

            case 1:

                System.out.print("Masukkan Nomor Antrian : ");
                String nomor = input.nextLine();

                System.out.print("Masukkan Nama Pelanggan : ");
                String nama = input.nextLine();

                System.out.print("Masukkan Total Belanja : ");
                double total = input.nextDouble();
                input.nextLine();

                queue.enqueue(nomor, nama, total);

                break;

            case 2:

                Node pelanggan = queue.dequeue();

                if (pelanggan != null) {

                    System.out.println("\nMelayani Pelanggan");
                    System.out.println("Nomor Antrian : " + pelanggan.nomorAntrian);
                    System.out.println("Nama          : " + pelanggan.namaPelanggan);
                    System.out.println("Total Belanja : Rp " + pelanggan.totalBelanja);

                    stack.push(pelanggan);

                    System.out.println("Transaksi berhasil disimpan ke riwayat.");

                }

                break;

            case 3:

                queue.displayQueue();

                break;

            case 4:

                stack.displayStack();

                break;

            case 5:

                System.out.println("Terima kasih telah menggunakan program.");

                break;

            default:

                System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 5);

        input.close();

    }

}