import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        int day = 30;
        int month = 8;
        int year = 1996;

        System.out.println(collectBirthdays(year, month, day));

    }
    public static String collectBirthdays(int year, int month, int day) {

        Calendar calendar = new GregorianCalendar(year,month-1,day);
        Calendar calendar1= new GregorianCalendar();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy - E");
        String text = "";
        StringBuilder builder = new StringBuilder(text);

        for (int i = 0; !calendar.after(calendar1); i++)
            {
            String formatedTime = format1.format(calendar.getTime());
            text =i + " - "+ formatedTime + System.lineSeparator();
            builder.append(text);
            calendar.add(Calendar.YEAR, 1);
            }

        return builder.toString();
    }
}
