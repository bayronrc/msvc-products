package com.bayron.springcloud.msvc.products.repositories;

import com.bayron.springcloud.msvc.products.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    

}
