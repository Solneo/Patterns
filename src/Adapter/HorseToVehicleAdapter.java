package Adapter;

public class HorseToVehicleAdapter implements Vehicle {
    private Horse horse;

    public HorseToVehicleAdapter(Horse h) {
        horse = h;
    }

    @Override
    public void drive() {
        horse.move();
    }
}
