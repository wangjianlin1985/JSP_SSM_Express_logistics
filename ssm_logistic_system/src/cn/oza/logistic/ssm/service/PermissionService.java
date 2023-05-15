// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.PermissionExample;
import cn.oza.logistic.ssm.pojo.Permission;

public interface PermissionService
{
    int deleteByPrimaryKey(Long permissionId);
    
    int insert(Permission record);
    
    int insertSelective(Permission record);
    
    List<Permission> selectByExample(PermissionExample example);
    
    Permission selectByPrimaryKey(Long permissionId);
    
    int updateByPrimaryKeySelective(Permission record);
    
    int updateByPrimaryKey(Permission record);
}
