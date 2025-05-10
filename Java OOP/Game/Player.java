package Game;

public class Player {

    private String name;
    private static int jumlahPlayer;

    // Constructor default
    public Player() {
        jumlahPlayer++;
        this.name = "Player" + jumlahPlayer;
    }

    // Constructor overloading
    public Player(String name) {
        jumlahPlayer++;
        this.name = name;
    }

    public void show() {
        System.out.println("Name : " + this.name);
    }

    public static int getJumlahPlayer() {
        return jumlahPlayer;
    }

}
