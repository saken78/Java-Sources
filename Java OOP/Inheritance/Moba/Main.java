package inheritance.Moba;

public class Main {
    public static void main(String[] args) {
        Assasin hero1 = new Assasin("Ling", 1000, 90);

        Mage hero2 = new Mage("Lunox", 1000, 30);

        Tanker hero3 = new Tanker("Atlas", 2000, 10);

        Fighter hero4 = new Fighter("Thamuz", 1200, 40);
        hero1.levelUp();
        hero2.show();
        hero3.show();
        hero1.show();
        hero4.show();
    }
}

