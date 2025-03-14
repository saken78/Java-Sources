//player
class Player{
 String name;
 double health;
 int level;
 // object member
 Weapon weapon;
 Armor armor;

 Player(String name, double health){
     this.name = name;
     this.health = health;
 }

 void equipWeapon(Weapon weapon){
     this.weapon = weapon;
 }

 void equipArmor(Armor armor){
     this.armor = armor;
 }

 void display(){
     System.out.println("\nName : " + this.name);
     System.out.println("Health : " + this.health + " hp");
     this.weapon.display();
     this.armor.display();
 }
}

