package sem5_homework.models;

import sem5_homework.presenters.Model;

import java.util.*;

public class TableModel implements Model {

    private Collection<Table> tables;


    /**
     * Получение списка всех столиков
     */
    @Override
    public Collection<Table> loadTables() {

        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationDate Дата бронирования
     * @param name            Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * TODO: Доработать в рамках домашней работы
     * Отменить бронирование по номеру
     *
     * @param oldReservation  номер брони для отмены
     * @param reservationDate новая дата бронирования
     * @param tableNo         номер столика для брони
     * @param name            имя
     * @return  новый номер брони
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {

        for (Table table : tables) {
            table.getReservations().removeIf(reservation -> reservation.getId() == oldReservation);
        }
        return reservationTable(reservationDate, tableNo, name);
    }
}

