package sem7_homework;

public class Vacancy {

    private String companyName;

    private int salary;

    //region getter setter

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


    public Vacancy(String companyName, int salary) {
        this.companyName = companyName;
        this.salary = salary;
    }
}
