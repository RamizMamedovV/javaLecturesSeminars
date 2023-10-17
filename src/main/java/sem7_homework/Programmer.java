package sem7_homework;

public class Programmer implements Observer{

    private VacancyType vacancyType;

    private String name;
    private int salary = 100_000;

    public Programmer(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() && vacancyType == vacancy.getVacancyType()){
            System.out.printf("Программист %s: Мне нужна эта работа!" +
                            "(компания: %s; заработная плата: %d " +
                            "vacancy: %s)\n",
                    name, vacancy.getCompanyName(), salary, vacancyType);
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Программист %s: Я найду работу получше!" +
                            "(компания: %s; заработная плата: %d " +
                            "vacancy: %s)\n",
                    name, vacancy.getCompanyName(), salary, vacancyType);
        }
    }
}
