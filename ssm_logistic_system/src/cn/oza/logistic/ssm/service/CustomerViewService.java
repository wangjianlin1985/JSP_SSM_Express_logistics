// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.CustomerViewExample;
import cn.oza.logistic.ssm.pojo.CustomerView;

public interface CustomerViewService
{
    int insert(CustomerView record);
    
    int insertSelective(CustomerView record);
    
    List<CustomerView> selectByExample(CustomerViewExample example);
}
