import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Med_history {

    private Date recDate;

    private String status;

    private Doctor doc;

    private Set diagnostics = new HashSet();

    private Set analysis = new HashSet();

    public Med_history(Date r){
        recDate = r;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public void setDiagnostics(Diagnostic newDiagnostic){
        diagnostics.add(newDiagnostic);
    }

    public Set getDiagnostics() {
        return diagnostics;
    }

    public void deleteDiagnostic(Diagnostic d){
        diagnostics.remove(d);
    }

    public void setAnalysis(Analysis newAnalysis){
        analysis.add(newAnalysis);
    }

    public Set getAnalysis(){
        return analysis;
    }

    public void deleteAnalysis(Analysis a){
        analysis.remove(a);
    }

    @Override
    public String toString() {
        return ("����: " + recDate + "\n" +
        "������ :" + status  + "\n" +
        "������� ����: " + getDoc().getName() + " " + getDoc().getSurname() +  "\n"  +
                "������ ���. �����: " + getDoc().getPosition() + "\n" +
                "��������� �����: " + getDoc().getDepartment().getName() + "\n" +
        "���������� �������: " + "\n" + analysis.toString() + "\n" +
        "������������� �������� :" + "\n" + diagnostics.toString() + "\n");
    }
}