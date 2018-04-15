import java.util.HashSet;
import java.util.Set;

public class MedCard {

    private int id;

    private String name;

    private Set med_History = new HashSet();

    public MedCard(int i, String n){
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMed_History(Med_history m){
        med_History.add(m);
    }

    public Set getMed_History(){
        return med_History;
    }

    public void deleteMed_History(Med_history m){
        med_History.remove(m);
    }
}