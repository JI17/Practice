package codeWars.kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PizzaPayments {
    public static double michaelPays(double cost) {

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        double priceMichael = cost < 5 ? cost : cost * 2 / 3;
        double res = Math.max(priceMichael, cost - 10);
        return new BigDecimal(res).setScale(2, RoundingMode.UP).doubleValue();

    }
}

