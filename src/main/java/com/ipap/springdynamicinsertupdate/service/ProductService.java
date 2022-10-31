package com.ipap.springdynamicinsertupdate.service;

import com.ipap.springdynamicinsertupdate.entity.Product;
import com.ipap.springdynamicinsertupdate.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(int id) {
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(int id, Product productRequest) {
        return productRepository.findById(id).map(existingProduct -> {
            existingProduct.setName(productRequest.getName());
            existingProduct.setDescription(productRequest.getDescription());
            existingProduct.setPrice(productRequest.getPrice());
            existingProduct.setProductType(productRequest.getProductType());
            return productRepository.save(existingProduct);
        }).orElseThrow();
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "product deleted";
    }
}
