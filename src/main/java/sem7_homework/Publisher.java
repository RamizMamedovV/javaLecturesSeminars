package sem7_homework;

public interface Publisher {

    void sendOffer(Vacancy vacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
