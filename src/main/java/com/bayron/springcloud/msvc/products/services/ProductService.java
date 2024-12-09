package com.bayron.springcloud.msvc.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bayron.springcloud.msvc.products.entities.Product;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);
}
