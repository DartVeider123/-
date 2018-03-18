package TheCoolProjectPackage;

public class Goblin implements MonsterInter {
    public int health = 10;
    public int damage = 30;

    public String getName(){
        return "Гоблин";
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
}
