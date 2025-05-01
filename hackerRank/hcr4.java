import java.util.Scanner;

public class hcr4 {
    /*
     * Buat program Java yang menerima input angka N, lalu cetak segitiga bintang
     * seperti berikut:
     * 
     * Jika N = 4, maka output-nya:
     * *
     * *
     * * *
     * * * *
     * 
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
