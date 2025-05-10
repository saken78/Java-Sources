package Game;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Budi");
        Player p2 = new Player();
        Player p3 = new Player("Cici");

        p1.show();
        p2.show();
        p3.show();

        PlayerManager.showJumlah();
    }
}
