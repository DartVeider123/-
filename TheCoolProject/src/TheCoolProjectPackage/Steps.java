package TheCoolProjectPackage;
import ThisIsMagic.Printer;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import Предметы.*;

import java.io.IOException;

public class Steps{
    public void IAmDead(){
        System.out.println("Вы умерли");
        System.exit(0);
    }
    public boolean inShopOnesomething = true;
    public boolean InShopTwosomething = true;
    public static int round = 1;
    public AddInInvenrary addInInvenrary = new AddInInvenrary();
    public Printer printer = new Printer();
    //This is a start

    public void run1(){
        try {
            Buffer bufer = new Buffer();
            if(bufer.buf.equals("1")){
                System.out.println("Правила игры:");
                System.out.println("Вы - малоизвестный рыцарь обычного королевства, у Вас" );
                System.out.println("есть варианты выбора что Вы можете сделать: пойти в " );
                System.out.println("пещеру, атаковать другое королевство и так далее." );
                System.out.println("Также у Вас есть монеты, предметы и прочее." );
                System.out.println("Ваша задача - стать правителем всех королевств на земле.");
                System.out.println("Чтобы посмотреть сколько у вас денег, просто напишите деньги," );
                System.out.println("чтобы посмотреть ваш инвентарь, напишите инвентарь.");
                System.out.println("В инвентаре не может быть больше 2 предметов, 1 брони и 1 оружия.");
                System.out.println("Чтобы посмотреть свои способности напишите способности");
                TheTwoStart();
            }
            else if(bufer.buf.equals("2")){
                TheTwoStart();
            }
            else{
                System.out.println("Введите 1 или 2");
                run1();
            }
        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            run1();
        }
    }
    public void TheTwoStart(){
        System.out.println("Если вы захотите прочитать правила, напишите правила");
        System.out.println("");
        System.out.println("");
        TwoStart();
    }
    public void TwoStart(){
        System.out.println("Утро.Вы как всегда просыпаетесь от звона мечей и понимаете,");
        System.out.println("что впереди Вас ждет трудный день.Вы встаете с кровати.");
        System.out.println("Что делать дельше?");
        System.out.println("1.Пойти в магазин");
        System.out.println("2.Пойти в Подземелье биться с монстрами");
        System.out.println("3.Атаковать другое королевство");
        TheTwo();
    }
    public void TheTwo(){
        try {
            Buffer bufer = new Buffer();
            if(bufer.buf.equals("1")){
                TwoFalshcStart();
            }
            else if(bufer.buf.equals("2")){
                System.out.println("Вы пришли в подземелье и на вас нападают монстры:");
                LolStartDong();
            }
            else if(bufer.buf.equals("3")){
                System.out.println("Вы нападаете на чужое королевство и на встречу Вам идут рыцари");
            }
            else {
                printer.print(bufer.buf, 3);
                TwoStart();
            }
        }catch (IOException e){
            System.out.println("Введите 1, 2, или 3");
            TheTwo();
        }
    }

    //InThe Shop

    public void TwoFalshcStart() {
                System.out.println("Вы пришли в магазин, торговец вам предлагает две вещи:");
                if (inShopOnesomething == true) {
                    System.out.println("1.Железный меч");
                } else System.out.println("1.Вы уже купили этот предмет");
                if (InShopTwosomething == true) {
                    System.out.println("2.Аптечка");
                } else System.out.println("2.Вы уже купили этот предмет");
                System.out.println("0.Выйти из магазина");
                inShop();
    }
    public void inShop(){
        try {
            Buffer buffer = new Buffer();
            if(buffer.buf.equals("1")) {
                if (inShopOnesomething == true) {
                    System.out.println("1.Свойства");
                    System.out.println("2.Купить, цена 30");
                    afterInShopOne();
                }else {
                    System.out.println("Вы уже купили этот предмет");
                    TwoFalshcStart();
                }
            }
            else if(buffer.buf.equals("2")){
                if(InShopTwosomething == true) {
                    System.out.println("1.Свойства");
                    System.out.println("2.Купить, цена 10");
                    afterInShopTwo();
                }else {
                    System.out.println("Вы уже купили этот предмет");
                    TwoFalshcStart();
                }
            }
            else if(buffer.buf.equals("0")){
                TwoStart();
            }else {
                System.out.println("Введите 0, 1, или 2");
                inShop();
            }
        }catch (IOException e){
            System.out.println("Введите 0, 1, или 2");
            inShop();
        }
    }
    public void afterInShopOne(){
        IronSword ironSword = new IronSword();
        try {
        Buffer buffer = new Buffer();
        if(buffer.buf.equals("1")){
            System.out.println("Плюс к силе: " + ironSword.Damage());
            TwoFalshcStart();
        }
        else if(buffer.buf.equals("2")){
            buyOne(30);
        }
        else{
            System.out.println("Введите 1 или 2");
            afterInShopOne();
        }
    }catch (IOException e){
        System.out.println("Введите 1 или 2");
        afterInShopOne();
        }
    }
    public void afterInShopTwo(){
        Health health = new Health();
        try {
            Buffer buffer = new Buffer();
            if(buffer.buf.equals("1")){
                System.out.println("Плюс к здоровью в бою: " + health.getSkill());
                TwoFalshcStart();
            }
            else if(buffer.buf.equals("2")){
                buyTwo(10);
            }
            else{
                System.out.println("Введите 1 или 2");
                afterInShopTwo();
            }
        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            afterInShopTwo();
        }
    }
    public void buyOne(int m){
        if(TheCoolJavaClass.theCoolJavaClass.money.getMoney() < m){
            System.out.println("У вас не хватает монет");
            TwoFalshcStart();
        }
        else {
            if(!(TheCoolJavaClass.theCoolJavaClass.weapon instanceof Weapon)) {
                TheCoolJavaClass.theCoolJavaClass.money.minusMoney(m);
            }
            addInInvenrary.addInventary(new IronSword());
            inShopOnesomething = false;
            TwoFalshcStart();
        }
    }
    public void buyTwo(int m){
        if(TheCoolJavaClass.theCoolJavaClass.money.getMoney() < m){
            System.out.println("У вас не хватает монет");
            TwoFalshcStart();
        }
        else {
            if(!(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something) || !(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Something)) {
                TheCoolJavaClass.theCoolJavaClass.money.minusMoney(m);
            }
            addInInvenrary.addInventary(new Health());
            TwoFalshcStart();
        }
    }

    //InThe Dangeon
    public void LolStartDong(){
        MyStatsInRound myStatsInRound = new MyStatsInRound();
        Monsters monsters = new Monsters();
        TheMonsterStats theMonsterStats = new TheMonsterStats(monsters.monster);
        round = 1;
        StartInDangeon(myStatsInRound, monsters, theMonsterStats);
    }
    public void StartInDangeon(MyStatsInRound myStatsInRound, Monsters monsters, TheMonsterStats theMonsterStats){
        System.out.println("Имя: " + monsters.monster.getName());
        System.out.println("Здоровье: " + theMonsterStats.monsterHp());
        System.out.println("Атака: " + TheMonsterStats.monsterAttack());
        System.out.println("Раунд: " + (round));
        FalchInDangeon(theMonsterStats, myStatsInRound, monsters);
    }
    public void FalchInDangeon(TheMonsterStats theMonsterStats, MyStatsInRound myStatsInRound, Monsters monsters){
        System.out.println("Что Вы хотите сделать:");
        System.out.println("1.Ударить в голову(+25 к урону, шанс попадания 20%)");
        System.out.println("2.Ударить в тело(+10 к урону, шанс попадания 50%)");
        System.out.println("3.Ударить в ногу(шанс попадания 75%)");
        System.out.println("4.Посмотреть ваши способности");
        System.out.println("5.Использовать Аптечку");
        System.out.println("6.Использовать Усилитель Атаки");
        System.out.println("0.Уйти обратно в город");
        InDangeon(theMonsterStats, myStatsInRound, monsters);
    }
    public void InDangeon(TheMonsterStats theMonsterStats, MyStatsInRound myStatsInRound, Monsters monsters){
        try {
            Buffer bufer = new Buffer();
            if(bufer.buf.equals("1")){
                int a = (int)Math.round(Math.random() * 4);
                if(a == 0){
                    theMonsterStats.minusHpMonster(25,myStatsInRound);
                }
                if(theMonsterStats.monsterHp() <= 0){
                    System.out.println("Вы убили " + monsters.monster.getName() + "а");
                    afterKill(monsters);
                }
                if(myStatsInRound.myHp <=0){
                    IAmDead();
                }
                myStatsInRound.myHp = myStatsInRound.myHp - TheMonsterStats.monsterAttack();
                round++;
                StartInDangeon(myStatsInRound, monsters, theMonsterStats);
            }
            else if(bufer.buf.equals("2")){
                int a = (int)Math.round(Math.random());
                if(a == 0){
                    theMonsterStats.minusHpMonster(10,myStatsInRound);
                }
                if(theMonsterStats.monsterHp() <= 0){
                    System.out.println("Вы убили " + monsters.monster.getName() + "а");
                    afterKill(monsters);
                }
                if(myStatsInRound.myHp <=0){
                    IAmDead();
                }
                myStatsInRound.myHp = myStatsInRound.myHp - TheMonsterStats.monsterAttack();
                round++;
                StartInDangeon(myStatsInRound, monsters, theMonsterStats);
            }
            else if(bufer.buf.equals("3")){
                int a = (int)Math.round(Math.random() * 3);
                if(a == 0 || a == 1 || a == 2){
                    theMonsterStats.minusHpMonster(0,myStatsInRound);
                }
                if(theMonsterStats.monsterHp() <= 0){
                    System.out.println("Вы убили " + monsters.monster.getName() + "а");
                    afterKill(monsters);
                }
                myStatsInRound.myHp = myStatsInRound.myHp - TheMonsterStats.monsterAttack();
                if(myStatsInRound.myHp <=0){
                    IAmDead();
                }
                round++;
                StartInDangeon(myStatsInRound, monsters, theMonsterStats);
            }
            else if(bufer.buf.equals("4")){
                System.out.println("Сила: " + myStatsInRound.myDamage);
                System.out.println("Здоровье: " + myStatsInRound.myHp);
                StartInDangeon(myStatsInRound, monsters, theMonsterStats);
            }
            else if(bufer.buf.equals("5")){
                if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Health && TheCoolJavaClass.theCoolJavaClass.something2 instanceof Health){
                    Health health = new Health();
                    myStatsInRound.myHp = myStatsInRound.myHp + health.getSkill();
                    TheCoolJavaClass.theCoolJavaClass.something2 = new  Object();
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }
                else if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Health && !(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Health)){
                    Health health = new Health();
                    myStatsInRound.myHp = myStatsInRound.myHp + health.getSkill();
                    TheCoolJavaClass.theCoolJavaClass.something1 = new  Object();
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }
                else if(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Health && !(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Health)){
                    Health health = new Health();
                    myStatsInRound.myHp = myStatsInRound.myHp + health.getSkill();
                    TheCoolJavaClass.theCoolJavaClass.something2 = new  Object();
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }else {
                    System.out.println("У вас нет Аптечки");
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }
            }
            else if(bufer.buf.equals("6")){
                if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof RageDamage && TheCoolJavaClass.theCoolJavaClass.something2 instanceof RageDamage){
                    RageDamage rageDamage = new RageDamage();
                    myStatsInRound.myDamage = myStatsInRound.myDamage + rageDamage.getSkill();
                    TheCoolJavaClass.theCoolJavaClass.something2 = new  Object();
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }
                else if(TheCoolJavaClass.theCoolJavaClass.something1 instanceof RageDamage && !(TheCoolJavaClass.theCoolJavaClass.something2 instanceof RageDamage)){
                    RageDamage rageDamage = new RageDamage();
                    myStatsInRound.myDamage = myStatsInRound.myDamage + rageDamage.getSkill();
                    TheCoolJavaClass.theCoolJavaClass.something1 = new  Object();
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }
                else if(TheCoolJavaClass.theCoolJavaClass.something2 instanceof RageDamage && !(TheCoolJavaClass.theCoolJavaClass.something1 instanceof RageDamage)){
                    RageDamage rageDamage = new RageDamage();
                    myStatsInRound.myDamage = myStatsInRound.myDamage + rageDamage.getSkill();
                    TheCoolJavaClass.theCoolJavaClass.something2 = new  Object();
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }else {
                    System.out.println("У вас нет Усилетиля Атаки");
                    StartInDangeon(myStatsInRound, monsters, theMonsterStats);
                }
            }
            else if(bufer.buf.equals("0")){
            TwoStart();
            }
            else {
                System.out.println("Введите 1, 2, 3, 4, 5 или 6");
                InDangeon(theMonsterStats, myStatsInRound, monsters);
            }
        }catch (IOException e){
            System.out.println("Введите 1, 2, 3, 4, 5 или 6");
            InDangeon(theMonsterStats, myStatsInRound, monsters);
        }
    }
    public void afterKill(Monsters monsters){
        int randomchik = (int)Math.round(Math.random() * 4);
        if(randomchik == 1){
            monsterHaveSomething(monsters);
        }
        else monsterHaveNothing();
    }
    public void monsterHaveSomething(Monsters monsters){
        int randomBaby = (int)Math.round(Math.random() * 3);
        if(randomBaby == 0){
            int randomSomething = (int)Math.round(Math.random() * 3) + 1;
            if(randomSomething == 1){
                System.out.println("У " + monsters.monster.getName() + "а есть " + "Деревяный меч");
                vivodim(new WoodenSword());
            }
            if(randomSomething == 2){
                System.out.println("У " + monsters.monster.getName() + "а есть " + "Деревянная броня");
                vivodim(new WoodenArmor());
            }
            if(randomSomething == 3){
                System.out.println("У " + monsters.monster.getName() + "а есть " + "Аптечка");
                vivodim(new Health());
            }else {
                System.out.println("У " + monsters.monster.getName() + "а есть " + "Усилитель атаки");
                vivodim(new RageDamage());
            }
        }else{
            int randomMoney = (int)Math.round(Math.random() * 2) + 1;
            if(randomMoney == 1){
                System.out.println("У " + monsters.monster.getName() + "а есть " + randomMoney + " монета");
                TheCoolJavaClass.theCoolJavaClass.money.plusMoney(randomMoney);
                monsterHaveNothing();
            }
            else{
                System.out.println("У " + monsters.monster.getName() + "а есть " + randomMoney + " монеты");
                TheCoolJavaClass.theCoolJavaClass.money.plusMoney(randomMoney);
                monsterHaveNothing();
            }
        }
    }
    public void monsterHaveNothing(){
        System.out.println("1.Следующий бой");
        System.out.println("2.Вернуться в город");
        try {
            Buffer buffer = new Buffer();
            if(buffer.buf.equals("1")){
                LolStartDong();
            }
            if(buffer.buf.equals("2")){
                TwoStart();
            }else{
                printer.print(buffer.buf, 2);
                monsterHaveNothing();
            }
        }catch (IOException e){
            System.out.println("Введите 1, или 2");
            monsterHaveNothing();
        }
    }
    public void vivodim(Object a){
        System.out.println("1.Взять");
        System.out.println("2.Следующий бой");
        try {
            Buffer buffer = new Buffer();
            if (buffer.buf.equals("1")) {
                if(a instanceof Weapon && !(TheCoolJavaClass.theCoolJavaClass.weapon instanceof Weapon)){
                    TheCoolJavaClass.theCoolJavaClass.weapon = a;
                    TheCoolJavaClass.theCoolJavaClass.stats.plusDamage(a);
                    monsterHaveNothing();
                }
                else if(a instanceof Weapon && TheCoolJavaClass.theCoolJavaClass.weapon instanceof Weapon) {
                    System.out.println("У вас уже есть оружие, что бы его выкинуть напишите инвентарь, выберите предмет и выберите выкинуть");
                    vivodim(a);
                }
                else if(a instanceof Armor && !(TheCoolJavaClass.theCoolJavaClass.armor instanceof Armor)){
                    TheCoolJavaClass.theCoolJavaClass.armor = a;
                    TheCoolJavaClass.theCoolJavaClass.stats.plusHp(a);
                    monsterHaveNothing();
                }
                else if(a instanceof Armor && TheCoolJavaClass.theCoolJavaClass.armor instanceof Armor) {
                    System.out.println("У вас уже есть броня, что бы его выкинуть напишите инвентарь, выберите предмет и выберите выкинуть");
                    vivodim(a);
                }
                else if(a instanceof Something && !(TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something)){
                    TheCoolJavaClass.theCoolJavaClass.something1 = a;
                    monsterHaveNothing();
                }
                else if(a instanceof Something && TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something && !(TheCoolJavaClass.theCoolJavaClass.something2 instanceof Something)){
                    TheCoolJavaClass.theCoolJavaClass.something2 = a;
                    monsterHaveNothing();
                }
                else if(a instanceof Something && TheCoolJavaClass.theCoolJavaClass.something1 instanceof Something && TheCoolJavaClass.theCoolJavaClass.something2 instanceof Something){
                    System.out.println("У вас уже есть два предмета, что бы их выкинуть напишите инвентарь, выберите предмет и выберите выкинуть");
                    vivodim(a);
                }
            }
            if (buffer.buf.equals("2")) {
                LolStartDong();
            }else printer.print(buffer.buf, 2);
        }catch (IOException e){
            System.out.println("Введите 1 или 2");
            vivodim(a);
        }
    }
}
