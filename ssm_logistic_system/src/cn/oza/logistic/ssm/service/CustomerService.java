// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.CustomerExample;
import cn.oza.logistic.ssm.pojo.Customer;

public interface CustomerService
{
    int deleteByPrimaryKey(Long customerId);
    
    int insert(Customer record);
    
    int insertSelective(Customer record);
    
    List<Customer> selectByExample(CustomerExample example);
    
    Customer selectByPrimaryKey(Long customerId);
    
    int updateByPrimaryKeySelective(Customer record);
    
    int updateByPrimaryKey(Customer record);
}
