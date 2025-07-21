package com.anand.microkubeshop.product.repository;

import com.anand.microkubeshop.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
