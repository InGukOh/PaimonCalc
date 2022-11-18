package com.example.paimonwillcalc.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class set_Day {

    public static String getToday(){

        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EE", Locale.KOREA);

        String toDay = sdf.format(date);

        return toDay;
    }

}
