package com.elastic.spring.infra.mapper;

import com.elastic.spring.adapter.dto.ProductResponseDto;
import com.elastic.spring.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponseDto productEntityToProductResponseDto(Product product);
}
