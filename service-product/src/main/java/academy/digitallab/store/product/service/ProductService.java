package academy.digitallab.store.product.service;

import academy.digitallab.store.product.entity.Category;
import academy.digitallab.store.product.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProduct();
    List<Product> findByCategory(Category category);
    Product getProduct(Long id);

    Product createProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);
    Product updateStock(Long id, Double quantity);
}
