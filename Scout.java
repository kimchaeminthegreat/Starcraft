package test;
public class Scout extends Unit implements Attackable, Defensible, Flyable {
    public Scout(String name, int hp) {
        super(name, hp, 20, 20, 10);
    }
    @Override
    public void attack(int x, int y, int z) {
        printWhoAmI();
        System.out.println("attack power: " + (attack + 5));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
    @Override
    public void defense(int x, int y, int z) {
        printWhoAmI();
        System.out.println("defense power: " + (defense + 5));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
    @Override
    public void fly(int x, int y, int z) {
        printWhoAmI();
        System.out.println("air surveillance: " + (speed + 5));
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Moved to " + getLocation());
    }
}