package com.companyCat;

import java.util.Scanner;

public class Main {
    public static String operation;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	Fraction fraction = new Fraction(7, 7);
	Fraction fraction1 = new Fraction(5, 0);
	Fraction fraction2 = new Fraction(8, 2);

    System.out.println(fraction +System.lineSeparator()+fraction1+System.lineSeparator()+fraction2);


        System.out.println(Fraction.BackFraction(fraction));
        Fraction.operation = "+"; //по идее будет работать с +.- ))))

        System.out.println(" операция над дробями - "+Fraction.operation);
        System.out.println(Fraction.CalcSumR(fraction, fraction1));

    }
}
