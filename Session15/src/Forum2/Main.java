package Forum2;

/*
 * Main Program
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Queue Menggunakan Array");

        QueueArray array = new QueueArray(5);

        array.enqueue(10);
        array.enqueue(20);
        array.enqueue(30);

        System.out.print("Isi Queue : ");
        array.display();

        array.dequeue();

        System.out.print("Setelah Dequeue : ");
        array.display();

        System.out.println();

        System.out.println("Queue Menggunakan Linked List");

        QueueLinkedList linked = new QueueLinkedList();

        linked.enqueue(10);
        linked.enqueue(20);
        linked.enqueue(30);

        System.out.print("Isi Queue : ");
        linked.display();

        linked.dequeue();

        System.out.print("Setelah Dequeue : ");
        linked.display();

    }

}