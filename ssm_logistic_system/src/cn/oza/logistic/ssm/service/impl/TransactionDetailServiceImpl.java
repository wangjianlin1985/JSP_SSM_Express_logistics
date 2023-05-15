// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.TransactionDetailExample;
import cn.oza.logistic.ssm.pojo.TransactionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.TransactionDetailMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.TransactionDetailService;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService
{
    @Autowired
    private TransactionDetailMapper transactionDetailMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long transactionDetailId) {
        return this.transactionDetailMapper.deleteByPrimaryKey(transactionDetailId);
    }
    
    @Override
    public int insert(final TransactionDetail record) {
        return this.transactionDetailMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final TransactionDetail record) {
        return 0;
    }
    
    @Override
    public List<TransactionDetail> selectByExample(final TransactionDetailExample example) {
        return this.transactionDetailMapper.selectByExample(example);
    }
    
    @Override
    public TransactionDetail selectByPrimaryKey(final Long transactionDetailId) {
        return this.transactionDetailMapper.selectByPrimaryKey(transactionDetailId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final TransactionDetail record) {
        return this.transactionDetailMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final TransactionDetail record) {
        return this.transactionDetailMapper.updateByPrimaryKey(record);
    }
}
