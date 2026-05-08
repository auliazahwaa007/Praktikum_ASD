package Pertemuan12;

public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa07 () {

    }
    public Mahasiswa07(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    public void tampilinformasi() {
        System.out.printf("%-15s %-15s %-15s %.1f\n", nama, nim, kelas, ipk);
    }
}