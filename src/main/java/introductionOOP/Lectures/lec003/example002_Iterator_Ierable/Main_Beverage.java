package introductionOOP.Lectures.lec003.example002_Iterator_Ierable;

import introductionOOP.Lectures.lec003.example002_Iterator_Ierable.example002_2_Iterable.BeverageIterable;
import introductionOOP.Lectures.lec003.example002_Iterator_Ierable.example002_2_Iterable.Coffee_Iterable;


public class Main_Beverage {
    public static void main(String[] args) {

        Beverage latte = new Coffee();
        latte.addIngredients(new Water("water"));
        latte.addIngredients(new Water("water"));
        latte.addIngredients(new Water("water1"));
        latte.addIngredients(new Beans("beans"));

 //                     for Iterator


//        while (latte.hasNext()) {
//            System.out.println(latte.next());
//        }


        //#region Beverage Iterator из лекции

         //Iterator<Ingredients> iterator = latte;
//         while (iterator.hasNext()) {
//             System.out.println(iterator.next());
//         }

        //#endregion


        //                      for Iterable

        BeverageIterable latte_Iter = new Coffee_Iterable();
        latte_Iter.addIngredients(new Water("water"));
        latte_Iter.addIngredients(new Beans("beans"));


        for (Ingredients c : latte_Iter) {
            System.out.println(c);
        }



    }
}
