package com.elastic.spring.domain.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.UUID;

@Document(indexName = "product")
@Getter
@Setter
public class Product {

    @Id
    private UUID productId;
    private String name;
    private Double value;
    private Integer amount;

    public Product(UUID productId, String name, Double value, Integer amount) {
        this.productId = productId;
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    public Product() {
    }
}
