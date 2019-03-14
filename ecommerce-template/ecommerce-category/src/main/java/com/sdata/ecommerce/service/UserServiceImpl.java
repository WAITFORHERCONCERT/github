/*
package com.sdata.ecommerce.service;

import com.sdata.ecommerce.domain.SystemUser;
import com.sdata.ecommerce.domain.User;
import com.sdata.ecommerce.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        List<User> users = userMapper.getUserWithPermissionsByName(name);
        return users != null ? users.get(0) : null;
    }

    @Override
    public SystemUser loadSystemUserByName(String name) {
        User user = this.getUserByName(name);

        if (user == null) {
            throw new UsernameNotFoundException("UserName " + name + " not found");
        }

        return new SystemUser(user);
    }

    @Override
    public void saveUser(User user) {
        if (StringUtils.isNotBlank(user.getPassword())) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        }
        userMapper.insert(user);
    }
}
*/
