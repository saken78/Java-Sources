package Attacker;

import java.util.Random;

public class Karakter {
    private String nama;
    private int hp;
    private int maxAttack;
    private Random rand = new Random();

    public Karakter(String nama, int hp, int maxAttack) {
        this.nama = nama;
        this.hp = hp;
        this.maxAttack = maxAttack;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHP() {
        return this.hp;
    }

    public void attack(Karakter musuh) {
        int damage = rand.nextInt(this.maxAttack) + 1; // random 1 - maxAttack
        musuh.hp -= damage;
        if (musuh.hp < 0)
            musuh.hp = 0;
        System.out.println(this.nama + " menyerang " + musuh.nama + " sebesar " + damage + " damage.");
    }

    public void showStatus() {
        System.out.println(this.nama + " ➝ HP: " + this.hp);
    }
}
