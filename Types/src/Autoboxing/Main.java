package Autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Неудобство примитивных типов - с ними нельзя делать то, что можно делать со всеми объектами -
    // они не имеют методов их нельзя помещать в коллекции и прочее.

    // Для того, чтобы обойти это неудобство, для всех примитивных типов существуют соответствующие классы-оболочки,
    // объекты которых могут хранить значения примитивных типов, но обладает всеми свойствами нормальных объектов.

    public static void main(String[] args) {
        Integer in = new Integer(-8);

        // 1. Распаковка через вызов метода
        int absVal = absoluteValue(in);
        System.out.println("absolute value of " + in + " = " + absVal);
        List<Double> doubleList = new ArrayList<Double>();

        // Автоупаковка через вызов метода
        doubleList.add(3.1416);

        // 2. Распаковка через присвоение
        double phi = doubleList.get(0);
        System.out.println("phi = " + phi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
