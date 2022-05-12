package com.example.ecommerce.service;


import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAll();

    void saveProduct(Product product);

    void deleteProduct(Product product);

    Product findProductById(Long id);

}
