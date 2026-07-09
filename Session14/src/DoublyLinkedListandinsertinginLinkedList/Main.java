package DoublyLinkedListandinsertinginLinkedList;

/*
 * Main Program
 */
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        // Insert di awal
        list.insertFirst(20);
        list.insertFirst(10);

        System.out.println("Setelah insertFirst():");
        list.display();

        System.out.println();

        // Insert di akhir
        list.insertLast(40);
        list.insertLast(50);

        System.out.println("Setelah insertLast():");
        list.display();

        System.out.println();

        // Insert setelah node tertentu
        list.insertAfter(20, 30);

        System.out.println("Setelah insertAfter(20, 30):");
        list.display();

        System.out.println();

        // Insert pada posisi tertentu
        list.insertAtPosition(3, 25);

        System.out.println("Setelah insertAtPosition(3, 25):");
        list.display();

    }

}
