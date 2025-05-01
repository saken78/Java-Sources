import java.util.Scanner;

public class hcr1 {
    /*
     * Buat program Java yang menerima input sebuah bilangan bulat positif N, lalu
     * cetak semua angka ganjil dari 1 sampai N.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        for (int a = 1; a <= n; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            } else {
            }
        }
    }

}
