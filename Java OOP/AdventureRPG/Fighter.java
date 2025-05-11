package AdventureRPG;

public class Fighter extends Karakter implements CanAttack {

    Fighter(String name) {
        super(name);
    }

    public void role() {
        System.out.println("Fighter : Frontliner");
    }

    @Override
    public void action() {
        System.out.println(name + " Fighting until deathh");
    }

    public void attack() {
        System.out.println("Sringggggggg!!!!! Sworddss through the bodies");
    }
}
