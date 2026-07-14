package Forum1;

/*
 * Class CircularQueue
 * Implementasi Circular Queue menggunakan array.
 */
public class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public CircularQueue(int capacity) {

        this.capacity = capacity;
        queue = new int[capacity];

        front = 0;
        rear = 0;
        size = 0;

    }

    // Mengecek apakah queue penuh
    public boolean isFull() {
        return size == capacity;
    }

    // Mengecek apakah queue kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Menambahkan data
    public void enqueue(int data) {

        if (isFull()) {

            System.out.println("Queue penuh.");
            return;

        }

        queue[rear] = data;

        rear = (rear + 1) % capacity;

        size++;

    }

    // Menghapus data
    public int dequeue() {

        if (isEmpty()) {

            System.out.println("Queue kosong.");
            return -1;

        }

        int data = queue[front];

        front = (front + 1) % capacity;

        size--;

        return data;

    }

    // Menampilkan isi queue
    public void display() {

        if (isEmpty()) {

            System.out.println("Queue kosong.");
            return;

        }

        int i = front;

        for (int count = 0; count < size; count++) {

            System.out.print(queue[i] + " ");

            i = (i + 1) % capacity;

        }

        System.out.println();

    }

}