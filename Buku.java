import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    // Konstruktor untuk membuat objek Buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true; // Saat buku pertama kali ditambahkan, dianggap tersedia
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Buku sedang tidak tersedia.");
        }
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 1997);
        Buku buku2 = new Buku("The Lord of the Rings", "J.R.R. Tolkien", 1954);

        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        buku1.pinjamBuku();
        buku2.pinjamBuku();

        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
    }
}