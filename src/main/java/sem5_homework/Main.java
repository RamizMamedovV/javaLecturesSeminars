package sem5_homework;

import sem5_homework.models.TableModel;
import sem5_homework.presenters.BookingPresenter;
import sem5_homework.presenters.Model;
import sem5_homework.presenters.View;
import sem5_homework.views.BookingView;

import java.util.Date;

public class Main {
    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        //bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");

    }
}
