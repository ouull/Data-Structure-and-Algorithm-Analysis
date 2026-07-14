package stackqueue;

/*
 * Class Queue
 * Mengelola antrian pelanggan dengan konsep FIFO
 * (First In First Out).
 */
public class Queue {

    private Node front;
    private Node rear;
    private int jumlah;

    // Constructor
    public Queue() {

        front = null;
        rear = null;
        jumlah = 0;

    }

    /*
     * Mengecek apakah queue kosong.
     */
    public boolean isEmpty() {

        return front == null;

    }

    /*
     * Menambahkan pelanggan ke antrian.
     */
    public void enqueue(String nomorAntrian,
                        String namaPelanggan,
                        double totalBelanja) {

        Node newNode = new Node(
                nomorAntrian,
                namaPelanggan,
                totalBelanja);

        if (isEmpty()) {

            front = rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;

        }

        jumlah++;

        System.out.println("Pelanggan berhasil ditambahkan ke antrian.");

    }

    /*
     * Mengambil pelanggan pertama dari antrian.
     */
    public Node dequeue() {

        if (isEmpty()) {

            System.out.println("Antrian kosong.");
            return null;

        }

        Node keluar = front;

        front = front.next;

        if (front == null) {

            rear = null;

        }

        keluar.next = null;

        jumlah--;

        return keluar;

    }

    /*
     * Menampilkan seluruh antrian.
     */
    public void displayQueue() {

        if (isEmpty()) {

            System.out.println("Antrian masih kosong.");
            return;

        }

        Node current = front;

        System.out.println("\n===== ANTRIAN PELANGGAN =====");

        while (current != null) {

            System.out.println("--------------------------------");
            System.out.println("Nomor Antrian : " + current.nomorAntrian);
            System.out.println("Nama          : " + current.namaPelanggan);
            System.out.println("Total Belanja : Rp " + current.totalBelanja);

            current = current.next;

        }

        System.out.println("--------------------------------");
        System.out.println("Jumlah Antrian : " + jumlah);

    }

}