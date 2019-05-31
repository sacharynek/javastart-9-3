public class CalendarConverter {

    static final int MONDAY = 1, TUESDAY = 2, WEDNESDAY = 3, THURSDAY = 4, FRIDAY = 5, SATURDAY = 6, SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case MONDAY:
                return "Poniedziałek";

            case TUESDAY:
                return "Wtorek";

            case WEDNESDAY:
                return "Sroda";

            case THURSDAY:
                return "Czwartek";

            case FRIDAY:
                return "Piatek";

            case SATURDAY:
                return "Sobota";

            case SUNDAY:
                return "Niedziela";

            default:
                return "numer musi byc od 1 do 7 wlacznie";

        }
    }

}
