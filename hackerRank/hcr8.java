import java.util.Scanner;

public class hcr8 {
    /*
     * Buat program Java yang menerima input N, lalu mencetak piramida angka seperti
     * berikut:
     * 
     * Contoh:
     * 
     * Jika N = 5, maka output-nya:
     * 
     *     1
     *    1 2
     *   1 2 3
     *  1 2 3 4
     * 1 2 3 4 5
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Piramida : ");
        int n = userInput.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n - a; b++) {
                System.out.print("  ");
            }

            for (int c = 1; c <= a; c++) {
                System.out.print(c + "   ");
            }
            System.out.println();
        }

    }

}
