// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import cn.oza.logistic.ssm.pojo.BasicData;

public interface BasicDataService
{
    int deleteByPrimaryKey(Long basicDataId);
    
    int insert(BasicData record);
    
    int insertSelective(BasicData record);
    
    List<BasicData> selectByExample(BasicDataExample example);
    
    BasicData selectByPrimaryKey(Long basicDataId);
    
    int updateByPrimaryKeySelective(BasicData record);
    
    int updateByPrimaryKey(BasicData record);
}
