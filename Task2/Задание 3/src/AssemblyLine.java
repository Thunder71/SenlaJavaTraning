public class AssemblyLine implements IAssemblyLine {

    Product product;
    LineStep lineStep1;
    LineStep lineStep2;
    LineStep lineStep3;

    private  ProductPart namePart1;

    private ProductPart namePart2;

    private ProductPart namePart3;

    public AssemblyLine(IProductPart namePart1, IProductPart namePart2, IProductPart namePart3, Product product){
        this.namePart1 = (ProductPart) namePart1;
        this.namePart2 = (ProductPart) namePart2;
        this.namePart3 = (ProductPart) namePart3;
        this.product = product;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        product.installFirstPart(namePart1);
        product.installSecondPart(namePart2);
        product.installThirdPart(namePart3);
        return product;
    }
}
