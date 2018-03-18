package TheCoolProjectPackage;

public class TheMonsterStats {
    public static int goblinHp = 7;
    public static int goblinAttack = 29;
    public static int golemHp = 29;
    public static int golemAttack = 7;
    public static int dragonHp = 18;
    public static int dragonAttack = 18;
    public int goblinHpr;
    public int goblinAttackr;
    public int golemHpr;
    public int golemAttackr;
    public int dragonHpr;
    public int dragonAttackr;

    public static MonsterInter monster;

    public TheMonsterStats(MonsterInter monster) {
        this.monster = monster;
            if(goblinHp < goblinAttack - 2){
                goblinHp = goblinHp + 3;
                goblinAttack++;
            }else if(goblinHp >= goblinAttack - 2){
                goblinAttack = goblinAttack + 3;
                goblinHp++;
            }
            if(golemAttack < golemHp - 2){
            golemAttack = golemAttack + 3;
            golemHp++;
            }else if(golemAttack >= golemHp - 2){
            golemHp = golemHp + 3;
            golemAttack++;
            }
            dragonAttack = dragonAttack + 2;
            dragonHp = dragonHp + 2;
            goblinHpr = goblinHp;
            goblinAttackr = goblinAttack;
            golemHpr = golemHp;
            golemAttackr = golemAttack;
            dragonHpr = dragonHp;
            dragonAttackr = dragonAttack;
        }
    public int monsterHp(){
        if(monster instanceof Goblin){
            return goblinHpr;
        }
        else if(monster instanceof Golem){
            return golemHpr;
        }
        else return dragonHpr;
    }
    public static int monsterAttack(){
        if(monster instanceof Goblin){
            return goblinAttack;
        }
        else if(monster instanceof Golem){
            return golemAttack;
        }
        else return dragonAttack;
    }
    public void minusHpMonster(int a,MyStatsInRound myStatsInRound){
        if(monster instanceof Goblin){
            goblinHpr = goblinHpr - (myStatsInRound.myDamage + a);
        }
        else if(monster instanceof Golem){
            golemHpr = golemHpr - (myStatsInRound.myDamage + a);
        }
        else dragonHpr = dragonHpr - (myStatsInRound.myDamage + a);
    }
    public void Obnulation(){
        goblinHp = 7;
        goblinAttack = 29;
        golemHp = 29;
        golemAttack = 7;
        dragonHp = 18;
        dragonAttack = 18;
    }
}
