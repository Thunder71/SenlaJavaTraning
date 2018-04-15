import java.util.HashSet;
import java.util.Set;

public class Department {

    private int id;

    private String name;

    private Set doctors = new HashSet();

    public  Department(int i, String n){
        id = i;
        name = n;
    }

    public void addDoctor(Doctor newDoctor){
        doctors.add(newDoctor);
        newDoctor.setDepartment(this);
    }

    public Set getDoctors(){
        return  doctors;
    }

    public void removeDoctor(Doctor e){
        doctors.remove(e);
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
}