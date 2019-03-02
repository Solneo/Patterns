package FactoryMethod;

import FactoryMethod.ElfMage;
import FactoryMethod.HumanMage;
import FactoryMethod.Mage;

public class SquadFactory {

   public Mage getMage(String type){
        Mage mageReturn = null;
        switch (type){
            case "HUMAN": mageReturn = new HumanMage();break;
            case "ELF": mageReturn = new ElfMage(); break;
            default:throw new IllegalArgumentException("Wrong mage type:" + type);
        }
        return mageReturn;
   }
}
