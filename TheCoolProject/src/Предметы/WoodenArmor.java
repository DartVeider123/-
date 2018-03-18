package Предметы;

public class WoodenArmor implements Armor {
    @Override
    public String getName() {
        return "Деревянная броня";
    }

    @Override
    public int defense() {
        return 20;
    }
}
