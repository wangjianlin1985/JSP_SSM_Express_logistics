// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import cn.oza.logistic.ssm.pojo.BasicData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BasicDataMapper
{
    int deleteByPrimaryKey(Long baseId);
    
    int insert(BasicData record);
    
    int insertSelective(BasicData record);
    
    List<BasicData> selectByExample(BasicDataExample example);
    
    BasicData selectByPrimaryKey(Long baseId);
    
    int updateByPrimaryKeySelective(BasicData record);
    
    int updateByPrimaryKey(BasicData record);
}
