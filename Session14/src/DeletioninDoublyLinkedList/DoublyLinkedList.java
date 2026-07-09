package DeletioninDoublyLinkedList;

/*
 * Class DoublyLinkedList
 * Implementasi operasi deletion pada Doubly Linked List.
 */
public class DoublyLinkedList {

    private Node head;

    // Menambahkan data di akhir (untuk persiapan data)
    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    // Deletion di awal
    public void deleteFirst() {

        if (head == null) {
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

    }

    // Deletion di akhir
    public void deleteLast() {

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;

    }

    // Deletion pada posisi tertentu (dimulai dari 1)
    public void deleteAtPosition(int position) {

        if (head == null) {
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        if (current.next == null) {
            deleteLast();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

    }

    // Menampilkan isi Doubly Linked List
    public void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" <-> ");
            }

            current = current.next;
        }

        System.out.println();

    }

}
