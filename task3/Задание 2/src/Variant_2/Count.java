package Variant_2;

public class Count {

    
    public static Integer countNum(Integer[] mass){
        Integer sum = 0;
        for (int i = 0; i < Modifer.NUMBER; i++){
            String str;
            str = mass[i].toString();
            sum = sum + Character.getNumericValue(str.charAt(0));

        }
        return sum;
    }
}
