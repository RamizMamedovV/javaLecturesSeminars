package introductionOOP.Seminars.Sem007.observer;

public interface Publisher {

    Employee sendOffer(Document vacancy);
    void getResponse(boolean isAcceptable, Employee employee, Document vacancy);
}
