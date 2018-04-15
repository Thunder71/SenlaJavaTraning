public class Product implements IProduct {

    private String name;

    private  ProductPart namePart1;

    private ProductPart namePart2;

    private ProductPart namePart3;

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductPart getNamePart1() {
        return namePart1;
    }

    public void setNamePart1(ProductPart namePart1) {
        this.namePart1 = namePart1;
    }

    public ProductPart getNamePart2() {
        return namePart2;
    }

    public void setNamePart2(ProductPart namePart2) {
        this.namePart2 = namePart2;
    }

    public ProductPart getNamePart3() {
        return namePart3;
    }

    public void setNamePart3(ProductPart namePart3) {
        this.namePart3 = namePart3;
    }

    @Override
    public void installFirstPart(IProductPart productPart) {
        this.namePart1 = (ProductPart) productPart;
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        this.namePart2 = (ProductPart) productPart;
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        this.namePart3 = (ProductPart) productPart;
    }
}
