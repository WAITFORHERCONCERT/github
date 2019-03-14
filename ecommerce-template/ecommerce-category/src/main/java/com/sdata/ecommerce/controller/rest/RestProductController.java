package com.sdata.ecommerce.controller.rest;


import com.sdata.ecommerce.api.search.SearchRequest;
import com.sdata.ecommerce.api.search.SearchResponse;
import com.sdata.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/products")
public class RestProductController {
    private final ProductService productService;

    @Autowired
    public RestProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    @ResponseBody
    public SearchResponse searchContent(SearchRequest request) {
        return productService.search(request);
    }
}
