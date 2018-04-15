public class Analysis {

    private int id;

    private String name;

    private String type;

    private Labaratory lab;

    public Analysis(int i, String n, String t){
        id = i;
        name = n;
        type = t;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Labaratory getLab() {
        return lab;
    }

    public void setLab(Labaratory lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return ("Название анализа: " + name + "\n" +
        "Тип анализа: " + type + "\n" +
        "Лабаратория: " + lab.getName() + "\n"
        + "Тел.: " + lab.getPhone() + "\n" +
        "Адресс: " + lab.getAdress() + "\n");
    }
}