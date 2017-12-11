package BigDecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        float sum = 500;
        float allP = 0f;
        float percent = 0.00000001f;

        for (int i = 1; i <= 12; i++) {
            float add;
            add = sum * percent + allP * percent;
            allP += add;
        }
        sum += allP;
        System.out.println("float: " + sum);

        BigDecimal sumBigDecimal = new BigDecimal(500);
        BigDecimal allPerDecimal = new BigDecimal(0);
        BigDecimal percentDecimal = new BigDecimal(0.00000001); // 0.000001% ежемесячно

        for (int i = 1; i <= 12; i++) {
            BigDecimal addDecimal = new BigDecimal(0);
            addDecimal = addDecimal.add(sumBigDecimal.multiply(percentDecimal));
            addDecimal = addDecimal.add(allPerDecimal.multiply(percentDecimal));
            allPerDecimal = allPerDecimal.add(addDecimal);
        }
        sumBigDecimal = sumBigDecimal.add(allPerDecimal);
        System.out.println("BigDecimal: " + sumBigDecimal);
    }
}
