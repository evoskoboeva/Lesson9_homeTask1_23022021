package com.companyCat;

public class Fraction<pablic, operation> {
    public static String getOperation() {
        return operation;
    }

    public static void setOperation(String operation) {
        Fraction.operation = operation;
    }

    public static String operation;
    private int numerator;
    private int denominate;
    private char del = '/';

    //public String operation;


    public static Fraction BackFraction(Fraction fraction) {
        if (fraction.numerator == 0) {
            return new Fraction(fraction.denominate, 1);
        } else {
            return new Fraction(fraction.denominate, fraction.numerator);
        }
    }



    public static String CalcSumR(Fraction fraction, Fraction fraction1)  //подавать можно любые 2 дроби..

    {

        if (fraction.denominate == 0) {
            fraction.denominate = 1;
        }
        if (fraction1.denominate == 0) {
            fraction1.denominate = 1;
        }
        if (operation.equals("+")) {
            var s = (fraction.numerator / fraction.denominate + fraction1.numerator / fraction1.denominate)
                    + System.lineSeparator() + "1/" +
                    (fraction.numerator / fraction.denominate + fraction1.numerator / fraction1.denominate);
            return s;
        } else if (operation.equals("-")) {
            var s = (fraction.numerator / fraction.denominate - fraction1.numerator / fraction1.denominate)
                    + System.lineSeparator() + "1/" +
                    (fraction.numerator / fraction.denominate - fraction1.numerator / fraction1.denominate);

            return s;
        } else if (operation.equals("*")) {
            var s = (fraction.numerator / fraction.denominate) * (fraction1.numerator / fraction1.denominate)
                    + System.lineSeparator() + "1/" +
                    (fraction.numerator / fraction.denominate) * (fraction1.numerator / fraction1.denominate);
            return s;
        }
        ;
        return null;
    }



    @Override
    public String toString() {
        return "Fraction{" +
                numerator +
                "/" + denominate +
                '}';
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominate() {
        return denominate;
    }
    public int getDel() {
        return del;
    }


    public void setDenominate(int denominate) {
        this.denominate = denominate;
    }

    public Fraction(int numerator, int denominate) {
        this.numerator = numerator;
        this.denominate = denominate;
    }
}
