public class CalendarConverter {

    static final int monday = 1, tuesday = 2, wednesday = 3, thursday = 4, friday = 5, saturday = 6, sunday = 7;

    static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case monday:
                return "Poniedziałek";

            case tuesday:
                return "Wtorek";

            case wednesday:
                return "Sroda";

            case thursday:
                return "Czwartek";

            case friday:
                return "Piatek";

            case saturday:
                return "Sobota";

            case sunday:
                return "Niedziela";

            default:
                return "numer musi byc od 1 do 7 wlacznie";

        }
    }

}
