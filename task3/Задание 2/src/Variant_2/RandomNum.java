package Variant_2;

public class RandomNum {

    private  static int min;
    private static int max;

    public static int Random(){
        min = Modifer.MIN_NUMBER;
        max = Modifer.MAX_NUMBER;

        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
