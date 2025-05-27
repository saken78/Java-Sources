package inheritance.Moba;

public class Tanker extends Hero {
    private String type = "Tanker";
    private double physicalDefence = 40;

    Tanker(String namaInput, double healthInput, double physicalDefenceInput2) {
        super(namaInput, healthInput, physicalDefenceInput2);
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("Defence\t: " + this.physicalDefence);
        System.out.println("Type\t: " + this.type);
    }

    @Override
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);

    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);

    }

    @Override
    public void specialAbillity() {
        this.physicalDefence += 40;
        System.out.println("\n" + this.getNama() + " mendapatkan buff defence " + this.physicalDefence);
    }

}


