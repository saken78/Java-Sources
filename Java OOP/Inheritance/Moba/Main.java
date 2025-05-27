package inheritance.Moba;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Assasin hero1 = new Assasin("Ling", 1000, 90);

        Mage hero2 = new Mage("Lunox", 1000, 70);

        Tanker hero3 = new Tanker("Atlas", 2000, 40);

        Fighter hero4 = new Fighter("Thamuz", 1200, 40);

        ArrayList<Hero> kumpulanHero = new ArrayList<Hero>();

        // HeroMage.add(hero2);

        kumpulanHero.add(hero1);
        kumpulanHero.add(hero2);
        kumpulanHero.add(hero3);
        kumpulanHero.add(hero4);

        for (Hero hero : kumpulanHero) {
            hero.show();
        }

        hero3.specialAbillity();
        
        hero1.attack(hero3);
        hero3.show();

        // next debuff

    }
}


