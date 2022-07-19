
public class BatClass extends ZooKeeper2 {
    public BatClass() {
        setEnergyLevel(300);
    }

    public void fly() {
        setEnergyLevel(getEnergyLevel() - 55);
        System.out.println("flap flap flap");
    }

    public void eatHumans() {
        setEnergyLevel(getEnergyLevel() + 23);
        System.out.println("nom nom");
    }

    public void attackTown() {
        setEnergyLevel(getEnergyLevel() - 36);
        System.out.println("burn, people!");
    }
}
