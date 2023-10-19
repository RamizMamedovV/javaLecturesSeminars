package introductionOOP.Seminars.Sem007.observer.sem7_homework_observerV2;

public interface Publisher {

    void sendOffer(Document vacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
