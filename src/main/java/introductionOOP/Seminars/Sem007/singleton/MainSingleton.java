package introductionOOP.Seminars.Sem007.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        SingleTonClass singleTonClass = SingleTonClass.gitInstance(11, "ccc", true);

        System.out.println(singleTonClass);
        System.out.println(singleTonClass.getX());
        System.out.println(singleTonClass.getStr());
    }
}
