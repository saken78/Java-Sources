package inheritance.Moba;

public abstract class Hero {

    // atribut superclass
    private String nama;
    private double health;
    private double basicAttack;
    private int level;
    private double magicPower;
    private double physicalDefence;

    // constructor superclass
    Hero(String namaInput, double healthInput, double basicAttackInput) {
        this.nama = namaInput;
        this.health = healthInput;
        this.basicAttack = basicAttackInput;
        this.level = 1;
        this.magicPower = this.basicAttack;
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

    public double getMagicPower() {
        return this.magicPower;
    }

    public double getPhysicalDefence() {
        return this.physicalDefence;
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

    // decreasing defence
    public void setDecreasePhysicalDefence(double bufferPhysicalDefence) {
        this.physicalDefence -= bufferPhysicalDefence;
    }

    // increasing defence
    public void setIncreasePhysicalDefence(double bufferPhysicalDefence) {
        this.physicalDefence += bufferPhysicalDefence;
    }

    // set new name
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // increasing magic power
    public void setIncreaseMagicPower(double bufferMagicPower) {
        this.magicPower += bufferMagicPower;
    }

    // decreasing basic attack
    public void setDecreaseMagicPower(double bufferMagicPower) {
        this.magicPower -= bufferMagicPower;
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
    public abstract void specialAbillity();

    // abstract class
    public abstract void levelUp();

    // method levelling
    public void setLevelUp(int bufferLevel) {
        this.level += bufferLevel;
    }

    // common method
    protected void attack(Hero enemy) {
        System.out.println("\n" + this.nama + " attacking " + enemy.nama);
        // this.basicAttack = this.magicPower;
        enemy.takeDamage(this.basicAttack);
    }

    protected void takeDamage(double basicAttack) {
        this.health = this.health - this.basicAttack;
    }

    protected void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Level\t: " + this.level);

    }

}


