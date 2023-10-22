package dateTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2023,10,3);
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);


    }
}
