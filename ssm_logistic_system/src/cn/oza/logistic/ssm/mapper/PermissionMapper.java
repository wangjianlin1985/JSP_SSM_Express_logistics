// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.PermissionExample;
import cn.oza.logistic.ssm.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PermissionMapper
{
    int deleteByPrimaryKey(Long permissionId);
    
    int insert(Permission record);
    
    int insertSelective(Permission record);
    
    List<Permission> selectByExample(PermissionExample example);
    
    Permission selectByPrimaryKey(Long permissionId);
    
    int updateByPrimaryKeySelective(Permission record);
    
    int updateByPrimaryKey(Permission record);
}
