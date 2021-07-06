package java_web.branches_ex;

public class mainClass {
    public static void main(String[] args) {
        ProductManager products = new ProductManager();
        products.add(new Product(1, "Phone", 100));
        products.add(new Product(2, "Lamp", 20));
        products.add(new Product(3, "Fan", 30.5));
        products.add(new Product(4, "Mirror", 13));

        products.printProducts();

        products.setProduct(3, "Laptop", 2000);
        products.remove(4);
        System.out.println("After change: ");
        products.printProducts();
        products.sort();
        System.out.println("After sort: ");
        products.printProducts();
        System.out.println("\n\n\n--------End Code--------");
    }
}
