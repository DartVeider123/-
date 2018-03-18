package Предметы;

public class IronArmor implements Armor{
    @Override
    public String getName() {
        return "Железная броня";
    }

    @Override
    public int defense() {
        return 40;
    }
}
