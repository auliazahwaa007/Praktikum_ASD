package TugasJobsheet10;

public class Antriankrs07 {
    Mahasiswa07[] data;
    int front;
    int rear;
    int size;
    int max;

    int jumlahDiproses = 0;
    int maksimalKRS = 30;

    public Antriankrs07(int max) {
        this.max = max;
        data = new Mahasiswa07[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;

        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa07 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;

        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Mahasiswa yang diproses KRS:");

        int jumlahPanggil = Math.min(2, size);

        for (int i = 0; i < jumlahPanggil; i++) {
            Mahasiswa07 mhs = data[front];
            mhs.tampilkanData();

            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian Mahasiswa:");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;

            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("2 Antrian Terdepan:");

        int batas = Math.min(2, size);

        for (int i = 0; i < batas; i++) {
            int index = (front + i) % max;

            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void jumlahSudahKRS() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: "
                + jumlahDiproses);
    }

    public void jumlahBelumKRS() {
        System.out.println("Sisa kuota KRS DPA: "
                + (maksimalKRS - jumlahDiproses));
    }
}
