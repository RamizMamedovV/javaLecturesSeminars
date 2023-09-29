package introductionOOP.Lectures.lec001;

import introductionOOP.Lectures.lec001.Hero;

public class Magician extends Hero {
    private int mana;
    private int MaxMana;
    public Magician() {
        super(String.format("Magician_%d", ++number)
        , rnd.nextInt(150, 200));
        this.maxHp = rnd.nextInt(150, 200);
        this.hp = maxHp;
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.toString(), this.mana);
    }
}
