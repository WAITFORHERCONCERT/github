package com.sdata.ecommerce.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sdata.ecommerce.api.search.SearchRequest;
import com.sdata.ecommerce.api.search.SearchResponse;
import com.sdata.ecommerce.domain.Category;
import com.sdata.ecommerce.mapper.CategoryMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Category getCategoryById(String id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public SearchResponse search(SearchRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());

         List<Category> categorys = categoryMapper.queryAll();
        if (StringUtils.isNotBlank(request.getKeywordLike())) {
            PageHelper.startPage(request.getPageNum(), request.getPageSize());
            categorys = categoryMapper.queryByLike(request.getKeywordLike());
        }
        return new SearchResponse(categorys, ((Page) (categorys)).getTotal());
    }

    @Override
    public int saveOrUpdateCategory(Category category) {


        if (StringUtils.isNotBlank(category.getId())) {
            return categoryMapper.updateByPrimaryKey(category);
        } else {
            return categoryMapper.insert(category);
        }
    }

    @Override
    public void deleteCategoryById(List<String> ids) {
        Iterator id=ids.iterator();
        while (id.hasNext()){
             categoryMapper.deleteByPrimaryKey(id.next().toString());
        }

    }
}
