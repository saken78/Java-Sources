import java.util.Scanner;

public class hcr10 {
    /*
    1
    3 5
    7 9 11
    13 15 17 
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("N : ");
        int n = userInput.nextInt();
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(" " + odd);
                odd += 2;
            }
            System.out.println();
        }

    }

}
