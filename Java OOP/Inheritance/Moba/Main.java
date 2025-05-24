package inheritance.Moba;

public class Main {
    public static void main(String[] args) {
        Assasin hero1 = new Assasin("Ling", 1000, 90);
        hero1.show();

        Mage hero2 = new Mage("Lunox", 1000, 30);
        hero2.show();

        Tanker hero3 = new Tanker("Atlas", 2000, 10);
        hero3.show();

        Fighter hero4 = new Fighter("Thamuz", 1200, 40);
        hero4.show();

        hero1.attack(hero3);

        hero3.show();

    }
}


