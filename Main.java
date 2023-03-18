package test;

public class Main {
    public static void main(String[] args) {


        Unit marin = new Marin("Marin", 100);
        Unit zealot = new Zealot("Zealot", 110);
        Unit zergling = new Zergling("Zergling", 90);
        Unit scout = new Scout("Scout", 80);

        Unit[] units = { marin, zealot, zergling, scout };

        for(Unit unit: units) {
            System.out.println(unit.name + ", HP: " + unit.hp + ", Speed: " + unit.speed + ", Location: " + unit
                    .getLocation());
        }


        System.out.println("<Let's fight~!!!>");
        for(Unit unit: units) {
            if (unit instanceof Attackable) {
                ((Attackable) unit).attack(3, 3,3);
                System.out.println(" - - - - - - ");
            }
            if (unit instanceof Defensible) {
                ((Defensible) unit).defense(1, 1,1);
                System.out.println(" - - - - - - ");
            }
            if (unit instanceof Flyable) {
                ((Flyable) unit).fly(10, 10,10);
                System.out.println(" - - - - - - ");
            }
        }
    }
}
