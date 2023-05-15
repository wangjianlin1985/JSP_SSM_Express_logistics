// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderExample;
import cn.oza.logistic.ssm.pojo.Order;

public interface OrderService
{
    int deleteByPrimaryKey(Long orderId);
    
    int insert(Order record);
    
    int insertSelective(Order record);
    
    List<Order> selectByExample(OrderExample example);
    
    Order selectByPrimaryKey(Long orderId);
    
    int updateByPrimaryKeySelective(Order record);
    
    int updateByPrimaryKey(Order record);
}
