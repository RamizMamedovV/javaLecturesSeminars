package introductionOOP.Seminars.Sem007.observer.sem7_homework_observerV2;

public class Vacancy implements Document{

    private String companyName;

    private int salary;

    private VacancyType vacancyType;

    //region getter setter


    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(VacancyType vacancyType) {
        this.vacancyType = vacancyType;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //endregion


    public Vacancy() {
    }

    public Vacancy(String companyName, int salary, VacancyType vacancyType) {
        this.companyName = companyName;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }
}
