package AbstractFactory;

public class OrkWarriorFactory extends WarriorFactory {
    @Override
    public AbstractWarrior learnWarrior() {
        return new OrkWarrior();
    }

    @Override
    public AbstractSword forgeSword() {
        return new OrkSword();
    }
}
