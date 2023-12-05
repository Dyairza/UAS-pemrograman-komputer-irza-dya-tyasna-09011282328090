import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                tambah(angka1, angka2);
                break;
            case '-':
                kurang(angka1, angka2);
                break;
            case '*':
                kali(angka1, angka2);
                break;
            case '/':
                bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }
    }

    public static void tambah(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public static void kurang(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    public static void kali(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }

    public static void bagi(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Pembagian oleh nol tidak diperbolehkan.");
        }
    }
}