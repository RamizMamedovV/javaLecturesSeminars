package sem7_homework;

public class Master implements Observer{

    private VacancyType vacancyType;
    private String name;
    private int salary = 80000;

    public Master(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(Document vacancy) {
        if (this.salary <= vacancy.getSalary() && vacancyType == vacancy.getVacancyType()){
            System.out.printf("Специалист %s: Мне нужна эта работа!" +
                            "(компания: %s; заработная плата: %d " +
                            "vacancy: %s)\n",
                    name, vacancy.getCompanyName(), salary, vacancyType);
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше!" +
                            "(компания: %s; заработная плата: %d " +
                            "vacancy: %s)\n",
                    name, vacancy.getCompanyName(), salary, vacancyType);
        }
    }
}
