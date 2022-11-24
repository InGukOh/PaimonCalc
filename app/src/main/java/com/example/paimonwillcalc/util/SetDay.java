package com.example.paimonwillcalc.util;

import android.icu.util.LocaleData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SetDay {

    public static String getToday(){

        Date date = Calendar.getInstance().getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("EE", Locale.KOREA);

        String toDay = sdf.format(date);

//        Date currentDate = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(currentDate);
//        int num = calendar.get(Calendar.DAY_OF_WEEK);
//
//        return num;

        return toDay;
    }

}
