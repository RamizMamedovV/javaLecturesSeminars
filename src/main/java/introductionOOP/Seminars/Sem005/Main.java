package introductionOOP.Seminars.Sem005;

import introductionOOP.Seminars.Sem005.models.TableModel;
import introductionOOP.Seminars.Sem005.presenter.BookingPresenter;
import introductionOOP.Seminars.Sem005.presenter.Model;
import introductionOOP.Seminars.Sem005.presenter.View;
import introductionOOP.Seminars.Sem005.view.BookingView;

public class Main {
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter booking = new BookingPresenter(bookingView, tableModel);

        booking.updateUIShowTables();

    }
}
