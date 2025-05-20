package Latihan;

import java.util.Scanner;

class substring {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String A = inputUser.next();
        String B = inputUser.next();

        int cp = A.compareTo(B);

        if (cp > 0) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }

        String cpa = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cpb = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(cpa + " " + cpb);
    }
}
