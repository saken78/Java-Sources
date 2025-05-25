package inheritance.Moba;

public abstract class Hero {
    String nama;
    double health;
    double basicAttack;

    Hero(String namaInput, double healthInput, double basicAttackInput) {
        this.nama = namaInput;
        this.health = healthInput;
        this.basicAttack = basicAttackInput;
    }

    protected void attack(Hero enemy) {
        System.out.println("\n" + this.nama + " attacking " + enemy.nama);
        enemy.takeDamage(basicAttack);
    }

    protected void takeDamage(double basicAttack) {
        this.health = this.health - basicAttack;
    }

    protected void show() {
        System.out.println("\nNama : " + this.nama);
        System.out.println("Health : " + this.health);
        System.out.println("Attack Power : " + this.basicAttack);
    }

}


