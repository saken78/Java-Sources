package AdventureRPG;

import java.util.Scanner;
import java.util.ArrayList;

public class TeamManager extends Main {
    Scanner inputUser = new Scanner(System.in);
    ArrayList<Karakter> teemate = new ArrayList<>();

    // add karakter
    public void addTeam() {
        boolean running = true;
        while (running == true) {
            System.out.print("add name : ");
            String name = inputUser.nextLine();

            String type = inputUser.nextLine();

            try {
                if (type.equalsIgnoreCase("mage")) {
                    teemate.add(new Mage(name));
                } else if (type.equalsIgnoreCase("healer")) {
                    teemate.add(new Healer(name));
                } else if (type.equalsIgnoreCase(type)) {
                    teemate.add(new Fighter(name));
                } else {
                    throw new NoName("Notfound");
                }
            } catch (NoName e) {
                System.out.println("error : " + e.getMessage());
            }
            System.out.print("Add again (y/n) : ");
            String cn = inputUser.nextLine();
            if (cn.equalsIgnoreCase("y")) {
                running = true;
            } else {
                running = false;
            }
        }

    }

    public void show() {
        for (Karakter karakter : teemate) {
            karakter.role();
            karakter.action();
            if (karakter instanceof CanAttack) {
                ((CanAttack) karakter).attack();
            }
        }
    }

}
