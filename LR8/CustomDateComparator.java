package LR8;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

class CustomDateComparator implements Comparator<Date> {
    @Override
    public int compare(Date d1, Date d2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(d1);
        cal2.setTime(d2);

        int[] fields = {
            Calendar.MILLISECOND,
            Calendar.SECOND,
            Calendar.MINUTE,
            Calendar.HOUR_OF_DAY,
            Calendar.DAY_OF_MONTH,
            Calendar.MONTH,
            Calendar.YEAR
        };

        for (int field : fields) {
            int value1 = cal1.get(field);
            int value2 = cal2.get(field);
            if (value1 != value2) {
                return Integer.compare(value1, value2);
            }
        }
        return 0;
    }
}
