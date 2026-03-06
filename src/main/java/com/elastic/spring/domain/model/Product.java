package com.elastic.spring.domain.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.UUID;



@Getter
@Setter
@Document(indexName = "product")
public class Product {

    @Id
    private UUID productId;
    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Double)
    private Double value;
    @Field(type = FieldType.Integer)
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
