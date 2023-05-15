// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.TransactionExample;
import cn.oza.logistic.ssm.pojo.Transaction;

public interface TransactionService
{
    int deleteByPrimaryKey(Long transactionId);
    
    int insert(Transaction record);
    
    int insertSelective(Transaction record);
    
    List<Transaction> selectByExample(TransactionExample example);
    
    Transaction selectByPrimaryKey(Long transactionId);
    
    int updateByPrimaryKeySelective(Transaction record);
    
    int updateByPrimaryKey(Transaction record);
}
