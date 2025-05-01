import java.util.Scanner;

public class hcr6 {
    /*
     * Buat program Java yang meminta input satu angka N, lalu cetak * angka dari 1
     * sampai N.
     * Untuk setiap angka:
     * 
     * Tampilkan apakah Genap atau Ganjil
     * 
     * Jika angka tersebut kelipatan 5, tambahkan tulisan: << kelipatan * 5 >>
     * 
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        for (int a = 1; a <= n; a++) {
            if (a % 2 == 0 && a % 5 == 0) {
                System.out.println(a + " even and multipled by 5");
            } else if (a % 2 == 0) {
                System.out.println(a + " even");
            } else if (a % 2 != 0 && a % 5 == 0) {
                System.out.println(a + " odd and multipled by 5");
            } else if (a % 2 != 0) {
                System.out.println(a + " odd");
            }
        }
    }

}
