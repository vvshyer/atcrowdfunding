package com.nju.atcrowdfunding.manager.dao;

import com.nju.atcrowdfunding.bean.RolePermission;
import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    List<RolePermission> selectAll();

    int updateByPrimaryKey(RolePermission record);
}