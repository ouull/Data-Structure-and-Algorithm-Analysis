package stackqueue;

/*
 * Class Node
 * Menyimpan data pelanggan pada Queue dan Stack.
 */
public class Node {

    String nomorAntrian;
    String namaPelanggan;
    double totalBelanja;

    Node next;

    // Constructor
    public Node(String nomorAntrian, String namaPelanggan, double totalBelanja) {

        this.nomorAntrian = nomorAntrian;
        this.namaPelanggan = namaPelanggan;
        this.totalBelanja = totalBelanja;

        this.next = null;

    }

}