// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderExample;
import cn.oza.logistic.ssm.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderMapper
{
    int deleteByPrimaryKey(Long orderId);
    
    int insert(Order record);
    
    int insertSelective(Order record);
    
    List<Order> selectByExample(OrderExample example);
    
    Order selectByPrimaryKey(Long orderId);
    
    int updateByPrimaryKeySelective(Order record);
    
    int updateByPrimaryKey(Order record);
}
