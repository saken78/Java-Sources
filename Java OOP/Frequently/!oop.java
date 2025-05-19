package Latihan;

/* Buat program Java yang menerima input array angka dari user,
lalu menentukan angka mana yang paling sering muncul dan berapa kali kemunculannya.
 */
import java.util.*;

public class !oop {
    public static void main(String[] args) {
        ArrayList<Integer> user = new ArrayList<>();
        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan berpa banyak angka nya : ");
        int much = inputUser.nextInt();

        for (int i = 1; i < much; i++) {
            System.out.print("Angka ke -" + i + " : ");
            int angka = inputUser.nextInt();
            user.add(angka);
        }

        int buffer = 0;

        // highest
        for (int k : user) {
            if (k > buffer) {
                buffer = k;
            }
        }
        System.out.println();
        System.out.println("Tertinggi : " + buffer);

        // frequently
        int buff = 0;
        ArrayList<Integer> done = new ArrayList<>();
        for (int k : user) {
            if (!done.contains(k)) {
                buff = 0;
                for (int l : user) {
                    if (k == l) {
                        buff++;
                    }
                }
            }
            System.out.println("Angka : " + k + " Muncul : " + buff);
            done.add(k);
        }

    }
}
