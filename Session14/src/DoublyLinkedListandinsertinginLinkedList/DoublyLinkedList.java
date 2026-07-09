package DoublyLinkedListandinsertinginLinkedList;

/*
 * Class DoublyLinkedList
 * Implementasi insertion pada Doubly Linked List.
 */
public class DoublyLinkedList {

    private Node head;

    // Menampilkan isi linked list
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

    // Insert di awal
    public void insertFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }

    }

    // Insert di akhir
    public void insertLast(int data) {

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

    // Insert setelah node tertentu
    public void insertAfter(int target, int data) {

        Node current = head;

        while (current != null && current.data != target) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        Node newNode = new Node(data);

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;

    }

    // Insert pada posisi tertentu (dimulai dari posisi 1)
    public void insertAtPosition(int position, int data) {

        if (position == 1) {

            insertFirst(data);
            return;

        }

        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {

            current = current.next;
            count++;

        }

        if (current == null) {
            return;
        }

        Node newNode = new Node(data);

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;

    }

}
