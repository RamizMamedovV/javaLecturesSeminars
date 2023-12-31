package introductionOOP.Seminars.Sem007.observer;

public class Vacancy implements Document{

    String companyName;

    double offerSalary;

    Occupations occupations;

    public double getOfferSalary() {
        return offerSalary;
    }

    public Occupations getOccupations() {
        return occupations;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setOfferSalary(double offerSalary) {
        this.offerSalary = offerSalary;
    }

    public void setOccupations(Occupations occupations) {
        this.occupations = occupations;
    }

    public Vacancy(String companyName, double offerSalary, Occupations occupations) {
        this.companyName = companyName;
        this.offerSalary = offerSalary;
        this.occupations = occupations;
    }

    @Override
    public String toString() {
        return String.format("companyName: %s, offerSalary: %.2f, occupations: %s"
        , companyName, offerSalary, occupations);
    }
}
