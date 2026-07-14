package linkedlist;

/*
 * Class LinkedList
 * Berisi operasi-operasi pada Single Linked List.
 */
public class LinkedList {

    private Node head;

    // Constructor
    public LinkedList() {

        head = null;

    }

    /*
     * Menambahkan buku di akhir linked list.
     */
    public void tambahBuku(String kodeBuku, String judul, String penulis) {

        Node newNode = new Node(kodeBuku, judul, penulis);

        if (head == null) {

            head = newNode;

        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;

        }

        System.out.println("Buku berhasil ditambahkan.");

    }

    /*
     * Menghapus buku terakhir.
     */
    public void hapusBukuTerakhir() {

        if (head == null) {

            System.out.println("Tidak ada data untuk dihapus");
            return;

        }

        if (head.next == null) {

            head = null;

            System.out.println("Buku terakhir berhasil dihapus.");
            return;

        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

        System.out.println("Buku terakhir berhasil dihapus.");

    }

    /*
     * Mencari buku berdasarkan kode buku.
     */
    public void cariBuku(String kode) {

        Node current = head;

        while (current != null) {

            if (current.kodeBuku.equalsIgnoreCase(kode)) {

                System.out.println("\n=== Buku Ditemukan ===");
                System.out.println("Kode Buku : " + current.kodeBuku);
                System.out.println("Judul     : " + current.judul);
                System.out.println("Penulis   : " + current.penulis);

                return;

            }

            current = current.next;

        }

        System.out.println("Buku tidak ditemukan.");

    }

    /*
     * Menampilkan semua buku.
     */
    public void tampilkanSemuaBuku() {

        if (head == null) {

            System.out.println("Belum ada data buku.");
            return;

        }

        Node current = head;

        System.out.println("\n===== DAFTAR BUKU =====");

        while (current != null) {

            System.out.println("----------------------------");
            System.out.println("Kode Buku : " + current.kodeBuku);
            System.out.println("Judul     : " + current.judul);
            System.out.println("Penulis   : " + current.penulis);

            current = current.next;

        }

        System.out.println("----------------------------");
        System.out.println("Total Buku : " + hitungTotalBuku());

    }

    /*
     * Menghitung jumlah buku.
     */
    public int hitungTotalBuku() {

        int jumlah = 0;

        Node current = head;

        while (current != null) {

            jumlah++;

            current = current.next;

        }

        return jumlah;

    }

}