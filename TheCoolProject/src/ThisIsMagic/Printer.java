package ThisIsMagic;

import TheCoolProjectPackage.TheCoolJavaClass;

public class Printer {
    Rules rules = new Rules();
    Inventary inventary = new Inventary();

    public void print(String s, int a){
        if(s.equals("деньги")){
            System.out.println("У Вас осталось " + TheCoolJavaClass.theCoolJavaClass.money.getMoney() + " монет");
        }
        else if(s.equals("инвентарь")){
            inventary.printInventary();
        }
        else if(s.equals("способности")){
            TheCoolJavaClass.theCoolJavaClass.stats.printStats();
        }
        else if(s.equals("правила")){
            rules.rulesPrint();
        }
        else {
            if(a == 4) {
                System.out.println("Введите 1, 2, 3 или 4");
            }else if(a == 3){
                System.out.println("Введите 1, 2, или 3");
            }
            else System.out.println("Введите 1 или 2");
        }

    }
}
