package Adapter;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Машина едет");
    }
}
