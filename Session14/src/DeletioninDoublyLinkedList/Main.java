package DeletioninDoublyLinkedList;

/*
 * Main Program
 */
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Data awal:");
        list.display();

        System.out.println();

        list.deleteFirst();
        System.out.println("Setelah deleteFirst():");
        list.display();

        System.out.println();

        list.deleteAtPosition(2);
        System.out.println("Setelah deleteAtPosition(2):");
        list.display();

        System.out.println();

        list.deleteLast();
        System.out.println("Setelah deleteLast():");
        list.display();

    }

}