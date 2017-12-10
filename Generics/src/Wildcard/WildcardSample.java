package Wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardSample {

    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        printList(strList);
    }
}
