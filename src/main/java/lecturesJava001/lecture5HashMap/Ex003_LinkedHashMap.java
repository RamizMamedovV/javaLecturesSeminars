package lecturesJava001.lecture5HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
/*                          LinkedHashMap

«Старший брат» коллекции HashMap, который все помнит…
Помнит порядок добавления элементов ➜ более медлительный
 */
public class Ex003_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}



        //                              Hashtable
    // «Устаревший брат» коллекции HashMap,
    //который не знает про null
    Map<Integer,String> table = new Hashtable<>();
        table.put(1, "один");
        table.put(11, "один один");
        table.put(2, "два");
        System.out.println(table); // {2=один, 1=два, 11=один один}
    // table.put(null, "один"); //  java.lang.NullPointerException
    }


}
