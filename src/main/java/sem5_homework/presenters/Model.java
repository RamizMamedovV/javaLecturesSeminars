package sem5_homework.presenters;

import sem5_homework.models.Table;

import java.util.Collection;
import java.util.Date;
public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);


}
