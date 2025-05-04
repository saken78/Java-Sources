package OOP_exc;

import java.util.Scanner;

class Karakter {
    private String name;
    private int level;
    private int health;
    private int attack;

    Karakter(String name, int level, int health, int attack) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
    }

    void getName() {
        System.out.println(this.name);
    }

    String setName(String name) {
        this.name = name;
        return name;
    }

    void getLevel() {
        System.out.println(this.level);
    }

    int setLevel(int level) {
        this.level = level;
        return this.level;
    }

    void getHealth() {
        System.out.println(this.name + " health : " + this.health);
    }

    int setHealth(int health) {
        this.health = health;
        return this.health;
    }

    void getAttack() {
        System.out.println(this.attack);
    }

    int setAttack(int attack) {
        this.attack = attack;
        return this.attack;
    }

    void opponentAttack(Karakter opponent) {
        System.out.println("Attacking " + opponent.name);
        opponent.health -= this.attack;
    }

    void stats() {
        System.out.println("Name\t: " + this.name);
        System.out.println("Level\t: " + this.level);
        System.out.println("Health\t: " + this.health);
        System.out.println("Attack\t: " + this.attack);
    }
}

public class enc {
    public static void main(String[] args) {
        // Scanner inputUser = new Scanner(System.in);
        Karakter freya = new Karakter("Nimus", 1, 100, 12);
        Karakter ludwik = new Karakter("Greek", 1, 100, 14);
        freya.opponentAttack(ludwik);
        freya.getAttack();
        ludwik.getHealth();

    }
}
