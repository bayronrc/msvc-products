package com.bayron.springcloud.msvc.products.services;

import com.bayron.springcloud.msvc.products.entities.Product;
import com.bayron.springcloud.msvc.products.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    final private ProductRepository repository;

    private ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    @Transactional
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }
}
