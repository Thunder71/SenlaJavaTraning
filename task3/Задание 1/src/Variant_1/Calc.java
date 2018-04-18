package Variant_1;

public class Calc {

    public static String Summ(String[] mass){

        String sum;
        Integer sum1 = 0;
        for (int i = 0; i < mass.length; i++){
            sum1 = sum1 + Integer.parseInt(mass[i]);
        }
        sum = sum1.toString();
        return sum;

    }
}
