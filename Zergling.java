package test;
public class Zergling extends Unit implements Attackable, Defensible {
    public Zergling(String name, int hp) {
        super(name, hp, 8, 9, 9);
    }
    @Override
    public void attack(int x, int y, int z) {
        printWhoAmI();
        System.out.println("attack power: " + (attack + 1));
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