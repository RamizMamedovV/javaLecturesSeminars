package myLibrary;

import java.util.Random;

public class GetStringRandomNameSurname {

    public static String getNamesSurnames() {
        Random rnd = new Random();
        String[] str;
        int i = rnd.nextInt(10);
        if (i % 2 == 0) {
            str = CreateArrayMenFemaleFirstLastNames.getMenFirstLastNames(1);
        } else {
            str = CreateArrayMenFemaleFirstLastNames.getFemaleFirstLastNames(1);
        }
        return str[0];
    }

    public static String getName() {
        Random rnd = new Random();
        String[] str;
        int i = rnd.nextInt(10);
        if (i % 2 == 0) {
            str = CreateArrayMenFemaleFirstLastNames.getFemaleNames(1);
        } else {
            str = CreateArrayMenFemaleFirstLastNames.getMenNames(1);
        }
        return str[0];
    }

    public static String getSurname() {
        Random rnd = new Random();
        String[] str;
        int i = rnd.nextInt(10);
        if (i % 2 == 0) {
            str = CreateArrayMenFemaleFirstLastNames.getFemaleSurnames(1);
        } else {
            str = CreateArrayMenFemaleFirstLastNames.getMenSurnames(1);
        }
        return str[0];
    }
}
