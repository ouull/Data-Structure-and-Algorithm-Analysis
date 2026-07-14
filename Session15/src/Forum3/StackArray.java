package Forum3;

/*
 * Implementasi Stack menggunakan Array.
 */
public class StackArray {

    private int[] stack;
    private int top;

    // Constructor
    public StackArray(int size) {

        stack = new int[size];
        top = -1;

    }

    // Menambahkan data (Push)
    public void push(int data) {

        if (top == stack.length - 1) {

            System.out.println("Stack penuh.");
            return;

        }

        stack[++top] = data;

    }

    // Menghapus data (Pop)
    public void pop() {

        if (top == -1) {

            System.out.println("Stack kosong.");
            return;

        }

        System.out.println("Data yang keluar : " + stack[top]);

        top--;

    }

    // Melihat data paling atas (Peek)
    public void peek() {

        if (top == -1) {

            System.out.println("Stack kosong.");
            return;

        }

        System.out.println("Data paling atas : " + stack[top]);

    }

    // Menampilkan isi stack
    public void display() {

        if (top == -1) {

            System.out.println("Stack kosong.");
            return;

        }

        for (int i = top; i >= 0; i--) {

            System.out.print(stack[i] + " ");

        }

        System.out.println();

    }

}