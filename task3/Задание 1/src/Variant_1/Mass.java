package Variant_1;

import java.util.Scanner;

public class Mass {
    private String[] word;
    private Scanner in;

    public Mass(Scanner in){
        this.in = in;
    }

    public String[] getWord() {
        return word;
    }

    public void addWord() {
        for (int i = 0; i < word.length; i++){
            word[i] = in.nextLine();
        }
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }


}
