package Forum3;

/*
 * Main Program
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Stack Menggunakan Array");

        StackArray array = new StackArray(5);

        array.push(10);
        array.push(20);
        array.push(30);

        System.out.print("Isi Stack : ");
        array.display();

        array.peek();

        array.pop();

        System.out.print("Setelah Pop : ");
        array.display();

        System.out.println();

        System.out.println("Stack Menggunakan Linked List");

        StackLinkedList linked = new StackLinkedList();

        linked.push(10);
        linked.push(20);
        linked.push(30);

        System.out.print("Isi Stack : ");
        linked.display();

        linked.peek();

        linked.pop();

        System.out.print("Setelah Pop : ");
        linked.display();

    }

}