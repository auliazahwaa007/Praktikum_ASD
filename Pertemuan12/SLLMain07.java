package Pertemuan12;
import java.util.Scanner;
public class SLLMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList07 sll = new SingleLinkedList07();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        System.out.println();
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
        // Mahasiswa07 mhs1 = new Mahasiswa07("21212200", "Alvaro", "1A", 4.0);
        // Mahasiswa07 mhs2 = new Mahasiswa07("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa07 mhs3 = new Mahasiswa07("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa07 mhs4 = new Mahasiswa07("21212203", "Dirga", "4D", 3.6);
        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
