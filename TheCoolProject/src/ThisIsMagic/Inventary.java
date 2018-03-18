package ThisIsMagic;

import TheCoolProjectPackage.Buffer;
import Предметы.RageDamage;
import TheCoolProjectPackage.TheCoolJavaClass;
import Предметы.*;

import java.io.IOException;

public class Inventary {
    public boolean YestArmor = true;
    public boolean YestWeapon = true;
    public boolean YestSomething1 = true;
    public boolean YestSomething2 = true;
    WoodenArmor woodenArmor = new WoodenArmor();
    WoodenSword woodenSword = new WoodenSword();
    IronArmor ironArmor = new IronArmor();
    IronSword ironSword = new IronSword();
    GoldenArmor goldenArmor = new GoldenArmor();
    GoldenSword goldenSword = new GoldenSword();
    Health health= new Health();
    RageDamage rageDamage = new RageDamage();

    //These are the methods

    public void printInventary(){
        if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof WoodenSword) {
            System.out.println("1.Оружие: " + woodenSword.getName());
        }else if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof IronSword){
            System.out.println("1.Оружие: " + ironSword.getName());
        }else if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof GoldenSword){
            System.out.println("1.Оружие: " + goldenSword.getName());
        }else {
            System.out.println("1.Оружие: " + "нет");
            YestWeapon = false;
        }
        if (TheCoolJavaClass.theCoolJavaClass.armor instanceof WoodenArmor){
            System.out.println("2.Броня: " + woodenArmor.getName());
        }else if(TheCoolJavaClass.theCoolJavaClass.armor instanceof IronArmor){
        System.out.println("2.Броня: " + ironArmor.getName());
        }else if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof GoldenArmor){
        System.out.println("2.Броня: " + goldenArmor.getName());
        }else{
            System.out.println("2.Броня: " + "нет");
            YestArmor = false;
        }
        if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Health) {
            System.out.println("3.Предмет: " + health.getName());
        }else if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof RageDamage){
            System.out.println("3.Предмет: " + rageDamage.getName());
        }else {
            System.out.println("3.Предмет: " + "нет");
            YestSomething1 = false;
        }
        if(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Health) {
            System.out.println("4.Предмет: " + health.getName());
        }else if(TheCoolJavaClass.theCoolJavaClass.something2 instanceof RageDamage){
            System.out.println("4.Предмет: " + rageDamage.getName());
        }else{
            System.out.println("4.Предмет: " + "нет");
            YestSomething2 = false;
        }
        System.out.println("Чтобы выбрать предмет, напишите 1, 2, 3 или 4");
        System.out.println("Чтобы продолжить играть напишите 0");
        afterPrintInventary();
    }
    public void afterPrintInventary(){
        try {
            Buffer buffer = new Buffer();
            if(buffer.buf.equals("0")){
            }
            else if(buffer.buf.equals("1")){
                startWeaponMethod();
            }
            else if(buffer.buf.equals("2")) {
                startArmorMethod();
            }
            else if(buffer.buf.equals("3")) {
                startSomething1Method();
            }
            else if(buffer.buf.equals("4")) {
                startSomething2Method();
            }
            else {
                System.out.println("Введите 0, 1, 2, 3 или 4");
                afterPrintInventary();
            }
        }catch (IOException e){
            System.out.println("Введите 0, 1, 2, 3 или 4");
            afterPrintInventary();
        }
    }
    public void startSomething1Method(){
        if(YestSomething1 == true) {
            System.out.println("1.Свойства");
            System.out.println("2.Выбросить");
            Something1Method();
        }else{
            System.out.println("У вас нет предмета в 1 слоте");
            printInventary();
        }
        YestSomething1 = true;
    }
    public void startSomething2Method(){
        if(YestSomething2 == true) {
            System.out.println("1.Свойства");
            System.out.println("2.Выбросить");
            Something2Method();
        }else{
            System.out.println("У вас нет предмета во 2 слоте");
            printInventary();
        }
        YestSomething2 = true;
    }
    public void Something1Method(){
        try {
            Buffer buffer1 = new Buffer();
            if(buffer1.buf.equals("1")){
                if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Health) {
                    System.out.println("Плюс к здоровью в бою: " + health.getSkill());
                }else if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof RageDamage) {
                    System.out.println("Плюс к силе на один бой: " + rageDamage.getSkill());
                }
                printInventary();
            }else if(buffer1.buf.equals("2")){
                TheCoolJavaClass.theCoolJavaClass.something1 = new Object();
                printInventary();
            }
            else {
                System.out.println("Введите 1 или 2");
                Something1Method();
            }
        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            Something1Method();
        }
    }
    public void Something2Method(){
        try {
            Buffer buffer1 = new Buffer();
            if(buffer1.buf.equals("1")){
                if(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Health) {
                    System.out.println("Плюс к здоровью в бою: " + health.getSkill());
                }else if(TheCoolJavaClass.theCoolJavaClass.something2 instanceof RageDamage) {
                    System.out.println("Плюс к силе на один бой: " + rageDamage.getSkill());
                }
                printInventary();
            }else if(buffer1.buf.equals("2")){
                TheCoolJavaClass.theCoolJavaClass.something2 = new Object();
                printInventary();
            }
            else {
                System.out.println("Введите 1 или 2");
                Something2Method();
            }
        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            Something2Method();
        }
    }
    public void startArmorMethod(){
        if(YestArmor == true) {
            System.out.println("1.Свойства");
            System.out.println("2.Выбросить");
            armorMethod();
        }else{
            System.out.println("У вас нет брони");
            printInventary();
        }
        YestArmor = true;
    }
    public void startWeaponMethod(){
        if(YestWeapon == true) {
            System.out.println("1.Свойства");
            System.out.println("2.Выбросить");
            weaponMethod();
        }else{
            System.out.println("У вас нет оружия");
            printInventary();
        }
        YestWeapon = true;
    }
    public void weaponMethod(){
        try {
            Buffer buffer1 = new Buffer();
            if(buffer1.buf.equals("1")){
                if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof WoodenSword) {
                    System.out.println("Плюс к силе: " + woodenSword.Damage());
                }else if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof IronSword){
                    System.out.println("Плюс к силе: " + ironSword.Damage());
                }else if(TheCoolJavaClass.theCoolJavaClass.weapon instanceof GoldenSword){
                    System.out.println("Плюс к силе: " + goldenSword.Damage());

                }
                printInventary();
            }else if(buffer1.buf.equals("2")){
                TheCoolJavaClass.theCoolJavaClass.weapon = new Object();
                TheCoolJavaClass.theCoolJavaClass.stats.minusDamage();
                printInventary();
            }
            else {
                System.out.println("Введите 1 или 2");
                weaponMethod();
            }
        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            weaponMethod();
        }
    }
    public void armorMethod(){
        try {
            Buffer buffer2 = new Buffer();
            if(buffer2.buf.equals("1")) {
                if (TheCoolJavaClass.theCoolJavaClass.armor instanceof WoodenArmor) {
                    System.out.println("Плюс к здоровью: " + woodenArmor.defense());
                } else if (TheCoolJavaClass.theCoolJavaClass.armor instanceof IronArmor) {
                    System.out.println("Плюс к здоровью: " + ironArmor.defense());
                } else if (TheCoolJavaClass.theCoolJavaClass.weapon instanceof GoldenArmor) {
                    System.out.println("Плюс к здоровью: " + goldenArmor.defense());
                }
                printInventary();
            }
            else if(buffer2.buf.equals("2")){
                TheCoolJavaClass.theCoolJavaClass.armor = new Object();
                TheCoolJavaClass.theCoolJavaClass.stats.minusHp();
                printInventary();
            }
            else {
                System.out.println("Введите 1 или 2");
                armorMethod();
            }

        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            armorMethod();
        }
    }
}
