package com.sdata.ecommerce.controller.rest;

import com.sdata.ecommerce.api.search.SearchRequest;
import com.sdata.ecommerce.api.search.SearchResponse;
import com.sdata.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nedli
 */
@RestController
@RequestMapping("/api/v1/categories")
public class RestCategoryController {
    private final CategoryService categoryService;

    @Autowired
    public RestCategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/search")
    public SearchResponse searchContent(SearchRequest request) {
        return categoryService.search(request);
    }
}
