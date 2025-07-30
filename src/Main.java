public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro", "15.01.2025", "Apple Inc.", "USA", 6299, false);
        productsArray[2] = new Product("Xiaomi Mix 6", "20.12.2024", "Xiaomi Ltd.", "China", 4299, true);
        productsArray[3] = new Product("Sony Xperia Z5", "05.11.2024", "Sony Corp.", "Japan", 3999, false);
        productsArray[4] = new Product("Nokia Legend", "09.10.2024", "Nokia", "Finland", 2899, true);


        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}