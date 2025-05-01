import java.util.Scanner;

public class hcr5 {
    /*
     * Buat program Java yang menerima input angka N, lalu cetak tabel * * perkalian
     * Baris ke-1/2/n adalah 1×1, 1×2, 1×3
     * 
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int c = b * a;
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }

}
