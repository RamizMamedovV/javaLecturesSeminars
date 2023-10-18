package sem7_homework;

public interface Publisher {

    void sendOffer(Document vacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
