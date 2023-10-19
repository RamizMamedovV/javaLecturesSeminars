package introductionOOP.Seminars.Sem007.observer;

public interface Document {

    void setCompanyName(String companyName);
    void setOfferSalary(double offerSalary);
    void setOccupations(Occupations occupations);

    double getOfferSalary();
    Occupations getOccupations();
}
