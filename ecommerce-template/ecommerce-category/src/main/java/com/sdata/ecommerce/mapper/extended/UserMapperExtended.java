package com.sdata.ecommerce.mapper.extended;

import com.sdata.ecommerce.domain.User;

import java.util.List;

public interface UserMapperExtended {
    List<User> getUserWithPermissionsByName(String name);
}
