package ahmad.thymeleaf.services;

import ahmad.thymeleaf.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}