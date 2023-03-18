package test;
public class Marin extends Unit implements Attackable, Defensible {
    public Marin(String name, int hp) {
        super(name, hp, 10, 10, 10);
    }
    @Override
    public void attack(int x, int y, int z) {
        printWhoAmI();
        System.out.println("attack power: " + (attack + 2));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
    @Override
    public void defense(int x, int y, int z) {
        printWhoAmI();
        System.out.println("defense power: " + (defense + 2));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
}