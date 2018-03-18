package Предметы;

public class GoldenSword implements Weapon {
    @Override
    public String getName() {
        return "Золотой меч";
    }
    @Override
    public int Damage() {
        return 30;
    }
}
