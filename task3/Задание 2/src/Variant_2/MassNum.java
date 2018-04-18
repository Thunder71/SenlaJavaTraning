package Variant_2;

public class MassNum {

    private int num;
    private Integer[] massNum = new Integer[num];


    public Integer[] getMassNum(){
        return massNum;
    }


    public void addMassNum(Integer[] massNum) {
        for (int i = 0; i < num; i++){
            massNum[i] = RandomNum.Random();
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
