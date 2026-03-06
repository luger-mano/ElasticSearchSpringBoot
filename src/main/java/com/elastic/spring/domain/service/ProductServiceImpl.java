package com.elastic.spring.domain.service;

import com.elastic.spring.adapter.dto.ProductRequestDto;
import com.elastic.spring.adapter.dto.ProductResponseDto;
import com.elastic.spring.domain.model.Product;
import com.elastic.spring.domain.repository.ProductRepository;
import com.elastic.spring.infra.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductResponseDto getProductById(UUID productId) {
        var product = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found."));
        log.info("Product found: {}",product);
        return productMapper.productEntityToProductResponseDto(product);
    }

    @Override
    public ProductResponseDto saveProduct(ProductRequestDto dto) {
        Product product = dto.toEntity();

        product.setProductId(UUID.randomUUID());
        productRepository.save(product);

        log.info("Product saved successfully");

        return dto.toResponseDto();
    }
}
