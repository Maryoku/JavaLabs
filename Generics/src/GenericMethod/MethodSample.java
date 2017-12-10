package GenericMethod;

import java.util.ArrayList;
import java.util.Collection;

public class MethodSample {

    public static void main(String[] args)
    {
        addAll(new String[10], new ArrayList<String>());
        addAll(new Object[10], new ArrayList<Object>());
        //addAll(new Integer[10], new ArrayList<String>()); // Ошибка
        addAll(new String[10], new ArrayList<Object>());
    }

    static <T> void addAll(T[] a, Collection<T> c) {
        for (int i = 0; i < a.length; i++) {
            c.add(a[i]);
        }
    }
}
