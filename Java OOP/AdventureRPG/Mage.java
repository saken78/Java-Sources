package AdventureRPG;

public class Mage extends Karakter implements CanAttack {

    Mage(String name) {
        super(name);
    }

    public void role() {
        System.out.println(name + " Mage Backlaner");
    }

    public void action() {
        System.out.println(name + " Karakter called underdeath");
    }

    public void attack() {
        System.out.println("Take a Sniff");
    }

}
