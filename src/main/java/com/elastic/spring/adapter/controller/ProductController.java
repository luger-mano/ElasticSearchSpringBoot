package com.elastic.spring.adapter.controller;

import com.elastic.spring.adapter.dto.ProductResponseDto;
import com.elastic.spring.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponseDto>> products(){
        return ResponseEntity.ok().build();
    }
}
