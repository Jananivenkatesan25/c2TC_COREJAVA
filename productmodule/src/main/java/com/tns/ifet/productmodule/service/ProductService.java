package com.tns.ifet.productmodule.service;

import java.util.List;

import com.tns.ifet.productmodule.entity.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product productDetails);
    void deleteProduct(Long id);
}