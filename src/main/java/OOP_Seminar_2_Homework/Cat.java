package OOP_Seminar_2_Homework;

public class Cat implements Eatable{
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }


    @Override
    public boolean eat(int food) {
        return food >= this.getAppetite();
    }

    public int eat(boolean eatable) {
        if (eatable) {
            System.out.printf("%s съел %d \n", this.name, this.appetite);
            return getAppetite();
        } else  {
            System.out.printf("%s не съел %d \n", this.name, this.appetite);
            return -1;
        }
    }
}
