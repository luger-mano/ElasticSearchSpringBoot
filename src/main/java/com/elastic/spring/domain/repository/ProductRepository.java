package com.elastic.spring.domain.repository;

import com.elastic.spring.domain.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;


public interface ProductRepository extends ElasticsearchRepository<Product, UUID> {

}
