package introductionOOP.Seminars.Sem005.view;

import introductionOOP.Seminars.Sem005.models.Table;
import introductionOOP.Seminars.Sem005.presenter.View;

import java.util.Collection;

public class BookingView implements View {

    public void showTables(Collection<Table> list) {
        for (Table table : list) {
            System.out.println(table);
        }
    }
}
