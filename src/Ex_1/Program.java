package Ex_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
//        List list = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            list.add(String.format("string %d", i));
        }

        System.out.println(list);
        list.add("123");
        System.out.println(list);
//        System.out.println(allLength(list));
    }
}
