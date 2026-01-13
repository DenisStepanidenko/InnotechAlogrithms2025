package t1.education.lesson9.singleton;

public class Main {


    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("s1 и s2 это один и тот же объект? " + (s1 == s2));

    }


}
