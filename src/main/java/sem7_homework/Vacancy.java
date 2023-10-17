package sem7_homework;

public class Vacancy {

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //endregion


    public Vacancy(String companyName, int salary, VacancyType vacancyType) {
        this.companyName = companyName;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }
}
