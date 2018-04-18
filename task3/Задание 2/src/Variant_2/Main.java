package Variant_2;

public class Main {
    public static void main(String[] args) {

        Integer sum;
        Integer[] mass = new Integer[Modifer.NUMBER];
        MassNum massNum = new MassNum();
        massNum.setMassNum(mass);
        massNum.addMassNum();

        for (int i = 0; i < massNum.getMassNum().length; i++){
            System.out.println(massNum.getMassNum()[i].toString());
        }

        sum = Count.countNum(mass);
        System.out.println("Sum of the first three numbers: ");
        System.out.println(sum);


    }
}
