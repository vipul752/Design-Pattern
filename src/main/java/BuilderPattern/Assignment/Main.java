package BuilderPattern.Assignment;

import java.util.Date;

public class Main {
     static void main(String[] args) {

        Product product = new Product.Builder(
                "Summer Vacation",
                new Date(2024, 6, 1),
                new Date(2024, 6, 15),
                "New York",
                "Los Angeles"
        )
                .budget(2000)
                .build();

        product.Display();
    }
}
