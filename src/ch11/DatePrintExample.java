package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
    //2024년 05월 08일 화요일 10 30분
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년, MM월 dd일 hh시 mm분 ss초");
        String strNow = sdf.format(now);
        System.out.println(strNow);

    }
}
