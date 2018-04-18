package Variant_2;

public class MassNum {

    private Integer[] massNum;


    public void setMassNum(Integer[] massNum) {
        this.massNum = massNum;
    }

    public Integer[] getMassNum(){
        return massNum;
    }


    public void addMassNum() {
        for (int i = 0; i < massNum.length; i++){
            massNum[i] = RandomNum.Random();
        }
    }

}
