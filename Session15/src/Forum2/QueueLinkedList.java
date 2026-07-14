package Forum2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Implementasi Queue menggunakan Linked List.
 */
public class QueueLinkedList {

    Queue<Integer> queue = new LinkedList<>();

    // Menambahkan data
    public void enqueue(int data) {

        queue.add(data);

    }

    // Menghapus data
    public void dequeue() {

        System.out.println("Data yang keluar : " + queue.remove());

    }

    // Menampilkan isi queue
    public void display() {

        System.out.println(queue);

    }

}