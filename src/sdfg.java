import AbstractFactory.Barak;
import AbstractFactory.HumanWarriorFactory;
import AbstractFactory.OrkWarriorFactory;
import FactoryMethod.Mage;
import FactoryMethod.SquadFactory;

public class sdfg {
    public static void main(String[] args) {
        FactoryMethod();
        AbstractFactory();
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
}
