// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.CustomerViewExample;
import cn.oza.logistic.ssm.pojo.CustomerView;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerViewMapper
{
    int insert(CustomerView record);
    
    int insertSelective(CustomerView record);
    
    List<CustomerView> selectByExample(CustomerViewExample example);
}
