// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.TransactionExample;
import cn.oza.logistic.ssm.pojo.Transaction;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Repository
public interface TransactionMapper
{
    int deleteByPrimaryKey(Long transactionId);
    
    int insert(Transaction record);
    
    int insertSelective(Transaction record);
    
    List<Transaction> selectByExample(TransactionExample example);
    
    Transaction selectByPrimaryKey(Long transactionId);
    
    int updateByPrimaryKeySelective(Transaction record);
    
    int updateByPrimaryKey(Transaction record);
}
