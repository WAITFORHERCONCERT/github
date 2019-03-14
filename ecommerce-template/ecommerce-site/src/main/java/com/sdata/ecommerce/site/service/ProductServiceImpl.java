package com.sdata.ecommerce.site.service;

import com.sdata.ecommerce.site.domain.Product;
import com.sdata.ecommerce.site.mapper.ProductDao;
import com.sdata.ecommerce.site.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> queryAll() {
       return productDao.findAll();
    }
}
