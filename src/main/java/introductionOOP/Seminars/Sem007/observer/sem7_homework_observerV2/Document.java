package introductionOOP.Seminars.Sem007.observer.sem7_homework_observerV2;

public interface Document {

    VacancyType getVacancyType();
    void setVacancyType(VacancyType vacancyType);
    String getCompanyName();

    void setCompanyName(String companyName);

    int getSalary();

    void setSalary(int salary);
}
