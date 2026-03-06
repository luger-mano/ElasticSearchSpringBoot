package com.elastic.spring.adapter.controller;

import com.elastic.spring.adapter.dto.ProductRequestDto;
import com.elastic.spring.adapter.dto.ProductResponseDto;
import com.elastic.spring.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<ProductResponseDto> productById(@RequestParam("productId") UUID productId){
        var products = productService.getProductById(productId);
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> saveProduct(@RequestBody ProductRequestDto dto){
        var productSaved = productService.saveProduct(dto);
        return ResponseEntity.ok(productSaved);
    }
}
