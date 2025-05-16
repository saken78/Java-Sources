package Guessing;

import java.util.ArrayList;

public class NumberAnalyzer {
    private ArrayList<Integer> sended = new ArrayList<>();

    NumberAnalyzer(ArrayList<Integer> sender) {
        this.sended = sender;
    }

    public void checking() {
        for (int n : sended) {
            if (n % 2 != 0) {
                System.out.println("Numbers is odd : " + n);
            }
        }
    }

    public void even() {
        for (int n : sended) {
            if (n % 2 == 0) {
                System.out.println("Numbers is even : " + n);
            }
        }
    }

    public void threefive() {
        for (int n : sended) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Multiple by 3 & 5 : " + n);
            }
        }
    }

}
