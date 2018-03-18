package TheCoolProjectPackage;

import ThisIsMagic.Money;
import ThisIsMagic.Stats;

public class TheCoolJavaClass {
    public static TheCoolJavaClass theCoolJavaClass = new TheCoolJavaClass();
    public Stats stats = new Stats();
    public Object weapon = new Object();
    public Object armor = new Object();
    public Object something1 = new Object();
    public Object something2 = new Object();
    public static Money money = new Money();
    public static void main(String[] args) {
        System.out.println("1.Если вы хотите узнать правила игры введите 1");
        System.out.println("2.Если вы хотите уже знаете правила игры введите 2");
        Steps steps = new Steps();
        steps.run1();
    }
}
