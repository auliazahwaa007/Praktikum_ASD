package TugasJobsheet10;

import java.util.Scanner;

public class Mainkrs07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Antriankrs07 antrian = new Antriankrs07(10);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN PERSETUJUAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses KRS");
            System.out.println("8. Sisa Kuota DPA");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa07 mhs =
                            new Mahasiswa07(nim, nama, prodi, kelas);

                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkan2Terdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahSudahKRS();
                    break;

                case 8:
                    antrian.jumlahBelumKRS();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilih != 0);
    }
}
