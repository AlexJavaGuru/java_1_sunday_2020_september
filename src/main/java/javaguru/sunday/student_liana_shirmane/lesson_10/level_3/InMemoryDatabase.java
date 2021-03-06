package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task8

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {
    ArrayList<Product> productList = new ArrayList();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                System.out.println("Product " + productTitle + " is in the list");
                return product;
            }

        }
        return null;
    }
}
