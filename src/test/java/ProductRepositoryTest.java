import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class ProductRepositoryTest {
    Product product1 = new Product(532, "Book1", 324);
    Product product2 = new Product(545, "Smartphone", 1432);
    Product product3 = new Product(654, "Book2", 150);

    @Test
    public void findAllProducts() {
        ProductRepository repo = new ProductRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findOneProduct() {
        ProductRepository repo = new ProductRepository();
        repo.add(product1);

        Product[] expected = {product1};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }
    @Test
    public void removeByIdProduct() {
        ProductRepository repo = new ProductRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.removeById(product2.getId());

        Product[] expected = {product1,product3};
        Product[] actual = repo.findAll();


        assertArrayEquals(expected, actual);

    }
    @Test
    public void removeByIdProduc() {
        ProductRepository repo = new ProductRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.removeById(product3.getId());

        Product[] expected = {product1,product2};
        Product[] actual = repo.findAll();


        assertArrayEquals(expected, actual);

    }


}