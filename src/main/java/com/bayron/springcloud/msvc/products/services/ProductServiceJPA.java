package com.bayron.springcloud.msvc.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bayron.springcloud.msvc.products.entities.Product;
import com.bayron.springcloud.msvc.products.repositories.ProductRepository;

@Service
public class ProductServiceJPA implements ProductService {

    private ProductRepository repository;

    public ProductServiceJPA(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

}
