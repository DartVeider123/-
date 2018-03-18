package ThisIsMagic;

import Предметы.*;


public class Stats {
    public int firstStrong = 20;
    public int FirstHp = 300;
    public int strong = 20;
    public int hp = 300;
    public void plusDamage(Object a){
        if (a instanceof WoodenSword){
            this.strong = this.strong + ((WoodenSword) a).Damage();
        }
        else if(a instanceof IronSword){
            this.strong = this.strong + ((IronSword) a).Damage();
        }
        else{
            this.strong = this.strong + ((GoldenSword) a).Damage();
        }
    }
    public void plusHp(Object a){
        if (a instanceof WoodenArmor){
            this.hp = this.hp + ((WoodenArmor)a).defense();
        }
        else if (a instanceof IronArmor){
            this.hp = this.hp + ((IronArmor)a).defense();
        }
        else if (a instanceof GoldenArmor){
            this.hp = this.hp + ((GoldenArmor)a).defense();
        }
    }
    public void minusDamage(){
        this.strong = firstStrong;
    }
    public void minusHp(){
        this.hp = FirstHp;
    }
    public void printStats(){
        System.out.println("Сила: " + this.strong);
        System.out.println("Здоровье: " + this.hp);
    }
}
