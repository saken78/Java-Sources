package inheritance.Moba;

public abstract class Hero {

    // atribut superclass
    private String nama;
    private double health;
    private double basicAttack;
    private int level;

    // constructor superclass
    Hero(String namaInput, double healthInput, double basicAttackInput) {
        this.nama = namaInput;
        this.health = healthInput;
        this.basicAttack = basicAttackInput;
        this.level = 1;
    }

    // method superclass
    public String getNama() {
        return this.nama;
    }

    public double getHealth() {
        return this.health;
    }

    public double getBasicAttack() {
        return this.basicAttack;
    }

    public int getLevel() {
        return this.level;
    }

    // decreasing health
    public void setHealthAttack(double bufferHealth) {
        this.health -= bufferHealth;
    }

    // increasing health
    public void setHealthIncrease(double bufferHealth) {
        this.health += bufferHealth;
    }

    // set new name
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // increasing basic attack
    public void setIncreaseBasicAttack(double bufferBasicAttack) {
        this.basicAttack += bufferBasicAttack;
    }

    // decreasing basic attack
    public void setDecreaseBasicAttack(double bufferBasicAttack) {
        this.basicAttack -= bufferBasicAttack;
    }

    // abstract class
    public abstract void levelUp();

    // method levelling
    public void setLevelUp(int bufferLevel) {
        this.level += bufferLevel;
    }

    // common method

    protected void attack(Hero enemy) {
        System.out.println("\n" + this.nama + " attacking " + enemy.nama);
        enemy.takeDamage(basicAttack);
    }

    protected void takeDamage(double basicAttack) {
        this.health = this.health - basicAttack;
    }

    protected void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Level\t: " + this.level);

    }

}

