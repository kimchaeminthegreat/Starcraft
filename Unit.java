package test;
public class Unit{
    String name;
    int hp;
    int speed;
    int defense;
    int attack;
    int x, y, z;

    public Unit(String name, int hp, int speed, int defense, int attack, int x, int y, int z) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.defense = defense;
        this.attack = attack;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Unit(String name, int hp, int speed, int defense, int attack) {
        this(name, hp, speed, defense, attack, 0, 0, 0);
    }

    public String getLocation() {
        return "(" + x + ", " + y + " ," + z + ")";
    }
    protected void printWhoAmI() {
        System.out.println("My name is " + name + ". I have " + hp + "hp power.");
    }
}