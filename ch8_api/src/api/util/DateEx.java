package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:03:06 KST 2025

        // yyyy : 년도 4자리, yy : 년도 2자
        // MM : 월 2자리, 1~9월 01
        // dd : 일 2자리
        // hh : 시 2자리
        // mm : 분 2자리
        // ss : 초 2자리
        // a : AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(d));
    }
}
