package Players;

import Boss.Boss;
import Game.Ability;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero:heroes) {
            Random r = new Random();
            int randomNumber = r.nextInt(4) + 2;
            hero.setDamage(hero.getDamage() * randomNumber);

        }
        System.out.println("Hunter ability");




    }


}

