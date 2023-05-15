// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderViewExample;
import cn.oza.logistic.ssm.pojo.OrderView;

public interface OrderViewService
{
    int insert(OrderView record);
    
    int insertSelective(OrderView record);
    
    List<OrderView> selectByExample(OrderViewExample example);
}
