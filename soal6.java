import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrom(input)) {
            System.out.println("Kata atau frase tersebut adalah palindrom.");
        } else {
            System.out.println("Kata atau frase tersebut bukan palindrom.");
        }
    }

    public static boolean isPalindrom(String input) {
        // Menghapus spasi dan mengubah semua huruf menjadi huruf kecil
        input = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}