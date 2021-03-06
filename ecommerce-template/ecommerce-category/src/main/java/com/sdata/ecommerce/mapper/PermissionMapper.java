package com.sdata.ecommerce.mapper;

import com.sdata.ecommerce.domain.Permission;
import com.sdata.ecommerce.domain.PermissionExample;
import com.sdata.ecommerce.mapper.extended.PermissionMapperExtended;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper extends PermissionMapperExtended {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    long countByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int deleteByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    List<Permission> selectByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    Permission selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Wed Mar 06 15:36:04 CST 2019
     */
    int updateByPrimaryKey(Permission record);
}