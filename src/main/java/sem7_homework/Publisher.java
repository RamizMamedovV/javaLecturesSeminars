package sem7_homework;

public interface Publisher {

    void sendOffer(String companyName, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
