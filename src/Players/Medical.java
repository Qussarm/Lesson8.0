package Players;

import Boss.Boss;
import Game.Ability;

public class Medical extends Hero{
    public Medical(int health, int damage) {
        super(health, damage, Ability.HEALT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero:heroes)
        {
            if (hero.getHealth() > 0) {
                hero.setHealth(hero.getHealth() +15);
            }
        }

    }
}
