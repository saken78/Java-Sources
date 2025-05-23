// binaries recursive
public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        displayBinary(23);
        System.out.println();

    }

    public static void displayBinary(int value) {
        if (value > 0) {
            
            displayBinary(value / 2); 
            // ini fungsi yang memanggil dirinya sendiri
            System.out.print(value % 2);
        }

    }

}
