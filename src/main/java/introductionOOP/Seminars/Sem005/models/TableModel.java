package introductionOOP.Seminars.Sem005.models;

import introductionOOP.Seminars.Sem005.presenter.Model;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> ladTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                tables.add(new Table());
            }
        }
        return tables;
    }

    @Override
    public int reservationTable(Date date, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getId() == tableNo) {
                Reservation reservation = new Reservation((Data) date, name);
                table.getReservations().put(reservation.getReservationId(), reservation);
                return reservation.getReservationId();
            }
        }
        throw new RuntimeException("Не корректный номер столика");
    }

    @Override
    public int deleteReservationTable(int reservationId) {
        for (Table table : tables) {
            if(table.getReservations().containsKey(reservationId)) {
                table.getReservations().remove(reservationId);
                return 1;
            }
        }

        return 0;
    }
}
