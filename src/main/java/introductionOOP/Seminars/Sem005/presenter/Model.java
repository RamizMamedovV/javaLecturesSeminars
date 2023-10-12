package introductionOOP.Seminars.Sem005.presenter;

import introductionOOP.Seminars.Sem005.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> ladTables();

    int reservationTable(Date date, int tableNo, String name);

    int deleteReservationTable(int reservationId);
}
