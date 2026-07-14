package Forum1;

public class Main {

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Circular Queue:");
        queue.display();

        queue.dequeue();

        System.out.println("Setelah dequeue:");
        queue.display();

    }

}