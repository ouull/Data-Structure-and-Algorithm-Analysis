package CircularDoublyLinkedList;

/*
 * Class CircularDoublyLinkedList
 * Implementasi Circular Doubly Linked List.
 */
public class CircularDoublyLinkedList {

    private Node head;
    private Node tail;

    // Constructor
    public CircularDoublyLinkedList() {

        head = null;
        tail = null;

    }

    /*
     * Menambahkan node di akhir Circular Doubly Linked List.
     */
    public void insert(int data) {

        Node newNode = new Node(data);

        // Jika linked list masih kosong
        if (head == null) {

            head = newNode;
            tail = newNode;

            // Membentuk circular
            head.next = head;
            head.prev = head;

        }

        // Jika linked list sudah memiliki node
        else {

            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;

        }

    }

    /*
     * Traversal maju
     * Menggunakan pointer next.
     */
    public void displayForward() {

        if (head == null) {

            System.out.println("Linked List kosong.");
            return;

        }

        Node current = head;

        do {

            System.out.print(current.data + " <-> ");

            current = current.next;

        }

        while (current != head);

        System.out.println("(kembali ke head)");

    }

    /*
     * Traversal mundur
     * Menggunakan pointer prev.
     */
    public void displayBackward() {

        if (tail == null) {

            System.out.println("Linked List kosong.");
            return;

        }

        Node current = tail;

        do {

            System.out.print(current.data + " <-> ");

            current = current.prev;

        }

        while (current != tail);

        System.out.println("(kembali ke tail)");

    }

}