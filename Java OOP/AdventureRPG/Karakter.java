package AdventureRPG;

public abstract class Karakter {
    String name;

    Karakter(String name) {
        this.name = name;
    }

    public abstract void role();

    public void action() {
        System.out.println(name + " Karakter menyerang");
    }

}
 
