// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderExample;
import cn.oza.logistic.ssm.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderMapper orderMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long orderId) {
        return this.orderMapper.deleteByPrimaryKey(orderId);
    }
    
    @Override
    public int insert(final Order record) {
        return this.orderMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Order record) {
        return this.orderMapper.insertSelective(record);
    }
    
    @Override
    public List<Order> selectByExample(final OrderExample example) {
        return this.orderMapper.selectByExample(example);
    }
    
    @Override
    public Order selectByPrimaryKey(final Long orderId) {
        return this.orderMapper.selectByPrimaryKey(orderId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Order record) {
        return this.orderMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final Order record) {
        return this.orderMapper.updateByPrimaryKey(record);
    }
}
