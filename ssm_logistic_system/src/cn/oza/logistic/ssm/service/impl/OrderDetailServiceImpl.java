// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderDetailExample;
import cn.oza.logistic.ssm.pojo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService
{
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long orderDetailId) {
        return this.orderDetailMapper.deleteByPrimaryKey(orderDetailId);
    }
    
    @Override
    public int insert(final OrderDetail record) {
        return this.orderDetailMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final OrderDetail record) {
        return this.orderDetailMapper.insertSelective(record);
    }
    
    @Override
    public List<OrderDetail> selectByExample(final OrderDetailExample example) {
        return this.orderDetailMapper.selectByExample(example);
    }
    
    @Override
    public OrderDetail selectByPrimaryKey(final Long orderDetailId) {
        return this.orderDetailMapper.selectByPrimaryKey(orderDetailId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final OrderDetail record) {
        return this.orderDetailMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final OrderDetail record) {
        return this.orderDetailMapper.updateByPrimaryKey(record);
    }
}
