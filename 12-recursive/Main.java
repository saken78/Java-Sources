package Latihan;

public class Mai1n {
    public static void main(String[] args) {
        int hasil = facttorial(5);
        System.out.println(hasil);
    }

    public static int facttorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * facttorial(n - 1);
        }
    }
}
