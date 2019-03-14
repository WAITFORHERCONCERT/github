package com.sdata.ecommerce.domain;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class SystemUser extends User implements UserDetails {
    public SystemUser() {
    }

    public SystemUser(String id, String name, String nickName,
                      String password, String email, String phone, Byte enabled, Date createdDate, List<Permission> permissions) {
        super(id, name, nickName, password, email, phone, enabled, createdDate);
        super.setPermissions(permissions);
    }

    public SystemUser(User user) {
        this(user.getId(), user.getName(), user.getNickName(), user.getPassword(), user.getEmail(), user.getPhone(), user.getEnabled(), user.getCreatedDate(), user.getPermissions());
    }

    //通过此方法拿到用户的所有权限.
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();

        if (super.getPermissions() != null) {
            for (Permission permission : super.getPermissions()) {
                if (permission != null && StringUtils.isNotBlank(permission.getName())) {
                    SimpleGrantedAuthority authority = new SimpleGrantedAuthority(permission.getName());
                    authorities.add(authority);
                }
            }
        }

        return authorities;
    }

    @Override
    public String getUsername() {
        return super.getName();
    }

    // 是否不过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 是否不锁定
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 是否授权不过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //是否启用
    @Override
    public boolean isEnabled() {
        return true;
    }
}
