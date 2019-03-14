package com.sdata.ecommerce.controller;

import com.sdata.ecommerce.domain.Product;
import com.sdata.ecommerce.service.CategoryService;
import com.sdata.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private static final String PAGE_DIR="pages";
    private static final String PRODUCT_EDIT_PAGE=PAGE_DIR+"/pdctlog/product-edit";
    private static final String PRODUCT_LIST_PAGE=PAGE_DIR+"/pdctlog/product-list";

    private final ProductService productService;
    private final CategoryService categoryService;

    @Autowired
    public ProductController(ProductService productService,CategoryService categoryService) {
        this.productService = productService;
        this.categoryService=categoryService;
    }
    @RequestMapping
    public String listPage() {
        return PRODUCT_LIST_PAGE;
    }
    @RequestMapping("edit")
    public String editPage(ModelMap model, @RequestParam("id") String id) {
        model.addAttribute("product", productService.getProductById(id));
        return PRODUCT_EDIT_PAGE;
    }
    @RequestMapping("add")
    public String addPage(ModelMap modelMap){
        modelMap.addAttribute("product", new Product());
        return PRODUCT_EDIT_PAGE;
    }
    @PostMapping("save")
    public String saveOrUpdate(Product product) {
       productService.saveOrUpdateProduct(product);
        return "redirect:product";
    }
    @PostMapping("del")
    public String del(@RequestParam(value = "ids") List<String> ids) {
        productService.deleteProductById(ids);
        return PRODUCT_LIST_PAGE;

    }

}
