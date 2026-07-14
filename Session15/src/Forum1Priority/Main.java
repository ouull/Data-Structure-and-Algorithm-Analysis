package Forum1Priority;

import java.util.PriorityQueue;

/*
 * Implementasi Priority Queue.
 */
public class Main {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(40);

        System.out.println("Priority Queue:");

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());

        }

    }

}