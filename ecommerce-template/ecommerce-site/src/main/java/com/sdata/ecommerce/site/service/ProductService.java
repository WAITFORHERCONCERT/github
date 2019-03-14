package com.sdata.ecommerce.site.service;

import com.sdata.ecommerce.site.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> queryAll();
}
