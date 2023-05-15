// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderViewExample;
import cn.oza.logistic.ssm.pojo.OrderView;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderViewMapper
{
    int insert(OrderView record);
    
    int insertSelective(OrderView record);
    
    List<OrderView> selectByExample(OrderViewExample example);
}
