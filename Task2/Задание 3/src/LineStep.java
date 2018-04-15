public class LineStep implements ILineStep {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IProductPart buildProductPart() {
        ProductPart part = new ProductPart(name);

        return part;
    }
}