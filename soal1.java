import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();
        
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlah = scanner.nextInt();
        
        double diskon = 0;
        
        if (jumlah >= 5 && jumlah <= 10) {
            diskon = 0.05;
        } else if (jumlah >= 11 && jumlah <= 20) {
            diskon = 0.1;
        } else if (jumlah > 20) {
            diskon = 0.2;
        }
        
        double totalHarga = harga * jumlah * (1 - diskon);
        
        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}