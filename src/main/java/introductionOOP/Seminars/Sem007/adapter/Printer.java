package introductionOOP.Seminars.Sem007.adapter;

public class Printer {

    Model2012 xerox001;

    public Printer(Model2012 xerox001) {
        this.xerox001 = xerox001;
    }

    public void print() {
        xerox001.copyA4("str");
        xerox001.printUsb(999000);
        xerox001.printDate();
    }
}
