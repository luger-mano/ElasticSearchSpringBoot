package com.elastic.spring.adapter.dto;

import com.elastic.spring.domain.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {
    private String name;
    private Double value;
    private Integer amount;

    public ProductResponseDto toResponseDto(){
        ProductResponseDto responseDto = new ProductResponseDto();

        responseDto.setName(this.name);
        responseDto.setValue(this.value);
        responseDto.setAmount(this.amount);

        return responseDto;
    }
    public Product toEntity(){
        Product product = new Product();

        product.setName(this.name);
        product.setValue(this.value);
        product.setAmount(this.amount);

        return product;
    }
}
