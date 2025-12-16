package M2Activity6;

public class Car extends Vehicle implements Refuelable {

    public Car(String brand) {
        super(4, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("The " + getBrand() + " car engine started "  );
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the " + getBrand() + " car" );
    }
}
