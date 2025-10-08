import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductStream {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 55000),
            new Product("Phone", 25000),
            new Product("Tablet", 30000),
            new Product("Monitor", 15000)
        );

        products.stream()
                .filter(p -> p.price > 20000)
                .sorted(Comparator.comparing(p -> p.name))
                .map(p -> p.name.toUpperCase())
                .forEach(System.out::println);

        double avg = products.stream()
                             .mapToDouble(p -> p.price)
                             .average()
                             .orElse(0);
        System.out.println("Average Price: " + avg);
    }
}
