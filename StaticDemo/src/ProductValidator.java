public class ProductValidator {
    static {
        System.out.println("static blok çalıştı");
    }
    public ProductValidator() {
    System.out.println("yapıcı blok çalıştı");
}
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void bisey() {

    }
}
