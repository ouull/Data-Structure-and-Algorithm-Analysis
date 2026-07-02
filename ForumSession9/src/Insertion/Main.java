package Insertion;

class Node {

    int data;
    Node next;

    // Constructor node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
class SinglyLinkedList {
    Node head;
    // Menambahkan node di awal
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Menampilkan isi linked list
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
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        System.out.println("Hasil Insertion");
        list.display();

    }

}