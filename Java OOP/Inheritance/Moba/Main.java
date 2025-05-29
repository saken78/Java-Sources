package inheritance.Moba;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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

        for (Hero hero : kumpulanHero) {
            hero.show();
        }

        hero6.buff();
        hero2.attack(hero6);

        hero6.show();

    }
}
