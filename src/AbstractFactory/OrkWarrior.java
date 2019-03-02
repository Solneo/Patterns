package AbstractFactory;

public class OrkWarrior extends AbstractWarrior {
    @Override
    public void putSword(AbstractSword abstractSword) {
        System.out.println(this.getClass()+" с "+ abstractSword.getClass());
    }
}
