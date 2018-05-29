import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
    static Date dateNow = new Date();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("E dd.MM.yyyy 'time:' hh:mm:ss");

    static String date = dateFormat.format(dateNow);

    static public String getDate() {
        return date;
    }

}
