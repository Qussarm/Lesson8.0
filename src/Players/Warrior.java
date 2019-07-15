package Players;

import Boss.Boss;
import Game.Ability;

import java.awt.*;
import java.util.Random;

public class Warrior  extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero: heroes) {
        if (hero.getHealth() < 100){
            hero.setDamage(boss.getDamage() + boss.getDamage());
        }


        }
        System.out.println("warrior ability");

    }
}
