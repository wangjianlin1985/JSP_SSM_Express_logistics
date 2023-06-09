// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.CustomerExample;
import cn.oza.logistic.ssm.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerMapper
{
    int deleteByPrimaryKey(Long customerId);
    
    int insert(Customer record);
    
    int insertSelective(Customer record);
    
    List<Customer> selectByExample(CustomerExample example);
    
    Customer selectByPrimaryKey(Long customerId);
    
    int updateByPrimaryKeySelective(Customer record);
    
    int updateByPrimaryKey(Customer record);
}
