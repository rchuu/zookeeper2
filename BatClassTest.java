
public class BatClassTest {

    public static void main(String[] args) {
        BatClass scaryBat = new BatClass();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.fly();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.attackTown();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.fly();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.eatHumans();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.eatHumans();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.eatHumans();
        System.out.println(scaryBat.getEnergyLevel());
        scaryBat.eatHumans();
        System.out.println(scaryBat.getEnergyLevel());
    }
}
