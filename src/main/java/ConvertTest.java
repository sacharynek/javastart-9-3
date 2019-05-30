

public class ConvertTest {

    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            System.out.format("%d dzień tygodnia to %s \n",i, CalendarConverter.convertDayToString(i));
        }
    }
}
