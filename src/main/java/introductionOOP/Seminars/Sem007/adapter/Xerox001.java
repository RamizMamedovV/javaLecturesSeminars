package introductionOOP.Seminars.Sem007.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Xerox001 implements Model2012{

    @Override
    public void copyA4(String str) {
        System.out.println(str);
    }


    @Override
    public void printUsb(int enterNo) {
        System.out.println(enterNo);
    }


    @Override
    public void printDate() {
        System.out.println(LocalDateTime.now());
    }

}
