import java.util.HashSet;
import java.util.Set;

public class Showcase {
    private int id;
    private String name;
    private Set flowers = new HashSet();

    public Showcase (int id, String name){
        this.id = id;
        this.name = name;
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

    public Set getFlowers(){
        return flowers;
    }

    public void addFlower(Flower newFlower){
        flowers.add(newFlower);
        newFlower.setShowcase(this);
    }

    public void removeFlower(Flower e){
        flowers.remove(e);
    }

    @Override
    public String toString() {
        return "Shop window name: " + name + "\n";
    }
}
