package com.sdata.ecommerce.site.controller;

import com.sdata.ecommerce.site.domain.Product;
import com.sdata.ecommerce.site.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/list")
    public String getlistPage() {
        return "/pages/list";
    }
    
}
