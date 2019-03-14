package com.sdata.ecommerce.site.controller.rest;

import com.sdata.ecommerce.site.domain.Product;
import com.sdata.ecommerce.site.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/products")
public class RestProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/search")
    public List<Product> searchContent() {
        return productService.queryAll();
    }

}
