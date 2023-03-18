package test;
public class Zealot extends Unit implements Attackable, Defensible {
    public Zealot(String name, int hp) {
        super(name, hp, 11, 10, 12);
    }
    @Override
    public void attack(int x, int y, int z) {
        printWhoAmI();
        System.out.println("attack power: " + (attack + 3));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
    @Override
    public void defense(int x, int y, int z) {
        printWhoAmI();
        System.out.println("defense power: " + (defense + 1));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
}