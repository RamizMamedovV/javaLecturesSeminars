package introductionOOP.Seminars.Sem007.adapter;

public class Main {
    public static void main(String[] args) {

        Xerox001 xerox001 = new Xerox001();
        Printer printer = new Printer(xerox001);
        printer.print();

        Xerox100 xerox100 = new Xerox100();
        AdapterXerox100 adapterXerox100 = new AdapterXerox100();
        Printer printer1 = new Printer(adapterXerox100);
        printer1.print();
    }
}
