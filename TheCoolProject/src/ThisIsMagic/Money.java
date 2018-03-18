package ThisIsMagic;

public class Money {
    public int money = 0;
    public void plusMoney(int plusmoney){
        this.money = this.money + plusmoney;
    }
    public void minusMoney(int minusmoney){
        this.money = this.money - minusmoney;
    }
    public int getMoney() {
        return money;
    }
}
