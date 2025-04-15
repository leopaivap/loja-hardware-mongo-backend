package com.lojahardware.service;

import com.lojahardware.model.Product;
import com.lojahardware.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Optional<Product> findById(String id) {
        return repository.findById(id);
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product update(String id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
