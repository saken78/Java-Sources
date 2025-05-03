import java.util.Scanner;

public class hcr7 {
    /*
     * gueesing
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("tebak angka 1 - 10 : ");
        int n = userInput.nextInt();
        int min = 1;
        boolean guess;
        int random = min + (int) (Math.random() * 10);
        while (true) {
            if (n <= 10 && n >= 1) {
                if (n == random) {
                    System.out.println("tebakan anda benar");
                    System.out.println("Random : " + random);
                    break;
                } else {
                    System.out.println("tebakan anda salah");
                    System.out.print("Masukan tebakan lagi : ");
                    n = userInput.nextInt();
                }

            } else {
                System.err.println("Masukan angka yang sesuai !!");
                break;
            }
        }
    }

}
