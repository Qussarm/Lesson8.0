package Players;

import Boss.Boss;
import Game.Ability;

public class Magical extends Hero{
    public Magical(int health, int damage) {
        super(health, damage, Ability.BOOST );
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero:heroes) {
            if (hero.getHealth() > 0){
                hero.setDamage(getDamage() + 3);
            }




        }
        System.out.println("+ 3 damage");
    }
}
