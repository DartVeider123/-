package TheCoolProjectPackage;

import Предметы.Armor;
import Предметы.Something;
import Предметы.Weapon;

public class AddInInvenrary {
    //This is check
    public void addInventary(Object a){
        if(a instanceof Weapon && !(TheCoolJavaClass.theCoolJavaClass.weapon instanceof Weapon)){
            TheCoolJavaClass.theCoolJavaClass.weapon = a;
            TheCoolJavaClass.theCoolJavaClass.stats.plusDamage(a);
        }
        else if(a instanceof Weapon && TheCoolJavaClass.theCoolJavaClass.weapon instanceof Weapon) {
            System.out.println("У вас уже есть оружие, что бы его выкинуть напишите инвентарь, выберите предмет и выберите выкинуть");
        }
        else if(a instanceof Armor && !(TheCoolJavaClass.theCoolJavaClass.armor instanceof Armor)){
            TheCoolJavaClass.theCoolJavaClass.armor = a;
            TheCoolJavaClass.theCoolJavaClass.stats.plusHp(a);
        }
        else if(a instanceof Armor && TheCoolJavaClass.theCoolJavaClass.armor instanceof Armor) {
            System.out.println("У вас уже есть броня, что бы его выкинуть напишите инвентарь, выберите предмет и выберите выкинуть");
        }
        else if(a instanceof Something && !(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something)){
            TheCoolJavaClass.theCoolJavaClass.something1 = a;
        }
        else if(a instanceof Something && TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something && !(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Something)){
            TheCoolJavaClass.theCoolJavaClass.something2 = a;
    }
        else if(a instanceof Something && TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something && TheCoolJavaClass.theCoolJavaClass.something2 instanceof Something){
            System.out.println("У вас уже есть два предмета, что бы их выкинуть напишите инвентарь, выберите предмет и выберите выкинуть");
        }
    }
}
