package introductionOOP.Seminars.Sem007.adapter;

public class Xerox100 implements Model2023{

    @Override
    public void printA4(String str) {
        System.out.println(str);
    }
}
