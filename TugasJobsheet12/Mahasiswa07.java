package TugasJobsheet12;

public class Mahasiswa07 {
    String nim, nama, jurusan;
    Mahasiswa07(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    void tampilData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
    }
}