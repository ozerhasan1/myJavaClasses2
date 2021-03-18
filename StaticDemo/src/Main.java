public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name ="kılıf";
        product.price = 0;
        manager.add(product);
    }
}
