package inheritance.Moba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        Assasin hero1 = new Assasin("Ling", 1000, 90);

        Mage hero2 = new Mage("Lunox", 1000, 70);
        Mage hero5 = new Mage("Alice", 1000, 120);

        Tanker hero3 = new Tanker("Atlas", 2000, 40);

        Fighter hero4 = new Fighter("Thamuz", 1200, 40);

        Healer hero6 = new Healer("Rafaela", 700, 30);

        ArrayList<Hero> kumpulanHero = new ArrayList<Hero>();

        kumpulanHero.add(hero1);
        kumpulanHero.add(hero2);
        kumpulanHero.add(hero3);
        kumpulanHero.add(hero4);
        kumpulanHero.add(hero5);
        kumpulanHero.add(hero6);

        boolean start = true;

        while (start == true) {
            System.out.println("\nMenu ::: ");
            System.out.println("1. Attack enemy");
            System.out.println("2. Take buff");
            System.out.println("3. Debuff");
            System.out.println("4. Display hero");
            System.out.println("5. Exit");
            System.out.print("\nattack/buff/debuff/exit/display : ");
            String choose = inputUser.nextLine();

            if (choose.equalsIgnoreCase("attack")) {
                System.out.print("Siapa yang menyerang : ");
                String heroch = inputUser.nextLine();

                // attack hero ling
                if (heroch.equalsIgnoreCase("ling")) {
                    System.out.print("Ling menyerang hero apa ? ");
                    String heroAttack = inputUser.nextLine();

                    if (heroAttack.equalsIgnoreCase("lunox")) {
                        hero1.attack(hero2);
                        hero2.show();
                    } else if (heroAttack.equalsIgnoreCase("atlas")) {
                        hero1.attack(hero3);
                        hero3.show();
                    } else if (heroAttack.equalsIgnoreCase("thamuz")) {
                        hero1.attack(hero4);
                        hero4.show();
                    } else if (heroAttack.equalsIgnoreCase("alice")) {
                        hero1.attack(hero5);
                        hero5.show();
                    } else if (heroAttack.equalsIgnoreCase("rafaela")) {
                        hero1.attack(hero6);
                        hero6.show();
                    } else {
                        System.out.println("hero tidak ada");
                    }

                } else if (heroch.equalsIgnoreCase("lunox")) {
                    System.out.print("Lunox menyerang hero apa ? ");
                    String heroAttack = inputUser.nextLine();

                    if (heroAttack.equalsIgnoreCase("ling")) {
                        hero2.attack(hero1);
                        hero2.show();
                    } else if (heroAttack.equalsIgnoreCase("atlas")) {
                        hero2.attack(hero3);
                        hero3.show();
                    } else if (heroAttack.equalsIgnoreCase("thamuz")) {
                        hero2.attack(hero4);
                        hero4.show();
                    } else if (heroAttack.equalsIgnoreCase("alice")) {
                        hero2.attack(hero5);
                        hero5.show();
                    } else if (heroAttack.equalsIgnoreCase("rafaela")) {
                        hero2.attack(hero6);
                        hero6.show();
                    } else {
                        System.out.println("hero tidak ada");
                    }

                } else if (heroch.equalsIgnoreCase("alice")) {
                    System.out.print("Alice menyerang hero apa ? ");
                    String heroAttack = inputUser.nextLine();

                    if (heroAttack.equalsIgnoreCase("lunox")) {
                        hero5.attack(hero2);
                        hero2.show();
                    } else if (heroAttack.equalsIgnoreCase("atlas")) {
                        hero5.attack(hero3);
                        hero3.show();
                    } else if (heroAttack.equalsIgnoreCase("thamuz")) {
                        hero5.attack(hero4);
                        hero4.show();
                    } else if (heroAttack.equalsIgnoreCase("ling")) {
                        hero5.attack(hero1);
                        hero1.show();
                    } else if (heroAttack.equalsIgnoreCase("rafaela")) {
                        hero5.attack(hero6);
                        hero6.show();
                    } else {
                        System.out.println("hero tidak ada");
                    }

                } else if (heroch.equalsIgnoreCase("atlas")) {
                    System.out.print("Atlas menyerang hero apa ? ");
                    String heroAttack = inputUser.nextLine();

                    if (heroAttack.equalsIgnoreCase("lunox")) {
                        hero3.attack(hero2);
                        hero2.show();
                    } else if (heroAttack.equalsIgnoreCase("ling")) {
                        hero3.attack(hero1);
                        hero3.show();
                    } else if (heroAttack.equalsIgnoreCase("thamuz")) {
                        hero3.attack(hero4);
                        hero4.show();
                    } else if (heroAttack.equalsIgnoreCase("alice")) {
                        hero3.attack(hero5);
                        hero5.show();
                    } else if (heroAttack.equalsIgnoreCase("rafaela")) {
                        hero3.attack(hero6);
                        hero6.show();
                    } else {
                        System.out.println("hero tidak ada");
                    }

                } else if (heroch.equalsIgnoreCase("thamuz")) {
                    System.out.print("Thamuz menyerang hero apa ? ");
                    String heroAttack = inputUser.nextLine();

                    if (heroAttack.equalsIgnoreCase("lunox")) {
                        hero4.attack(hero2);
                        hero2.show();
                    } else if (heroAttack.equalsIgnoreCase("atlas")) {
                        hero4.attack(hero3);
                        hero3.show();
                    } else if (heroAttack.equalsIgnoreCase("ling")) {
                        hero4.attack(hero1);
                        hero4.show();
                    } else if (heroAttack.equalsIgnoreCase("alice")) {
                        hero4.attack(hero5);
                        hero5.show();
                    } else if (heroAttack.equalsIgnoreCase("rafaela")) {
                        hero4.attack(hero6);
                        hero6.show();
                    } else {
                        System.out.println("hero tidak ada");
                    }

                } else if (heroch.equalsIgnoreCase("rafaela")) {
                    System.out.println("Rafaela tidak bisa menyerang hanyak healing ");
                }

            } else if (choose.equalsIgnoreCase("buff")) {
                System.out.println();

            } else if (choose.equalsIgnoreCase("debuff")) {

            } else if (choose.equalsIgnoreCase("exit")) {
                start = false;
            } else if (choose.equalsIgnoreCase("display")) {
                for (Hero hero : kumpulanHero) {
                    hero.show();
                }
            }

        }

    }
}
