package sem7_homework;

public class Master implements Observer{

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа!" +
                            "(компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), salary);
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше!" +
                            "(компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), salary);
        }
    }
}
