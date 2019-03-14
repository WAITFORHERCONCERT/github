package com.sdata.ecommerce.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sdata.ecommerce.api.search.SearchRequest;
import com.sdata.ecommerce.api.search.SearchResponse;
import com.sdata.ecommerce.domain.Product;
import com.sdata.ecommerce.mapper.ProductMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductMapper productMapper;
    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public SearchResponse search(SearchRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());

        List<Product> products = productMapper.queryAll();
        if (StringUtils.isNotBlank(request.getKeywordLike())) {
            PageHelper.startPage(request.getPageNum(), request.getPageSize());
            products = productMapper.queryByLike(request.getKeywordLike());
        }
        return new SearchResponse(products, ((Page) (products)).getTotal());
    }

    @Override
    public int saveOrUpdateProduct(Product product) {
        if (StringUtils.isNotBlank(product.getId())) {
            return productMapper.updateByPrimaryKeyWithBLOBs(product);
        } else {
            return productMapper.insert(product);
        }
    }

    @Override
    public Product getProductById(String id) {
        return productMapper.selectByPrimaryKey(id);

    }

    @Override
    public void deleteProductById(List<String> ids) {
        Iterator id=ids.iterator();
        while (id.hasNext()){
            productMapper.deleteByPrimaryKey(id.next().toString());
        }
    }
}
