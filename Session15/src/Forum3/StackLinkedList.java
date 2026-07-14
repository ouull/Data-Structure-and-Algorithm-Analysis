package Forum3;

import java.util.LinkedList;

/*
 * Implementasi Stack menggunakan Linked List.
 */
public class StackLinkedList {

    private LinkedList<Integer> stack = new LinkedList<>();

    // Push
    public void push(int data) {

        stack.push(data);

    }

    // Pop
    public void pop() {

        if (stack.isEmpty()) {

            System.out.println("Stack kosong.");
            return;

        }

        System.out.println("Data yang keluar : " + stack.pop());

    }

    // Peek
    public void peek() {

        if (stack.isEmpty()) {

            System.out.println("Stack kosong.");
            return;

        }

        System.out.println("Data paling atas : " + stack.peek());

    }

    // Display
    public void display() {

        System.out.println(stack);

    }

}