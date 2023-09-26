package introductionOOP.Lectures.lec001;

public class Magician extends Hero {
    private int mana;
    private int MaxMana;
    public Magician() {
        super(String.format("Magician_%d", ++Magician.number)
        , Magician.rnd.nextInt(150, 200));
        this.maxHp = Hero.rnd.nextInt(150, 200);
        this.hp = maxHp;
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.toString(), this.mana);
    }
}
