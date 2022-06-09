package baitap;

import java.util.Scanner;

public class BaiTap508 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input fraction first");
        Fraction fractionFirst = createFraction(scanner);



        System.out.println("===============");

        System.out.println("input fraction second");
        Fraction fractionSecond = createFraction(scanner);

        Fraction fraction = sumFraction(fractionFirst, fractionSecond);
        System.out.println("before reduce: " + fraction);

        fraction = reduceFraction(fraction);
        System.out.println("after reduce: " + fraction);

    }

    public static Fraction reduceFraction(Fraction fraction) {

        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();

        for (int i = numerator; i > 2; i--) {

            if (numerator % i == 0 && denominator % i == 0) {
                fraction.setNumerator(numerator / i);
                fraction.setDenominator(denominator / i);
                return fraction;
            }
        }
        return fraction;
    }

    public static Fraction sumFraction(Fraction fractionFirst, Fraction fractionSecond) {

        int numeratorFirst = fractionFirst.getNumerator();
        int denominatorFirst = fractionFirst.getDenominator();

        int numeratorSecond = fractionSecond.getNumerator();
        int denominatorSecond = fractionSecond.getDenominator();

        int sumOfNumerator = (numeratorFirst * denominatorSecond) + (numeratorSecond * denominatorFirst);

        int sumOfDenominator = denominatorFirst * denominatorSecond;

        Fraction fraction = new Fraction();
        fraction.setNumerator(sumOfNumerator);
        fraction.setDenominator(sumOfDenominator);

        return fraction;
    }

    public static Fraction createFraction(Scanner scanner) {

        System.out.println("input numerator");

        boolean checkType;
        String checkNumber;

        do {
            checkNumber = scanner.nextLine();
            checkType = Common.isNumericNotNegativeNumber(checkNumber);
        } while (!checkType);

        System.out.println("input denominator");

        int numerator = Integer.parseInt(checkNumber);

        do {
            checkNumber = scanner.nextLine();
            checkType = Common.isNumericNotZero(checkNumber);
        } while (!checkType);

        int denominator = Integer.parseInt(checkNumber);

        Fraction fraction = new Fraction(numerator, denominator);

        return fraction;
    }
}