import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        // Username dan password yang telah ditetapkan
        String usernameYangDitetapkan = "user123";
        String passwordYangDitetapkan = "pass123";

        // Meminta pengguna memasukkan username dan password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memeriksa autentikasi
        if (autentikasiBerhasil(username, password, usernameYangDitetapkan, passwordYangDitetapkan)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }

    // Metode untuk memeriksa apakah autentikasi berhasil
    public static boolean autentikasiBerhasil(String username, String password, String usernameYangDitetapkan, String passwordYangDitetapkan) {
        return username.equals(usernameYangDitetapkan) && password.equals(passwordYangDitetapkan);
    }
}