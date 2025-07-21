package com.anand.microkubeshop.product.service;

import com.anand.microkubeshop.product.dto.ProductRequest;
import com.anand.microkubeshop.product.model.Product;
import com.anand.microkubeshop.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product {} created successfully", product.getName());

        return product;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
