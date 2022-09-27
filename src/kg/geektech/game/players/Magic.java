package kg.geektech.game.players;

public class Magic extends Hero {

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {

            int damage1 = (heroes[i].getDamage() + 10);
            if(heroes[i].getHealth()>0) {
           boss.setHealth(boss.getHealth() - damage1);
            }
            System.out.println("Magic plus all heroes damage " + damage1);
        }

    }
}
