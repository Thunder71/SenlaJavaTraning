public class Main {
    public static void main(String[] args) {

        Showcase showcase1 = new Showcase(1,"First_showcase");
        Showcase showcase2 = new Showcase(1,"First_showcase");

        Color color1 = new Color(1,"red");
        Color color2 = new Color(2,"blue");
        Color color3 = new Color(3,"yellow");
        Color color4 = new Color(4,"white");

        Flower flow1 = new Flower(1,"magnolia",100);
        flow1.getColor(color1);
        Flower flow2 = new Flower(2,"astra",50);
        flow2.setColor(color2);
        Flower flow3 = new Flower(3,"roze",155);
        flow3.setColor(color4);
        Flower flow4 = new Flower(4,"tulip", 120);
        flow4.setColor(color3);

        showcase1.addFlower(flow1);
        showcase1.addFlower(flow3);
        showcase2.addFlower(flow2);
        showcase2.addFlower(flow4);

        Bouquet bouquet1 = new Bouquet(1);
        bouquet1.addFlower(flow1);
        bouquet1.addFlower(flow2);
        bouquet1.addFlower(flow3);
        bouquet1.addFlower(flow4);

        bouquet1.setCost();

        System.out.println("Букет состоит из " + bouquet1.getFlowers().size() + "цветов: " + "\n" +
        bouquet1.getFlowers());

        System.out.println("Стоимость букета: " + bouquet1.getCost());

    }
}
