package com.sdata.ecommerce.service;

import com.sdata.ecommerce.api.search.SearchRequest;
import com.sdata.ecommerce.api.search.SearchResponse;
import com.sdata.ecommerce.domain.Product;

import java.util.List;

public interface ProductService {
    SearchResponse search(SearchRequest request);

    int saveOrUpdateProduct(Product product);

    Product getProductById(String id);

    void deleteProductById(List<String> ids);
}
