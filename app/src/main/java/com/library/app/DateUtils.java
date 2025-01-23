package com.library.app;

import static com.library.app.Constants.TIME_ZONE;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
public class DateUtils {
    public static Instant getLocalTime() {
        TimeZone timeZone = TimeZone.getTimeZone(TIME_ZONE);
        String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.'Z'";
        Date date = new Date();
        DateFormat requiredFormat = new SimpleDateFormat(dateFormat);
        requiredFormat.setTimeZone(timeZone);
        String strCurrentDay = requiredFormat.format(date).toUpperCase();
        Instant currentTime = Instant.parse(strCurrentDay);
        return currentTime;
    }
}
