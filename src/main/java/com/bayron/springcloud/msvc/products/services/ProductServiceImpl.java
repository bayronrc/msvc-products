package com.bayron.springcloud.msvc.products.services;

import com.bayron.springcloud.msvc.products.entities.Product;
import com.bayron.springcloud.msvc.products.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    private final Environment env;

    public ProductServiceImpl(ProductRepository repository, Environment environment) {
        this.repository = repository;
        this.env = environment;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return ((List<Product>) repository.findAll())
                .stream()
                .map(p -> {
                    p.setPort(Integer.parseInt(env.getProperty("local.server.port")));
                    return p;
                })
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {

        return repository.findById(id).map(product -> {
            product.setPort(Integer.parseInt(env.getProperty("local.server.port")));
            return product;
        });
    }
}
