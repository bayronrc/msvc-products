package com.bayron.springcloud.msvc.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bayron.springcloud.msvc.products.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
