package GenericClass;

import java.util.Collection;

public class ClassSample {
    public static void main(String[] args)
    {
        GenericSample<Integer> value1 = new GenericSample<Integer>(new Integer(10));
        GenericSample.Print(value1);

        Integer intValue1 = value1.getValue();

        GenericSample<String> value2 = new GenericSample<String>("Hello world");
        GenericSample.Print(value2);

        // Ошибка несоответствия типа
        //Integer intValue2 = value2.getValue();
    }
}

class GenericSample<T>
{
    private T value;

    public GenericSample(T value) {
        this.value = value;
    }

    public String toString() {
        return "{" + value + "}";
    }

    public T getValue() {
        return value;
    }

    static <T> void Print(T param) {
        System.out.println(param);
    }
}