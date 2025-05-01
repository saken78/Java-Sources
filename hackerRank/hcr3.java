import java.util.Scanner;

public class hcr3 {
    /*
     * Buat program Java yang meminta input angka N, lalu hitung dan tampilkan
     * jumlah semua bilangan genap dari 1 sampai N.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int sum = 0;
        for (int a = 1; a <= n; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
                sum = sum + a; // sum += a
            }
        }
        System.out.println("Jumlah : " + sum);
    }

}
