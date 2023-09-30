package introductionOOP.Lectures.lec003.example001_Iterator;

import java.util.ArrayList;
import java.util.List;
/*
1. Iterator<E>
    Итератор над «коллекцией». Iterator занимает место
    Enumeration’в Java Collections Framework.
    hasNext()
    next()
    */
public class Worker_Main {
    public static void main(String[] args) {

        //#region Intro Iterator
        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1234);
        // nums.add(12345);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }
        //#endregion



        //#region Worker Iterator

//         Worker worker = new Worker(
//             "Имя", "Фамилия", 23, 4567);

         /*    можно в одну линию - компаратор подскажет!!
         while (((Iterator<String>) worker).hasNext()) {
             System.out.println(worker.next());
         }
         */

//         Iterator<String> components = worker;
//
//         while (components.hasNext()) {
//             System.out.println(worker.next());
//         }


        //#region Worker Iterator моя версия:

        Worker worker = new Worker(
             "Имя", "Фамилия", 23, 4567);
        Worker worker1 = new Worker(
             "Имя", "ФФФ", 23, 4567);
        Worker worker2 = new Worker(
             "Имя", "ЯЯЯЯ", 23, 4567);


         Freelancer freelancer = new Freelancer("AAA", 18);

        List<Worker> objectsList = new ArrayList<>();
        objectsList.add(worker);
        objectsList.add(worker1);
        objectsList.add(worker2);
        objectsList.add(freelancer);

        for (Worker o : objectsList) {
            System.out.println(o.getClass().getSimpleName() +"--------------");
            while (o.hasNext()){
                System.out.println(o.next());
            }
        }

    }
}
