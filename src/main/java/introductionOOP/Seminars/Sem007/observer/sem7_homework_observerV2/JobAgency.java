package introductionOOP.Seminars.Sem007.observer.sem7_homework_observerV2;

import java.util.ArrayList;
import java.util.List;
public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(Document vacancy) {
        for (Observer observer : observers){
            observer.receiveOffer(vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
