package AdventureRPG;

public class Healer extends Karakter {

    Healer(String name) {
        super(name);
    }

    public void role() {
        System.out.println("Healer");
    }

    @Override
    public void action() {
        System.out.println(name + " is healing");
    }

}
