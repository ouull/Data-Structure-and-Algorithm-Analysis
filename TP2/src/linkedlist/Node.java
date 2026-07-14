package linkedlist;

/*
 * Class Node
 * Menyimpan data buku dan pointer ke node berikutnya.
 */
public class Node {

    String kodeBuku;
    String judul;
    String penulis;

    Node next;

    // Constructor
    public Node(String kodeBuku, String judul, String penulis) {

        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;

    }

}