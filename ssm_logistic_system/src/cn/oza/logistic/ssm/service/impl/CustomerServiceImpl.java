// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.CustomerExample;
import cn.oza.logistic.ssm.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerMapper customerMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long customerId) {
        return this.customerMapper.deleteByPrimaryKey(customerId);
    }
    
    @Override
    public int insert(final Customer record) {
        return this.customerMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Customer record) {
        return this.customerMapper.insertSelective(record);
    }
    
    @Override
    public List<Customer> selectByExample(final CustomerExample example) {
        return this.customerMapper.selectByExample(example);
    }
    
    @Override
    public Customer selectByPrimaryKey(final Long customerId) {
        return this.customerMapper.selectByPrimaryKey(customerId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Customer record) {
        return this.customerMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final Customer record) {
        return this.customerMapper.updateByPrimaryKey(record);
    }
}
