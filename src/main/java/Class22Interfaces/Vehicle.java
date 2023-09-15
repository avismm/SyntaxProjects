package Class22Interfaces;

public interface Vehicle {
    void drive();
}
interface Bike extends Vehicle {
    void applyBreaks();
}
class HonderBike implements Bike {

    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void applyBreaks() {

    }
}
