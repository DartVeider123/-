package Предметы;

public class GoldenArmor implements Armor {
    @Override
    public String getName() {
        return "Золотая броня";
    }

    @Override
    public int defense() {
        return 60;
    }
}
