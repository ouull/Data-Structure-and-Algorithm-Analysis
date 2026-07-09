package CircularDoublyLinkedList;

/*
 * Main Program
 */
public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList list =
                new CircularDoublyLinkedList();

        // Menambahkan data
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Circular Doubly Linked List ");

        System.out.println();

        System.out.println("Traversal Maju:");

        list.displayForward();

        System.out.println();

        System.out.println("Traversal Mundur:");

        list.displayBackward();

    }

}