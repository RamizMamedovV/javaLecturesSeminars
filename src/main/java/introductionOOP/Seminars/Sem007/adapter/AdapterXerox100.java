package introductionOOP.Seminars.Sem007.adapter;

import java.time.LocalDateTime;

/*
чтобы не изменять класс Printer, мы создаём адаптивный интерфейс
для нового класса (Xerox100 implements Model2023) и адаптируем его
интерфейс под нужный интерфейс Model2012
 */
public class AdapterXerox100 implements Model2012{

    Model2023 xerox2023;

    public AdapterXerox100() {
        xerox2023 = new Xerox100();
    }

    @Override
    public void copyA4(String str) {
        xerox2023.printA4(str);
    }

    @Override
    public void printUsb(int enterNo) {
        System.out.println("No USB");
    }

    @Override
    public void printDate() {
        System.out.println(LocalDateTime.now());
    }
}
