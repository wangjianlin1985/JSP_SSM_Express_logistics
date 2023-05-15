// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderViewExample;
import cn.oza.logistic.ssm.pojo.OrderView;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.OrderViewMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.OrderViewService;

@Service
public class OrderViewServiceImpl implements OrderViewService
{
    @Autowired
    private OrderViewMapper orderViewMapper;
    
    @Override
    public int insert(final OrderView record) {
        return this.orderViewMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final OrderView record) {
        return this.orderViewMapper.insertSelective(record);
    }
    
    @Override
    public List<OrderView> selectByExample(final OrderViewExample example) {
        return this.orderViewMapper.selectByExample(example);
    }
}
