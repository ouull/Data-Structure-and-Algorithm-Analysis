package Deletion;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
class SinglyLinkedList {
    Node head;
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // Menghapus node pertama
    public void removeHead() {
        if (head == null) {
            System.out.println("Linked List kosong.");
            return;
        }
        head = head.next;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        System.out.println("Sebelum dihapus");
        list.display();
        list.removeHead();
        System.out.println("Setelah dihapus");
        list.display();
    }
}