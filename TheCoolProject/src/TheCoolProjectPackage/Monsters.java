package TheCoolProjectPackage;

public class Monsters {
    public static int monsterType;
    public MonsterInter monster;
    public Monsters() {
        monsterType = (int)Math.round(Math.random() * 2);
        if(monsterType == 0){
            monster = new Goblin();
        }else if(monsterType == 1){
            monster= new Golem();
        }else monster = new Dragon();
    }
}
