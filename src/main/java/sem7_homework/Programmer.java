package sem7_homework;

public class Programmer implements Observer{

    private String name;
    private int salary = 100_000;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Программист %s: Мне нужна эта работа!" +
                            "(компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Программист %s: Я найду работу получше!" +
                            "(компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
