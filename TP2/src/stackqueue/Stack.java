package stackqueue;

/*
 * Class Stack
 * Menyimpan riwayat transaksi pelanggan
 * menggunakan konsep LIFO (Last In First Out).
 */
public class Stack {

    private Node top;

    // Constructor
    public Stack() {

        top = null;

    }

    /*
     * Mengecek apakah stack kosong.
     */
    public boolean isEmpty() {

        return top == null;

    }

    /*
     * Menambahkan transaksi ke riwayat.
     */
    public void push(Node data) {

        Node newNode = new Node(
                data.nomorAntrian,
                data.namaPelanggan,
                data.totalBelanja);

        newNode.next = top;

        top = newNode;

    }

    /*
     * Menampilkan seluruh riwayat transaksi.
     */
    public void displayStack() {

        if (isEmpty()) {

            System.out.println("Belum ada riwayat transaksi.");
            return;

        }

        Node current = top;

        System.out.println("\n===== RIWAYAT TRANSAKSI =====");

        while (current != null) {

            System.out.println("--------------------------------");
            System.out.println("Nomor Antrian : " + current.nomorAntrian);
            System.out.println("Nama          : " + current.namaPelanggan);
            System.out.println("Total Belanja : Rp " + current.totalBelanja);

            current = current.next;

        }

        System.out.println("--------------------------------");

    }

}