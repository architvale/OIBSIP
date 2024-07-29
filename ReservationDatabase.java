import java.util.*;

public class ReservationDatabase {
    private static Map<String, Reservation> reservations = new HashMap<>();

    public static void addReservation(Reservation reservation) {
        reservations.put(reservation.getPnr(), reservation);
    }

    public static Reservation getReservation(String pnr) {
        return reservations.get(pnr);
    }

    public static void removeReservation(String pnr) {
        reservations.remove(pnr);
    }
}
