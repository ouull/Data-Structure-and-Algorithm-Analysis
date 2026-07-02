package Circular;

class Node {

    int data;
    Node next;

    public Node(int data) {

        this.data = data;

    }

}

class CircularLinkedList {

    Node head;

    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

            head.next = head;

            return;

        }

        Node current = head;

        while (current.next != head) {

            current = current.next;

        }

        current.next = newNode;

        newNode.next = head;

    }

    public void display() {

        if (head == null) {

            return;

        }

        Node current = head;

        do {

            System.out.print(current.data + " -> ");

            current = current.next;

        } while (current != head);

        System.out.println("(kembali ke head)");

    }

}

public class Main {

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

    }

}