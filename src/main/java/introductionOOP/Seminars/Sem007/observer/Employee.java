package introductionOOP.Seminars.Sem007.observer;

public class Employee {

    //region field
    private static int staticEmployeeId;

    private int id;
    private String name;
    private double gotSalary;
    private double needSalary;
    private Publisher publisher;
    private Occupations occupations;
    //endregion

    //region getters setters

    public String getName() {
        return name;
    }

    public double getNeedSalary() {
        return needSalary;
    }

    public Occupations getOccupations() {
        return occupations;
    }

    public int getId() {
        return id;
    }

    //endregion

    static {
        staticEmployeeId = 1000;
    }

    {
        id = ++staticEmployeeId;
    }

    public Employee(String name, Occupations occupations, double needSalary, Publisher publisher) {
        this.name = name;
        this.occupations = occupations;
        this.needSalary = needSalary;
        this.publisher = publisher;
    }

    public Employee getOffer(Document vacancy) {
        System.out.println("vacancy.getOfferSalary()" + vacancy.getOfferSalary());  //debug
        System.out.println("this.needSalary" + this.needSalary);
        System.out.println("vacancy.getOccupations()" + vacancy.getOccupations());  //debug
        if (vacancy.getOfferSalary() >= this.needSalary
                && vacancy.getOccupations() == this.occupations) {
            System.out.println(this.getName() + " got");
            return this;
            //publisher.getResponse(true, this, vacancy);
        } //else publisher.getResponse(false, this, vacancy);
        return null;
    }

    @Override
    public String toString() {
        return String.format(" name: %s, occupation: %s\n "
                , name, occupations);
    }
}
