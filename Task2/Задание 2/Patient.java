import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Patient extends Man {

    private int snils;

    private Date birthday;

    private int seriesPass;

    private int numPass;

    private MedCard card;

    private Set diagnostics = new HashSet();

    public Patient(String name, String surname, int snils, int seriesPass, int numPass){
        this.name = name;
        this.surname = surname;
        this.snils = snils;
        this.seriesPass = seriesPass;
        this.numPass = numPass;
    }

    public int getSnils() {
        return snils;
    }

    public void setSnils(int snils) {
        this.snils = snils;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSeriesPass() {
        return seriesPass;
    }

    public void setSeriesPass(int seriesPass) {
        this.seriesPass = seriesPass;
    }

    public int getNumPass() {
        return numPass;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public MedCard getCard() {
        return card;
    }

    public void setCard(MedCard card) {
        this.card = card;
    }

    public void setDiagnostic(Diagnostic newDiagnostic){
        diagnostics.add(newDiagnostic);
    }

    public Set getDiagnostics(){
        return diagnostics;
    }

    public void deleteDiagnostic(Diagnostic d){
        diagnostics.remove(d);
    }

}