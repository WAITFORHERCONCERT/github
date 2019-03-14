package com.sdata.ecommerce.site.mapper;

import com.sdata.ecommerce.site.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,String> {
}
