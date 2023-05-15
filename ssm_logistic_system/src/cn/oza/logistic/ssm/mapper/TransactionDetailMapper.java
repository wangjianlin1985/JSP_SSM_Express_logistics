// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.TransactionDetailExample;
import cn.oza.logistic.ssm.pojo.TransactionDetail;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Repository
public interface TransactionDetailMapper
{
    int deleteByPrimaryKey(Long transactionDetailId);
    
    int insert(TransactionDetail record);
    
    int insertSelective(TransactionDetail record);
    
    List<TransactionDetail> selectByExample(TransactionDetailExample example);
    
    TransactionDetail selectByPrimaryKey(Long transactionDetailId);
    
    int updateByPrimaryKeySelective(TransactionDetail record);
    
    int updateByPrimaryKey(TransactionDetail record);
}
