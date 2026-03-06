package com.elastic.spring.adapter.dto;

import com.elastic.spring.domain.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private String name;
    private Double value;
    private Integer amount;

    public Product toEntity(){
        Product product = new Product();

        product.setName(this.name);
        product.setValue(this.value);
        product.setAmount(this.amount);

        return product;
    }
}
