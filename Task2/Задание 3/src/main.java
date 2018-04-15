public class main {
    public static void main(String[] args) {


        LineStep lineStep1 = new LineStep();
        lineStep1.setName("Body");
        LineStep lineStep2 = new LineStep();
        lineStep2.setName("highway");
        LineStep lineStep3 = new LineStep();
        lineStep3.setName("engine");

        Product product1 = new Product("Auto");

        AssemblyLine line = new AssemblyLine(lineStep1.buildProductPart(), lineStep2.buildProductPart(), lineStep3.buildProductPart(), product1);
        line.assembleProduct(product1);

        System.out.println("Продукт: " + product1.getName() + "\n" +
                "Продукт состоит из: " + "\n" +
                "Первая деталь: " + product1.getNamePart1().getName() + "\n" +
                "Собрана на линии: " + lineStep1.getName() + "\n" +
                "Вторая деталь: " + product1.getNamePart2().getName() + "\n" +
                "Собрана на линии: " + lineStep2.getName() + "\n" +
                "Вторая деталь: " + product1.getNamePart3().getName() + "\n" +
                "Собрана на линии: " + lineStep3.getName() + "\n");


    }
}
