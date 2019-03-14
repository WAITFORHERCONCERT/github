package com.sdata.ecommerce.mapper.extended;

import com.sdata.ecommerce.domain.Product;

import java.util.List;

public interface ProductMapperExtended {
    List<Product> queryAll();
    List<Product> queryByLike(String keyword);

}
