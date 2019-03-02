package AbstractFactory;

public class Barak {
    private AbstractWarrior warrior;
    private AbstractSword sword;

    public Barak(WarriorFactory factory) {
        warrior = factory.learnWarrior();
        sword = factory.forgeSword();
    }
    public void compliteLearnWarrior(){
        warrior.putSword(sword);
    }
}
