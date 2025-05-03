import java.util.Scanner;

public class hcr1 {
    /*
     * Buat program Java yang menerima input N, lalu mencetak piramida angka
     * terbalik, contohnya:
     * Jika N = 5:
     * 
     * 1 2 3 4 5
     *  1 2 3 4
     *   1 2 3
     *    1 2
     *     1
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Piramida : ");
        int n = userInput.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int spasi = n - i; spasi > 0; spasi--) {
                System.out.print(" ");
            }
            for (int angka = 1; angka <= i; angka++) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }

    }

}
