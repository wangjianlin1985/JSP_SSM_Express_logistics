// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.InfoExample;
import cn.oza.logistic.ssm.pojo.Info;

public interface InfoService
{
    int deleteByPrimaryKey(Long orderId);
    
    int insert(Info record);
    
    int insertSelective(Info record);
    
    List<Info> selectByExample(InfoExample example);
    
    Info selectByPrimaryKey(Long orderId);
    
    int updateByPrimaryKeySelective(Info record);
    
    int updateByPrimaryKey(Info record);
}
