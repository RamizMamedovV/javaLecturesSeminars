package myLibrary;

public class GetNames {


    public static String femaleName() {
        String[] str;
            str = CreateArrayMenFemaleFirstLastNames.getFemaleNames(1);
        return str[0];
    }
    public static String manName() {
        String[] str;
            str = CreateArrayMenFemaleFirstLastNames.getMenNames(1);
        return str[0];
    }
}
