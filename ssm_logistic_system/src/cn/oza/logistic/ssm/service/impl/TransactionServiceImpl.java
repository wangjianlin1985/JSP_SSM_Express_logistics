// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.TransactionExample;
import cn.oza.logistic.ssm.pojo.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.TransactionMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService
{
    @Autowired
    private TransactionMapper transactionMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long transactionId) {
        return this.transactionMapper.deleteByPrimaryKey(transactionId);
    }
    
    @Override
    public int insert(final Transaction record) {
        return this.transactionMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Transaction record) {
        return this.transactionMapper.insertSelective(record);
    }
    
    @Override
    public List<Transaction> selectByExample(final TransactionExample example) {
        return this.transactionMapper.selectByExample(example);
    }
    
    @Override
    public Transaction selectByPrimaryKey(final Long transactionId) {
        return this.transactionMapper.selectByPrimaryKey(transactionId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Transaction record) {
        return this.transactionMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final Transaction record) {
        return this.transactionMapper.updateByPrimaryKey(record);
    }
}
