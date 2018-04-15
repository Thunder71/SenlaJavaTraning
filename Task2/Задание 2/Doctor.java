public class Doctor extends Man {

    private String position;

    private Department department;

    public Doctor(String n, String s, String p){
        name = n;
        surname = s;
        position = p;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}