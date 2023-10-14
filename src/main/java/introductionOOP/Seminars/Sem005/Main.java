package introductionOOP.Seminars.Sem005;

import introductionOOP.Seminars.Sem005.models.TableModel;
import introductionOOP.Seminars.Sem005.presenters.BookingPresenter;
import introductionOOP.Seminars.Sem005.presenters.Model;
import introductionOOP.Seminars.Sem005.presenters.View;
import introductionOOP.Seminars.Sem005.views.BookingView;

import java.util.Date;

public class Main {
    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");

    }
}
