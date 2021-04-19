package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(3.157, 3.156));
        areEqualByThreeDecimalPlaces(3.157, 3.157);
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        BigDecimal a = new BigDecimal(one).setScale(3, RoundingMode.DOWN);
        BigDecimal b = new BigDecimal(two).setScale(3, RoundingMode.DOWN);
        System.out.println(a);
        System.out.println(b);

        if(a.equals(b)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

}
