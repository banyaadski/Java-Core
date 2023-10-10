package org.example;

import java.util.Date;

public class DateClss {
    public static String Format(int a){
        Date date = new Date();
        String str = String.format("В %s итоговое число получается %d", date, a);
        return str;
    }
}
