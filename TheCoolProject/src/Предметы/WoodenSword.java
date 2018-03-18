package Предметы;

import Предметы.Weapon;

public class WoodenSword implements Weapon {
    @Override
    public String getName() {
        return "Деревяный меч";
    }
    @Override
    public int Damage() {
        return 10;
    }
}
