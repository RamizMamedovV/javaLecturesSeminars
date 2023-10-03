package myLibrary;

public class GetSurnames {


    public static String femaleSurname() {
        String[] str;
        str = CreateArrayMenFemaleFirstLastNames.getFemaleSurnames(1);
        return str[0];
    }
    public static String manSurname() {
        String[] str;
        str = CreateArrayMenFemaleFirstLastNames.getMenSurnames(1);
        return str[0];
    }
}
