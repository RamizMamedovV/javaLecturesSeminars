package OOP_Seminar_2_Homework;

public class Cat implements Eatable {
    private String name;
    private int switchHungary = 0;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    private boolean hungary() {
        return switchHungary == 0;
    }

    public void goToilet() {
        switchHungary = 0;
    }


    @Override
    public boolean eat(int food) {
        if (food >= this.getAppetite() && hungary()) {
            System.out.printf("%s съел %d ++++++\n", this.name, this.appetite);
            switchHungary = 1;
            return true;
        }
        else if (!hungary()) {
            System.out.printf("%s сытый, не съел %d ------\n", this.name, this.appetite);
            System.out.println("--------------");
            return false;
        }
        else {
            System.out.printf("%s не съел %d ------\n", this.name, this.appetite);
            return false;
        }
    }
}


//    @Override
//    public boolean eat(int food) {
//        return food >= this.getAppetite();
//    }
//
//    public int eat(boolean eatable) {
//        if (eatable) {
//            System.out.printf("%s съел %d \n", this.name, this.appetite);
//            return getAppetite();
//        } else  {
//            System.out.printf("%s не съел %d \n", this.name, this.appetite);
//            return -1;
//        }
//    }
