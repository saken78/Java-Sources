package AdventureRPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Fighting :::::::::");
        System.out.print("How many karakter : ");
        int manyes = inputUser.nextInt();
        inputUser.nextLine();
        Karakter[] tim = new Karakter[manyes];

        for (int i = 0; i < tim.length; i++) {
            System.out.print(" Choose karakter : ");
            String nis = inputUser.nextLine();
            System.out.print("Name : ");
            String name = inputUser.nextLine();
            try {
                if (nis.equalsIgnoreCase("fighter")) {
                    tim[i] = new Fighter(name);
                } else if (nis.equalsIgnoreCase("healer")) {
                    tim[i] = new Healer(name);
                } else if (nis.equalsIgnoreCase("mage")) {
                    tim[i] = new Mage(name);
                } else {
                    throw new NoName("Not found");
                }
            } catch (NoName e) {
                System.out.println(" error : " + e.getMessage());
            }
        }

        System.out.println();

        for (Karakter my : tim) {
            my.role();
            my.action();

            System.out.println();
        }

    }

}
