package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void addProduct(Product product);

    Page<Product> getAllProduct(Integer pageNumber);

    List<Product> getAllProduct();

    Optional<Product> getProductById(long productId);

    void updateProduct(Product product);

    void deleteProduct(long productId);

    List<Product> getAllProductByCategory(String category);

    Page<Product> getAllProductByCategory(Integer pageNumber, String category);

    Page<Product> getAllProductByBrandOrModel(Integer pageNumber,String searchTerm,String category);

    Page<Product> getAllProductByBrandOrModelOrCategory(Integer pageNumber,String searchTerm);
}
