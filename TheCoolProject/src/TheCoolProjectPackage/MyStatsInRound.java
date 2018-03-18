package TheCoolProjectPackage;

public class MyStatsInRound {
    public int myHp = TheCoolJavaClass.theCoolJavaClass.stats.hp;
    public int myDamage = TheCoolJavaClass.theCoolJavaClass.stats.strong;
    public void plusHpr(int a){
        this.myHp= myHp + a;
    }
    public void plusAttackr(int b){
        this.myDamage = myDamage + b;
    }
    public void minusHpr(int c){
        this.myHp= myHp - c;
    }
    public void minusAttackr(int d){
        this.myDamage = myDamage - d;
    }

}
