package com.elastic.spring.domain.service;

import com.elastic.spring.adapter.dto.ProductRequestDto;
import com.elastic.spring.adapter.dto.ProductResponseDto;

import java.util.UUID;

public interface ProductService {

    ProductResponseDto getProductById(UUID productId);

    ProductResponseDto saveProduct(ProductRequestDto dto);
}
