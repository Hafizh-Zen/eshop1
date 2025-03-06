package id.ac.ui.cs.advprog.eshop1.service;

import id.ac.ui.cs.advprog.eshop1.model.Product;
import java.util.List;

public interface ProductService {
    public Product create(Product product);
    public List<Product> findAll();
}
