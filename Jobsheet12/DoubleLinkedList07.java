package Jobsheet12;

public class DoubleLinkedList07 {
    Node07 head;
    Node07 tail;

    public DoubleLinkedList07() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa07 data) {
        Node07 newNode = new Node07(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa07 data) {
        Node07 newNode = new Node07(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa07 data) {
        Node07 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node07 newNode = new Node07(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return; 
        }
        Node07 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        Node07 current = tail;
        while (current != null) {
            current.data.tampil();   
            current = current.prev;  
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Mahasiswa07 dataDihapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berikut berhasil dihapus dari awal:");
        dataDihapus.tampil();
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Mahasiswa07 dataDihapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berikut berhasil dihapus dari akhir:");
        dataDihapus.tampil();
    }
}