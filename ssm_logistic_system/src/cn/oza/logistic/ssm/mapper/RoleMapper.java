// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.RoleExample;
import cn.oza.logistic.ssm.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RoleMapper
{
    int deleteByPrimaryKey(Long roleId);
    
    int insert(Role record);
    
    int insertSelective(Role record);
    
    List<Role> selectByExample(RoleExample example);
    
    Role selectByPrimaryKey(Long roleId);
    
    int updateByPrimaryKeySelective(Role record);
    
    int updateByPrimaryKey(Role record);
}
