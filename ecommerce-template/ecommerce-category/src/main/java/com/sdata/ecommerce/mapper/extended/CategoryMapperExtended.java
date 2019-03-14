package com.sdata.ecommerce.mapper.extended;

import com.sdata.ecommerce.domain.Category;

import java.util.List;

public interface CategoryMapperExtended {
    List<Category> queryAll();
    List<Category> queryByLike(String keyword);
}
