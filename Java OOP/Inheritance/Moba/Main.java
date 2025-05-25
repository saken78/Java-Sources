package inheritance.Moba;

public class Main {
    public static void main(String[] args) {
        Assasin hero1 = new Assasin("Ling", 1000, 90);

        Mage hero2 = new Mage("Lunox", 1000, 70);

        Tanker hero3 = new Tanker("Atlas", 2000, 40);

        Fighter hero4 = new Fighter("Thamuz", 1200, 40);

        hero3.specialAbillity();
        hero2.specialAbillity();
        hero2.attack(hero3);
        hero3.show();
        // hero2.attack(hero3);

        // next debuff

    }
}


