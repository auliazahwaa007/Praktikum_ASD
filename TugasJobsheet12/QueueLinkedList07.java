package TugasJobsheet12;

public class QueueLinkedList07 {
    Node07 front;
    Node07 rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }
    public boolean isFull() {
        return false;
    }
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }
    public void enqueue(Mahasiswa07 data) {
        Node07 newNode = new Node07(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Mahasiswa masuk ke antrian");
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilData();
        }
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node07 temp = front;

            System.out.println("\nDaftar Antrian:");
            while (temp != null) {
                temp.data.tampilData();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre : " + size);
    }
}