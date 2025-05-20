package Latihan;

import java.util.Scanner;

public class substring2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String s = inputUser.nextLine();  // string input
        int k = inputUser.nextInt();      // panjang substring

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);

            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }

            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
