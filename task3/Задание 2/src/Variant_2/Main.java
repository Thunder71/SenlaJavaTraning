package Variant_2;

public class Main {
    public static void main(String[] args) {

        Integer sum;
        Integer[] mass = new Integer[Modifer.NUMBER];
        MassNum massNum = new MassNum();
        massNum.setNum(Modifer.NUMBER);
        massNum.addMassNum(mass);

        for (int i = 0; i < Modifer.NUMBER; i++){
            System.out.println(mass[i].toString());
        }

        sum = Count.countNum(mass);
        System.out.println("Sum of the first three numbers: ");
        System.out.println(sum);


    }
}
