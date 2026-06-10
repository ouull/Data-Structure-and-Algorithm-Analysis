package binus.mahasiswa;
	
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftar = new Mahasiswa[5];

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

        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            System.out.println("Status   : " + m.cekKelulusan());
            System.out.println("Predikat : " + m.hitungPredikat());
            System.out.println();
        }

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        boolean ditemukan = false;

        for (Mahasiswa m : daftar) {

            if (m.getNim().equals(cariNim)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                m.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!\n");

                m.tampilkanInfo();
                System.out.println("Status   : " + m.cekKelulusan());
                System.out.println("Predikat : " + m.hitungPredikat());

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan!");
        }

        input.close();
    }
}