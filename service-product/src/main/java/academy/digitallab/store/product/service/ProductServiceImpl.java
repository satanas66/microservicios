package academy.digitallab.store.product.service;

import academy.digitallab.store.product.entity.Category;
import academy.digitallab.store.product.entity.Product;
import academy.digitallab.store.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productrepository;

    @Override
    public List<Product> listAllProduct() {
        return productrepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productrepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        product.setStatus("CREATED");
        product.setCreateAt(new Date());
        return productrepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productDB = getProduct(product.getId());
        if(null == productDB) {
            return null;
        }
        productDB.setName(product.getName());
        productDB.setDescription(product.getDescription());
        productDB.setCategory(product.getCategory());
        productDB.setStock(product.getStock());
        productDB.setPrice(product.getPrice());
        return productrepository.save(productDB);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product productDB = getProduct(id);
        if(null == productDB) {
            return null;
        }
        productDB.setStatus("DELETED");
        return productrepository.save(productDB);
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return productrepository.findByCategory(category);
    }

    @Override
    public Product updateStock(Long id, Double quantity) {
        Product productDB = getProduct(id);
        if(null == productDB) {
            return null;
        }
        Double stock = productDB.getStock()+quantity;
        productDB.setStock(stock);
        return productrepository.save(productDB);
    }
}
