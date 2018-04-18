package Variant_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[Modifier.NUM_WORDS];

        System.out.println("Add mas of numbers: ");
        Mass mass = new Mass(in);
        mass.setWord(words);
        mass.addWord();

        for (int i = 0; i < mass.getWord().length; i++){
            System.out.println(mass.getWord()[i]);
        }
        System.out.println("The sum is: " + Calc.Summ(words));
    }
}
