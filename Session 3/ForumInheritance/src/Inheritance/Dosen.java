package Inheritance;

public class Dosen extends Pegawai {
    private String mataKuliah;

    // Constructor
    public Dosen(String nama, int umur, String mataKuliah) {
        super(nama, umur); // memanggil constructor superclass
        this.mataKuliah = mataKuliah;
    }

    // Method khusus dosen
    public void tampilkanInfoDosen() {
        tampilkanInfo(); // method dari superclass
        System.out.println("Mata Kuliah : " + mataKuliah);
    }
}
