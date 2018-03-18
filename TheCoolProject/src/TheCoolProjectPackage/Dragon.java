package TheCoolProjectPackage;

public class Dragon implements MonsterInter {
    public int health = 20;
    public int damage = 20;

    public String getName(){
        return "Дракон";
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
}
