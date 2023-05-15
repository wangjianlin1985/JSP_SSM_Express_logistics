// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.OrderDetailExample;
import cn.oza.logistic.ssm.pojo.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderDetailMapper
{
    int deleteByPrimaryKey(Long orderDetailId);
    
    int insert(OrderDetail record);
    
    int insertSelective(OrderDetail record);
    
    List<OrderDetail> selectByExample(OrderDetailExample example);
    
    OrderDetail selectByPrimaryKey(Long orderDetailId);
    
    int updateByPrimaryKeySelective(OrderDetail record);
    
    int updateByPrimaryKey(OrderDetail record);
}
