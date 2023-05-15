// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.UserExample;
import cn.oza.logistic.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper
{
    int deleteByPrimaryKey(Long userId);
    
    int insert(User record);
    
    int insertSelective(User record);
    
    List<User> selectByExample(UserExample example);
    
    User selectByPrimaryKey(Long userId);
    
    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKey(User record);
}
