package introductionOOP.Seminars.Sem005.presenters;

import java.util.Date;
public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);


    void reBookingTable(int oldReservation, Date orderDate, int tableNo, String name);

}
