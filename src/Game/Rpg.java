package Game;

import Boss.Boss;
import Players.*;

public class Rpg {

    public static void startGame() {
        Boss boss = new Boss(400, 30);
        Hero[] heroes = gerHeroesArray();
        showStatistics(heroes, boss);
        while (!isFinished(heroes, boss)) {
            round(heroes, boss);
        }

    }

    private static boolean isFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won");

            return true;
        }


        boolean allHeroesDie = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDie = false;
                break;

            }
        }
        if (allHeroesDie) {
            System.out.println("Boss won");
        }
        return allHeroesDie;
    }

    private static void round(Hero[] heroes, Boss boss) {
        bossHit(heroes, boss);
        heroesHit(heroes, boss);
        showStatistics(heroes, boss);



    }

    private static void bossHit(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            int damageOfBoss = boss.getDamage();
            hero.putDamage(damageOfBoss);
            hero.setHealth(hero.getHealth() - damageOfBoss);
        }

    }

    private static void heroesHit(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                int damageOfHeroes = hero.getDamage();
                boss.setHealth(boss.getHealth() - damageOfHeroes);
                hero.useAbility(heroes, boss);

            }
        }

    }

    private static Hero[] gerHeroesArray() {
        Hero[] heroes = {new Warrior(100, 10),
                new Magical(100, 10),
                new Hunter(100, 10),
                new Medical(100, 10)};
        new Thor(100, 10);
        return heroes;
    }

    private static void showStatistics(Hero[] heroes, Boss boss) {
        System.out.println("______________________________");
        System.out.println("boss health = " + boss.getHealth());
        for (Hero hero : heroes) {
            System.out.println("Hero" + hero.getClass().getSimpleName() + "health = " + hero.getHealth());
        }
        System.out.println("______________________________");
    }

    }

