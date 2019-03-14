package com.sdata.ecommerce.domain.extended;

import com.sdata.ecommerce.domain.Permission;

import java.util.List;

public class UserExtended {
    List<Permission> permissions;
    public void setPermissions(List<Permission> permissions){
        this.permissions=permissions;
    };
    public List<Permission> getPermissions(){
        return permissions;
    }
}
