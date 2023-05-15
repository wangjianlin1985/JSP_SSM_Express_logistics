// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.RoleExample;
import cn.oza.logistic.ssm.pojo.Role;

public interface RoleService
{
    int deleteByPrimaryKey(Long roleId);
    
    int insert(Role record);
    
    int insertSelective(Role record);
    
    List<Role> selectByExample(RoleExample example);
    
    Role selectByPrimaryKey(Long roleId);
    
    int updateByPrimaryKeySelective(Role record);
    
    int updateByPrimaryKey(Role record);
}
