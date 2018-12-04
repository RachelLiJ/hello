package hi;

import java.util.ArrayList;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello world.");
        System.out.println("hello");
        System.out.println();
        System.out.println("Hello.main");
        System.out.println("args = [" + args + "]");
        System.out.println("Hello.main");//method
        int n = 1;
        System.out.println("n = " + n);
        int v = 20;
        System.out.println("Hello.main");
        System.out.println("v = " + v);
        System.out.println("args = " + args);

        for (int i = 0; i < 5; i++) {

        }
        for (String arg : args) {

        }
        for (int i = 0; i < args.length; i++) {

        }

        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i1 = 0; i1 < list.size(); i1++) {
            System.out.println(list.get(i1));
        }
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            System.out.println(list.get(i1));
        }
    }
}
