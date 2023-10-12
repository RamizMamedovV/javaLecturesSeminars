package introductionOOP.Seminars.Sem005.presenter;

import introductionOOP.Seminars.Sem005.models.Table;

import java.util.Collection;

public class BookingPresenter {

    View view;
    Model model;

    public BookingPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    private Collection<Table> loadTables() {
        return model.ladTables();
    }
    public void updateUIShowTables() {
        view.showTables(loadTables());
    }

}
