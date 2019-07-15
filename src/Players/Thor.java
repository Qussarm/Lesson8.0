package Players;

import Boss.Boss;
import Game.Ability;

import java.util.Random;

public class Thor extends Hero{

        public Thor (int health, int damage) {

            super(health, damage, Ability.DISABLE);




            }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero: heroes) {
            Random r = new Random();
            int randomNumber = r.nextInt(0) +0;
            hero.setHealth(boss.getDamage() + hero.getHealth() + randomNumber);

        }
        System.out.println("Stan");

    }
}

