public class Flower {
    private int id;
    private String name;
    private int cost;
    private Showcase showcase;
    private Color color;

    public Flower(int id, String name, int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Showcase getShowcase() {
        return showcase;
    }

    public void setShowcase(Showcase showcase) {
        this.showcase = showcase;
    }

    public Color getColor(Color color1) {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Name of flower: " + name + "\n" +
        "Cost of a flower: " + cost + "\n" +
                "Color: " + color + "\n" +
        "From shop window: " + "\n" + showcase);
    }
}
