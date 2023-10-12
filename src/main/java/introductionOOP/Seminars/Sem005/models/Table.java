package introductionOOP.Seminars.Sem005.models;

import java.util.*;

public class Table {

    private final Map<Integer,Reservation> reservations = new HashMap<>();

    private static int stId = 0;

    private final int id;

    {
        id = ++stId;
    }

    public int getId() {
        return id;
    }

    public Map<Integer,Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),"Table #%d", id);
    }
}
