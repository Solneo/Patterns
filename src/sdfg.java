import AbstractFactory.Barak;
import AbstractFactory.HumanWarriorFactory;
import AbstractFactory.OrkWarriorFactory;
import Adapter.*;
import FactoryMethod.Mage;
import FactoryMethod.SquadFactory;

public class sdfg {
    public static void main(String[] args) {
        FactoryMethod();
        AbstractFactory();
        Adapter();
    }

    private static void FactoryMethod() {
        Mage playerMage;
        Mage secondPlaerMage;
        SquadFactory squadFactory = new SquadFactory();

        playerMage = squadFactory.getMage("ELF");
        playerMage.cast();
        secondPlaerMage = squadFactory.getMage("HUMAN");
        secondPlaerMage.cast();
    }

    private static void AbstractFactory() {
        Barak barak = null;
        barak = new Barak(new HumanWarriorFactory());
        barak.compliteLearnWarrior();
        barak = new Barak(new OrkWarriorFactory());
        barak.compliteLearnWarrior();
    }

    private static void Adapter(){
        Driver bob = new Driver();
        Car audi = new Car();
        bob.travel(audi);
        Horse star = new Horse();
        //bob.travel(star); Не сработает т. к. лошадь зверь а не трансаортное средство
        Vehicle horseVehicle = new HorseToVehicleAdapter(star);
        bob.travel(horseVehicle);
    }
}
