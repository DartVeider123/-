package TheCoolProjectPackage;

public class Golem implements MonsterInter {
    public int health = 30;
    public int damage = 10;

    public String getName(){
        return "Голем";
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
}
