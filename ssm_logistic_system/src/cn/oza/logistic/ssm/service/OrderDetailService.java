// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderDetailExample;
import cn.oza.logistic.ssm.pojo.OrderDetail;

public interface OrderDetailService
{
    int deleteByPrimaryKey(Long orderDetailId);
    
    int insert(OrderDetail record);
    
    int insertSelective(OrderDetail record);
    
    List<OrderDetail> selectByExample(OrderDetailExample example);
    
    OrderDetail selectByPrimaryKey(Long orderDetailId);
    
    int updateByPrimaryKeySelective(OrderDetail record);
    
    int updateByPrimaryKey(OrderDetail record);
}
