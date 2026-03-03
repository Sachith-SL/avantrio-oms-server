package com.avantrio.oms.controller;

import com.avantrio.oms.dto.ProductDto;
import com.avantrio.oms.model.Product;
import com.avantrio.oms.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/oms/v1/product")
@CrossOrigin("*")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity(productRepository.findAll(), HttpStatus.OK);
    }
}
