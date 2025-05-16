package Mode;

import java.util.ArrayList;

public class Mode {

    ArrayList<Integer> sended = new ArrayList<>();

    Mode(ArrayList<Integer> sender) {
        this.sended = sender;
    }

    public void mode() {

        ArrayList<Integer> done = new ArrayList<>();

        for (int n : sended) {
            if (!done.contains(n)) {
                int mod = 0;
                for (int j : sended) {
                    if (n == j) {
                        mod++;

                    }
                }

                System.out.println("Angka : " + n + " Muncul : " + mod);
                done.add(n);
            }

        }
    }
}
