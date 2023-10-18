package sem7_homework;

public interface Document {

    VacancyType getVacancyType();
    void setVacancyType(VacancyType vacancyType);
    String getCompanyName();

    void setCompanyName(String companyName);

    int getSalary();

    void setSalary(int salary);
}
