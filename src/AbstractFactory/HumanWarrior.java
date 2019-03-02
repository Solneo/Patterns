package AbstractFactory;

public class HumanWarrior extends AbstractWarrior {
    @Override
    public void putSword(AbstractSword abstractSword) {
        System.out.println(this.getClass()+" c "+ abstractSword.getClass());
    }
}
