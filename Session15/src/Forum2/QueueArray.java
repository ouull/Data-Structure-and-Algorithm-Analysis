package Forum2;

/*
 * Implementasi Queue menggunakan Array.
 */
public class QueueArray {

    private int[] queue;
    private int front;
    private int rear;

    // Constructor
    public QueueArray(int size) {

        queue = new int[size];
        front = -1;
        rear = -1;

    }

    // Menambahkan data
    public void enqueue(int data) {

        if (rear == queue.length - 1) {

            System.out.println("Queue penuh.");
            return;

        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = data;

    }

    // Menghapus data
    public void dequeue() {

        if (front == -1 || front > rear) {

            System.out.println("Queue kosong.");
            return;

        }

        System.out.println("Data yang keluar : " + queue[front]);

        front++;

    }

    // Menampilkan isi queue
    public void display() {

        if (front == -1 || front > rear) {

            System.out.println("Queue kosong.");
            return;

        }

        for (int i = front; i <= rear; i++) {

            System.out.print(queue[i] + " ");

        }

        System.out.println();

    }

}