import java.util.ArrayList;

public class Bouquet {
    private int id;
    private  int cost;
    private ArrayList<Flower> flowers = new ArrayList<>();

    public Bouquet(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public int setCost() {
        cost = 0;
        for (int i = 0; i < flowers.size(); i++) {
            cost = cost + flowers.get(i).getCost();
        }
        return cost;
    }

    public ArrayList getFlowers() {
        return flowers;
    }

    public void addFlower(Flower newFlower) {
        flowers.add(newFlower);
    }

    public void removeFlower(Flower e){
        flowers.remove(e);
    }
}
