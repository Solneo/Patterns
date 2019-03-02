package AbstractFactory;

public class HumanWarriorFactory extends WarriorFactory{
    @Override
    public AbstractWarrior learnWarrior() {
        return new HumanWarrior();
    }

    @Override
    public AbstractSword forgeSword() {
        return new HumanSword();
    }
}
