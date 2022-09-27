package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage = 5;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(this.getHealth()>0){
            int damage2 =(boss.getDamage() / savedDamage);
            boss.setHealth(boss.getHealth()-damage2);
            System.out.println("Berserk plus damage " + damage2);
        }

        }

    }

