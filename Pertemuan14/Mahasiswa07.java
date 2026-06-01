package Pertemuan14;

public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa07() {
    }

    public Mahasiswa07(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: "+this.nim+" "+
        "Nama: "+this.nama+" "+
        "Kelas: "+this.kelas+" "+
        "IPK: "+this.ipk);
    }
}