//package inheritance.Moba;

public abstract class Hero implements ITakeDamaged, IAttack {

    // atribut superclass
    private String nama;
    private double health;
    private double physicalAttack;
    private int level;
    private double magicPower;
    private double physicalDefence;

    // constructor superclass
    Hero(String namaInput, double healthInput, double physicalAttack) {
        if (namaInput == null || healthInput <= 0 || physicalAttack < 0) {
            System.out.println("Input tidak valid!");
        }
        this.nama = namaInput;
        this.health = healthInput;
        this.physicalAttack = physicalAttack;
        this.level = 1;
        this.magicPower = this.physicalAttack;
    }

    // method superclass
    public String getNama() {
        return this.nama;
    }

    public double getHealth() {
        if (this.health < 0) {
            this.health = 0;
            return this.health;
        } else {
            return this.health;
        }
    }

    public double getPhysicalAttack() {
        return this.physicalAttack;
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
    public void setIncreasePhysicalAttack(double bufferPhysicalAttack) {
        this.physicalAttack += bufferPhysicalAttack;
    }

    // decreasing basic attack
    public void setDecreasePhysicalAttack(double bufferPhysicalAttack) {
        this.physicalAttack -= bufferPhysicalAttack;
    }

    // abstract class
    public abstract void levelUp();

    // method levelling
    public void setLevelUp(int bufferLevel) {
        this.level += bufferLevel;
    }

    protected void takeDamage(double physicalAttack) {
        this.health = this.health - this.physicalAttack;
    }

    protected void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Level\t: " + this.level);
    }

    @Override
    public String toString() {
        return "[Hero] " + this.nama + " | HP: " + this.health + " | Damage: " + this.physicalAttack;
    }

    // validasi alive
    public boolean isAlive() {
        return this.getHealth() > 0;
    }

}
