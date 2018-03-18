package Предметы;

import Предметы.Weapon;

public class IronSword implements Weapon{
    @Override
    public String getName() {
        return "Железный меч";
    }
    @Override
    public int Damage() {
        return 20;
    }
}
