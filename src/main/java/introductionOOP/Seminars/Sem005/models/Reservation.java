package introductionOOP.Seminars.Sem005.models;

import javax.xml.crypto.Data;

public class Reservation {

    private static int staticReservation = 1_000;

    private final Data data;
    private final String name;
    private final int reservationId;

    {
        reservationId = ++staticReservation;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Data getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public Reservation(Data data, String name) {
        this.data = data;
        this.name = name;
    }
}
