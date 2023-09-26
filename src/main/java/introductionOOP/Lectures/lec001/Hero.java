package introductionOOP.Lectures.lec001;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hero {
    protected static int number;
    protected static Random rnd;
    protected static Map<Integer,String> heros;
    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        Hero.number = 1;
        Hero.rnd = new Random();
        heros = new HashMap<>();
    }

    public Hero(String newName, int hp) {
        if (newName.isEmpty() || heros.containsValue(newName)) {
            this.name = String.format("DefaultName_%d", ++Hero.number);
        } else {
            this.name = newName;
        }
        heros.put(Hero.number, newName);
        this.hp = hp;
        this.maxHp = Hero.rnd.nextInt(hp + hp);
    }

    public Hero(String newName) {
        this(newName, Hero.rnd.nextInt(50, 150));
    }

    protected void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else {
            System.out.println(this.name + "is died");
            die(this.name);
        }
    }
    protected void die(String diedHero) {
        Integer index = null;
        for (Map.Entry<Integer, String> entry : heros.entrySet()) {
            if (entry.getValue().equals(diedHero)) {
                index = entry.getKey();
                Hero.heros.remove(index);
                break; // Найдено соответствие, выходим из цикла
            }
        }
    }

    public void attack(Hero targetHero) {
        int damage = Hero.rnd.nextInt(10, 20);
        targetHero.getDamage(damage);
    }

    public void healed(int healedHp) {
        this.hp = Math.min(this.hp + healedHp, maxHp);
    }

    @Override
    public String toString() {
        if (Hero.heros.containsValue(this.name)) {
            return String.format("Name: %s Hp: %d maxHp: %d Type", this.name
                    , this.hp, this.maxHp, this.getClass().getSimpleName());
        }
        return null;
    }
}
