package inheritance.Moba;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Assasin hero1 = new Assasin("Ling", 1000, 90);

        Mage hero2 = new Mage("Lunox", 1000, 70);

        Tanker hero3 = new Tanker("Atlas", 2000, 40);

        Fighter hero4 = new Fighter("Thamuz", 1200, 40);

        Mage hero5 = new Mage("Alice", 1000, 120);

        ArrayList<Hero> kumpulanHero = new ArrayList<Hero>();

        kumpulanHero.add(hero1);
        kumpulanHero.add(hero2);
        kumpulanHero.add(hero3);
        kumpulanHero.add(hero4);
        kumpulanHero.add(hero5);

        for (Hero hero : kumpulanHero) {
            hero.show();
        }

        hero1.buff();

        hero1.attack(hero5);

        hero5.show();

    }
}


