package com.sdata.ecommerce.service;

import com.sdata.ecommerce.api.search.SearchRequest;
import com.sdata.ecommerce.api.search.SearchResponse;
import com.sdata.ecommerce.domain.Category;

import java.util.List;


public interface CategoryService {
    Category getCategoryById(String id);

    SearchResponse search(SearchRequest request);

    int saveOrUpdateCategory(Category category);

    void deleteCategoryById(List<String> ids);
}
