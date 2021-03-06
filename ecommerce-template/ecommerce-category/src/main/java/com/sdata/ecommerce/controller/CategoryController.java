package com.sdata.ecommerce.controller;

import com.sdata.ecommerce.domain.Category;
import com.sdata.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author nedli
 */
@Controller
@RequestMapping("/category")
public class CategoryController extends BaseController {
    private static final String PAGE_DIR = "/pages";
    private static final String CATEGORY_LIST_PAGE = PAGE_DIR + "/catalog/category-list";
    private static final String CATEGORY_EDIT_PAGE = PAGE_DIR + "/catalog/category-edit";

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping
    public String listPage() {
        return CATEGORY_LIST_PAGE;
    }

    @RequestMapping("edit")
    public String editPage(ModelMap model, @RequestParam("id") String id) {
        model.addAttribute("category", categoryService.getCategoryById(id));
        return CATEGORY_EDIT_PAGE;
    }

    @RequestMapping("add")
    public String addPage(ModelMap model) {
        model.addAttribute("category", new Category());
        return  CATEGORY_EDIT_PAGE;
    }

    @PostMapping("save")
    public String saveOrUpdate(Category category) {
        categoryService.saveOrUpdateCategory(category);
        return "redirect:/category";
    }
    @PostMapping("del")
    public String del(@RequestParam(value = "ids") List<String> ids) {
       categoryService.deleteCategoryById(ids);
        return CATEGORY_LIST_PAGE;

    }
}
